package cn.net.hlsq.app;

import cn.net.hlsq.app.ui.MainFrame;

/**
 * Hello world!
 * 
 */
public class Main {
	public static void main(String[] args) {

		java.awt.EventQueue.invokeLater(new Runnable() {

			public void run() {
				new MainFrame();
			}
		});
	}
}
