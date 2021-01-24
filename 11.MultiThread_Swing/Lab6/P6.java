//Swing Program to display hello world

import javax.swing.*;
import java.lang.Thread;
import java.lang.Runnable;

public class P6{
	public static void main(String args[]){
		Thread UIThread=new Thread(new UI());
		UIThread.start();
	}
}

class UI implements Runnable{
	@Override
	public void run(){
		JFrame jframe=new JFrame("Hello World Swing");
		jframe.setSize(400,20);
		JLabel jlabel=new JLabel("Hello World");
		jlabel.setBounds(0,0,250,20);
		jframe.add(jlabel);
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jframe.setLayout(null);
		jframe.setVisible(true);
		}
} 		