package cn.net.hlsq.app;

import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JDialog;
import javax.swing.JLabel;

/**
 * 菜单关于按钮的点击事件
 * 
 * @author gefangshuai
 * @email gefangshuai@163.com
 * @createDate 2013年11月23日 下午3:54:46
 */
public class AboutActionHandler implements ActionListener {

	public void actionPerformed(ActionEvent e) {
		JDialog dialog = new JDialog(new Frame(), "关于", true);
		dialog.setDefaultCloseOperation(JDialog.HIDE_ON_CLOSE);
		dialog.setSize(300, 180);
		dialog.add(new JLabel("这个是对话框"));
		dialog.setVisible(true); // 显示对话框，窗口阻塞，不往下执行，只有等到对话框关闭了才往下执行。
	}

}
