package ���ݷ�װ;
//interface USB{
//	void open();
//	void close();
//}
//class Mouse implements USB{
//	@Override
//	public void open() {
//	System.out.println("��꿪��");
//		
//	}
//	@Override
//	public void close() {
//	System.out.println("���ر�");
//	}
//}
//class KeyBoard implements USB{
//	@Override
//	public void open() {
//	System.out.println("���̴�");
//	}
//	@Override
//	public void close() {
//	System.out.println("���̹ر�");
//	}
//}
//class NoteBook{
//	public void run() {
//	System.out.println("�ʼǱ�����");
//	}
//	public void useUSB(USB usb) {
//		if (usb!=null) {
//			usb.open();
//			usb.close();
//		}
//	}
//	public void shutDown() {
//		System.out .println("�ʼǱ��ر�");
//	}
//}
interface Service{
	void eat();
	void sleep();
}
class Student implements Service{
	public void eat() {
		System.out.println("ѧ��ȥʳ�óԷ�");			
		}
	public void sleep() {
		System.out.println("ѧ��������˯��");			
		}
}
class Teacher implements Service{
	public void eat() {
		System.out.println("��ʦȥ�̹������Է�");			
		}
	public void sleep() {
		System.out.println("��ʦ��ѧУ��Ԣ˯��");			
		}
}
class Parents implements Service{
	public void eat() {
		System.out.println("�ҳ�ȥ�д������ݳԷ�");			
		}
	public void sleep() {
		System.out.println("�ҳ����д���˯��");			
		}
}
public class �ӿ� {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
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


