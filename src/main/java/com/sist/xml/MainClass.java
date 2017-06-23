package com.sist.xml;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import com.sist.dao.EmpDAO;
import com.sist.dao.EmpVO;

import java.util.*;
@Component("mc") //bean�±׿� ����
public class MainClass {
	@Autowired //p:dao-ref="dao" ->�̷��� ������̼��� ���� xml�� Ŭ���� ����� �� �ʿ䰡 �������.  setter ���ʿ� ���� �� �ڵ� ���Ե�.
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
