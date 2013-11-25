package cn.net.hlsq.app.ui.button;

import javax.swing.JButton;

import cn.net.hlsq.app.event.buss.BaseStepHandler;

public class BaseButton extends JButton {

	private static final long serialVersionUID = 1L;
	public static int step = 0;

	public BaseButton() {
		addActionListener(new BaseStepHandler());
	}

}
