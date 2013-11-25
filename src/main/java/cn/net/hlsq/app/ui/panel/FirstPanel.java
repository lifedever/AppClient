package cn.net.hlsq.app.ui.panel;

import java.awt.Color;

import cn.net.hlsq.app.constant.StepEnum;

public class FirstPanel extends BasePanel {
	private static final long serialVersionUID = 1L;

	public FirstPanel() {
		init();
	}

	private void init() {
		// TODO 完成第一步的控件布局及功能
		setBackground(Color.WHITE);
		setStep(StepEnum.ONE);
	}
}
