package com.sist.dao;

import org.mybatis.spring.support.SqlSessionDaoSupport;
import java.util.*;
public class EmpDAO extends SqlSessionDaoSupport{
	public  List<EmpVO> empAllData(){
		//openSession ->�̹� ����������
		return getSqlSession().selectList("empAllData");
		//close()
		
		
	}
}