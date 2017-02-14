package HD.springbootTest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
* @ClassName: HelloController 
* @Description: TODO(这里用一句话描述这个类的作用) 
* @author 宋海贝 songhaibei7305@163.com
* @date 2017年2月13日 上午10:11:19 
*
 */
@RestController
public class HelloController {
	
	@RequestMapping("/hello")
	public String Hello(){
		return "hello baby";
	}
	
	@RequestMapping("/getDemo")
	public Demo getDemo(){
		Demo demo = new Demo();
		demo.setId(1);
		demo.setName("张三");
		return demo;
	}
	
	@RequestMapping("/hello1")
	public String Hello1(){
		return "hello test";
	}
}
