package View;

import java.awt.BorderLayout;
import java.awt.Font;import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.HeadlessException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import Model.MiniCalculatorModel;
import controller.MiniCalculatorListener;

public class MiniCalculatorView extends JFrame {
	private MiniCalculatorModel miniCalculatorModel;
	private JTextField jTextField_firstValue;
	private JTextField jTextField_secondValue;
	private JTextField jTextField_answer;

	public MiniCalculatorView() throws HeadlessException {
		super();
		this.miniCalculatorModel = new MiniCalculatorModel() ;
		this.init();
	}

	private void init() {
		this.setTitle("mini calculator");
		this.setSize(600,600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		
		Font font =new Font("Arial", Font.BOLD,40);
		JLabel jLabel_firstvalue=new JLabel("1st value");
		jLabel_firstvalue.setFont(font);
		JLabel jLabel_secondvalue=new JLabel("2nd value");
		jLabel_secondvalue.setFont(font);
		JLabel jLabel_answer=new JLabel("answer");
		jLabel_answer.setFont(font);
		
		
		jTextField_firstValue = new JTextField(50);
		jTextField_firstValue.setFont(font);
		jTextField_secondValue = new JTextField(50);
		jTextField_secondValue.setFont(font);
		jTextField_answer = new JTextField(50);
		jTextField_answer.setFont(font);
		
		
		JPanel jPanel_IO=new JPanel();
		jPanel_IO.setLayout(new GridLayout(3,2,10,10));
		jPanel_IO.add(jLabel_firstvalue);
		jPanel_IO.add(jTextField_firstValue);
		jPanel_IO.add(jLabel_secondvalue);
		jPanel_IO.add(jTextField_secondValue);
		jPanel_IO.add(jLabel_answer);
		jPanel_IO.add(jTextField_answer);
		
		MiniCalculatorListener miniCalculatorListener=new MiniCalculatorListener(this);
		JButton jButton_plus=new JButton("+");
		jButton_plus.setFont(font);
		jButton_plus.addActionListener(miniCalculatorListener);
		JButton jButton_minus=new JButton("-");
		jButton_minus.setFont(font);
		jButton_minus.addActionListener(miniCalculatorListener);
		JButton jButton_multiply=new JButton("*");
		jButton_multiply.setFont(font);
		jButton_multiply.addActionListener(miniCalculatorListener);
		JButton jButton_divide=new JButton("/");
		jButton_divide.setFont(font);
		jButton_divide.addActionListener(miniCalculatorListener);
		JButton jButton_pow=new JButton("^");
		jButton_pow.setFont(font);
		jButton_pow.addActionListener(miniCalculatorListener);
		JButton jButton_mod=new JButton("%");
		jButton_mod.setFont(font);
		jButton_mod.addActionListener(miniCalculatorListener);
		
		JPanel jPanel_button=new JPanel();
		jPanel_button.setLayout(new GridLayout(2,3));
		jPanel_button.add(jButton_plus);
		jPanel_button.add(jButton_minus);
		jPanel_button.add(jButton_multiply);
		jPanel_button.add(jButton_divide);
		jPanel_button.add(jButton_pow);
		jPanel_button.add(jButton_mod);

		
		this.setLayout(new BorderLayout(10,10));
		this.add(jPanel_IO,BorderLayout.CENTER);
		this.add(jPanel_button,BorderLayout.SOUTH);
		
		this.setVisible(true);
		
	}

	public void plus() {
		double firstValue=Double.valueOf(jTextField_firstValue.getText()) ;
		double secondValue=Double.valueOf(jTextField_secondValue.getText());
		this.miniCalculatorModel.setFirstValue(firstValue);
		this.miniCalculatorModel.setSecondValue(secondValue);
		this.miniCalculatorModel.plus();
		this.jTextField_answer.setText(this.miniCalculatorModel.getAnswer()+"");
	}
	
	public void minus() {
		double firstValue=Double.valueOf(jTextField_firstValue.getText()) ;
		double secondValue=Double.valueOf(jTextField_secondValue.getText());
		this.miniCalculatorModel.setFirstValue(firstValue);
		this.miniCalculatorModel.setSecondValue(secondValue);
		this.miniCalculatorModel.minus();
		this.jTextField_answer.setText(this.miniCalculatorModel.getAnswer()+"");
	}
	public void multiply() {
		double firstValue=Double.valueOf(jTextField_firstValue.getText()) ;
		double secondValue=Double.valueOf(jTextField_secondValue.getText());
		this.miniCalculatorModel.setFirstValue(firstValue);
		this.miniCalculatorModel.setSecondValue(secondValue);
		this.miniCalculatorModel.multiply();
		this.jTextField_answer.setText(this.miniCalculatorModel.getAnswer()+"");
	}
	public void divide() {
		double firstValue=Double.valueOf(jTextField_firstValue.getText()) ;
		double secondValue=Double.valueOf(jTextField_secondValue.getText());
		this.miniCalculatorModel.setFirstValue(firstValue);
		this.miniCalculatorModel.setSecondValue(secondValue);
		this.miniCalculatorModel.divide();
		this.jTextField_answer.setText(this.miniCalculatorModel.getAnswer()+"");
	}
	public void power() {
		double firstValue=Double.valueOf(jTextField_firstValue.getText()) ;
		double secondValue=Double.valueOf(jTextField_secondValue.getText());
		this.miniCalculatorModel.setFirstValue(firstValue);
		this.miniCalculatorModel.setSecondValue(secondValue);
		this.miniCalculatorModel.power();
		this.jTextField_answer.setText(this.miniCalculatorModel.getAnswer()+"");
	}
	public void mod() {
		double firstValue=Double.valueOf(jTextField_firstValue.getText()) ;
		double secondValue=Double.valueOf(jTextField_secondValue.getText());
		this.miniCalculatorModel.setFirstValue(firstValue);
		this.miniCalculatorModel.setSecondValue(secondValue);
		this.miniCalculatorModel.mod();
		this.jTextField_answer.setText(this.miniCalculatorModel.getAnswer()+"");
	}
}
