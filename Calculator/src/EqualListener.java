import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EqualListener implements ActionListener{
	private JLabel label;

	public EqualListener(JLabel label) {
		this.label = label;
	}
	
	public void actionPerformed(ActionEvent e) {
		if(label.getText().contains("/")){
			String arr[] = label.getText().split("\\/");
			double firstNum = Double.parseDouble(arr[0]);
			
			for(int i = 1 ; i < arr.length ; i++) {
				double number = Double.parseDouble(arr[i]);
				firstNum /= number;
			}
			String result = Double.toString(firstNum);
			label.setText(result);
		}
		
		else if(label.getText().contains("x")){
			double res = 1;
			String arr[] = label.getText().split("x");
			for(int i = 0 ; i < arr.length ; i++) {
				double number = Double.parseDouble(arr[i]);
				res *= number;
			}
			String result = Double.toString(res);
			label.setText(result);
		}
		
		else if(label.getText().contains("-")){
			
			String arr[] = label.getText().split("\\-");
			double firstNum = Double.parseDouble(arr[0]);
			for(int i = 1 ; i < arr.length ; i++ ) {
				double number = Double.parseDouble(arr[i]);
				firstNum -= number;
			}
			String result = Double.toString(firstNum);
			label.setText(result);
		}
		
		if(label.getText().contains("+")){
			double res = 0;
			String arr[] = label.getText().split("\\+");
			for(int i = 0 ; i < arr.length ; i++) {
				double number = Double.parseDouble(arr[i]);
				res += number;
			}
			String result = Double.toString(res);
			label.setText(result);
		}

	}
}
