package cn.net.hlsq.app.ui.panel;

import javax.swing.JPanel;

import cn.net.hlsq.app.constant.StepEnum;

public abstract class BasePanel extends JPanel {
	private static final long serialVersionUID = 1L;
	private StepEnum step;
	
	/**
	 * 执行此面板上的相关操作
	 * @author gefangshuai
	 */
	public abstract void execute();
	
	public StepEnum getStep() {
		return step;
	}

	public void setStep(StepEnum step) {
		this.step = step;
	}

}
