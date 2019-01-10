package kr.com.jc2019.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.com.jc2019.main.dao.Test01Dao;
import kr.com.jc2019.main.vo.Test01Vo;

@Service
public class Test01Service {

	@Autowired
	private Test01Dao dao;
	
	public List<Test01Vo> selectTest01List(){
		return dao.selectTest01();
	}
}
