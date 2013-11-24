package cn.net.hlsq.app.ui;

import java.awt.FlowLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import cn.net.hlsq.app.model.AppInfo;
import cn.net.hlsq.app.utils.BeanUtils;

public class FootPanel extends JPanel {

	private static final long serialVersionUID = 1L;

	public FootPanel() {
		initComponent();
		setVisible(true);
	}

	private void initComponent() {
		AppInfo appInfo = (AppInfo) BeanUtils.getBean("appInfo");
		JLabel label = new JLabel(appInfo.getAppAbout());
		label.setBorder(new EmptyBorder(5, 5, 5, 5));
		setLayout(new FlowLayout(FlowLayout.LEFT));
		add(label);
	}
}
