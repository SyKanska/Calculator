package com.javafee.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.border.LineBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.SwingConstants;

public class CalculatorFrame extends JFrame {
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textFieldResult;

	private JButton btnPercent;
	private JButton btnElement;
	private JButton btnSquared;
	private JButton btnOpposite;
	private JButton btnCE;
	private JButton btnC;
	private JButton btnBackspace;
	private JButton btnDivision;
	private JButton btn7;
	private JButton btn8;
	private JButton btn9;
	private JButton btnX;
	private JButton btn4;
	private JButton btn5;
	private JButton btn6;
	private JButton btnMinus;
	private JButton btn1;
	private JButton btn2;
	private JButton btn3;
	private JButton btnPlus;
	private JButton btnPlusMinus;
	private JButton btn0;
	private JButton btnComma;
	private JButton btnEqual;

	public CalculatorFrame() {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (UnsupportedLookAndFeelException e) {
			e.printStackTrace();
		}
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 700);
		contentPane = new JPanel();
		contentPane.setVerifyInputWhenFocusTarget(false);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{94, 94, 94, 94, 0};
		gbl_contentPane.rowHeights = new int[]{92, 92, 92, 92, 92, 92, 92, 0};
		gbl_contentPane.columnWeights = new double[]{1.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		textFieldResult = new JTextField();
		textFieldResult.setHorizontalAlignment(SwingConstants.RIGHT);
		textFieldResult.setFont(new Font("Tahoma", Font.PLAIN, 35));
		textFieldResult.setEnabled(false);
		GridBagConstraints gbc_textFieldResult = new GridBagConstraints();
		gbc_textFieldResult.gridwidth = 4;
		gbc_textFieldResult.insets = new Insets(0, 0, 5, 0);
		gbc_textFieldResult.fill = GridBagConstraints.BOTH;
		gbc_textFieldResult.gridx = 0;
		gbc_textFieldResult.gridy = 0;
		contentPane.add(textFieldResult, gbc_textFieldResult);
		textFieldResult.setColumns(10);
		
		btnPercent = new JButton("%");
		btnPercent.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GridBagConstraints gbc_btnPercent = new GridBagConstraints();
		gbc_btnPercent.fill = GridBagConstraints.BOTH;
		gbc_btnPercent.insets = new Insets(0, 0, 5, 5);
		gbc_btnPercent.gridx = 0;
		gbc_btnPercent.gridy = 1;
		contentPane.add(btnPercent, gbc_btnPercent);
		
		btnElement = new JButton("\u221A"); //unicode
		btnElement.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GridBagConstraints gbc_btnElement = new GridBagConstraints();
		gbc_btnElement.fill = GridBagConstraints.BOTH;
		gbc_btnElement.insets = new Insets(0, 0, 5, 5);
		gbc_btnElement.gridx = 1;
		gbc_btnElement.gridy = 1;
		contentPane.add(btnElement, gbc_btnElement);
		
		btnSquared = new JButton("x\u00B2");
		btnSquared.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GridBagConstraints gbc_btnSquared = new GridBagConstraints();
		gbc_btnSquared.fill = GridBagConstraints.BOTH;
		gbc_btnSquared.insets = new Insets(0, 0, 5, 5);
		gbc_btnSquared.gridx = 2;
		gbc_btnSquared.gridy = 1;
		contentPane.add(btnSquared, gbc_btnSquared);
		
		btnOpposite = new JButton("\u215Fx");
		btnOpposite.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GridBagConstraints gbc_btnOpposite = new GridBagConstraints();
		gbc_btnOpposite.fill = GridBagConstraints.BOTH;
		gbc_btnOpposite.insets = new Insets(0, 0, 5, 0);
		gbc_btnOpposite.gridx = 3;
		gbc_btnOpposite.gridy = 1;
		contentPane.add(btnOpposite, gbc_btnOpposite);
		
		btnCE = new JButton("CE");
		btnCE.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GridBagConstraints gbc_btnCE = new GridBagConstraints();
		gbc_btnCE.fill = GridBagConstraints.BOTH;
		gbc_btnCE.insets = new Insets(0, 0, 5, 5);
		gbc_btnCE.gridx = 0;
		gbc_btnCE.gridy = 2;
		contentPane.add(btnCE, gbc_btnCE);
		
		btnC = new JButton("C");
		btnC.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GridBagConstraints gbc_btnC = new GridBagConstraints();
		gbc_btnC.fill = GridBagConstraints.BOTH;
		gbc_btnC.insets = new Insets(0, 0, 5, 5);
		gbc_btnC.gridx = 1;
		gbc_btnC.gridy = 2;
		contentPane.add(btnC, gbc_btnC);
		
		btnBackspace = new JButton("\u2190");
		btnBackspace.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GridBagConstraints gbc_btnBackspace = new GridBagConstraints();
		gbc_btnBackspace.fill = GridBagConstraints.BOTH;
		gbc_btnBackspace.insets = new Insets(0, 0, 5, 5);
		gbc_btnBackspace.gridx = 2;
		gbc_btnBackspace.gridy = 2;
		contentPane.add(btnBackspace, gbc_btnBackspace);
		
		btnDivision = new JButton("\u00F7"); //00F7 or 002F
		btnDivision.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GridBagConstraints gbc_btnDivision = new GridBagConstraints();
		gbc_btnDivision.fill = GridBagConstraints.BOTH;
		gbc_btnDivision.insets = new Insets(0, 0, 5, 0);
		gbc_btnDivision.gridx = 3;
		gbc_btnDivision.gridy = 2;
		contentPane.add(btnDivision, gbc_btnDivision);
		
		btn7 = new JButton("7");
		btn7.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn7.setBackground(new Color(255, 255, 224));
		btn7.setContentAreaFilled(false);
		btn7.setOpaque(true);
		GridBagConstraints gbc_btn7 = new GridBagConstraints();
		gbc_btn7.fill = GridBagConstraints.BOTH;
		gbc_btn7.insets = new Insets(0, 0, 5, 5);
		gbc_btn7.gridx = 0;
		gbc_btn7.gridy = 3;
		contentPane.add(btn7, gbc_btn7);
		
		btn8 = new JButton("8");
		btn8.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn8.setBackground(new Color(255, 255, 224));
		btn8.setContentAreaFilled(false);
		btn8.setOpaque(true);
		GridBagConstraints gbc_btn8 = new GridBagConstraints();
		gbc_btn8.fill = GridBagConstraints.BOTH;
		gbc_btn8.insets = new Insets(0, 0, 5, 5);
		gbc_btn8.gridx = 1;
		gbc_btn8.gridy = 3;
		contentPane.add(btn8, gbc_btn8);
		
		btn9 = new JButton("9");
		btn9.setContentAreaFilled(false);
		btn9.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn9.setBackground(new Color(255, 255, 224));
		btn9.setOpaque(true);
		GridBagConstraints gbc_btn9 = new GridBagConstraints();
		gbc_btn9.fill = GridBagConstraints.BOTH;
		gbc_btn9.insets = new Insets(0, 0, 5, 5);
		gbc_btn9.gridx = 2;
		gbc_btn9.gridy = 3;
		contentPane.add(btn9, gbc_btn9);
		
		btnX = new JButton("x");
		btnX.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GridBagConstraints gbc_btnX = new GridBagConstraints();
		gbc_btnX.fill = GridBagConstraints.BOTH;
		gbc_btnX.insets = new Insets(0, 0, 5, 0);
		gbc_btnX.gridx = 3;
		gbc_btnX.gridy = 3;
		contentPane.add(btnX, gbc_btnX);
		
		btn4 = new JButton("4");
		btn4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn4.setBackground(new Color(255, 255, 224));
		btn4.setContentAreaFilled(false);
		btn4.setOpaque(true);
		GridBagConstraints gbc_btn4 = new GridBagConstraints();
		gbc_btn4.fill = GridBagConstraints.BOTH;
		gbc_btn4.insets = new Insets(0, 0, 5, 5);
		gbc_btn4.gridx = 0;
		gbc_btn4.gridy = 4;
		contentPane.add(btn4, gbc_btn4);
		
		btn5 = new JButton("5");
		btn5.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn5.setBackground(new Color(255, 255, 224));
		btn5.setContentAreaFilled(false);
		btn5.setOpaque(true);
		GridBagConstraints gbc_btn5 = new GridBagConstraints();
		gbc_btn5.fill = GridBagConstraints.BOTH;
		gbc_btn5.insets = new Insets(0, 0, 5, 5);
		gbc_btn5.gridx = 1;
		gbc_btn5.gridy = 4;
		contentPane.add(btn5, gbc_btn5);
		
		btn6 = new JButton("6");
		btn6.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn6.setBackground(new Color(255, 255, 224));
		btn6.setContentAreaFilled(false);
		btn6.setOpaque(true);
		GridBagConstraints gbc_btn6 = new GridBagConstraints();
		gbc_btn6.fill = GridBagConstraints.BOTH;
		gbc_btn6.insets = new Insets(0, 0, 5, 5);
		gbc_btn6.gridx = 2;
		gbc_btn6.gridy = 4;
		contentPane.add(btn6, gbc_btn6);
		
		btnMinus = new JButton("-");
		btnMinus.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GridBagConstraints gbc_btnMinus = new GridBagConstraints();
		gbc_btnMinus.fill = GridBagConstraints.BOTH;
		gbc_btnMinus.insets = new Insets(0, 0, 5, 0);
		gbc_btnMinus.gridx = 3;
		gbc_btnMinus.gridy = 4;
		contentPane.add(btnMinus, gbc_btnMinus);
		
		btn1 = new JButton("1");
		btn1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn1.setBackground(new Color(255, 255, 224));
		btn1.setContentAreaFilled(false);
		btn1.setOpaque(true);
		GridBagConstraints gbc_btn1 = new GridBagConstraints();
		gbc_btn1.fill = GridBagConstraints.BOTH;
		gbc_btn1.insets = new Insets(0, 0, 5, 5);
		gbc_btn1.gridx = 0;
		gbc_btn1.gridy = 5;
		contentPane.add(btn1, gbc_btn1);
		
		btn2 = new JButton("2");
		btn2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn2.setBackground(new Color(255, 255, 224));
		btn2.setContentAreaFilled(false);
		btn2.setOpaque(true);
		GridBagConstraints gbc_btn2 = new GridBagConstraints();
		gbc_btn2.fill = GridBagConstraints.BOTH;
		gbc_btn2.insets = new Insets(0, 0, 5, 5);
		gbc_btn2.gridx = 1;
		gbc_btn2.gridy = 5;
		contentPane.add(btn2, gbc_btn2);
		
		btn3 = new JButton("3");
		btn3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn3.setBackground(new Color(255, 255, 224));
		btn3.setContentAreaFilled(false);
		btn3.setOpaque(true);
		GridBagConstraints gbc_btn3 = new GridBagConstraints();
		gbc_btn3.fill = GridBagConstraints.BOTH;
		gbc_btn3.insets = new Insets(0, 0, 5, 5);
		gbc_btn3.gridx = 2;
		gbc_btn3.gridy = 5;
		contentPane.add(btn3, gbc_btn3);
		
		btnPlus = new JButton("+");
		btnPlus.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GridBagConstraints gbc_btnPlus = new GridBagConstraints();
		gbc_btnPlus.fill = GridBagConstraints.BOTH;
		gbc_btnPlus.insets = new Insets(0, 0, 5, 0);
		gbc_btnPlus.gridx = 3;
		gbc_btnPlus.gridy = 5;
		contentPane.add(btnPlus, gbc_btnPlus);
		
		btnPlusMinus = new JButton("\u00B1"); 
		btnPlusMinus.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GridBagConstraints gbc_btnPlusMinus = new GridBagConstraints();
		gbc_btnPlusMinus.fill = GridBagConstraints.BOTH;
		gbc_btnPlusMinus.insets = new Insets(0, 0, 0, 5);
		gbc_btnPlusMinus.gridx = 0;
		gbc_btnPlusMinus.gridy = 6;
		contentPane.add(btnPlusMinus, gbc_btnPlusMinus);
		
		btn0 = new JButton("0");
		btn0.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn0.setBackground(new Color(255, 255, 224));
		btn0.setContentAreaFilled(false);
		btn0.setOpaque(true);
		GridBagConstraints gbc_btn0 = new GridBagConstraints();
		gbc_btn0.fill = GridBagConstraints.BOTH;
		gbc_btn0.insets = new Insets(0, 0, 0, 5);
		gbc_btn0.gridx = 1;
		gbc_btn0.gridy = 6;
		contentPane.add(btn0, gbc_btn0);
		
		btnComma = new JButton(",");
		btnComma.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GridBagConstraints gbc_btnComma = new GridBagConstraints();
		gbc_btnComma.fill = GridBagConstraints.BOTH;
		gbc_btnComma.insets = new Insets(0, 0, 0, 5);
		gbc_btnComma.gridx = 2;
		gbc_btnComma.gridy = 6;
		contentPane.add(btnComma, gbc_btnComma);
		
		btnEqual = new JButton("=");
		btnEqual.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GridBagConstraints gbc_btnEqual = new GridBagConstraints();
		gbc_btnEqual.fill = GridBagConstraints.BOTH;
		gbc_btnEqual.gridx = 3;
		gbc_btnEqual.gridy = 6;
		contentPane.add(btnEqual, gbc_btnEqual);
		
		repaint();
	}
	
	public JTextField getTextFieldResult() {
		return textFieldResult;
	}

	public JButton getBtnPercent() {
		return btnPercent;
	}

	public JButton getBtnElement() {
		return btnElement;
	}

	public JButton getBtnSquared() {
		return btnSquared;
	}

	public JButton getBtnOpposite() {
		return btnOpposite;
	}

	public JButton getBtnCE() {
		return btnCE;
	}

	public JButton getBtnC() {
		return btnC;
	}

	public JButton getBtnBackspace() {
		return btnBackspace;
	}

	public JButton getBtnDivision() {
		return btnDivision;
	}

	public JButton getBtn7() {
		return btn7;
	}

	public JButton getBtn8() {
		return btn8;
	}

	public JButton getBtn9() {
		return btn9;
	}

	public JButton getBtnX() {
		return btnX;
	}

	public JButton getBtn4() {
		return btn4;
	}

	public JButton getBtn5() {
		return btn5;
	}

	public JButton getBtn6() {
		return btn6;
	}

	public JButton getBtnMinus() {
		return btnMinus;
	}

	public JButton getBtn1() {
		return btn1;
	}

	public JButton getBtn2() {
		return btn2;
	}

	public JButton getBtn3() {
		return btn3;
	}

	public JButton getBtnPlus() {
		return btnPlus;
	}

	public JButton getBtnPlusMinus() {
		return btnPlusMinus;
	}

	public JButton getBtn0() {
		return btn0;
	}

	public JButton getBtnComma() {
		return btnComma;
	}

	public JButton getBtnEqual() {
		return btnEqual;
	}
}
