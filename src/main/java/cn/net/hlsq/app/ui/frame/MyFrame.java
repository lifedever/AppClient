package cn.net.hlsq.app.ui.frame;

import java.awt.Toolkit;

import javax.swing.JFrame;

import org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper;

import cn.net.hlsq.app.model.AppInfo;
import cn.net.hlsq.app.utils.BeanUtils;

/**
 * 
 * @author gefangshuai
 * @email gefangshuai@163.com
 * @createDate 2013年11月23日 下午3:37:03
 */
public class MyFrame extends JFrame {
	private static final long serialVersionUID = 1L;
	AppInfo appInfo;
	static {
		try {
			/* 设置皮肤为BeautyEye */
			BeautyEyeLNFHelper.frameBorderStyle = BeautyEyeLNFHelper.FrameBorderStyle.osLookAndFeelDecorated;
			BeautyEyeLNFHelper.launchBeautyEyeLNF();
			// UIManager.put("RootPane.setupButtonVisible", false);//设置按钮启用或禁用
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public MyFrame() {
		appInfo = (AppInfo) BeanUtils.getBean("appInfo");
		setIconImage(Toolkit.getDefaultToolkit().getImage(MyFrame.class.getResource(appInfo.getLogo())));
	}
}
