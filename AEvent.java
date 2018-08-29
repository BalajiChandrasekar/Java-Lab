import java.awt.*;
import java.awt.event.*;

class AEvent extends Frame implements ActionListener{
TextField tf;
AEvent()
{
	tf=new TextField();
	tf.setBounds(80,50,170,20);
	Button b=new Button("General Kenobi");
	b.setBounds(100,120,100,30);
	b.addActionListener(this);
	add(b);
	add(tf);
	setSize(800,600);
	setLayout(null);
	setVisible(true);
}
@Override
public void actionPerformed(ActionEvent arg0) {
       tf.setText("Hello There!");
       	
}
public static void main(String args[])
{
	new AEvent();
}
}