import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator extends JFrame implements ActionListener{
 private JTextField num1;
 private JTextField num2;
 private JButton add;
 private JButton sub;
 private JButton mult;
 private JButton div;
 private JButton exp;
 private JButton sqrt;
 
 public Calculator()
 {
	 num1 = new JTextField();
	 num2 = new JTextField();
	 add = new JButton("add");
	 sub = new JButton("subtract");
	 mult = new JButton("multiply");
	 div = new JButton("divide");
	 exp = new JButton("exponential");
	 sqrt = new JButton("square root");
	 JFrame frame  = new JFrame();
	 frame.setVisible(true);
	 frame.setTitle("Calculator");
	 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 frame.setSize(450, 450);
	 JPanel panel = new JPanel();
	 panel.add(add);
	 panel.add(sub);
	 panel.add(mult);
	 panel.add(div);
	 panel.add(exp);
	 panel.add(sqrt);
	 panel.add(num1);
	 panel.add(num2);
	 panel.setLayout(null);
	 add.addActionListener(this);
	 sub.addActionListener(this);
	 mult.addActionListener(this);
     div.addActionListener(this);
	 add.setBounds(5, 100, 100, 23);
	 sub.setBounds(105, 100, 100, 23);
	 mult.setBounds(210, 100, 100, 23);
	 div.setBounds(315, 100, 100, 23);
	 
	 exp.setBounds(5, 150, 100, 23);
	 sqrt.setBounds(105, 150, 100, 23);
	 num1.setBounds(10, 30, 150, 30);
	 num2.setBounds(170, 30, 150, 30);
	 frame.add(panel);
	 
 }
 
 public static void main(String[] args)
 {
	 Calculator calc = new Calculator();
	 
	 
 }

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	int var = Integer.parseInt(num1.getText());
	int car = Integer.parseInt(num2.getText());
	JButton clicked = (JButton)e.getSource();
	JButton butto;
	 int ans = 0;
	if(clicked == add)
	{
		System.out.print(var+car);
	}
	else if(clicked == sub)
	{
		System.out.print(var-car);
	}
	else if(clicked == mult)
	{
		System.out.print(var*car);
	}
	else if(clicked == div)
	{
		var *= 1.0;
		System.out.print(var/car);
	}
	else if(clicked == exp)
	{
		System.out.print(Math.pow(var, car));	
	}
	else if(clicked == sqrt)
	{
		System.out.print("Square Root of " + var + " is " + Math.sqrt(var));
		System.out.print("Square Root of " + car + " is " + Math.sqrt(car));
	}

	
}

}

