package cn.net.hlsq.app.ui.panel;

import java.awt.BorderLayout;

import javax.swing.JPanel;

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
		add(new JPanel());
//		add(new StepPanel(), BorderLayout.CENTER);
	}

	/**
	 * 初始化页脚
	 * 
	 * @author gefangshuai
	 */
	private void initFoot() {
		add(new FootPanel(), BorderLayout.SOUTH);
	}
}
