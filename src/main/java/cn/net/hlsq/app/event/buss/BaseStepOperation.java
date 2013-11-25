package cn.net.hlsq.app.event.buss;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import cn.net.hlsq.app.ui.button.BaseButton;
import cn.net.hlsq.app.ui.button.FirstButton;
import cn.net.hlsq.app.ui.button.SecondButton;
import cn.net.hlsq.app.ui.button.ThirdButton;

public class BaseStepOperation implements ActionListener {
	CardLayout cardLayout;
	JPanel cardPanel;

	CardLayout getCardLayout(ActionEvent e) {
		JButton currentButton = (JButton) e.getSource();
		BorderLayout borderLayout = (BorderLayout) currentButton.getParent().getParent().getLayout();
		cardPanel = (JPanel) borderLayout.getLayoutComponent(BorderLayout.CENTER);
		return (CardLayout) cardPanel.getLayout();
	}

	private BaseButton getFirstButton(ActionEvent e) {
		JButton currentButton = (JButton) e.getSource();
		JPanel parent = (JPanel) currentButton.getParent();
		return (BaseButton) parent.getComponent(0);
	}

	private BaseButton getSecondButton(ActionEvent e) {
		JButton currentButton = (JButton) e.getSource();
		JPanel parent = (JPanel) currentButton.getParent();
		return (BaseButton) parent.getComponent(1);
	}

	// TODO 待解决step值变更问题

	@Override
	public void actionPerformed(ActionEvent e) {
		BaseButton button = (BaseButton) e.getSource();
		if (button instanceof FirstButton) {
			BaseButton.step--;
			firstButtonAction(e);
		} else if (button instanceof SecondButton) {
			BaseButton.step++;
			secondButtonAction(e);

		} else if (button instanceof ThirdButton) {
			thirdButtonAction();
		}
		
		if (BaseButton.step == 0) {
			getFirstButton(e).setEnabled(false);
			getSecondButton(e).setEnabled(true);
		} else if (BaseButton.step == 2) {
			getSecondButton(e).setEnabled(false);
			getFirstButton(e).setEnabled(true);
		} else {
			getFirstButton(e).setEnabled(true);
			getSecondButton(e).setEnabled(true);
		}
	}

	/**
	 * 第一个按钮的事件
	 * 
	 */
	private void firstButtonAction(ActionEvent e) {
		getCardLayout(e).previous(cardPanel);
	}

	/**
	 * 第二个按钮的事件
	 * 
	 */
	private void secondButtonAction(ActionEvent e) {
		getCardLayout(e).next(cardPanel);
	}

	/**
	 * 第三个按钮的事件
	 * 
	 */
	private void thirdButtonAction() {
		JOptionPane.showConfirmDialog(null, "确定要重新开始吗？\n 注意：之前的操作选项都会被清除！", "重新开始", JOptionPane.YES_NO_OPTION);
	}
}
