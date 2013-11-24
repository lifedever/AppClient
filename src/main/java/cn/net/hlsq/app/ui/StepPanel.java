package cn.net.hlsq.app.ui;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;

import javax.swing.JPanel;

import cn.net.hlsq.app.constant.StepEnum;
import cn.net.hlsq.app.ui.step.FirstButton;
import cn.net.hlsq.app.ui.step.FirstPanel;
import cn.net.hlsq.app.ui.step.SecondButton;
import cn.net.hlsq.app.ui.step.ThirdButton;
import cn.net.hlsq.app.ui.step.ThirdPanel;
import cn.net.hlsq.app.ui.step.SecondPanel;

import javax.swing.border.MatteBorder;

/**
 * 
 * @author gefangshuai
 * @email gefangshuai@163.com
 * @createDate 2013年11月24日 下午8:49:43
 */
public class StepPanel extends JPanel {
	private static final long serialVersionUID = 1L;
	private CardLayout cardLayout = new CardLayout(10, 10);
	private JPanel cardPanel = new JPanel(cardLayout);
	private JPanel buttonPanel = new JPanel();;

	public StepPanel() {
		setLayout(new BorderLayout());
		initCardPanel();
		initButtonPanel();
		eventHandler();
		add(buttonPanel, BorderLayout.SOUTH);
		cardPanel.setBorder(new MatteBorder(0, 0, 1, 0, (Color) Color.LIGHT_GRAY));
		add(cardPanel, BorderLayout.CENTER);
	}

	/**
	 * 初始化操作的panel
	 * 
	 * @author gefangshuai
	 */
	private void initCardPanel() {

		cardPanel.add(new FirstPanel(), StepEnum.ONE.getStep());
		cardPanel.add(new SecondPanel(), StepEnum.TWO.getStep());
		cardPanel.add(new ThirdPanel(), StepEnum.THREE.getStep());
	}

	/**
	 * 初始化操作按钮
	 * 
	 * @author gefangshuai
	 */
	private void initButtonPanel() {

		// 重新写写button3

		buttonPanel.add(new FirstButton());
		buttonPanel.add(new SecondButton());
		buttonPanel.add(new ThirdButton());
	}

	/**
	 * 事件监听
	 * 
	 * @author gefangshuai
	 */
	private void eventHandler() {

	}
}
