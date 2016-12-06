import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class JavaGUIDemo implements ActionListener {
	//JFrame
	//constructor; to initialize the instance variable
	private JFrame frame;
	
	private JPanel panel;
	
	private JLabel label;
	
	private JLabel output;
	
	private JTextField textField1;
	
	private JTextField textField2;
	
	private JButton button;
	
	public JavaGUIDemo() {
		frame = new JFrame("Calculator");
		frame.setVisible(true);
		frame.setSize(350,100);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel = new JPanel();
		panel.setBackground(Color.BLUE);
		
		label = new JLabel();
		label.setText("Enter your number");
		label.setForeground(Color.WHITE);
		
		output = new JLabel();
		output.setText("------");
		
		
		
		textField1 = new JTextField(5);
		textField2 = new JTextField(5);
		
		button = new JButton("Find Sum");
		button.addActionListener(this);
		
		panel.add(label);
		panel.add(textField1);
		panel.add(textField2);
		panel.add(button);
		panel.add(output);
		
		frame.add(panel);
		
	}
	
	public void actionPerformed(ActionEvent e) {
		//System.out.println(textField1.getText()+textField2.getText());
		double num1 = Double.parseDouble(textField1.getText());
		double num2 = Double.parseDouble(textField2.getText());
		double sum = num1 + num2;
		output.setText(String.valueOf(sum));
	}

}

		
		
