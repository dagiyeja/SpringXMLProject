package com.sist.xml;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import com.sist.dao.EmpDAO;
import com.sist.dao.EmpVO;

import java.util.*;
@Component("mc") //bean태그와 같다
public class MainClass {
	@Autowired //p:dao-ref="dao" ->이렇게 어노테이션을 쓰면 xml에 클래스 등록을 할 필요가 사라진다.  setter 쓸필요 없이 값 자동 주입됨.
	private EmpDAO dao;
	
	
	public void setDao(EmpDAO dao) {
		this.dao = dao;
	}


	public static void main(String[] args) {
		ApplicationContext app=new ClassPathXmlApplicationContext("app.xml");
		MainClass mc=(MainClass)app.getBean("mc");
		List<EmpVO> list=mc.dao.empAllData();
		for(EmpVO vo:list){
			System.out.println(vo.getEmpno()+" "+vo.getEname()+" "+vo.getJob()+" "+vo.getSal()+" "+vo.getHiredate()+" ");
		}
	}

}
