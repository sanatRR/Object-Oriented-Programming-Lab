package lab6;

/**
*
*@author Sanat 190953222
*Program to understand dynamic method dispatch concept
*/

class Game{
 void type(){
	System.out.println("Indoor & Outdoor games");
 }
}

class Cricket extends Game{
 @Override
 void type(){
	System.out.println("Cricket is an outdoor game");
 }
}

class Chess extends Game{
 @Override
 void type(){
	System.out.println("Chess is an indoor game");
 }
}

public class programadd1{
	public static void main(String[] args){
	Game g1=new Game();
	Game oG=new Cricket();
	Game iG=new Chess();
	//Dynamic method dispatch in action
	//Exact method to be called is decided by JRE at runtime.
	g1.type();
	oG.type();
	iG.type();
	}
}