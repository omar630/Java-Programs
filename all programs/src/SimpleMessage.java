import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
/*<applet code="SimpleMessage.class" height=300 width=300></applet>*/
public class SimpleMessage extends Applet {
	public void paint(Graphics g)
	{
		g.setColor(Color.pink);
		setBackground(Color.yellow);
		g.drawString("HI APPLET Program",80,150);
	}

}
