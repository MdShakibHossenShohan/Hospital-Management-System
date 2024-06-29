import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class HMS extends JFrame implements MouseListener,ActionListener
{
	JButton loginBtn,signupBtn, exitBtn;
	JPanel panel;
	Color mycolor;

	public HMS()
	{
		super("HMS");
		this.setSize(800, 450);
		mycolor=new Color(215,200,180);
		
		
		panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(mycolor);
		
		loginBtn = new JButton("Login");
		loginBtn.setBounds(280, 225, 80, 30);
		loginBtn.setBackground(Color.WHITE);
		loginBtn.setOpaque(true);
		loginBtn.setForeground(Color.BLUE);
		loginBtn.addMouseListener(this);
		loginBtn.addActionListener(this);
		panel.add(loginBtn);
		
		signupBtn = new JButton("Create new account");
		signupBtn.setBounds(370, 225, 170, 30);
		signupBtn.setBackground(Color.WHITE);
		signupBtn.setOpaque(true);
		signupBtn.setForeground(Color.BLUE);
		signupBtn.addMouseListener(this);
		signupBtn.addActionListener(this);
		panel.add(signupBtn);
		
		
		exitBtn = new JButton("Exit");
		exitBtn.setBounds(330, 275, 80, 30);
		exitBtn.setBackground(Color.WHITE);
		exitBtn.setOpaque(true);
		exitBtn.setForeground(Color.BLUE);
		exitBtn.addMouseListener(this);
		exitBtn.addActionListener(this);
		panel.add(exitBtn);
		
		
		this.add(panel);
	}
	
	public void mouseClicked(MouseEvent me){}
	public void mousePressed(MouseEvent me){}
	public void mouseReleased(MouseEvent me){}
	
	public void mouseEntered(MouseEvent me)
	{
		if(me.getSource()==loginBtn)
		{
			loginBtn.setBackground(Color.BLUE);
		}
		else if(me.getSource()==signupBtn)
		{
			signupBtn.setBackground(Color.BLUE);
		}
		else if(me.getSource()==exitBtn)
		{
			exitBtn.setBackground(Color.BLUE);
		}
	}
	public void mouseExited(MouseEvent me)
	{
		if(me.getSource()==loginBtn)
		{
			loginBtn.setBackground(Color.WHITE);
		}
		else if(me.getSource()==signupBtn)
		{
			signupBtn.setBackground(Color.WHITE);
		}
		else if(me.getSource()==exitBtn)
		{
			exitBtn.setBackground(Color.WHITE);
		}
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		String command = ae.getActionCommand();
		
		{
			if (loginBtn.getText().equals(command))
			{
				
				login l1=new login();
				l1.setVisible(true);
				this.setVisible(false);
				}
				else if (signupBtn.getText().equals(command))
				{
					registration r1=new registration();
					r1.setVisible(true);
					this.setVisible(false);
				}
		
			 else if(exitBtn.getText().equals(command))
			{
				System.exit(0);
			}
		}
	}
}
	

