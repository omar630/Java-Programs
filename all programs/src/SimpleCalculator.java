
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/*<applet code="SimpletCalculator" width=300 height=300></applet>*/

/**
 * @author Mohammed Omar
 *
 */
public class SimpleCalculator extends JFrame implements ActionListener {

	String msg = "";
	int v1, v2, result;
	JTextField t1;
	JButton b;
	boolean start = true;
	char OP;

	SimpleCalculator() {
		t1=new JTextField(25);
		//t2=new JTextField(25);
		t1.setEditable(false);
		//setLayout(new BorderLayout());
		add(t1, BorderLayout.NORTH); 
		JPanel p = new JPanel();
		 p.setLayout(new GridLayout(4, 4));
		String buttons = "789*456-123+0/c=";
		 for (int i = 0; i < buttons.length(); i++) 
		 {
			b = new JButton(buttons.substring(i, i + 1));
			b.addActionListener(this); 
			p.add(b); 
	}
		add(p, BorderLayout.CENTER);
		setSize(1000,1000);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent ae)
	{
		String str=ae.getActionCommand();//return the button name which is clicked
		System.out.println("str="+str);
		char ch=str.charAt(0);
		if ( Character.isDigit(ch))
		{
		if(start == true)
			t1.setText(str);
		else
			t1.setText(t1.getText()+str);
			start = false;
		}
		else if(str.equals("+"))
		{
			v1=Integer.parseInt(t1.getText());
			OP='+';
			start = true;
		}
		else if(str.equals("-"))
		{
			v1=Integer.parseInt(t1.getText());
			OP='-';
			start = true;
		}
		else if(str.equals("*"))
		{
			v1=Integer.parseInt(t1.getText());
			OP='*';
			start = true;
		}
		else if(str.equals("/"))
		{
			v1=Integer.parseInt(t1.getText());
			OP='/';
			start = true;
		}
		else if(str.equals("c"))
		{
			t1.setText("");
		}
		else if(str.equals("="))
		{
			v2=Integer.parseInt(t1.getText());
			if(OP=='+')
			result=v1+v2;
			else if(OP=='-')
				result=v1-v2;
			else if(OP=='*')
				result=v1*v2;
			else if(OP=='/')
			{
				try
				{
				result=v1/v2;
				}
				catch(ArithmeticException e)
				{ 
				JOptionPane.showMessageDialog(this,"Should not divide by 0");
				}
			}
			t1.setText(""+result);
			start = true;
		}	

	}
	public static void main(String args[]) {
		SimpleCalculator sc=new SimpleCalculator(); 
	}
}
