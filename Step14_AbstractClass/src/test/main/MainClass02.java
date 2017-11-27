package test.main;
/*
 *  연습 한거임
 */
import test.yourpac.MyPen;
import test.yourpac.YourPen;
import test.yourpac.pen;

public class MainClass02 {
	public static void main(String[] args) {
		MyPen p1 = new MyPen();
		p1.paint();
		p1.Color();
		
		pen p2 = new YourPen();
		p2.paint();
		p2.Color();
	}
}
