package cn.itsource.springmvc;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
//把这个类标识为一个controller
@Controller
//@RequestMapping("demoController")
public class DemoController {

	@RequestMapping("/demo6")
	public ModelAndView demo6(String user) throws Exception {
		System.out.println("DemoController -- Demo4");
		// 设置返回内容
		ModelAndView mv = new ModelAndView("/WEB-INF/views/demo.jsp");
//		mv.setViewName(viewName)
		mv.addObject("msg", "第一个基于注解的Controller方法!!");
		
		return mv;
	}
	
	//RequestMapping 映射路径的注解
	@RequestMapping(value="/demo1")
	public ModelAndView handleRequest(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		System.out.println("DemoController -- Demo1");
		return null;
	}

	
	@RequestMapping(value="/demo2")
	public ModelAndView handleRequest1(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		System.out.println("DemoController -- Demo2");
		
		return null;
	}
	
	@RequestMapping(value="/demo3")
	public ModelAndView demo3(HttpServletResponse response,HttpServletRequest request) throws Exception {
		System.out.println("DemoController -- Demo3");
		
		System.out.println(request);
		
		return null;
	}
	
	@RequestMapping(value="/demo4")
	public ModelAndView demo4(HttpServletResponse response,HttpSession session) throws Exception {
		System.out.println("DemoController -- Demo4");
		
		System.out.println(response);
		System.out.println(session);
		
		return null;
	}
	
	/**
	 * 控制器方法的形参，可以使任意类型
	 * @param user
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value="/demo5")
	public ModelAndView demo5(String user) throws Exception {
		System.out.println("DemoController -- Demo4");
		
		System.out.println(user);
		
		// 设置返回内容、
		ModelAndView mv = new ModelAndView("/WEB-INF/views/demo.jsp");
//		mv.setViewName(viewName)
		mv.addObject("msg", "第一个基于注解的Controller方法!!");
		
		return mv; 
	}
	
	
}
