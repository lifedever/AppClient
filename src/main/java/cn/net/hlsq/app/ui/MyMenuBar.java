package cn.net.hlsq.app.ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import cn.net.hlsq.app.handler.AboutActionHandler;

public class MyMenuBar extends JMenuBar {
	private static final long serialVersionUID = 1L;

	public MyMenuBar() {
		JMenu menu1 = new JMenu("文件");
		JMenuItem item11 = new JMenuItem("导入");
		JMenuItem item12 = new JMenuItem("导出");
		JMenuItem item13 = new JMenuItem("退出");
		item13.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				int i = JOptionPane.showConfirmDialog(null, "确定退出吗", "退出确认", JOptionPane.YES_NO_OPTION);
				if (0 == i) {
					System.exit(0);
				}
			}
		});
		menu1.add(item11);
		menu1.add(item12);
		menu1.addSeparator();
		menu1.add(item13);

		JMenu menu2 = new JMenu("帮助");
		JMenuItem item21 = new JMenuItem("文档");
		JMenuItem item22 = new JMenuItem("关于");
		item22.addActionListener(new AboutActionHandler());
		menu2.add(item21);
		menu2.add(item22);

		add(menu1);
		add(menu2);

	}
}
