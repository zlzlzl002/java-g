package test.main;

import test.fruit.Apple;
import test.fruit.AppleBox;
import test.fruit.Banana;
import test.fruit.BananaBox;
import test.fruit.FruitBox;
import test.fruit.Orange;
import test.fruit.OrangeBox;

public class MainClass01 {
	public static void main(String[] args) {
		// Apple �� ��� �ʹٸ�?
		AppleBox box1=new AppleBox();
		box1.push(new Apple());
		
		// Banana �� ��� �ʹٸ�?
		BananaBox box2=new BananaBox();
		box2.push(new Banana());
		
		// Orange �� ��� �ʹٸ�?
		OrangeBox box3=new OrangeBox();
		box3.push(new Orange());
		
		//Generic �� Apple �� �����ؼ� ��ü ���� 
		FruitBox<Apple> box4=new FruitBox<Apple>();
		box4.push(new Apple());
		
		//Generic �� Banana �� �����ؼ� ��ü ����
		FruitBox<Banana> box5=new FruitBox<Banana>();
		
		//Generic �� Orange �� �����ؼ� ��ü ����
		FruitBox<Orange> box6=new FruitBox<Orange>();
	}
}


















