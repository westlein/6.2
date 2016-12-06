import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class JavaGUIDemo implements ActionListener {
	private JFrame frame;
	private JPanel panel;
	private JLabel label;
	private JLabel outputLabel;
	private JTextField textField1;
	private JTextField textField2;
	private JButton button;
	
	public JavaGUIDemo() {
		frame = new JFrame("Total Calculator");
		frame.setVisible(true);
		frame.setSize(420, 115);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel = new JPanel();
		panel.setBackground(Color.GREEN);
		label = new JLabel();
		label.setText("Please enter a number into each field");
		outputLabel = new JLabel();
		outputLabel.setText(".........");
		
		textField1 = new JTextField(5);
		textField2 = new JTextField(5);
		
		button = new JButton("Calculate Sum");
		button.addActionListener(this);
		
		panel.add(label);
		panel.add(textField1);
		panel.add(textField2);
		panel.add(button);
		panel.add(outputLabel);
		
		frame.add(panel);
		
	}
	public void actionPeformed(ActionEvent e) {
		//system.out.println(textField1.getText()+textField2.getText());
		double num1 = Double.parseDouble(textField1.getText());
		double num2 = Double.parseDouble(textField2.getText());
		double sum = num1 + num2;
		outputLabel.setText(String.valueOf(sum));
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}

	
		
		
