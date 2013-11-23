package cn.net.hlsq.app.ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.FlowLayout;

import javax.swing.Box;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;

import cn.net.hlsq.app.model.AppInfo;
import cn.net.hlsq.app.utils.BeanUtils;

public class MainPanel extends JPanel {

	private static final long serialVersionUID = 1L;

	public MainPanel() {
		setLayout(new BorderLayout());
		JPanel panel = new JPanel();
		panel.setBorder(new MatteBorder(0, 0, 1, 0, (Color) Color.LIGHT_GRAY));
		panel.setAlignmentY(Component.BOTTOM_ALIGNMENT);
		panel.setAlignmentX(Component.RIGHT_ALIGNMENT);
		Box hBox1 = Box.createHorizontalBox();
		hBox1.add(new JLabel("姓名"));
		hBox1.add(new JTextField(20));

		Box hBox2 = Box.createHorizontalBox();
		hBox2.add(new JLabel("性别"));
		hBox2.add(Box.createHorizontalStrut(30));
		hBox2.add(new JTextField(20));

		Box vBox = Box.createVerticalBox();
		vBox.add(hBox1);
		vBox.add(Box.createVerticalStrut(30));
		vBox.add(hBox2);
		panel.add(vBox);
		add(panel, BorderLayout.CENTER);
		AppInfo appInfo = (AppInfo) BeanUtils.getBean("appInfo");
		JLabel label = new JLabel(appInfo.getAppAbout());
		label.setBorder(new EmptyBorder(5, 5, 5, 5));
		JPanel bottomPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
		bottomPanel.add(label);
		add(bottomPanel, BorderLayout.SOUTH);
	}
}
