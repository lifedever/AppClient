package cn.net.hlsq.app.ui.step;

import java.awt.Color;
import java.awt.Font;

import org.jb2011.lnf.beautyeye.ch3_button.BEButtonUI;

public class ThirdButton extends BaseButton {
	private static final long serialVersionUID = 1L;

	public ThirdButton() {
		setText("重新开始");
		setForeground(Color.WHITE);
		setUI(new BEButtonUI().setNormalColor(BEButtonUI.NormalColor.red));
		setFont(new Font("宋体", Font.BOLD, 13));
	}
}
