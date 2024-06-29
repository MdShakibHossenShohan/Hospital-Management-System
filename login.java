import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class login extends JFrame implements MouseListener,ActionListener
{
	
	JPanel panel;
	JLabel user,pass;
	JTextField text;
	JPasswordField passfield;
	JButton login,back;
	Color mycolor;
	
	public login()
	{
		super("Login");
		this.setSize(800,450);
		
		mycolor=new Color(215,200,180);
		
		panel=new JPanel();
		panel.setLayout(null);
		panel.setBackground(mycolor);
		
		user=new JLabel("Email or Phone");
		user.setBounds(280,115,100,30);
		user.setBackground(Color.BLUE);
		user.setOpaque(true);
		user.setForeground(Color.RED);
		panel.add(user);
		
		
		text=new JTextField();
		text.setBounds(380,115,200,30);
		panel.add(text);
		
		pass=new JLabel("Password");
		pass.setBounds(280,165,100,30);
		user.setBackground(Color.BLUE);
		user.setOpaque(true);
		user.setForeground(Color.RED);
		panel.add(pass);
		
		
		passfield=new JPasswordField();
		passfield.setBounds(380,165,200,30);
		panel.add(passfield);
		
		login=new JButton("Enter");
		login.setBounds(300,215,100,40);
		login.setBackground(Color.RED);
		login.addMouseListener(this);
		login.addActionListener(this);
		panel.add(login);
		
		back=new JButton("Back");
		back.setBounds(450,215,100,40);
		back.setBackground(Color.RED);
		back.addMouseListener(this);
		back.addActionListener(this);
		panel.add(back);
		
		this.add(panel);
	}
	
	
	public void mouseClicked(MouseEvent me){}
	public void mousePressed(MouseEvent me){}
	public void mouseReleased(MouseEvent me){}
	
	public void mouseEntered(MouseEvent me)
	{
		if(me.getSource()==login)
		{
			login.setBackground(Color.BLUE);
		}
		else if(me.getSource()==back)
		{
			back.setBackground(Color.BLUE);
		}
	}
	public void mouseExited(MouseEvent me)
	{
		if(me.getSource()==login)
		{
			login.setBackground(Color.RED);
		}
		else if(me.getSource()==back)
		{
			back.setBackground(Color.RED);
		}
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		String command=ae.getActionCommand();
		{
			String name=user.getText();
			String pass=passfield.getText();
				
				if(name.isEmpty()||pass.isEmpty())
				{
					JOptionPane.showMessageDialog(null,"Wrong info");
					login l1=new login();
					l1.setVisible(true);
					this.setVisible(false);
				}
		else if(login.getText().equals(command))
		{   
	        JOptionPane.showMessageDialog(this,"Welcome");
			home hh=new home();
			hh.setVisible(true);
			this.setVisible(false);
		}
		
		else if(back.getText().equals(command))
		{
			HMS h1=new HMS();
			h1.setVisible(true);
			this.setVisible(false);
		}
	
	}

}
}