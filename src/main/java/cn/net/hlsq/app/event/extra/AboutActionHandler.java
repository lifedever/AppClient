package cn.net.hlsq.app.event.extra;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import cn.net.hlsq.app.model.AppInfo;
import cn.net.hlsq.app.utils.BeanUtils;

/**
 * 菜单关于按钮的点击事件
 * 
 * @author gefangshuai
 * @email gefangshuai@163.com
 * @createDate 2013年11月23日 下午3:54:46
 */
public class AboutActionHandler implements ActionListener {

	public void actionPerformed(ActionEvent e) {
		AppInfo appInfo = (AppInfo) BeanUtils.getBean("appInfo");
		JOptionPane.showMessageDialog(null, appInfo.getAppAbout(), "关于", JOptionPane.WARNING_MESSAGE);
	}

}
