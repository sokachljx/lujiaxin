package 数据封装;
//interface USB{
//	void open();
//	void close();
//}
//class Mouse implements USB{
//	@Override
//	public void open() {
//	System.out.println("鼠标开启");
//		
//	}
//	@Override
//	public void close() {
//	System.out.println("鼠标关闭");
//	}
//}
//class KeyBoard implements USB{
//	@Override
//	public void open() {
//	System.out.println("键盘打开");
//	}
//	@Override
//	public void close() {
//	System.out.println("键盘关闭");
//	}
//}
//class NoteBook{
//	public void run() {
//	System.out.println("笔记本运行");
//	}
//	public void useUSB(USB usb) {
//		if (usb!=null) {
//			usb.open();
//			usb.close();
//		}
//	}
//	public void shutDown() {
//		System.out .println("笔记本关闭");
//	}
//}
interface Service{
	void eat();
	void sleep();
}
class Student implements Service{
	public void eat() {
		System.out.println("学生去食堂吃饭");			
		}
	public void sleep() {
		System.out.println("学生回寝室睡觉");			
		}
}
class Teacher implements Service{
	public void eat() {
		System.out.println("老师去教工餐厅吃饭");			
		}
	public void sleep() {
		System.out.println("老师回学校公寓睡觉");			
		}
}
class Parents implements Service{
	public void eat() {
		System.out.println("家长去招待所饭馆吃饭");			
		}
	public void sleep() {
		System.out.println("家长回招待所睡觉");			
		}
}
public class 接口 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Student stu=new Student();
		stu.eat();
		stu.sleep();
		Teacher t=new Teacher();
		t.eat();
		t.sleep();
		Parents p=new Parents();
		p.eat();
		p.sleep();
//       NoteBook nb =new NoteBook();
//       nb.run();
//       Mouse m=new Mouse();
//        nb.useUSB(m);
//        KeyBoard kb=new KeyBoard();
//        nb.useUSB(kb);
//        nb.shutDown();
        }
	}


