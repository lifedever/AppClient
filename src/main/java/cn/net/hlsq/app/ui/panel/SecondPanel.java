package cn.net.hlsq.app.ui.panel;

import java.awt.Color;

import cn.net.hlsq.app.constant.StepEnum;

public class SecondPanel extends BasePanel {
	private static final long serialVersionUID = 1L;

	public SecondPanel() {
		init();
	}

	private void init() {
		// TODO 完成第二步的控件布局及功能
		setBackground(Color.green);
		setStep(StepEnum.TWO);
	}
}
