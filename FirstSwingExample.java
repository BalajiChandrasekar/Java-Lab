import javax.swing.*;
public class FirstSwingExample{
	public static void main(String args[])
	{
		JFrame f= new JFrame();
		JButton b= new JButton("CLick");
		b.setBounds(325,250,100,40);
		f.add(b);
		f.setSize(800,600);
		f.setLayout(null);
		f.setVisible(true);
		
	}
}