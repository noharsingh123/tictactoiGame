package TicTocToe.Ashutosh.com;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class WhoWinSeries
{
  WhoWinSeries()
  {
	  JFrame jf=new JFrame();
	  jf.setSize(500,600);
	  jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	  jf.setLayout(null);
	  JLabel jl=new JLabel("message");
	  jl.setBounds(100,100,200,50);
	  jl.setForeground(Color.red);
	  jl.setFont(new Font("Arial",1,30));
	  jf.add(jl);
	  jf.setVisible( true);
  }
}
