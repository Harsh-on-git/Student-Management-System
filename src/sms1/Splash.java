package sms1;

import javax.swing.*;
import java.awt.*;
public class Splash  extends JFrame implements Runnable{
    Thread t;
    Splash(){
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/first.png"));
        Image i2 = i1.getImage().getScaledInstance(1000, 700, Image.SCALE_DEFAULT);
         ImageIcon i3 = new ImageIcon(i2);
        JLabel image  = new JLabel(i3);
        add(image);
        setVisible(true);
        setSize(1000,700);
        setLocation(250,50);
        
        t = new Thread(this);
        t.start();
        
    }
    public void run(){
        try{
            Thread.sleep(7000);
            setVisible(false);
            
            //next frame
            new Login();
            
        }catch(Exception e){
            
        }
    }
    public static void main(String[]args){
        Splash s = new Splash();
    }
  
}
