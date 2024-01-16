import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class pinchange extends JFrame implements ActionListener {
    JPasswordField pin, repin;
    JButton change, back;
    String pinnumber;
    pinchange(String pinnumber){
        this.pinnumber = pinnumber;

        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 900, 900);
        add(image);

        JLabel text = new JLabel("CHANGE YOUR PIN");
        text.setBounds(250, 300, 500, 35);
        text.setForeground(Color.white);
        text.setFont(new Font("Times New Roman", Font.BOLD, 16));
        image.add(text);

        JLabel pintext = new JLabel("NEW PIN");
        pintext.setBounds(165, 350, 180, 25);
        pintext.setForeground(Color.white);
        pintext.setFont(new Font("Times New Roman", Font.BOLD, 16));
        image.add(pintext);

        pin = new JPasswordField();
        pin.setFont(new Font("Times New Roman", Font.BOLD, 25));
        pin.setBounds(330, 350, 180, 25);
        image.add(pin);

        JLabel repintext = new JLabel("RE-ENTER NEW PIN");
        repintext.setBounds(165, 390, 180, 25);
        repintext.setForeground(Color.white);
        repintext.setFont(new Font("Times New Roman", Font.BOLD, 16));
        image.add(repintext);

        repin = new JPasswordField();
        repin.setFont(new Font("Times New Roman", Font.BOLD, 25));
        repin.setBounds(330, 390, 180, 25);
        image.add(repin);

        change = new JButton("CHANGE");
        change.setBounds(355, 485, 150, 30);
        change.addActionListener(this);
        image.add(change);

        back = new JButton("BACK");
        back.setBounds(355, 520, 150, 30);
        back.addActionListener(this);
        image.add(back);

        setSize(900, 900);
        setLocation(300, 0);
//        setUndecorated(true);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        if (ae.getSource() == change) {
            try {
                String npin = pin.getText();
                String rpin = repin.getText();
                if (!npin.equals(rpin)) {
                    JOptionPane.showMessageDialog(null, "Pleaes Enter Correct PIN");
                    return;
                }
                if (npin.equals("")){
                    JOptionPane.showMessageDialog(null, "Please Enter PIN");
                    return;
                }
                if (rpin.equals("")){
                    JOptionPane.showMessageDialog(null, "Please Re_Enter New PIN");
                    return;
                }
                conn c = new conn();
                String query1 = "update bank set pin = '"+rpin+"' where pin = '"+pinnumber+"'";
                String query2 = "update login set Pin_Number = '"+rpin+"' where Pin_Number = '"+pinnumber+"'";
                String query3 = "update signupthree set PIN = '"+rpin+"' where PIN = '"+pinnumber+"'";

                c.s.executeUpdate(query1);
                c.s.executeUpdate(query2);
                c.s.executeUpdate(query3);

                JOptionPane.showMessageDialog(null, "PIN Changed Successfully");

                setVisible(false);
                new transactions(rpin).setVisible(true);

            } catch (Exception e) {
                System.out.println(e);
            }
        }else {
            setVisible(false);
            new transactions(pinnumber).setVisible(true);
        }
    }

    public static void main(String[] args) {
        new pinchange("");
    }
}
