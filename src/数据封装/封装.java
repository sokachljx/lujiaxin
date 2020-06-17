package 数据封装;
class Book{
	private String title;
	private Double price;
	public void setTitle(String t) {
	   title =t;//设置title属性
	}
	public void setPrice(Double p) {
		if(p>0.0) {
		price=p;//设置price属性
		}
	}
	public String getTitle() {
		return title;
	}
	public Double getPrice() {
		return price;
	}
	public void getInfo() {
		System.out.println("书名:"+title+"书的价格:"+price);
	}
}
public class 封装 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
        Book book=new Book();
        book.setTitle("Java开发.");
        book.setPrice(99.8);
        book.getInfo();
	}

}
