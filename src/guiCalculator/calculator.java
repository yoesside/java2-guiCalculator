package guiCalculator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class calculator {

	private JFrame frame;
	private JTextField textField;
	private JButton btn_Multi;

	double first, second, result;
	String operation, answer;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calculator window = new calculator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Tahoma", Font.BOLD, 18));
		frame.setBounds(100, 100, 288, 440);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD, 10));
		textField.setBounds(10, 11, 250, 42);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btn_7 = new JButton("7");
		btn_7.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn_7.getText();
				textField.setText(number);
			}
		});
		btn_7.setBounds(10, 130, 55, 55);
		frame.getContentPane().add(btn_7);
		
		JButton btn_Backspace = new JButton("\uF0E7");
		btn_Backspace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String backSpace=null;
				if(textField.getText().length()>0) {
					StringBuilder str=new StringBuilder(textField.getText());
					str.deleteCharAt(textField.getText().length()-1);
					backSpace=str.toString();
					textField.setText(backSpace);
				}
			}
		});
		btn_Backspace.setFont(new Font("Wingdings", Font.BOLD, 18));
		btn_Backspace.setBounds(10, 64, 55, 55);
		frame.getContentPane().add(btn_Backspace);
		
		JButton btn_4 = new JButton("4");
		btn_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn_4.getText();
				textField.setText(number);
			}
		});
		btn_4.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn_4.setBounds(10, 196, 55, 55);
		frame.getContentPane().add(btn_4);
		
		JButton btn_1 = new JButton("1");
		btn_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn_1.getText();
				textField.setText(number);
			}
		});
		btn_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn_1.setBounds(10, 262, 55, 55);
		frame.getContentPane().add(btn_1);
		
		JButton btn_0 = new JButton("0");
		btn_0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn_0.getText();
				textField.setText(number);
			}
		});
		btn_0.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn_0.setBounds(10, 328, 55, 55);
		frame.getContentPane().add(btn_0);
		
		JButton btn_Dot = new JButton(".");
		btn_Dot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn_Dot.getText();
				textField.setText(number);
			}
		});
		btn_Dot.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn_Dot.setBounds(75, 328, 55, 55);
		frame.getContentPane().add(btn_Dot);
		
		JButton btn_2 = new JButton("2");
		btn_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn_2.getText();
				textField.setText(number);
			}
		});
		btn_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn_2.setBounds(75, 262, 55, 55);
		frame.getContentPane().add(btn_2);
		
		JButton btn_5 = new JButton("5");
		btn_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn_5.getText();
				textField.setText(number);
			}
		});
		btn_5.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn_5.setBounds(75, 196, 55, 55);
		frame.getContentPane().add(btn_5);
		
		JButton btn_8 = new JButton("8");
		btn_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn_8.getText();
				textField.setText(number);
			}
		});
		btn_8.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn_8.setBounds(75, 130, 55, 55);
		frame.getContentPane().add(btn_8);
		
		JButton btn_Clear = new JButton("C");
		btn_Clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btn_Clear.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn_Clear.setBounds(75, 64, 55, 55);
		frame.getContentPane().add(btn_Clear);
		
		JButton btn_00 = new JButton("00");
		btn_00.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn_00.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn_00.setBounds(140, 64, 55, 55);
		frame.getContentPane().add(btn_00);
		
		JButton btn_9 = new JButton("9");
		btn_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn_9.getText();
				textField.setText(number);
			}
		});
		btn_9.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn_9.setBounds(140, 130, 55, 55);
		frame.getContentPane().add(btn_9);
		
		JButton btn_6 = new JButton("6");
		btn_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn_6.getText();
				textField.setText(number);
			}
		});
		btn_6.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn_6.setBounds(140, 196, 55, 55);
		frame.getContentPane().add(btn_6);
		
		JButton btn_3 = new JButton("3");
		btn_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn_3.getText();
				textField.setText(number);
			}
		});
		btn_3.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn_3.setBounds(140, 262, 55, 55);
		frame.getContentPane().add(btn_3);
		
		JButton btn_Equal = new JButton("=");
		btn_Equal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String answer;
				second=Double.parseDouble(textField.getText());
				if(operation=="+") {
					result=first+second;
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operation=="-") {
					result=first-second;
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operation=="*") {
					result=first*second;
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operation=="/") {
					result=first/second;
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operation=="%") {
					result=first%second;
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}
				
			}
		});
		btn_Equal.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn_Equal.setBounds(140, 328, 55, 55);
		frame.getContentPane().add(btn_Equal);
		
		JButton btn_Pluss = new JButton("+");
		btn_Pluss.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="+";
			}
		});
		btn_Pluss.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn_Pluss.setBounds(205, 64, 55, 55);
		frame.getContentPane().add(btn_Pluss);
		
		JButton btn_Sub = new JButton("-");
		btn_Sub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="-";
			}
		});
		btn_Sub.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn_Sub.setBounds(205, 130, 55, 55);
		frame.getContentPane().add(btn_Sub);
		
		btn_Multi = new JButton("*");
		btn_Multi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="*";
			}
		});
		btn_Multi.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn_Multi.setBounds(205, 196, 55, 55);
		frame.getContentPane().add(btn_Multi);
		
		JButton btn_Divide = new JButton("/");
		btn_Divide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="/";
			}
		});
		btn_Divide.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn_Divide.setBounds(205, 262, 55, 55);
		frame.getContentPane().add(btn_Divide);
		
		JButton btn_Percent = new JButton("%");
		btn_Percent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="%";
			}
		});
		btn_Percent.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn_Percent.setBounds(205, 328, 55, 55);
		frame.getContentPane().add(btn_Percent);
	}
}
