import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator {
	public static void main(String[] args) {
		JFrame frame = new JFrame("Calculator");
		frame.setSize(300,350);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);

		JPanel topPanel = new JPanel();
		frame.add(topPanel, BorderLayout.NORTH);
		topPanel.setBackground(Color.WHITE);
		topPanel.setLayout(new BorderLayout());

		JPanel mainPanel = new JPanel();
		frame.add(mainPanel,BorderLayout.CENTER);
		mainPanel.setLayout(new GridLayout(5,4));

		JLabel label = new JLabel(" ");
		label.setFont(new Font("Courier", Font.PLAIN, 20));
		topPanel.add(label,BorderLayout.EAST);

		String[] emptyButtons = {" "," "," "};
		for(int i = 0 ; i < emptyButtons.length ; i++) {
			JOperandButton buttonEmpty = new JOperandButton(emptyButtons[i]);
			mainPanel.add(buttonEmpty);
		}

		JOperandButton buttonC = new JOperandButton("C");
		mainPanel.add(buttonC);
		buttonC.addActionListener(new CListener(label));
		
		JOperandButton button7 = new JOperandButton("7");
		mainPanel.add(button7);
		button7.addActionListener(new OperandListener(label,button7));

		JOperandButton button8 = new JOperandButton("8");
		mainPanel.add(button8);
		button8.addActionListener(new OperandListener(label,button8));

		JOperandButton button9 = new JOperandButton("9");
		mainPanel.add(button9);
		button9.addActionListener(new OperandListener(label,button9));

		JOperatorButton buttonDiv = new JOperatorButton("/");
		mainPanel.add(buttonDiv);
		buttonDiv.addActionListener(new OperatorListener(label,buttonDiv));

		JOperandButton button4 = new JOperandButton("4");
		mainPanel.add(button4);
		button4.addActionListener(new OperandListener(label,button4));

		JOperandButton button5 = new JOperandButton("5");
		mainPanel.add(button5);
		button5.addActionListener(new OperandListener(label,button5));

		JOperandButton button6 = new JOperandButton("6");
		mainPanel.add(button6);
		button6.addActionListener(new OperandListener(label,button6));

		JOperatorButton buttonMul = new JOperatorButton("x");
		mainPanel.add(buttonMul);
		buttonMul.addActionListener(new OperatorListener(label,buttonMul));

		JOperandButton button1 = new JOperandButton("1");
		mainPanel.add(button1);
		button1.addActionListener(new OperandListener(label,button1));
		
		JOperandButton button2 = new JOperandButton("2");
		mainPanel.add(button2);
		button2.addActionListener(new OperandListener(label,button2));
		
		JOperandButton button3 = new JOperandButton("3");
		mainPanel.add(button3);
		button3.addActionListener(new OperandListener(label,button3));
		
		JOperatorButton buttonSub = new JOperatorButton("-");
		mainPanel.add(buttonSub);
		buttonSub.addActionListener(new OperatorListener(label,buttonSub));

		JOperandButton button0 = new JOperandButton("0");
		mainPanel.add(button0);
		button0.addActionListener(new OperandListener(label,button0));
		
		JOperandButton buttonDot = new JOperandButton(".");
		mainPanel.add(buttonDot);
		buttonDot.addActionListener(new OperandListener(label,buttonDot));

		JOperatorButton buttonEqu = new JOperatorButton("=");
		mainPanel.add(buttonEqu);
		buttonEqu.addActionListener(new EqualListener(label));
		
		JOperatorButton buttonSum = new JOperatorButton("+");
		mainPanel.add(buttonSum);
		buttonSum.addActionListener(new OperatorListener(label,buttonSum));

		frame.validate();
	}
}

class CListener implements ActionListener{
	private JLabel label;

	public CListener(JLabel label ) {
		this.label = label;
	}

	public void actionPerformed(ActionEvent e) {
		label.setText(" ");

	}
}

class OperandListener implements ActionListener {
	private JLabel label;
	private JButton button;

	public OperandListener(JLabel label,JButton button) {
		this.label = label;
		this.button = button;
	}

	public void actionPerformed (ActionEvent e) {
		label.setText(label.getText() + button.getText());
	}
}

class OperatorListener implements ActionListener{
	private JLabel label;
	private JButton button;

	public OperatorListener(JLabel label , JButton button) {
		this.button = button;
		this.label = label;
	}

	public void actionPerformed(ActionEvent e) {
		label.setText(label.getText() + button.getText());
	}
}



