package ch08.ex03_anony;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Ex02 extends Frame {
	
	public Ex02() {
		Button btn = new Button(" ���� ");
		add(btn);
		setSize(500, 500);
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.out.println(" ������ ���� ");
				System.exit(0);
				
				super.windowClosing(e);
			}
			
		});
		
		setVisible(true);
		
			
		
			
	}

	public static void main(String[] args) {
		Ex02 ex = new Ex02();
		
		
	}

}
