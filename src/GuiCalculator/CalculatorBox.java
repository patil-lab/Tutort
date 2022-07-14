package GuiCalculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorBox extends JFrame {

	private JButton btnAdd, btnSubtract, btnMultiply, btnDivide, btnClear, btnDelete, btnEquals, btnDot;
	private JButton[] numBtn;
	private JTextField output;
	private String previous, current, operator;

	private CalculatorBox() {
		super("Box Calclator");


		JPanel mainPanel = new JPanel();
		current = "";
		previous = "";
		JPanel row1 = new JPanel();
		JPanel row2 = new JPanel();
		JPanel row3 = new JPanel();
		JPanel row4 = new JPanel();
		JPanel row5 = new JPanel();

		// Initialize components
		output = new JTextField(16);
		btnSubtract = new JButton("-");
		btnAdd = new JButton("+");
		btnDivide = new JButton("÷");
		btnMultiply = new JButton("*");
		btnDot = new JButton(".");
		btnEquals = new JButton("=");
		btnClear = new JButton("C");
		btnDelete = new JButton("D");
		numBtn = new JButton[11];
		numBtn[10] = btnDot;

		class NumberBtnHandler implements ActionListener {
			@Override
			public void actionPerformed(ActionEvent e) {
				JButton selectedBtn = (JButton) e.getSource();
				for (JButton btn : numBtn) {
					if (selectedBtn == btn) {
						appendToOutput(btn.getText());
						updateOutput();
					}
				}

			}
		}

		class OperatorBtnHandler implements ActionListener {

			@Override
			public void actionPerformed(ActionEvent e) {
				JButton selectedBtn = (JButton) e.getSource();
				if (selectedBtn == btnMultiply) {
					selectOperator(btnMultiply.getText());
				} else if (selectedBtn == btnAdd) {
					selectOperator(btnAdd.getText());
				} else if (selectedBtn == btnSubtract) {
					selectOperator(btnSubtract.getText());
				} else if (selectedBtn == btnDivide) {
					selectOperator(btnDivide.getText());
				}
				updateOutput();
			}
		}

		class OtherBtnHandler implements ActionListener {

			@Override
			public void actionPerformed(ActionEvent e) {

				JButton selectedBtn = (JButton) e.getSource();
				if (selectedBtn == btnDelete) {
					delete();
				} else if (selectedBtn == btnClear) {
					clear();
				} else if (selectedBtn == btnEquals) {
					calculate();
				}
				updateOutput();
			}
		}

		NumberBtnHandler numBtnHandler = new NumberBtnHandler();
		OtherBtnHandler otherBtnHandler = new OtherBtnHandler();
		OperatorBtnHandler opBtnHandler = new OperatorBtnHandler();
		for (int count = 0; count < numBtn.length - 1; count++) {
			numBtn[count] = new JButton((String.valueOf(count)));
			numBtn[count].setFont(new Font("Monospaced", Font.BOLD, 22));
			numBtn[count].addActionListener(numBtnHandler);
		}
		btnDot.setFont(new Font("Monospaced", Font.BOLD, 22));
		btnDot.addActionListener(numBtnHandler);
		btnEquals.setFont(new Font("Monospaced", Font.BOLD, 22));
		btnEquals.addActionListener(otherBtnHandler);
		btnAdd.setFont(new Font("Monospaced", Font.BOLD, 22));
		btnAdd.addActionListener(opBtnHandler);
		btnSubtract.setFont(new Font("Monospaced", Font.BOLD, 22));
		btnSubtract.addActionListener(opBtnHandler);
		btnDivide.setFont(new Font("Monospaced", Font.BOLD, 22));
		btnDivide.addActionListener(opBtnHandler);
		btnMultiply.setFont(new Font("Monospaced", Font.BOLD, 22));
		btnMultiply.addActionListener(opBtnHandler);
		btnClear.setFont(new Font("Monospaced", Font.BOLD, 20));
		btnClear.addActionListener(otherBtnHandler);
		btnDelete.setFont(new Font("Monospaced", Font.BOLD, 20));
		btnDelete.addActionListener(otherBtnHandler);

		output.setMaximumSize(new Dimension(185, 40));
		output.setFont(new Font("Monospaced", Font.BOLD, 27));
		output.setDisabledTextColor(new Color(0, 0, 0));
		output.setMargin(new Insets(0, 5, 0, 0));
		output.setText("0");

		row1.setLayout(new BoxLayout(row1, BoxLayout.LINE_AXIS));
		row2.setLayout(new BoxLayout(row2, BoxLayout.LINE_AXIS));
		row3.setLayout(new BoxLayout(row3, BoxLayout.LINE_AXIS));
		row4.setLayout(new BoxLayout(row4, BoxLayout.LINE_AXIS));
		row5.setLayout(new BoxLayout(row5, BoxLayout.LINE_AXIS));

		row1.add(Box.createHorizontalGlue());
		row1.add(btnClear);
		row1.add(btnDelete);
		row2.add(numBtn[7]);
		row2.add(numBtn[8]);
		row2.add(numBtn[9]);
		row2.add(btnMultiply);
		row3.add(numBtn[4]);
		row3.add(numBtn[5]);
		row3.add(numBtn[6]);
		row3.add(btnAdd);
		row4.add(numBtn[1]);
		row4.add(numBtn[2]);
		row4.add(numBtn[3]);
		row4.add(btnSubtract);
		row5.add(btnDot);
		row5.add(numBtn[0]);
		row5.add(btnEquals);
		row5.add(btnDivide);

		// Add all rows to the main panel
		mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.PAGE_AXIS));
		mainPanel.add(output);
		mainPanel.add(Box.createRigidArea(new Dimension(0, 5)));
		mainPanel.add(row1);
		mainPanel.add(row2);
		mainPanel.add(row3);
		mainPanel.add(row4);
		mainPanel.add(row5);

		// final touch
		this.add(mainPanel);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		this.setSize(205, 280);


	}

	public static void main(String[] args) {
		new CalculatorBox();

	}

	public void delete() {
		if (current.length() > 0) {
			current = current.substring(0, current.length() - 1);
		}
	}

	public void clear() {
		current = "";
		previous = "";
		operator = null;
	}

	public void updateOutput() {
		output.setText(current);
	}

	public void appendToOutput(String num) {
		if (num.equals(".") && current.contains(".")) {
			return;
		}
		current += num;
	}

	public void selectOperator(String newOperator) {
		// if no number is entered yet
		if (current.isEmpty()) {
			operator = newOperator;
			return;
		}

		if (!previous.isEmpty()) {
			calculate();
		}

		operator = newOperator;
		previous = current;
		current = "";
	}

	public void calculate() {
		if (previous.length() < 1 || current.length() < 1) {
			return;
		}
		double result = 0.0;
		double num1 = Double.parseDouble(previous);
		double num2 = Double.parseDouble(current);
		switch (operator) {
			case "*":
				result = num1 * num2;
				break;
			case "+":
				result = num1 + num2;
				break;
			case "-":
				result = num1 - num2;
				break;
			case "÷":
				result = num1 / num2;
				break;
			default:
				break;
		}
		current = String.valueOf(result);
		operator = null;
		previous = "";
		//processOutputNumber();
	}

	public void processOutputNumber() {
		if (current.length() > 0) {
			String integerPart = current.split("\\.")[0];
			String decimalPart = current.split("\\.")[1];
			if (decimalPart.equals("0")) {
				current = integerPart;
			}
		}
	}

}



