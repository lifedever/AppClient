package cn.net.hlsq.app.ui.step;

import java.awt.Color;
import java.awt.Font;

import org.jb2011.lnf.beautyeye.ch3_button.BEButtonUI;

public class FirstButton extends BaseButton {

	private static final long serialVersionUID = 1L;

	public FirstButton() {
		setText("上一步");
		setEnabled(false);
		setForeground(Color.WHITE);
		setFont(new Font("宋体", Font.BOLD, 13));
		setUI(new BEButtonUI().setNormalColor(BEButtonUI.NormalColor.green));
	}
}
