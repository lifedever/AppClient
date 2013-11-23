package cn.net.hlsq.app.ui;

import javax.swing.JFrame;

import org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper;

/**
 * 
 * @author gefangshuai
 * @email gefangshuai@163.com
 * @createDate 2013年11月23日 下午3:37:03
 */
public class MyFrame extends JFrame {
	private static final long serialVersionUID = 1L;
	static {
		try {
			/* 设置皮肤为BeautyEye */
			BeautyEyeLNFHelper.frameBorderStyle = BeautyEyeLNFHelper.FrameBorderStyle.translucencyAppleLike;
			BeautyEyeLNFHelper.launchBeautyEyeLNF();
			// UIManager.put("RootPane.setupButtonVisible", false);//设置按钮启用或禁用
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
