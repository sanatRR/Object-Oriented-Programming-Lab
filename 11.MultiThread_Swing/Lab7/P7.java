//Implementation of Counter
//EveryTime Count clicked Counter+=6

import javax.swing.*;
import java.lang.Runnable;
import java.lang.Thread;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class P7{
	public static void main(String[] args)
	{
		Thread UIThread=new Thread(new UI());
		UIThread.start();
	}
}

class UI implements Runnable,ActionListener{

	JTextField jtextfield;
	@Override
	public void run()
	{
		JFrame jframe=new JFrame("Counter");
		jframe.setSize(200,70);
		JLabel jlabel=new JLabel("Counter");
		JButton jbutton=new JButton("count");
		jbutton.addActionListener(this);
		jtextfield=new JTextField("0000");
		jframe.add(jlabel);
		jframe.add(jtextfield);
		jframe.add(jbutton);
		jframe.setLayout(new FlowLayout(FlowLayout.RIGHT));	
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jframe.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e)
	{
		int num=Integer.valueOf(jtextfield.getText().strip());
		num+=6;
		jtextfield.setText(String.valueOf(num));	
	}
}
