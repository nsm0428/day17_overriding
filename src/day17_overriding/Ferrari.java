package day17_overriding;

import java.util.*;

public class Ferrari extends ArrayList<String>{
	private int ye;
	public Ferrari(int ye) {
		this.ye = ye;
	}
	public int getYe() {
		return ye;
	}
	public void speed() {
		System.out.println(ye + "년식 페라리 속도 : 300km");
		add("ttt");
		System.out.println(get(0));
	}
//	@Override
//	public boolean add(String e) {
//		System.out.println("내가 만든 add메소드 출력");
//		System.out.println("저장은 안한다");
//		return true;
//	}
	
}
