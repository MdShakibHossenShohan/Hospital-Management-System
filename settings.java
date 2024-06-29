import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class settings extends JFrame implements MouseListener,ActionListener
{
	JButton myid,logout,back3;
	JPanel panel;
	Color mycolor;

	public settings()
	{
		super("SETTINGS");
		this.setSize(800, 450);
		mycolor=new Color(215,200,180);
		
		
		panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(mycolor);
		
		myid = new JButton("My Info");
		myid.setBounds(280, 100, 170, 30);
		myid.setBackground(Color.WHITE);
		myid.setOpaque(true);
		myid.setForeground(Color.BLUE);
		myid.addMouseListener(this);
		myid.addActionListener(this);
		panel.add(myid);
		
		logout=new JButton("Log Out");
		logout.setBounds(285, 140, 155, 30);
		logout.setBackground(Color.WHITE);
		logout.setOpaque(true);
		logout.setForeground(Color.BLUE);
		logout.addMouseListener(this);
		logout.addActionListener(this);
		panel.add(logout);
		
		
		back3 = new JButton("Back");
		back3.setBounds(315,220,80,30);
		back3.setBackground(Color.WHITE);
		back3.setOpaque(true);
		back3.setForeground(Color.BLUE);
		back3.addMouseListener(this);
		back3.addActionListener(this);
		panel.add(back3);
		
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
		
		{   if (logout.getText().equals(command))
			{
				HMS h1=new HMS();
			    h1.setVisible(true);
			    this.setVisible(false);
			} 
			if (back3.getText().equals(command))
			{
				home hh=new home();
			    hh.setVisible(true);
				this.setVisible(false);
			}
				
			
		}
	}
}