package cn.net.hlsq.app;

import org.springframework.stereotype.Component;

import cn.net.hlsq.app.model.AppInfo;
import cn.net.hlsq.app.ui.MainFrame;
import cn.net.hlsq.app.utils.BeanUtils;

/**
 * Hello world!
 * 
 */
@Component("app")
public class App {
	public static void main(String[] args) {
		AppInfo appInfo = (AppInfo) BeanUtils.getBean("appInfo");
		new MainFrame(appInfo);
	}
}
