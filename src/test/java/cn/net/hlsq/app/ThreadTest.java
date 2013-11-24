package cn.net.hlsq.app;

import javax.swing.SwingUtilities;

import org.junit.Test;

import cn.net.hlsq.app.ui.MainFrame;


public class ThreadTest {
	static MainFrame mainFrame;
	@Test
	public void test1() {
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				mainFrame = new MainFrame();
			}
		});
	}
}
