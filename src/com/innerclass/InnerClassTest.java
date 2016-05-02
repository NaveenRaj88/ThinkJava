package com.innerclass;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.JOptionPane;
import javax.swing.Timer;

class TalkingClock{
	private int interval;
	private boolean beep;
	
	public TalkingClock(int interval , boolean beep){
		this.interval = interval;
		this.beep = beep;
	}
	
	public void start(){
		ActionListener listener = this.new TimePrinter();
		Timer t = new Timer(interval, listener);
		t.start();
	}
	
	class TimePrinter implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("At the tone, the time is "+ new Date() );
			if(TalkingClock.this.beep) Toolkit.getDefaultToolkit().beep();
		}
		
		
	}
}

public class InnerClassTest {
	
	
	
	public static void main(String[] args) {
		TalkingClock talkingClock = new TalkingClock(1000, true);
		talkingClock.start();
		JOptionPane.showMessageDialog(null, "Quit Program!");
		System.exit(0);
	}
}
