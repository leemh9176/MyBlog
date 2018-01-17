package com.leemh.myblog.api.controller.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.leemh.myblog.api.vo.RequestVO;

@Controller
public class UserController {

	@RequestMapping(value="/login", method = RequestMethod.POST)
	public ModelAndView login(RequestVO requestVO) {
		return null;
	}
	
}
