package com.hortsmann;

import java.awt.Toolkit;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import javax.swing.Timer;

public class TimerUsingLambda {

	public static void main(String[] args) throws InterruptedException {
		Timer t = new Timer(1000, event->{
			System.out.println("At the tone, the time is " + new Date());
			Toolkit.getDefaultToolkit().beep();
		});
		t.start();
		TimeUnit.SECONDS.sleep(2000);
	}
}
