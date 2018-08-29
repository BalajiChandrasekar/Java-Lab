import java.awt.*;
class First2
{
	First2()
	{
		Frame f= new Frame();
		Button b= new Button("Click here");
		b.setBounds(30,50,80,30);
		f.add(b);
		f.setSize(800,600);
		f.setLayout(null);
		f.setVisible(true);
				
	}
	
	public static void main(String args[])
	{
		First2 f=new First2();
		
	}
}