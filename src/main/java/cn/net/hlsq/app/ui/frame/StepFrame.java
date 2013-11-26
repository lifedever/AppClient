package cn.net.hlsq.app.ui.frame;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

import cn.net.hlsq.app.ui.panel.StepPanel;

public class StepFrame extends MyFrame {

	private static StepFrame instance = null;
	private static final long serialVersionUID = 1L;
	private int width = 650;
	private int height = 420;

	private StepFrame() {
		initProp();
		initComponent();
		setVisible(true);
	}

	public static synchronized StepFrame getInstance() {
		if (instance == null) {
			instance = new StepFrame();
		}
		instance.setVisible(true);
		return instance;
	}

	private void initProp() {
		setTitle("数据导入向导");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

		Toolkit kit = this.getToolkit();
		Dimension winSize = kit.getScreenSize();
		setBounds((winSize.width - width) / 2, (winSize.height - height) / 2, // 位置
				width, height); // 大小
	}

	private void initComponent() {
		add(new StepPanel());
	}

}
