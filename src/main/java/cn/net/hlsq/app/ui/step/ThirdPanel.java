package cn.net.hlsq.app.ui.step;

import java.awt.Color;

import cn.net.hlsq.app.constant.StepEnum;

public class ThirdPanel extends BasePanel {
	private static final long serialVersionUID = 1L;

	public ThirdPanel() {
		init();
	}

	private void init() {
		// TODO 完成第三步的控件布局及功能
		setBackground(Color.cyan);
		setStep(StepEnum.THREE);
	}
}
