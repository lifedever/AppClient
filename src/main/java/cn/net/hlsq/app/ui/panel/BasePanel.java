package cn.net.hlsq.app.ui.panel;

import javax.swing.JPanel;

import cn.net.hlsq.app.constant.StepEnum;

public class BasePanel extends JPanel {
	private static final long serialVersionUID = 1L;
	private StepEnum step;

	public StepEnum getStep() {
		return step;
	}

	public void setStep(StepEnum step) {
		this.step = step;
	}

}
