package service.com.imooc.www;

import org.apache.cxf.frontend.ServerFactoryBean;
import org.apache.cxf.interceptor.LoggingInInterceptor;

public class FirstCXFService {

	public String printReceInfo(String name){
		System.out.println("�ͻ��˷��͵���ϢΪ��"+name);
		return name;
	}
	
	public static void main(String[] args) {
		ServerFactoryBean factory = new ServerFactoryBean();
		//���÷��ʵ�ַ
		factory.setAddress("http://localhost:8085/firstService");
		//����ʵ����
		factory.setServiceClass(FirstCXFService.class);
		
		
		//��������
		factory.create();
		System.out.println("server is running!");
	}
}
