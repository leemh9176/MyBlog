package com.leemh.myblog.api.dao;

import java.util.ArrayList;

import org.springframework.ui.ModelMap;

import com.leemh.myblog.api.vo.UserVO;

public interface UserDAO {
	
	void insertUser(UserVO userVO);
	
	void updateUser(UserVO userVO);
	
	void deleteUser(ModelMap map);
	
	UserVO readUser(ModelMap map);
	
	ArrayList<UserVO> readUserList(ModelMap map);
}
