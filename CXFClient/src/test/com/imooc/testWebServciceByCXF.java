package test.com.imooc;

import org.junit.Test;

import service.com.imooc.FirstCXFService;
import service.com.imooc.FirstCXFServicePortType;

public class testWebServciceByCXF {

	@Test
	public void test(){
		FirstCXFService firstService = new FirstCXFService();
		FirstCXFServicePortType cxfServicePortType=firstService.getFirstCXFServicePort();
		cxfServicePortType.printReceInfo("哈哈哈，这是我客户端传输的文本");
	}
}
