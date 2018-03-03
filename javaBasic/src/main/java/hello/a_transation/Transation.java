package hello.a_transation;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
/*
 * 注:当自定义一个乱码时,输出的时候会自动转换为中文.
 */
public class Transation {

	public static void main(String[] args) throws Exception {
		String input1 = "\u6240\u6709\u5185\u7F6E\u89C4\u5219";
		System.out.println(input1);//所有内置规则
		//ææåç½®è§å    ->ISO-8859-1
		//鎵�鏈夊唴缃鍒�      ->GBK 
		//change(input1);
		
		String input2 = "ææåç½®è§å";
		change(input2);
		
		String input3 = "鎵�鏈夊唴缃鍒� ";
		//change(input3);
		
		

	}
	
	public static void change(String input) throws IOException {
		System.out.println("转换前"+input);
		String output1 = new String(input.getBytes("ISO-8859-1"),"UTF-8");
		System.out.println("转换后1"+output1);
		String output2 = new String(input.getBytes("GBK"),"UTF-8");
		System.out.println("转换后2"+output2);			
	}

}
