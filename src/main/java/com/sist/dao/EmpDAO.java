package com.sist.dao;

import org.mybatis.spring.support.SqlSessionDaoSupport;
import java.util.*;
public class EmpDAO extends SqlSessionDaoSupport{
	public  List<EmpVO> empAllData(){
		//openSession ->이미 구현되있음
		return getSqlSession().selectList("empAllData");
		//close()
		
		
	}
}
