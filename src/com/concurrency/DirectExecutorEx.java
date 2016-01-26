package com.concurrency;

import java.util.concurrent.Executor;

class DirectExecutor implements Executor {
	@Override
	public void execute(Runnable command) {
		command.run();
	}
}

public class DirectExecutorEx {
	public static void main(String[] args) {
		DirectExecutor dExecutor = new DirectExecutor();
		dExecutor.execute(new LiftOff());
		for (int i = 0; i < 6; i++) {
			dExecutor.execute(new LiftOff());
		}
	}
}
