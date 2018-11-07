import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.applet.*;
/*<applet code=AppletFactorial width=500 height=500><?applet>*/
public class AppletFactorial extends Applet implements ActionListener {
	Button b1,b2;
	Label l1,l2;
	TextField t1,t2;
	public void init() {
		l1=new Label("NUMBER");
		l2=new Label("RESULT");
		t1=new TextField(20);
		t2=new TextField(20);
		b1=new Button("COMPUTE");
		b2=new Button("CLEAR");
		b1.addActionListener(this);
		b2.addActionListener(this);
		add(l1);
		add(t1);
		add(l2);
		add(t2);
		add(b1);
		add(b2);
	}
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource()==b1) {
			int n=Integer.parseInt(t1.getText());
			int fact=1;
			for(int i=n;i>0;i--)
				fact*=i;
			t2.setText(Integer.toString(fact));
		}
		else if(ae.getSource()==b2) {
			t1.setText("");
			t2.setText("");
		}
	}
}
