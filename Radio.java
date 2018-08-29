import javax.swing.*;

public class Radio {

	JFrame f;
	Radio()
	{ f=new JFrame();
	JRadioButton r1=new JRadioButton("PlayStation");
	JRadioButton r2=new JRadioButton("Xbox");
	r1.setBounds(50,100,100,30);
	r2.setBounds(50,150,70,30);
	ButtonGroup bg= new ButtonGroup();
	bg.add(r1);
	bg.add(r2);
	f.add(r1);f.add(r2);
	f.setSize(800,600);
	f.setLayout(null);
	f.setVisible(true);
	
	}
	public static void main(String args[])
	{
		new Radio();
		
	}
}
