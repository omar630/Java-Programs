import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.applet.*;
/*<applet code=AppletFactorial width=500 height=500><?applet>*/
public class AppletFactorial extends JFrame implements ActionListener {
	JButton b1,b2;
	JLabel l1,l2;
	JTextField t1,t2;
	AppletFactorial() {
		l1=new JLabel("NUMBER");
		l2=new JLabel("RESULT");
		t1=new JTextField(20);
		t2=new JTextField(20);
		b1=new JButton("COMPUTE");
		b2=new JButton("CLEAR");
		b1.addActionListener(this);
		b2.addActionListener(this);
		setLayout(new FlowLayout());
		add(l1);
		add(t1);
		add(l2);
		add(t2);
		add(b1);
		add(b2);
		setSize(400,400);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent ae) {
		if(ae.getActionCommand()=="COMPUTE") {
			int n=Integer.parseInt(t1.getText());
			int fact=1;
			for(;n>0;n--)
				fact*=n;
			t2.setText(Integer.toString(fact));
		}
		else if(ae.getSource()==b2) {
			t1.setText("");
			t2.setText("");
		}
	}
	public static void main(String args[]) {
		AppletFactorial a=new AppletFactorial();
	}
}
