package kr.com.jc2019.main.dao.Impl;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.com.jc2019.main.dao.Test01Dao;
import kr.com.jc2019.main.vo.Test01Vo;

@Repository
public class Test01DaoImpl implements Test01Dao{
	
	@Autowired
	private SqlSessionTemplate sqlSession;
	
	@Override
	public List<Test01Vo> selectTest01() {
		
		return sqlSession.selectList("test.sql.selectTest01List");
	}

}
