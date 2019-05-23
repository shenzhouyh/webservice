package service.com.imooc.www;

import org.apache.cxf.frontend.ServerFactoryBean;
import org.apache.cxf.interceptor.LoggingInInterceptor;

public class FirstCXFService {

	public String printReceInfo(String name){
		System.out.println("客户端发送的信息为："+name);
		return name;
	}
	
	public static void main(String[] args) {
		ServerFactoryBean factory = new ServerFactoryBean();
		//设置访问地址
		factory.setAddress("http://localhost:8085/firstService");
		//设置实现类
		factory.setServiceClass(FirstCXFService.class);
		
		
		//启动服务
		factory.create();
		System.out.println("server is running!");
	}
}
