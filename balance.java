import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class balance extends JFrame implements MouseListener,ActionListener
{
	JButton totalcost,paid,due,back2;
	JPanel panel;
	Color mycolor;

	public balance()
	{
		super("BALANCE");
		this.setSize(800, 450);
		mycolor=new Color(215,200,180);
		
		
		panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(mycolor);
		
		totalcost = new JButton("Total Cost:20000");
		totalcost.setBounds(280, 100, 170, 30);
		totalcost.setBackground(Color.WHITE);
		totalcost.setOpaque(true);
		totalcost.setForeground(Color.BLUE);
		totalcost.addMouseListener(this);
		totalcost.addActionListener(this);
		panel.add(totalcost);
		
		paid=new JButton("Paid:10000");
		paid.setBounds(285, 140, 155, 30);
		paid.setBackground(Color.WHITE);
		paid.setOpaque(true);
		paid.setForeground(Color.BLUE);
		paid.addMouseListener(this);
		paid.addActionListener(this);
		panel.add(paid);
		
		due = new JButton("Due:10000");
		due.setBounds(295, 180, 130, 30);
		due.setBackground(Color.WHITE);
		due.setOpaque(true);
		due.setForeground(Color.BLUE);
		due.addMouseListener(this);
		due.addActionListener(this);
		panel.add(due);
		
		
		back2 = new JButton("Back");
		back2.setBounds(315,220,80,30);
		back2.setBackground(Color.WHITE);
		back2.setOpaque(true);
		back2.setForeground(Color.BLUE);
		back2.addMouseListener(this);
		back2.addActionListener(this);
		panel.add(back2);
		
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
			if (back2.getText().equals(command))
			{
				home hh=new home();
				hh.setVisible(true);
				this.setVisible(false);
			}
				
			
		}
	}
}