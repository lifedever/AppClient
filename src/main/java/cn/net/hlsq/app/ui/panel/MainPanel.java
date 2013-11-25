package cn.net.hlsq.app.ui.panel;

import java.awt.BorderLayout;

import javax.swing.JPanel;
import javax.swing.border.MatteBorder;
import java.awt.Color;

public class MainPanel extends JPanel {

	private static final long serialVersionUID = 1L;

	public MainPanel() {
		setLayout(new BorderLayout());
		// 初始化组件
		initComponent();
		// 初始化foot
		initFoot();
	}

	/**
	 * 初始化中间组件
	 * 
	 * @author gefangshuai
	 */
	private void initComponent() {
		 add(new StartPanel(), BorderLayout.CENTER);
	}

	/**
	 * 初始化页脚
	 * 
	 * @author gefangshuai
	 */
	private void initFoot() {
		FootPanel footPanel = new FootPanel();
		footPanel.setBorder(new MatteBorder(1, 0, 0, 0, (Color) new Color(220, 220, 220)));
		add(footPanel, BorderLayout.SOUTH);
	}
}
