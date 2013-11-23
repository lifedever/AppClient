package cn.net.hlsq.app.ui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;

import org.springframework.stereotype.Component;

import cn.net.hlsq.app.model.AppInfo;

/**
 * 主窗体
 * 
 * @author gefangshuai
 * @email gefangshuai@163.com
 * @createDate 2013年11月23日 下午3:21:49
 */

@Component("mainFrame")
public class MainFrame extends MyFrame {

	private static final long serialVersionUID = 1L;

	private AppInfo appInfo;

	public MainFrame() {
		 initProp();
		 initComp();
	}

	public MainFrame(AppInfo appInfo) {
		this.appInfo = appInfo;
		// this.appInfo = (AppInfo) BeanUtils.getBean("appInfo");
		initProp();
		initComp();
		setVisible(true);
	}

	private void initProp() {

		setTitle(appInfo.getAppName());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Toolkit kit = this.getToolkit();
		Dimension winSize = kit.getScreenSize();
		setBounds(winSize.width / 4, winSize.height / 4, // 位置
				appInfo.getAppWidth(), appInfo.getAppHeight()); // 大小
	}

	private void initComp() {
		setJMenuBar(new MyMenuBar());
		MainPanel panel = new MainPanel();
		setContentPane(panel);
	}

}
