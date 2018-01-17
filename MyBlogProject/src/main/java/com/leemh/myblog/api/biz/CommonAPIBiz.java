package com.leemh.myblog.api.biz;

import org.springframework.beans.factory.annotation.Autowired;

import com.leemh.myblog.api.dao.UserDAO;
import com.leemh.myblog.api.vo.RequestVO;
import com.leemh.myblog.api.vo.UserVO;

public class CommonAPIBiz {

//	@Autowired UserDAO userDAO;
	
	public UserVO createUserVO(RequestVO requestVO) {
		UserVO userVO = new UserVO();
		
		userVO.setId(requestVO.getId());
		userVO.setPassword(requestVO.getPassword());
		userVO.setName(requestVO.getName());
		userVO.setSex(requestVO.getSex());
		userVO.setEmail(requestVO.getEmail());
		userVO.setPhone_number(requestVO.getPhone_number());
		userVO.setBirth(requestVO.getBirth());
		
		return userVO;
	}
}
