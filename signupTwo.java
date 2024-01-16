import javax.swing.*;
import java.awt.*;
import java.util.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;

public class signupTwo extends JFrame implements ActionListener {

    JTextField pantextfield, aadhartextfield;
    JButton next;
    JRadioButton syes, sno, eyes, eno;
    JComboBox religion1, category1, income1, occupation1, education1;
    String formno;
    signupTwo(String formno){
        this.formno = formno;
        setLayout(null);

        setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 2");

        JLabel additionaldetail = new JLabel("Page 2: Additional Details");
        additionaldetail.setFont(new Font("Raleway", Font.BOLD, 22));
        additionaldetail.setBounds(290, 50, 400, 30);
        add(additionaldetail);

        JLabel religion = new JLabel("Religion:");
        religion.setFont(new Font("Raleway", Font.BOLD, 20));
        religion.setBounds(100, 140, 100, 30);
        add(religion);

        String Religionvalues[] = {"Hindu", "Sikh", "Muslim", "Christian", "Other"};
        religion1 = new JComboBox(Religionvalues);
        religion1.setBounds(300, 140, 400, 30);
        religion1.setBackground(Color.white);
        add(religion1);

        JLabel category = new JLabel("Category:");
        category.setFont(new Font("Raleway", Font.BOLD, 20));
        category.setBounds(100, 190, 200, 30);
        add(category);

        String Categoryvalues[] = {"General", "OBC", "SC", "ST", "Other"};
        category1 = new JComboBox(Categoryvalues);
        category1.setBounds(300, 190, 400, 30);
        category1.setBackground(Color.white);
        add(category1);

        JLabel income = new JLabel("Income:");
        income.setFont(new Font("Raleway", Font.BOLD, 20));
        income.setBounds(100, 240, 200, 30);
        add(income);

        String Incomevalues[] = {"Null", "<150000", "<250000", "<500000", "<1000000"};
        income1 = new JComboBox(Incomevalues);
        income1.setBounds(300, 240, 400, 30);
        income1.setBackground(Color.white);
        add(income1);

        JLabel educational = new JLabel("Educational");
        educational.setFont(new Font("Raleway", Font.BOLD, 20));
        educational.setBounds(100, 290, 200, 30);
        add(educational);

        JLabel qualification = new JLabel("Qualification:");
        qualification.setFont(new Font("Raleway", Font.BOLD, 20));
        qualification.setBounds(100, 315, 200, 30);
        add(qualification);

        String Educationanlvalues[] = {"Non Graduate", "Under Graduate", "Post Graduate", "Doctrate", "Other"};
        education1 = new JComboBox(Educationanlvalues);
        education1.setBounds(300, 305, 400, 30);
        education1.setBackground(Color.white);
        add(education1);

        JLabel occupation = new JLabel("Occupation:");
        occupation.setFont(new Font("Raleway", Font.BOLD, 20));
        occupation.setBounds(100, 365, 200, 30);
        add(occupation);

        String Occupationvalues[] = {"Salaried", "Self-Employed", "Buisness", "Student", "Retired" , "Other"};
        occupation1 = new JComboBox(Occupationvalues);
        occupation1.setBounds(300, 365, 400, 30);
        occupation1.setBackground(Color.white);
        add(occupation1);

        JLabel pannumber = new JLabel("PAN Number:");
        pannumber.setFont(new Font("Raleway", Font.BOLD, 20));
        pannumber.setBounds(100, 440, 200, 30);
        add(pannumber);

        pantextfield = new JTextField();
        pantextfield.setFont(new Font("Raleway", Font.BOLD, 14));
        pantextfield.setBounds(300, 440, 400, 30);
        add(pantextfield);

        JLabel aadharnumber = new JLabel("Aadhar Number:");
        aadharnumber.setFont(new Font("Raleway", Font.BOLD, 20));
        aadharnumber.setBounds(100, 490, 200, 30);
        add(aadharnumber);

        aadhartextfield = new JTextField();
        aadhartextfield.setFont(new Font("Raleway", Font.BOLD, 14));
        aadhartextfield.setBounds(300, 490, 400, 30);
        add(aadhartextfield);

        JLabel seniorcitizen = new JLabel("Senior Citizen:");
        seniorcitizen.setFont(new Font("Raleway", Font.BOLD, 20));
        seniorcitizen.setBounds(100, 540, 200, 30);
        add(seniorcitizen);

        syes = new JRadioButton("Yes");
        syes.setBounds(300, 540, 100, 30);
        syes.setBackground(Color.white);
        add(syes);
        sno = new JRadioButton("No");
        sno.setBounds(400, 540, 100, 30);
        sno.setBackground(Color.white);
        add(sno);
        ButtonGroup seniorcitizengroup = new ButtonGroup();
        seniorcitizengroup.add(syes);
        seniorcitizengroup.add(sno);


        JLabel existingaccount = new JLabel("Existing Account:");
        existingaccount.setFont(new Font("Raleway", Font.BOLD, 20));
        existingaccount.setBounds(100, 590, 200, 30);
        add(existingaccount);

        eyes = new JRadioButton("Yes");
        eyes.setBounds(300, 590, 100, 30);
        eyes.setBackground(Color.white);
        add(eyes);
        eno = new JRadioButton("No");
        eno.setBounds(400, 590, 100, 30);
        eno.setBackground(Color.white);
        add(eno);
        ButtonGroup existingaccountgroup = new ButtonGroup();
        existingaccountgroup.add(eyes);
        existingaccountgroup.add(eno);

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
        String sreligion = (String) religion1.getSelectedItem();
        String scategory = (String) category1.getSelectedItem();
        String sincome = (String) income1.getSelectedItem();
        String seducation = (String) education1.getSelectedItem();
        String soccupation = (String) occupation1.getSelectedItem();
        String seniorcitizen = null;
        if (syes.isSelected()){
            seniorcitizen = "Yes";
        } else if (sno.isSelected()) {
            seniorcitizen = "No";
        }
        String existingaccount = null;
        if (eyes.isSelected()){
            existingaccount = "Yes";
        } else if (eno.isSelected()) {
            existingaccount = "No";
        }
        String span = pantextfield.getText();
        String saadhar = aadhartextfield.getText();


        try {
            if (sreligion.equals("")){
                JOptionPane.showMessageDialog(null, "Religion is required");
            }
            if (scategory.equals("")){
                JOptionPane.showMessageDialog(null, "Category Name is required");
            }
            if (sincome.equals("")){
                JOptionPane.showMessageDialog(null, "Income is required");
            }
            if (seducation.equals("")){
                JOptionPane.showMessageDialog(null, "Education is required");
            }
            if (soccupation.equals("")){
                JOptionPane.showMessageDialog(null, "Occupation is required");
            }
            if (seniorcitizen.equals("")){
                JOptionPane.showMessageDialog(null, "Senior Citizen status is required");
            }
            if (existingaccount.equals("")){
                JOptionPane.showMessageDialog(null, "Existing account yes or no is required");
            }
            if (span.equals("")){
                JOptionPane.showMessageDialog(null, "Pan Number is required");
            }
            if (saadhar.equals("")){
                JOptionPane.showMessageDialog(null, "Aadhar Number is required");
            } else {
                conn c = new conn();
                String query = "insert into signuptwo values('"+formno+"', '"+sreligion+"', '"+ scategory+"', '"+sincome+"', '"+seducation+"', '"+soccupation+"', '"+span+"', '"+saadhar+"', '"+seniorcitizen+"', '"+existingaccount+"')";
                c.s.executeUpdate(query);
            }
            setVisible(false);
            new signupThree(formno).setVisible(true);

        }catch (Exception e){
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        new signupTwo("");
    }
}

