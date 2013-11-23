package cn.net.hlsq.app.ui;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

import cn.net.hlsq.app.constant.PropEnum;
import cn.net.hlsq.app.utils.PropUtils;

/**
 * 主窗体
 * 
 * @author gefangshuai
 * @email gefangshuai@163.com
 * @createDate 2013年11月23日 下午3:21:49
 */
public class MainFrame extends MyFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MainFrame() {
		initProp();
		initComp();
	}

	private void initProp() {

		setTitle(PropUtils.getValue(PropEnum.MAIN.getPropName(), "app.name"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Toolkit kit = this.getToolkit();
		Dimension winSize = kit.getScreenSize();
		setBounds(winSize.width / 4,
				winSize.height / 4, // 位置
				Integer.parseInt(PropUtils.getValue(PropEnum.MAIN.getPropName(), "app.width")),
				Integer.parseInt(PropUtils.getValue(PropEnum.MAIN.getPropName(), "app.heigth"))); // 大小
	}

	private void initComp() {
		setJMenuBar(new MyMenuBar());
		MyPanel panel = new MyPanel();
		setContentPane(panel);
	}

	public static void main(String[] args) {
		new MainFrame();
	}
}
