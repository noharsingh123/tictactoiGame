package TicTocToe.Ashutosh.com;
import javax.swing.*;

import com.Ashutosh.GamePanel;

import java.awt.event.*;
import java.awt.*;
public class UserPanel implements ActionListener
{
  JFrame jf;JLabel jl1,jl2,jl3;JTextField jt1,jt2;JComboBox cb;JButton jb;
  UserPanel()
  {
	   jf=new JFrame("TicTacToeGame By Ashutosh");
	   jf.setSize(500,600);
	   jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	   jl1= new JLabel("Enter the (X) turn");
	   jl1.setBounds(50, 50, 100, 30);
	   jf.add(jl1);
	   jt1=new JTextField();
	   jt1.setBounds(50, 100, 150, 30);
	   jf.add(jt1);
	   jl2= new JLabel("Enter the (0) turn");
	   jl2.setBounds(50, 150, 200, 30);
	   jf.add(jl2);
	   jt2=new JTextField();
	   jt2.setBounds(50, 200, 250, 30);
	   jf.add(jt2);
	   jl3= new JLabel("Select series");
	   jl3.setBounds(50, 250, 300, 30);
	   jf.add(jl3);
	   String[] series= {"3","5","7","9"};
	   cb=new JComboBox();
	   cb.setBounds(50, 300, 350, 30);
	   jf.add(cb);
	   jb=new JButton("Starts");
	   jb.setBounds(100, 400, 450, 30);
	   jf.add(jb);
	   jb.addActionListener(this);
	   jf.setVisible(true);
  }
  public static void main(String[] args)
  {
	UserPanel user=new UserPanel();
}
public void actionPerformed(ActionEvent e)
{
	if(e.getSource()==jb)
	{
		String player1= jt1.getText();
		String player2= jt1.getText();
		String series=(String)cb.getSelectedItem();
        
        GamePanel gp=new GamePanel(player1, player2, Integer.parseInt(series));
        gp.openGamePanel();
        jf.setVisible(false);
	}
}
}
