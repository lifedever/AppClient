package cn.net.hlsq.app.ui.panel;

import java.awt.Color;

import javax.swing.GroupLayout;

import cn.net.hlsq.app.constant.StepEnum;
import javax.swing.JLabel;
import javax.swing.GroupLayout.Alignment;
import java.awt.Font;
import javax.swing.LayoutStyle.ComponentPlacement;

public class FirstPanel extends BasePanel {
	private static final long serialVersionUID = 1L;
	private GroupLayout layout;
	public FirstPanel() {
		setToolTipText("温馨提示");
		init();
	}

	private void init() {
		// TODO 完成第一步的控件布局及功能
		setBackground(new Color(255, 255, 255));
		setStep(StepEnum.ONE);
		
		JLabel label = new JLabel("开始使用");
		label.setToolTipText("");
		label.setFont(new Font("宋体", Font.BOLD, 29));
		
		JLabel lblNewLabel = new JLabel("<html>\r\n\t<p>&nbsp;&nbsp;本程序提供两种方式完成附件挂接到档案系统的功能</p>\r\n\t<ol>\r\n\t\t<li>\r\n\t\t\t<strong>直接挂接的方式</strong><br />\r\n\t\t\t这种方式速度比较快。要求程序和附件必须在同一台电脑上，配置路径要指定附件所在位置的绝对路径。\r\n\t\t</li>\r\n\t\t<li>\r\n\t\t\t<strong>FTP的方式</strong><br />\r\n\t\t\t这种方式速度比较慢。一般适用于出于某些原因无法直接接触附件的情况，可以通过ftp链接到附件所在的机器，然后完成附件与档案系统的挂接。\r\n\t\t</li>\r\n\t</ol>\r\n\t<p>&nbsp;&nbsp;两种功能适用于两种不同场合的需求，您可以按照您自己的需求来灵活选择。</p>\r\n\t<p><font color=\"red\">&nbsp;&nbsp;温馨提示：</font>在没有严格要求的情况下，建议您选择第一种，第一种的优点就是直接将附件相对路径写到数据库，无需进行数据的拷贝，处理速度特别快！</p>\r\n</html>");
		lblNewLabel.setFont(new Font("新宋体", Font.PLAIN, 15));
		layout = new GroupLayout(this);
		layout.setHorizontalGroup(
			layout.createParallelGroup(Alignment.TRAILING)
				.addGroup(layout.createSequentialGroup()
					.addGroup(layout.createParallelGroup(Alignment.CENTER)
						.addComponent(lblNewLabel)
						.addComponent(label))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		layout.setVerticalGroup(
			layout.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, layout.createSequentialGroup()
					.addContainerGap()
					.addComponent(label, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 230, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(20, Short.MAX_VALUE))
		);
		setLayout(layout);
	}
}
