package p1;

class CBox
{
	int length;
	int width;
	int height;
}

public class class04 {
	public static void main(String args[]) {
		CBox box;
		box =new CBox();
		
		box.length =15;
		box.height =25;
		box.width =10;
		
		System.out.println("length="+box.length);
		System.out.println("height="+box.height);
		System.out.println("width="+box.width);
	}

}
