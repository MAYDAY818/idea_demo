package cn.itsource.springmvc.helloworld;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class HelloWorldController implements Controller{

	@Override
	public ModelAndView handleRequest(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		
		System.out.println("Hello SpringMVC！！");
		// 设置参数
//		String user = request.getParameter("user");
//		System.out.println("user:" + user);
		
		// 回显参数
//		request.setAttribute("msg", "Hello SpringMVC!!");
//		request.getRequestDispatcher("/WEB-INF/views/hello.jsp").forward(request, response)
		ModelAndView mv = new ModelAndView();
		mv.addObject("msg","Hello SpringMVC-Model");
		mv.setViewName("/WEB-INF/views/hello.jsp");
		
		return mv;
	}
}
