import javax.swing.*;
import java.awt.*;

public class JOperatorButton extends JButton{
	public JOperatorButton(String op) {
		this.setText(op);
		this.setBackground(Color.GRAY);
		this.setFont(new Font("Courier", Font.PLAIN, 20));
	}
}
