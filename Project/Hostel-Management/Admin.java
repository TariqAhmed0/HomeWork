package UIScreen; 
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Admin extends JFrame implements ActionListener {
    private JButton addHostelite,readAllHostelites, searchHostelite, updateHostelite, deleteHostelite, billInfo, totalIncome,  complaints , forgotPasswords;
    private JButton back;

    public Admin() {
        super("Admin Screen");
        this.setSize(600, 600);
        this.setForeground(Color.BLACK);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new GridLayout(10, 1));

        addHostelite = new JButton("Add Profile");
        readAllHostelites = new JButton("View All Hostelites");
        searchHostelite = new JButton("Search Info");
        updateHostelite = new JButton("Update Info");
        deleteHostelite = new JButton("Delete Profile");
        billInfo = new JButton("Bill Info");
        totalIncome = new JButton("Total Income");
        complaints = new JButton("See Complaints");
        forgotPasswords = new JButton("Get Passwords");
        back = new JButton("Back");


        this.add(addHostelite);
        this.add(readAllHostelites);
        this.add(searchHostelite);
        this.add(updateHostelite);
        this.add(deleteHostelite);
        this.add(billInfo);
        this.add(totalIncome);
        this.add(complaints);
        this.add(forgotPasswords);
        this.add(back);

        addHostelite.addActionListener(this);
        readAllHostelites.addActionListener(this);
        searchHostelite.addActionListener(this);
        updateHostelite.addActionListener(this);
        deleteHostelite.addActionListener(this);
        billInfo.addActionListener(this);
        totalIncome.addActionListener(this);
        complaints.addActionListener(this);
        forgotPasswords.addActionListener(this);
        back.addActionListener(this);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == addHostelite) {
            this.dispose();
            new AddHostelite();
        }
        
        else if (e.getSource() == readAllHostelites) {
            this.dispose();
            new ViewAllProfiles();

        }
        else if(e.getSource() == searchHostelite) {
            this.dispose();
            new SearchHostelite();
        }
        else if(e.getSource() == updateHostelite) {
            this.dispose();
            new UpdateHostelite();
        }
        else if(e.getSource() == deleteHostelite) {
            this.dispose();
            new DeleteHostelite();
        }
        else if (e.getSource() == billInfo) {
            this.dispose();
            new BillInfo();
        }
        
        else if(e.getSource() == totalIncome) {
            this.dispose();
            new TotalIncome();
        }
        else if (e.getSource() == complaints) {
            this.dispose();
            new Complaints();
        }

        else if (e.getSource() == forgotPasswords) {
            this.dispose();
            new forgotPassword();
        }
        
        else if(e.getSource() == back) {
            this.dispose();
            new Main();
        }
        
    } 
    
}
