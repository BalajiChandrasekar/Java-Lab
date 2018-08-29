import java.awt.*;
class First extends Frame{
	First(){
		Button b= new Button("click here");
		b.setBounds(30,100,80,30);
		add(b);
		setSize(500,500);
		setLayout(null);
		setVisible(true);
		
	}
	public static void main(String args[])
	{
		First f= new First();
	}
}