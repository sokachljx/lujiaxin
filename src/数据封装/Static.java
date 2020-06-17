package 数据封装;

//public class Static {
//         public static String getType() {
//        	 return "人类";
//         }
//         public String getName() {
//        	 return"张三";
//         }
//	public static void main(String[] args) {
//		// TODO 自动生成的方法存根
//          Static a=new Static();
//          System.out.println(a.getName());
//          System.out.println(a.getType());
//	}
//
//}
public class Static extends Base{
	static {
		System.out.println("test static");
	}
	public Static() {
		System.out.println("test constructor");
	}
	public static void main(String[] args) {
		new Static();
	}
}
class Base{
	static {
		System.out.println("base static");
	}
	public Base() {
		System.out.println("base constructor");
	}
}