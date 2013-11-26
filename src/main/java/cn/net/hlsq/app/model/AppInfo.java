package cn.net.hlsq.app.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * 应用程序信息类
 * 
 * @author gefangshuai
 * @email gefangshuai@163.com
 * @createDate 2013年11月23日 下午7:44:22
 */
@Component("appInfo")
public class AppInfo {
	@Value("#{properties['app.name']}")
	private String appName;
	@Value("#{properties['app.width']}")
	private int appWidth;
	@Value("#{properties['app.height']}")
	private int appHeight;
	@Value("#{properties['app.about']}")
	private String appAbout;
	@Value("#{properties['app.logo']}")
	private String logo;

	public String getAppName() {
		return appName;
	}

	public int getAppWidth() {
		return appWidth;
	}

	public int getAppHeight() {
		return appHeight;
	}

	public String getAppAbout() {
		return appAbout;
	}

	public void setAppName(String appName) {
		this.appName = appName;
	}

	public void setAppWidth(int appWidth) {
		this.appWidth = appWidth;
	}

	public void setAppHeight(int appHeight) {
		this.appHeight = appHeight;
	}

	public void setAppAbout(String appAbout) {
		this.appAbout = appAbout;
	}

	public String getLogo() {
		return logo;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}

}
