package cn.net.hlsq.app.ui.button;

import java.awt.Color;
import java.awt.Font;

import org.jb2011.lnf.beautyeye.ch3_button.BEButtonUI;

public class SecondButton extends BaseButton {

	private static final long serialVersionUID = 1L;

	public SecondButton() {
		setText("下一步");
		setForeground(Color.WHITE);
		setFont(new Font("宋体", Font.BOLD, 13));
		setUI(new BEButtonUI().setNormalColor(BEButtonUI.NormalColor.green));
	}
}
