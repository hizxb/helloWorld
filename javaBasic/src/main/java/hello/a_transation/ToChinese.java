package hello.a_transation;
public class ToChinese {  
  
    /** 
     * @param args 
     */  
    /** 
     * @param args 
     */  
    public static void main(String[] args) {  
        String[] input = {  
                "### \u8bbe\u7f6eLogger\u8f93\u51fa\u7ea7\u522b\u548c\u8f93\u51fa\u76ee\u7684\u5730 ###",  
                "### \u628a\u65e5\u5fd7\u4fe1\u606f\u8f93\u51fa\u5230\u63a7\u5236\u53f0 ###",  
                "### \u628a\u65e5\u5fd7\u4fe1\u606f\u8f93\u51fa\u5230\u6587\u4ef6\uff1aheros.log ###",  
                "###\u663e\u793aSQL\u8bed\u53e5\u90e8\u5206"  
        };  
        for(int i=0; i<input.length;i++){  
            change(input[i]);  
        }  
    }  
  
    /** 
     *  
     */  
    private static void change(String input) {  
        // TODO Auto-generated method stub  
        System.out.println("转换前得结果："+input);  
        try {  
            String output = new String(input.getBytes("iso-8859-1"),"utf-8");  
            System.out.println("转换后得结果："+output);  
        } catch (Exception e) {  
            // TODO Auto-generated catch block  
            e.printStackTrace();  
        }  
    }  
  
}  
