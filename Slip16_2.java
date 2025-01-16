import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import java.util.Map.Entry;
public class Slip16_2 implements ActionListener
{
	Hashtable hm=new Hashtable();
	JTextArea ta;
	JTextField t1,t2,t3;
	JButton b1,b2,b3;
	JLabel l1,l2,l3;
	JPanel p1,p2;
	
	public Slip16_2()
	{
		JFrame f=new JFrame("Slip 16_2");
		f.setLayout(new FlowLayout());
		
		ta= new JTextArea(22,20);
		
		l1=new JLabel("City name");
		l2=new JLabel("code");
		
		t1=new JTextField(20);
		t2=new JTextField(20);
		
		b1=new JButton("Add");
		
		p1=new JPanel(new GridLayout(3,2));
		
		p1.add(l1);
		p1.add(l2);
		p1.add(t1);
		p1.add(t2);
		p1.add(b1);
		
		l3=new JLabel("City name");
		
		t3=new JTextField(20);
		
		b2=new JButton("Search");
		b3=new JButton("Remove");
		
		p2=new JPanel(new GridLayout(3,2));
		
		p2.add(l3);
		p2.add(t3);
		p2.add(b2);
		p2.add(b3);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		
		//f.add(ta);
		f.add(p1);
		//f.add(l3);
		f.add(p2);
		
		f.setSize(695,500);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b1)
		{
			String city=t1.getText();
			String code=t2.getText();
			
			hm.put(city,code);
			this.show(hm);
		}
		else if(ae.getSource()==b2)
		{
			String searchCity=t3.getText();
			Set s=hm.entrySet();
			Iterator i=s.iterator();
			while(i.hasNext())
			{
				Map.Entry me=(Entry)i.next();
				if(searchCity.equalsIgnoreCase((String)me.getKey()))
				{
					ta.setText((String)me.getValue());
				}
			}
		}
		else if(ae.getSource()==b3)
		{
			String removeCity=t3.getText();
			hm.remove(removeCity);
			ta.setText("");
		}
	}
	public void show(Hashtable hm)
	{
		ta.setText("");
		Set s=hm.entrySet();
		Iterator i=s.iterator();
		while(i.hasNext())
		{
			Map.Entry me=(Entry)i.next();
			ta.append(me.getKey()+" "+me.getValue()+"\n");
		}
	}
	public static void main(String [] args)
	{
		new Slip16_2();
	}
}
