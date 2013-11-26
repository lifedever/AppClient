package cn.net.hlsq.app.ui.panel.buss;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

import cn.net.hlsq.app.constant.ConfigTypeEnum;
import cn.net.hlsq.app.constant.StepEnum;
import cn.net.hlsq.app.dao.AppConfigrationDao;
import cn.net.hlsq.app.model.AppConfigration;
import cn.net.hlsq.app.ui.panel.BasePanel;
import cn.net.hlsq.app.utils.BeanUtils;

public class FirstPanel extends BasePanel {
	private static final long serialVersionUID = 1L;
	private GroupLayout layout;
	JRadioButton rdbtnNewRadioButton = null;
	JRadioButton rdbtnNewRadioButton_1 = null;
	ButtonGroup radioGroup = null;
	JLabel lblNewLabel = null;
	JLabel hiddenLabel = null;

	public FirstPanel() {
		setToolTipText("温馨提示");
		init();
	}

	// TODO 完成第一步的控件布局及功能
	private void init() {
		rdbtnNewRadioButton = new JRadioButton("直接挂接的方式（速度快）");
		rdbtnNewRadioButton.setSelected(true);
		rdbtnNewRadioButton.setBackground(Color.WHITE);
		rdbtnNewRadioButton.setFont(new Font("宋体", Font.PLAIN, 14));

		rdbtnNewRadioButton_1 = new JRadioButton("FTP挂接的方式（速度较慢）");
		rdbtnNewRadioButton_1.setBackground(Color.WHITE);
		rdbtnNewRadioButton_1.setFont(new Font("宋体", Font.PLAIN, 14));

		// radio button group
		radioGroup = new ButtonGroup();
		radioGroup.add(rdbtnNewRadioButton);
		radioGroup.add(rdbtnNewRadioButton_1);

		lblNewLabel = new JLabel("1.选择附件挂接方式");
		lblNewLabel.setFont(new Font("宋体", Font.BOLD, 18));

		hiddenLabel = new JLabel("");

		layout = new GroupLayout(this);
		layout.setHorizontalGroup(layout.createParallelGroup(Alignment.LEADING).addGroup(
				layout.createSequentialGroup()
						.addGap(145)
						.addGroup(
								layout.createParallelGroup(Alignment.LEADING)
										.addGroup(
												layout.createSequentialGroup()
														.addComponent(hiddenLabel, GroupLayout.PREFERRED_SIZE, 151, GroupLayout.PREFERRED_SIZE)
														.addContainerGap())
										.addGroup(
												layout.createParallelGroup(Alignment.LEADING)
														.addGroup(
																layout.createSequentialGroup()
																		.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 206, Short.MAX_VALUE)
																		.addGap(99))
														.addGroup(
																layout.createSequentialGroup()
																		.addGroup(
																				layout.createParallelGroup(Alignment.LEADING)
																						.addComponent(rdbtnNewRadioButton_1,
																								GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
																						.addComponent(rdbtnNewRadioButton, GroupLayout.DEFAULT_SIZE,
																								220, Short.MAX_VALUE)).addGap(85))))));
		layout.setVerticalGroup(layout.createParallelGroup(Alignment.LEADING).addGroup(
				layout.createSequentialGroup().addGap(84).addComponent(lblNewLabel).addGap(45).addComponent(rdbtnNewRadioButton).addGap(18)
						.addComponent(rdbtnNewRadioButton_1).addGap(18).addComponent(hiddenLabel).addContainerGap(49, Short.MAX_VALUE)));
		setBackground(Color.WHITE);
		setStep(StepEnum.ONE);

		setLayout(layout);
	}

	@Override
	public void execute() {
		if (rdbtnNewRadioButton.isSelected()) {
			AppConfigration.getInstance().setType(ConfigTypeEnum.LOCAL.getType());
		}
		if (rdbtnNewRadioButton_1.isSelected()) {
			AppConfigration.getInstance().setType(ConfigTypeEnum.FTP.getType());
		}
		AppConfigrationDao dao = (AppConfigrationDao) BeanUtils.getBean("appConfigrationDao");

		// TODO 报错，检查simpleJdbcInsert是否注入成功
		dao.saveOrUpdate(AppConfigration.getInstance());
		System.out.println("第1个 面板的值存数据库");
	}
}
