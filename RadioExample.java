import javax.swing.*;
import java.awt.event.*;
class RadioExample extends JFrame implements ActionListener{
	JRadioButton rb1,rb2;
	JButton b;
	RadioExample()
	{
		rb1=new JRadioButton("Anakin Skywalker");
		rb1.setBounds(100,50,200,30);
		
		rb2= new JRadioButton("Darth Vader");
		rb2.setBounds(100,100,200,30);
		
		ButtonGroup bg= new ButtonGroup();
		bg.add(rb1);bg.add(rb2);
		b=new JButton("Click");
		b.setBounds(100,150,80,30);
		b.addActionListener(this);
		add(rb1);add(rb2);
		add(b);
		setSize(800,600);
		setLayout(null);
		setVisible(true);
		
		
	}
	public void actionPerformed(ActionEvent e) {
		if(rb1.isSelected()) {
			JOptionPane.showMessageDialog(this, "You are Ani.");
			}
		if(rb2.isSelected()){
			JOptionPane.showMessageDialog(this, "You are Vader.");
			
		}
	}
	public static void main(String args[])
	{
		new RadioExample();
	}
}