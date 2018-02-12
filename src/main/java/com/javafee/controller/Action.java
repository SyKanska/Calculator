package com.javafee.controller;

import java.awt.EventQueue;

import com.javafee.view.CalculatorFrame;

public class Action {
	private CalculatorFrame calculatorFrame = null;
	
	private Boolean isBtnSignClicked = false;
	private String signClicked = null;
	
	private StringBuilder firstVariable = new StringBuilder("");
	private StringBuilder secondVariable = new StringBuilder("");

	public void control() {
		initializeCalculatorFrame();
	}

	private void initializeCalculatorFrame() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calculatorFrame = new CalculatorFrame();
					calculatorFrame.setVisible(true);

					calculatorFrame.getBtn0().addActionListener(e -> onClickBtnNumber(calculatorFrame.getBtn0().getText()));
					calculatorFrame.getBtn1().addActionListener(e -> onClickBtnNumber(calculatorFrame.getBtn1().getText()));
					calculatorFrame.getBtn2().addActionListener(e -> onClickBtnNumber(calculatorFrame.getBtn2().getText()));
					calculatorFrame.getBtn3().addActionListener(e -> onClickBtnNumber(calculatorFrame.getBtn3().getText()));
					calculatorFrame.getBtn4().addActionListener(e -> onClickBtnNumber(calculatorFrame.getBtn4().getText()));
					calculatorFrame.getBtn5().addActionListener(e -> onClickBtnNumber(calculatorFrame.getBtn5().getText()));
					calculatorFrame.getBtn6().addActionListener(e -> onClickBtnNumber(calculatorFrame.getBtn6().getText()));
					calculatorFrame.getBtn7().addActionListener(e -> onClickBtnNumber(calculatorFrame.getBtn7().getText()));
					calculatorFrame.getBtn8().addActionListener(e -> onClickBtnNumber(calculatorFrame.getBtn8().getText()));
					calculatorFrame.getBtn9().addActionListener(e -> onClickBtnNumber(calculatorFrame.getBtn9().getText()));
					calculatorFrame.getBtnPlus().addActionListener(e -> onClickBtnSign(calculatorFrame.getBtnPlus().getText()));
					calculatorFrame.getBtnMinus().addActionListener(e -> onClickBtnSign(calculatorFrame.getBtnMinus().getText()));
					//TODO add another methods
					calculatorFrame.getBtnEqual().addActionListener(e -> onClickBtnEqual());
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	private void reloadTextFieldResult(String text) {
		calculatorFrame.getTextFieldResult().setText(text);
	}
	
	private void clearTextFieldResult() {
		calculatorFrame.getTextFieldResult().setText("");
	}
	
	private void onClickBtnNumber(String clickedNumber) {
		if(!this.isBtnSignClicked) {
			firstVariable.append(clickedNumber);
			reloadTextFieldResult(this.firstVariable.toString());
		} else {
			secondVariable.append(clickedNumber);
			reloadTextFieldResult(this.secondVariable.toString());
		}
	}
	
	private void onClickBtnSign(String signClicked) {
		this.isBtnSignClicked = true;
		this.signClicked = signClicked;
		clearTextFieldResult();
	}
	
	private void onClickBtnEqual() {
		
	}
}
