package cn.itsource.springmvc.mvc;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * 控制数据回显测试
 * @author Administrator
 *
 */
@Controller
public class DataController {
	
	@RequestMapping("/data1")
	public ModelAndView data1(HttpServletRequest req,HttpServletResponse resp){
		req.setAttribute("data", "DataController 。。。data1");
		
		ModelAndView mv = new ModelAndView("/WEB-INF/views/data/data1.jsp");
		return mv;
	}
	
	@RequestMapping("/data2")
	public ModelAndView data2(){
		
		ModelAndView mv = new ModelAndView("/WEB-INF/views/data/data2.jsp");
//		mv.addObject("data", "最近天气回暖了...");
		mv.addObject("这个属性很特殊...");// 默认key为，当前数据的类型名称（首字母小写）
		mv.addObject(new Date());// 默认key为，当前数据的类型名称（首字母小写）
		mv.addObject(new User("admin","1234"));// 默认key为，当前数据的类型名称（首字母小写）
		
		return mv;
	}

	@RequestMapping("/data3")
	public String data3(HttpServletRequest req,HttpServletResponse resp){
		req.setAttribute("data", "这时直接返回String类型的地址");
		System.out.println("data3..");
		return "data/data3"; //代表视图的地址。 前缀 + 返回值 + 后缀
	}
	
	// 返回index.html
	@RequestMapping("/data4")
	public String data4(HttpServletRequest req,HttpServletResponse resp){
		req.setAttribute("data", "这时直接返回String类型的地址");
		System.out.println("data4..");
//		return "redirect:index.html"; //代表视图的地址。 前缀 + 返回值 + 后缀
//		return "forward:index.html"; //代表视图的地址。 前缀 + 返回值 + 后缀
		return null; //代表视图的地址。 前缀 + 返回值 + 后缀
	}
	

	/**
	 * 返回值　： 直接就是需要回传的对象，在前台页面吧中，用${首字母小写的对象类型名称}
	 * 视图  　 : 采用默认值。规则为： 前缀+“请求地址”+后缀
	 * @return
	 */
	@RequestMapping("/data40")
	@ModelAttribute("user")
	public User data40(){
		
		// 这种直接返回值的方式，如何指定视图地址呢？？
		//  /WEB-INF/views/data40.jsp
		//  前缀+ data40（默认视图名） + 后缀
		//  默认视图名为：请求地址名称
		return new User("小强","4321");
	}
	
	
	@RequestMapping("data5")
	@ResponseBody
	public String data5(Model model){
		System.out.println("data5..");
		model.addAttribute("data", "使用Model对象传值！！");
//		return "redirect:index.html"; //代表视图的地址。 前缀 + 返回值 + 后缀
//		return "forward:index.html"; //代表视图的地址。 前缀 + 返回值 + 后缀
		return "data5"; //代表视图的地址。 前缀 + 返回值 + 后缀
	}
}
