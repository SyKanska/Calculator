package com.javafee.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JTextField;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JButton;

public class CalculatorFrame extends JFrame {
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textFieldResult;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculatorFrame frame = new CalculatorFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public CalculatorFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 80, 100, 100, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{1.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		textFieldResult = new JTextField();
		textFieldResult.setEnabled(false);
		GridBagConstraints gbc_textFieldResult = new GridBagConstraints();
		gbc_textFieldResult.insets = new Insets(0, 0, 5, 0);
		gbc_textFieldResult.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldResult.gridwidth = 4;
		gbc_textFieldResult.gridx = 0;
		gbc_textFieldResult.gridy = 0;
		contentPane.add(textFieldResult, gbc_textFieldResult);
		textFieldResult.setColumns(10);
		
		JButton btn7 = new JButton("7");
		GridBagConstraints gbc_btn7 = new GridBagConstraints();
		gbc_btn7.fill = GridBagConstraints.HORIZONTAL;
		gbc_btn7.insets = new Insets(0, 0, 5, 5);
		gbc_btn7.gridx = 0;
		gbc_btn7.gridy = 2;
		contentPane.add(btn7, gbc_btn7);
		
		JButton btn8 = new JButton("8");
		GridBagConstraints gbc_btn8 = new GridBagConstraints();
		gbc_btn8.fill = GridBagConstraints.HORIZONTAL;
		gbc_btn8.insets = new Insets(0, 0, 5, 5);
		gbc_btn8.gridx = 1;
		gbc_btn8.gridy = 2;
		contentPane.add(btn8, gbc_btn8);
		
		JButton btn9 = new JButton("9");
		GridBagConstraints gbc_btn9 = new GridBagConstraints();
		gbc_btn9.fill = GridBagConstraints.HORIZONTAL;
		gbc_btn9.insets = new Insets(0, 0, 5, 5);
		gbc_btn9.gridx = 2;
		gbc_btn9.gridy = 2;
		contentPane.add(btn9, gbc_btn9);
		
		JButton btn4 = new JButton("4");
		GridBagConstraints gbc_btn4 = new GridBagConstraints();
		gbc_btn4.fill = GridBagConstraints.HORIZONTAL;
		gbc_btn4.insets = new Insets(0, 0, 5, 5);
		gbc_btn4.gridx = 0;
		gbc_btn4.gridy = 3;
		contentPane.add(btn4, gbc_btn4);
		
		JButton btn5 = new JButton("5");
		GridBagConstraints gbc_btn5 = new GridBagConstraints();
		gbc_btn5.fill = GridBagConstraints.HORIZONTAL;
		gbc_btn5.insets = new Insets(0, 0, 5, 5);
		gbc_btn5.gridx = 1;
		gbc_btn5.gridy = 3;
		contentPane.add(btn5, gbc_btn5);
		
		JButton btn6 = new JButton("6");
		GridBagConstraints gbc_btn6 = new GridBagConstraints();
		gbc_btn6.fill = GridBagConstraints.HORIZONTAL;
		gbc_btn6.insets = new Insets(0, 0, 5, 5);
		gbc_btn6.gridx = 2;
		gbc_btn6.gridy = 3;
		contentPane.add(btn6, gbc_btn6);
		
		JButton btn1 = new JButton("1");
		GridBagConstraints gbc_btn1 = new GridBagConstraints();
		gbc_btn1.fill = GridBagConstraints.HORIZONTAL;
		gbc_btn1.insets = new Insets(0, 0, 5, 5);
		gbc_btn1.gridx = 0;
		gbc_btn1.gridy = 4;
		contentPane.add(btn1, gbc_btn1);
		
		JButton btn2 = new JButton("2");
		GridBagConstraints gbc_btn2 = new GridBagConstraints();
		gbc_btn2.fill = GridBagConstraints.HORIZONTAL;
		gbc_btn2.insets = new Insets(0, 0, 5, 5);
		gbc_btn2.gridx = 1;
		gbc_btn2.gridy = 4;
		contentPane.add(btn2, gbc_btn2);
		
		JButton btn3 = new JButton("3");
		GridBagConstraints gbc_btn3 = new GridBagConstraints();
		gbc_btn3.fill = GridBagConstraints.HORIZONTAL;
		gbc_btn3.insets = new Insets(0, 0, 5, 5);
		gbc_btn3.gridx = 2;
		gbc_btn3.gridy = 4;
		contentPane.add(btn3, gbc_btn3);
		
		JButton btn0 = new JButton("0");
		GridBagConstraints gbc_btn0 = new GridBagConstraints();
		gbc_btn0.fill = GridBagConstraints.HORIZONTAL;
		gbc_btn0.insets = new Insets(0, 0, 0, 5);
		gbc_btn0.gridx = 1;
		gbc_btn0.gridy = 5;
		contentPane.add(btn0, gbc_btn0);
	}

}
