package day17_overriding_Quiz;

import java.awt.*;
import java.text.*;
import java.util.*;

public class Quiz01_member {
	public void timeThread() {
		Date date01 = new Date();
		SimpleDateFormat simp = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
		Label label = new Label();
		
		for(int i = 0; i<10; i++) {
			try {
				Date date = new Date();
				label.setText(simp.format(date));
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		Date date02 = new Date();
	}
}