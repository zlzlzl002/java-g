package test.main;

import test.mypac.Test;
import test.mypac.Test.Gura;
import test.mypac.Test.Monkey;

public class MainClass01 {
	// static �޼ҵ� 
	public static void main(String[] args) {
		Test t=new Test();
		Gura g=t.getGura();
		g.say();
		
		Monkey m=t.getMonkey();
		m.say();
	}
}









