package ���ݷ�װ;

//public class Static {
//         public static String getType() {
//        	 return "����";
//         }
//         public String getName() {
//        	 return"����";
//         }
//	public static void main(String[] args) {
//		// TODO �Զ����ɵķ������
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