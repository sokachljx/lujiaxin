package ���ݷ�װ;
class Book{
	private String title;
	private Double price;
	public void setTitle(String t) {
	   title =t;//����title����
	}
	public void setPrice(Double p) {
		if(p>0.0) {
		price=p;//����price����
		}
	}
	public String getTitle() {
		return title;
	}
	public Double getPrice() {
		return price;
	}
	public void getInfo() {
		System.out.println("����:"+title+"��ļ۸�:"+price);
	}
}
public class ��װ {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
        Book book=new Book();
        book.setTitle("Java����.");
        book.setPrice(99.8);
        book.getInfo();
	}

}
