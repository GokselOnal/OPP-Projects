import javax.swing.*;
import java.awt.*;

public class JOperandButton extends JButton {
	public JOperandButton(String num) {
		this.setText(num);
		this.setBackground(Color.WHITE);
		this.setFont(new Font("Courier", Font.PLAIN, 20));
	}
}
