package cn.net.hlsq.app.ui;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

/**
 * 主窗体
 * 
 * @author gefangshuai
 * @email gefangshuai@163.com
 * @createDate 2013年11月23日 下午3:21:49
 */
public class MainFrame extends MyFrame {

	private String appName = "桌面应用";
	private int width = 600;
	private int height = 300;

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MainFrame() {
		initProp();
		initComp();
	}

	private void initProp() {

		setTitle(appName);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Toolkit kit = this.getToolkit();
		Dimension winSize = kit.getScreenSize();
		setBounds(winSize.width / 4, winSize.height / 4, // 位置
				width, height); // 大小
	}

	private void initComp() {
		setJMenuBar(new MyMenuBar());
		MyPanel panel = new MyPanel();
		setContentPane(panel);
	}

	public static void main(String[] args) {
		new MainFrame();
	}

	public String getAppName() {
		return appName;
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

	public void setAppName(String appName) {
		this.appName = appName;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public void setHeight(int height) {
		this.height = height;
	}

}
