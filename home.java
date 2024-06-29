import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class home extends JFrame implements MouseListener,ActionListener
{
	JButton doctorlist,balance,settings;
	JPanel panel;
	Color mycolor;

	public home()
	{
		super("HOME");
		this.setSize(800, 450);
		mycolor=new Color(215,200,180);
		
		panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(mycolor);
		
	    doctorlist = new JButton("Doctor List");
	    doctorlist.setBounds(280, 100, 130, 30);
		doctorlist.setBackground(Color.WHITE);
		doctorlist.setOpaque(true);
		doctorlist.setForeground(Color.BLUE);
		doctorlist.addMouseListener(this);
		doctorlist.addActionListener(this);
		panel.add(doctorlist);
		
		balance = new JButton("Balance");
		balance.setBounds(280, 140, 130, 30);
        balance.setBackground(Color.WHITE);
		balance.setOpaque(true);
	    balance.setForeground(Color.BLUE);
		balance.addMouseListener(this);
        balance.addActionListener(this);
		panel.add(balance);
		
		settings = new JButton("Settings");
		settings.setBounds(280, 180, 130, 30);
        settings.setBackground(Color.WHITE);
		settings.setOpaque(true);
	    settings.setForeground(Color.BLUE);
		settings.addMouseListener(this);
        settings.addActionListener(this);
		panel.add(settings);
		
		
		this.add(panel);
	}
		
		
	public void mouseClicked(MouseEvent me){}
	public void mousePressed(MouseEvent me){}
	public void mouseReleased(MouseEvent me){}
	
	public void mouseEntered(MouseEvent me)
	{
		if(me.getSource()==doctorlist)
		{
			doctorlist.setBackground(Color.BLUE);
		}
		else if(me.getSource()==balance)
		{
			balance.setBackground(Color.BLUE);
		}
		else if(me.getSource()==settings)
		{
			settings.setBackground(Color.BLUE);
		}
		
	}
	public void mouseExited(MouseEvent me)
	{
		if(me.getSource()==doctorlist)
		{
			doctorlist.setBackground(Color.WHITE);
		}
		else if(me.getSource()==balance)
		{
			balance.setBackground(Color.WHITE);
		}
		else if(me.getSource()==settings)
		{
			settings.setBackground(Color.WHITE);
		}
		
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		String command=ae.getActionCommand();
		
		if(doctorlist.getText().equals(command))
		{
			doctorlist d1 = new doctorlist();
			d1.setVisible(true);
			this.setVisible(false);
		}
		else if(balance.getText().equals(command))
		{
			balance b1 = new balance();
			b1.setVisible(true);
			this.setVisible(false);
		}
		else if(settings.getText().equals(command))
		{
			settings s1=new settings();
			s1.setVisible(true);
			this.setVisible(false);
		}
		
	
	}

	
	
}
	