import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class registration extends JFrame implements MouseListener, ActionListener
{
	JPanel panel;
	JLabel userlabel,passlabel;
	JTextField userfield;
	JPasswordField passfield;
	JButton signup,backb;
	Color mycolor, mycolor1;
	Font myfont;
	
	
	public registration ()
	{
		super("Account Creation");
		this.setSize(800,500);
		
		panel = new JPanel();
		panel.setLayout(null);
		
		userlabel = new JLabel("First Name");
		userlabel.setBounds(300,100,100,30);
		userlabel.setBackground(Color.BLUE);
		userlabel.setOpaque(true);
		userlabel.setForeground(Color.RED);
		userlabel.setFont(myfont);
		panel.add(userlabel);
		
	    userfield = new JTextField();
		userfield.setBounds(400,100,100,30);
		panel.add(userfield);
	
		
		userlabel = new JLabel("Age");
		userlabel.setBounds(300,140,100,30);
		userlabel.setBackground(Color.BLUE);
		userlabel.setOpaque(true);
		userlabel.setForeground(Color.RED);
		userlabel.setFont(myfont);
		panel.add(userlabel);
		
	    userfield = new JTextField();
		userfield.setBounds(400,140,100,30);
		panel.add(userfield);
		
		userlabel = new JLabel("Email or Phone");
		userlabel.setBounds(300,180,100,30);
		userlabel.setBackground(Color.BLUE);
		userlabel.setOpaque(true);
		userlabel.setForeground(Color.RED);
		userlabel.setFont(myfont);
		panel.add(userlabel);
		
		userfield = new JTextField();
		userfield.setBounds(400,180,100,30);
		panel.add(userfield);
		
		userlabel = new JLabel("Gender");
		userlabel.setBounds(300,220,100,30);
		userlabel.setBackground(Color.BLUE);
		userlabel.setOpaque(true);
		userlabel.setForeground(Color.RED);
		userlabel.setFont(myfont);
		panel.add(userlabel);
		
	    userfield = new JTextField();
		userfield.setBounds(400,220,100,30);
		panel.add(userfield);
		
		passlabel = new JLabel("Password:");
		passlabel.setBounds(300,260,100,30);
		passlabel.setBackground(Color.BLUE);
		passlabel.setOpaque(true);
		panel.add(passlabel);
		
		passfield = new JPasswordField();
		passfield.setBounds(400,260,100,30);
		panel.add(passfield);
		
		passlabel = new JLabel("Confirm Password:");
		passlabel.setBounds(300,300,100,30);
		passlabel.setBackground(Color.BLUE);
		passlabel.setOpaque(true);
		panel.add(passlabel);
		
		passfield = new JPasswordField();
		passfield.setBounds(400,300,100,30);
		panel.add(passfield);
		
		signup= new JButton("Register");
		signup.setBounds(300,340,130,30);
		signup.setBackground(Color.RED);
		signup.setForeground(Color.BLUE);
		signup.addMouseListener(this);
		signup.addActionListener(this);
		panel.add(signup);
		
		backb = new JButton("Back");
		backb.setBounds(415,340,80,30);
		backb.setBackground(Color.RED);
		backb.setForeground(Color.BLUE);
		backb.addMouseListener(this);
		backb.addActionListener(this);
		panel.add(backb);
		
		this.add(panel);
	}
	public void mouseClicked(MouseEvent me){}
	public void mousePressed(MouseEvent me){}
	public void mouseReleased(MouseEvent me){}
	public void mouseEntered(MouseEvent me){}
	
	public void mouseExited(MouseEvent me){}
	public void actionPerformed(ActionEvent ae)
	{
		String command = ae.getActionCommand();
		
		{
			if (signup.getText().equals(command))
			{
				String name=userfield.getText();
				String pass=passfield.getText();
				
				if(name.isEmpty()||pass.isEmpty())
				{
					JOptionPane.showMessageDialog(null,"Please input all info");
				}
				else{
					
					account acc= new account(name,pass);
					acc.addaccount();
					
					JOptionPane.showMessageDialog(null,"Saved");
					
					userfield.setText("");
					passfield.setText("");
					
				home hh=new home();
				hh.setVisible(true);
				this.setVisible(false);
				}
			}
			else if(backb.getText().equals(command))
			{
				HMS h1=new HMS();
			    h1.setVisible(true);
			    this.setVisible(false);
			}
		}
	}
	
}