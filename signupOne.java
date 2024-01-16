import javax.swing.*;
import java.awt.*;
import java.util.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;

public class signupOne extends JFrame implements ActionListener {

    long random;
    JTextField nametextfield, fnametextfield, emailtextfield, addresstextfield, citytextfield, statetextfield, pintextfield;
    JButton next;
    JRadioButton male, female, other, married, unmarried;
    JDateChooser datechooser;
    signupOne(){

        setLayout(null);

        Random ran = new Random();
        random = Math.abs((ran.nextLong() % 9000L) + 1000L);

        JLabel formno = new JLabel("APPLICTION  FORM NO." + random);
        formno.setFont(new Font("Raleway", Font.BOLD, 38));
        formno.setBounds(140, 20, 600, 40);
        add(formno);

        JLabel personaldetail = new JLabel("Page 1: Personal Details");
        personaldetail.setFont(new Font("Raleway", Font.BOLD, 22));
        personaldetail.setBounds(290, 80, 400, 30);
        add(personaldetail);

        JLabel name = new JLabel("Name:");
        name.setFont(new Font("Raleway", Font.BOLD, 20));
        name.setBounds(100, 140, 100, 30);
        add(name);

        nametextfield = new JTextField();
        nametextfield.setFont(new Font("Raleway", Font.BOLD, 14));
        nametextfield.setBounds(300, 140, 400, 30);
        add(nametextfield);

        JLabel fname = new JLabel("Father Name:");
        fname.setFont(new Font("Raleway", Font.BOLD, 20));
        fname.setBounds(100, 190, 200, 30);
        add(fname);

        fnametextfield = new JTextField();
        fnametextfield.setFont(new Font("Raleway", Font.BOLD, 14));
        fnametextfield.setBounds(300, 190, 400, 30);
        add(fnametextfield);

        JLabel dob = new JLabel("Date Of Birth:");
        dob.setFont(new Font("Raleway", Font.BOLD, 20));
        dob.setBounds(100, 240, 200, 30);
        add(dob);

        datechooser = new JDateChooser();
        datechooser.setBounds(300, 240, 400, 30);
        datechooser.setForeground(new Color(105, 105, 105));
        add(datechooser);

        JLabel gender = new JLabel("Gender:");
        gender.setFont(new Font("Raleway", Font.BOLD, 20));
        gender.setBounds(100, 290, 200, 30);
        add(gender);

        male = new JRadioButton("Male");
        male.setBounds(300, 290, 60, 30);
        male.setBackground(Color.white);
        add(male);
        female = new JRadioButton("Female");
        female.setBounds(400, 290, 100, 30);
        female.setBackground(Color.white);
        add(female);
        other = new JRadioButton("Other");
        other.setBounds(510, 290, 120, 30);
        other.setBackground(Color.white);
        add(other);
        ButtonGroup gendergroup = new ButtonGroup();
        gendergroup.add(male);
        gendergroup.add(female);
        gendergroup.add(other);

        JLabel email = new JLabel("Email Address:");
        email.setFont(new Font("Raleway", Font.BOLD, 20));
        email.setBounds(100, 340, 200, 30);
        add(email);

        emailtextfield = new JTextField();
        emailtextfield.setFont(new Font("Raleway", Font.BOLD, 14));
        emailtextfield.setBounds(300, 340, 400, 30);
        add(emailtextfield);

        JLabel maritial = new JLabel("Maritial Status:");
        maritial.setFont(new Font("Raleway", Font.BOLD, 20));
        maritial.setBounds(100, 390, 200, 30);
        add(maritial);

        married = new JRadioButton("Married");
        married.setBounds(300, 390, 100, 30);
        married.setBackground(Color.white);
        add(married);
        unmarried = new JRadioButton("Unmarried");
        unmarried.setBounds(400, 390, 100, 30);
        unmarried.setBackground(Color.white);
        add(unmarried);
        ButtonGroup maritialgroup = new ButtonGroup();
        maritialgroup.add(married);
        maritialgroup.add(unmarried);

        JLabel address = new JLabel("Address:");
        address.setFont(new Font("Raleway", Font.BOLD, 20));
        address.setBounds(100, 440, 200, 30);
        add(address);

        addresstextfield = new JTextField();
        addresstextfield.setFont(new Font("Raleway", Font.BOLD, 14));
        addresstextfield.setBounds(300, 440, 400, 30);
        add(addresstextfield);

        JLabel city = new JLabel("City:");
        city.setFont(new Font("Raleway", Font.BOLD, 20));
        city.setBounds(100, 490, 200, 30);
        add(city);

        citytextfield = new JTextField();
        citytextfield.setFont(new Font("Raleway", Font.BOLD, 14));
        citytextfield.setBounds(300, 490, 400, 30);
        add(citytextfield);

        JLabel state = new JLabel("State:");
        state.setFont(new Font("Raleway", Font.BOLD, 20));
        state.setBounds(100, 540, 200, 30);
        add(state);

        statetextfield = new JTextField();
        statetextfield.setFont(new Font("Raleway", Font.BOLD, 14));
        statetextfield.setBounds(300, 540, 400, 30);
        add(statetextfield);

        JLabel pincode = new JLabel("Pin Code:");
        pincode.setFont(new Font("Raleway", Font.BOLD, 20));
        pincode.setBounds(100, 590, 200, 30);
        add(pincode);

        pintextfield = new JTextField();
        pintextfield.setFont(new Font("Raleway", Font.BOLD, 14));
        pintextfield.setBounds(300, 590, 400, 30);
        add(pintextfield);

        next = new JButton("Next");
        next.setBackground(Color.black);
        next.setForeground(Color.white);
        next.setFont(new Font("Raleway", Font.BOLD, 14));
        next.setBounds(620, 660, 80, 30);
        next.addActionListener(this);
        add(next);


        getContentPane().setBackground(Color.white);

        setSize(850,800);
        setLocation(350,10);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        String formno = "" + random;
        String name = nametextfield.getText();
        String fname = fnametextfield.getText();
        String dob = ((JTextField) datechooser.getDateEditor().getUiComponent()).getText();
        String gender = null;
        if (male.isSelected()){
            gender = "Male";
        } else if (female.isSelected()) {
            gender = "Female";
        } else if (other.isSelected()) {
            gender = "Other";
        }
        String email = emailtextfield.getText();
        String marital = null;
        if (married.isSelected()){
            marital = "Married";
        } else if (unmarried.isSelected()) {
            marital = "Unmarried";
        }
        String address = addresstextfield.getText();
        String city = citytextfield.getText();
        String state = statetextfield.getText();
        String pin = pintextfield.getText();

        try {
            if (name.equals("")){
                JOptionPane.showMessageDialog(null, "Name is required");
            }
            if (fname.equals("")){
                JOptionPane.showMessageDialog(null, "Father Name is required");
            }
            if (dob.equals("")){
                JOptionPane.showMessageDialog(null, "Date of birth is required");
            }
            if (gender.equals("")){
                JOptionPane.showMessageDialog(null, "Gender is required");
            }
            if (email.equals("")){
                JOptionPane.showMessageDialog(null, "Email is required");
            }
            if (marital.equals("")){
                JOptionPane.showMessageDialog(null, "Marital status is required");
            }
            if (address.equals("")){
                JOptionPane.showMessageDialog(null, "Address is required");
            }
            if (city.equals("")){
                JOptionPane.showMessageDialog(null, "City is required");
            }
            if (state.equals("")){
                JOptionPane.showMessageDialog(null, "State is required");
            }
            if (pin.equals("")){
                JOptionPane.showMessageDialog(null, "Pin Code is required");
            } else {
                conn c = new conn();
                String query = "insert into signup values('"+formno+"', '"+name+"', '"+fname+"', '"+dob+"', '"+gender+"', '"+email+"', '"+marital+"', '"+address+"', '"+city+"', '"+state+"', '"+pin+"')";
                c.s.executeUpdate(query);

                setVisible(false);
                new signupTwo(formno).setVisible(true);
            }

        }catch (Exception e){
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        new signupOne();
    }
}
