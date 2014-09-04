import java.awt.Color;
import java.awt.Graphics;
import javax.swing.*;
public class AddApplet extends JApplet {
    private double sum;
    public void init() {
        String no1;
        String no2;
        no1 = JOptionPane.showInputDialog("Enter floating value");
        no2 = JOptionPane.showInputDialog("Enter 2nd floating value");
        double n1 = Double.parseDouble(no1);
        double n2 = Double.parseDouble(no2);
        sum = n1+n2;
    }
    public void paint(Graphics g) {
        //super.paint(g);
        g.setColor(Color.red);
        g.drawRect(15,10,270,20);
        g.setColor(Color.BLUE);
        g.drawString(""+sum,25,25);
    }
}
