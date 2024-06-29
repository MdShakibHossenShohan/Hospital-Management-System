import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class doctorlist extends JFrame implements MouseListener,ActionListener
{
	JButton doctorname,fee,appointment,back1;
	JPanel panel;
	Color mycolor;

	public doctorlist()
	{
		super("DOCTOR LIST");
		this.setSize(800, 450);
		mycolor=new Color(215,200,180);
		
		
		panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(mycolor);
		
		doctorname = new JButton("Dr.Maliha Khanam");
		doctorname.setBounds(280, 225, 155, 30);
		doctorname.setBackground(Color.WHITE);
		doctorname.setOpaque(true);
		doctorname.setForeground(Color.BLUE);
		doctorname.addMouseListener(this);
		doctorname.addActionListener(this);
		panel.add(doctorname);


		fee = new JButton("Fee:1000");
		fee.setBounds(430, 225, 100, 30);
		fee.setBackground(Color.WHITE);
		fee.setOpaque(true);
		fee.setForeground(Color.BLUE);
		fee.addMouseListener(this);
		fee.addActionListener(this);
		panel.add(fee);
		
		appointment = new JButton("Confirm appointment");
		appointment.setBounds(320, 260, 170, 30);
		appointment.setBackground(Color.WHITE);
		appointment.setOpaque(true);
		appointment.setForeground(Color.BLUE);
		appointment.addMouseListener(this);
		appointment.addActionListener(this);
		panel.add(appointment);
		
		back1 = new JButton("Back");
		back1.setBounds(355,300,80,30);
		back1.setBackground(Color.WHITE);
		back1.setOpaque(true);
		back1.setForeground(Color.BLUE);
		back1.addMouseListener(this);
		back1.addActionListener(this);
		panel.add(back1);
		
		this.add(panel);
	}

	public void mouseClicked(MouseEvent me){}
	public void mousePressed(MouseEvent me){}
	public void mouseReleased(MouseEvent me){}
	public void mouseEntered(MouseEvent me)
	{
		if(me.getSource()==doctorname)
		{
			doctorname.setBackground(Color.BLUE);
		}
		else if(me.getSource()==fee)
		{
			fee.setBackground(Color.BLUE);
		}
		else if(me.getSource()==appointment)
		{
			appointment.setBackground(Color.BLUE);
		}
		else if(me.getSource()==back1)
		{
			back1.setBackground(Color.BLUE);
		}
	}
	
	public void mouseExited(MouseEvent me)
	{
		if(me.getSource()==doctorname)
		{
			doctorname.setBackground(Color.WHITE);
		}
		else if(me.getSource()==fee)
		{
			fee.setBackground(Color.WHITE);
		}
		else if(me.getSource()==appointment)
		{
			appointment.setBackground(Color.WHITE);
		}
		else if(me.getSource()==back1)
		{
			back1.setBackground(Color.WHITE);
		}
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		String command = ae.getActionCommand();
		
		{
			if (appointment.getText().equals(command))
			{
				JOptionPane.showMessageDialog(null,"Appointment Confirmed");
				}
				else if (back1.getText().equals(command))
				{
					home hh=new home();
				    hh.setVisible(true);
				    this.setVisible(false);
				}
		
			
		}
	}


}