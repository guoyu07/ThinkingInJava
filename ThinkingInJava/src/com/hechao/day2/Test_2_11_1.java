package com.hechao.day2;

public class Test_2_11_1 {

	static int i;

	public static void main(String[] args) {


//		new Test_2_11_1().add();
//		new Test_2_11_1().add();
//		new Test_2_11_1().add();
//		new Test_2_11_1().add();
		
//		test1();
//		System.out.println("hello");
	for(String string:args){
		System.out.println(string);
	}
		
		
		
	}

	
	private static void test1() {
		Integer integer=1;
		int i1=new Integer(1);
		System.out.println(integer+" "+i1);
	}

	void add(){
		i++;
		System.out.println(i);
	}

}
