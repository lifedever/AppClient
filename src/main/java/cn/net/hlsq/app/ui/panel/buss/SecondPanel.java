package cn.net.hlsq.app.ui.panel.buss;

import java.awt.Color;

import cn.net.hlsq.app.constant.StepEnum;
import cn.net.hlsq.app.ui.panel.BasePanel;

public class SecondPanel extends BasePanel {
	private static final long serialVersionUID = 1L;

	public SecondPanel() {
		init();
	}

	private void init() {
		setBackground(Color.green);
		setStep(StepEnum.TWO);
	}

	// TODO 完成第二步的控件布局及功能
	@Override
	public void execute() {
		System.out.println("第2个面板的值存数据库");
	}
}
