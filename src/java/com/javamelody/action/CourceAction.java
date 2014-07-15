package com.javamelody.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.javamelody.entity.Cource;
import com.javamelody.service.CourceService;

@Controller
@RequestMapping("/cource")
public class CourceAction {

	@Autowired
	private CourceService courceService;
	
	private HttpServletRequest request;
	
	private HttpServletResponse response;
	
	@ModelAttribute
	public void setRequestAndResponse(HttpServletRequest request,HttpServletResponse response){
		
		this.request = request;
		
		this.response = response;
	}
	
	@RequestMapping("/courceList")
	public ModelAndView courceList(){
		
		ModelAndView mv = new ModelAndView("courceList");
		Cource cource = courceService.selectById(1);
		mv.addObject("cource", cource);
		return mv;
	}
}
