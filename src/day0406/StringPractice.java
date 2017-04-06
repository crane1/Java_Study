package day0406;

public class StringPractice {
	
	public static void checkQQNormal(String qq){
		boolean flag = true;
		char head = qq.charAt(0);
		if(head <= '0' || head > '9'){  //首部为1-9
			System.out.println("首字符输入不合法");
			return;
		}
		if(qq.length() >= 5 && qq.length() <= 10){
			char[] qqs = qq.toCharArray();
			for(int i = 1; i < qqs.length; i++){
				if(qqs[i] < '0' || qqs[i] > '9'){
					flag = false;
					System.out.println("输入内容不合法,位置：" + (i+1));
					break;
				}
			}
		}else{
			System.out.println("长度不合法");
		}
		
		if(flag){
			System.out.println("qq:" + qq);
		}
	}
	
	public static void checkQQRegex(String qq){
		String regex = "[1-9][0-9]{4,9}";
		boolean flag = qq.matches(regex);
		if(flag){
			System.out.println("qq:" + qq);
		}else{
			System.out.println("输入不合法");
		}
	}
	public static void main(String[] args) {
//		String qq = "82l169813";
//		checkQQNormal(qq);
//		checkQQRegex(qq);
//		
//		String str = "D:\\workspace\\test.txt";
//		String[] strs = str.split("\\\\");
//		for(String s : strs){
//			System.out.println(s);
//		}
		
		//叠词替换
		String strv = "dddd34eeej";
		strv = strv.replaceAll( "([a-zA-Z])\\1{2,}", "^(*￣(oo)￣)^");
		System.out.println(strv);
		
		
				
	}
}
