package excuses;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JFrame;

public class Excuses extends JComponent implements ActionListener
{
    JFrame Xframe;
    int width = Toolkit.getDefaultToolkit().getScreenSize().width;
    int height = Toolkit.getDefaultToolkit().getScreenSize().height;
    JCheckBox box = new JCheckBox();
    JCheckBox box2 = new JCheckBox();

    public static void main(String[] args)
    {
        new Excuses().getGoing();
    }

    public void getGoing()
    {
        Xframe = new JFrame();
        Xframe.setSize(1000, 1000);
        Xframe.add(this);
        Xframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Xframe.setLayout(new GridLayout(3, 3));
        box = new JCheckBox("Male");
        box.setMnemonic(KeyEvent.VK_C);
        box.setSelected(false);
        Xframe.add(box);
        box2 = new JCheckBox("Female");
        box2.setMnemonic(KeyEvent.VK_C);
        box2.setSelected(false);
        Xframe.add(box2);
        Xframe.setVisible(true);
    }

    @Override
    public void paint(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
    }

    @Override
    public void actionPerformed(ActionEvent ae)
    {
        System.out.println("Ouch!");
    }
}
