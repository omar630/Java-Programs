
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import javax.swing.*;
/*<applet code="SimpletCalculator" width=300 height=300></applet>*/

/**
 * @author Mohammed Omar
 *
 */
public class SimpleCalculator extends JFrame implements ActionListener {

	String msg = "";
	int v1, v2, result;
	JTextField t1, t2;
	JButton b;
	boolean start = true;
	char op;

	SimpleCalculator() {
		t1 = new JTextField(25);
		t2 = new JTextField(25);
		t1.setEditable(false);
		add(t1, BorderLayout.NORTH);
		JPanel p = new JPanel();
		p.setLayout(new GridLayout(4, 4));
		String buttons = "789*456-123+0/c=";
		for (int i = 0; i < buttons.length(); i++) {
			b = new JButton(buttons.substring(i, i + 1));
			b.addActionListener(this);
			p.add(b);
		}
		add(p, BorderLayout.CENTER);
		setSize(400, 400);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
