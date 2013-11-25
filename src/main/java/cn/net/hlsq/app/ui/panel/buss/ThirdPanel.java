package cn.net.hlsq.app.ui.panel.buss;

import java.awt.Color;

import cn.net.hlsq.app.constant.StepEnum;
import cn.net.hlsq.app.ui.panel.BasePanel;

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
