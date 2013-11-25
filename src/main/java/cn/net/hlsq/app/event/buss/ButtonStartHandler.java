package cn.net.hlsq.app.event.buss;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import cn.net.hlsq.app.ui.frame.StepFrame;

/**
 * 点击“我们开始吧”调用的事件
 * 
 * @author gefangshuai
 * @email gefangshuai@163.com
 * @createDate 2013年11月25日 下午8:48:23
 */
public class ButtonStartHandler implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		StepFrame.getInstance();
	}
}
