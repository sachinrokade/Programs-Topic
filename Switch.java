

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

class SwitchOn extends JFrame implements ActionListener
{
    JButton on,off,b;
    JLabel back;
    public SwitchOn()
    {
        this.setLayout(null);
    
       ImageIcon imglogo8 = new ImageIcon("F:/Student exam Images/pic_off.gif");
       back = new JLabel(imglogo8);
       back.setBackground(Color.red);
       back.setBounds(80,20,100,180);
       this.add(back);
        
        
        on=new JButton("On");
        on.addActionListener((ActionListener)this);
        on.setBounds(10,300,100,20);
        this.add(on,BorderLayout.EAST);
        
        off=new JButton("OFF");
        off.addActionListener((ActionListener)this);
        off.setBounds(150,300,100,20);
        this.add(off,BorderLayout.WEST);
        
        this.setTitle("Tube Light Program");
        this.setBounds(450,100,300,400);
        this.setVisible(true);
        this.setResizable(false );
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        JButton bt=(JButton)e.getSource();
        if(bt==on)
        {
                ImageIcon imglogo7 = new ImageIcon("F:/Student exam Images/pic_on.gif");
                back.setIcon(imglogo7);
        }
        if(bt==off)
        {
                ImageIcon imglogo8 = new ImageIcon("F:/Student exam Images/pic_off.gif");
                back.setIcon(imglogo8);
        }
        
    }
    public static void main(String[] args) 
    {
        SwitchOn j=new SwitchOn();
        double a,b,x;
        a=3.0;
        b=6.0;
        x=Math.sqrt(a*a);
        System.out.print(""+x);
    }
    
}
