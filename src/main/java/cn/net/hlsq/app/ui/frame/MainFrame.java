package cn.net.hlsq.app.ui.frame;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

import org.springframework.stereotype.Component;

import cn.net.hlsq.app.model.AppInfo;
import cn.net.hlsq.app.ui.base.MyMenuBar;
import cn.net.hlsq.app.ui.panel.MainPanel;
import cn.net.hlsq.app.utils.BeanUtils;

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
		appInfo = (AppInfo) BeanUtils.getBean("appInfo");
		initProp();
		initComp();
		setVisible(true);
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
		setBounds((winSize.width - appInfo.getAppWidth()) / 2, (winSize.height - appInfo.getAppHeight()) / 2, // 位置
				appInfo.getAppWidth(), appInfo.getAppHeight()); // 大小
	}

	private void initComp() {
		setJMenuBar(new MyMenuBar());
		MainPanel panel = new MainPanel();
		setContentPane(panel);
	}

}
