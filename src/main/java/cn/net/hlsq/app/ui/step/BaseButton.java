package cn.net.hlsq.app.ui.step;

import javax.swing.JButton;

import cn.net.hlsq.app.event.buss.BaseStepOperation;

public class BaseButton extends JButton {

	private static final long serialVersionUID = 1L;
	public static int step = 0;

	public BaseButton() {
		addActionListener(new BaseStepOperation());
	}

}
