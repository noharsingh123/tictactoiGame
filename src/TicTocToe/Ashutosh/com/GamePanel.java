package TicTocToe.Ashutosh.com;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class GamePanel implements ActionListener
{
    JFrame jf;
    JButton jb1,jb2,jb3,jb4,jb5,jb6,jb7,jb8,jb9;
    int count=0;
    boolean win=false;
    int total_series;
	Color color1;
	String xo_value="",title_str="";
	String	player1,player2;
	int series_count=1;
	boolean player1_turn=true;
	int palyer1_win_count=0,player2_win_count=0;
    GamePanel(String player1,String player2,int total_series)
    {
    	this.player1=player1;
    	this.player2=player2;
    	this.total_series=total_series;
    }
    void openGamePanel()
    {
    	jf=new JFrame("");
    	jf.setSize(500,500);
    	jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	jf.setLayout(new GridLayout(3,3));
    	jb1=new JButton();
    	jb1.addActionListener(this);
    	jf.add(jb1);
    	jb2=new JButton();
    	jb2.addActionListener(this);
    	jf.add(jb2);
    	jb3=new JButton();
    	jb3.addActionListener(this);
    	jf.add(jb3);
    	jb4=new JButton();
    	jb4.addActionListener(this);
    	jf.add(jb4);
    	jb5=new JButton();
    	jb5.addActionListener(this);
    	jf.add(jb5);
    	jb6=new JButton();
    	jb6.addActionListener(this);
    	jf.add(jb6);
    	jb7=new JButton();
    	jb7.addActionListener(this);
    	jf.add(jb7);
    	jb8=new JButton();
    	jb8.addActionListener(this);
    	jf.add(jb8);
    	jb9=new JButton();
    	jb9.addActionListener(this);
    	jf.add(jb9);
    	jf.setVisible(true);
    }
    
	public void actionPerformed(ActionEvent e)
	{
	  count=count+1;
	  if(player1_turn==true)
	  {
		color1=Color.yellow;
		xo_value="X";
		title_str="0";
		jf.setTitle(player2+"(+title_str+)turn");
		player1_turn=false;
	  }
	  else
	  {
		  xo_value="0";
		  color1=Color.red;
		  title_str="X";
		  jf.setTitle(player1+"("+title_str+")turns");
		  player1_turn=true;
	  }
	  if(e.getSource()==jb1)
	  {
		  jb1.setBackground(Color.red);
		  jb1.setFont(new Font("Arial",1,50));
		  jb1.setText(xo_value);
		  jb1.setEnabled(false);
	  }
	  if(e.getSource()==jb2)
	  {
		jb2.setBackground(Color.red);
		jb2.setFont(new Font("Arial",1,50));
		jb2.setText(xo_value);
		jb2.setEnabled(false);
	  }
	  if(e.getSource()==jb3)
	  {
		jb3.setBackground(Color.red);
		jb3.setFont(new Font("Arial",1,50));
		jb3.setText(xo_value);
		jb3.setEnabled(false);
	  }
	  if(e.getSource()==jb4)
	  {
		jb4.setBackground(Color.red);
		jb4.setFont(new Font("Arial",1,50));
		jb4.setText(xo_value);
		jb4.setEnabled(false);
	  }
	  if(e.getSource()==jb5)
	  {
		jb5.setBackground(Color.red);
		jb5.setFont(new Font("Arial",1,50));
		jb5.setText(xo_value);
		jb5.setEnabled(false);
	  }
	  if(e.getSource()==jb6)
	  {
		jb6.setBackground(Color.red);
		jb6.setFont(new Font("Arial",1,50));
		jb6.setText(xo_value);
		jb6.setEnabled(false);
	  }
	  if(e.getSource()==jb7)
	  {
		jb7.setBackground(Color.red);
		jb7.setFont(new Font("Arial",1,50));
		jb7.setText(xo_value);
		jb7.setEnabled(false);
	  }
	  if(e.getSource()==jb8)
	  {
		jb8.setBackground(Color.red);
		jb8.setFont(new Font("Arial",1,50));
		jb8.setText(xo_value);
		jb8.setEnabled(false);
	  }
	  if(e.getSource()==jb9)
	  {
		jb9.setBackground(Color.red);
		jb9.setFont(new Font("Arial",1,50));
		jb9.setText(xo_value);
		jb9.setEnabled(false);
	  }
	  winningPosibility();
	  whoWins();
	}
	void winningPosibility()
	{
	 if(jb1.getText()==jb2.getText()&&jb2.getText()==jb3.getText()&&jb3.getText()!="")
	 {
          win=true;		 
	 }
	 else if(jb4.getText()==jb5.getText()&&jb5.getText()==jb6.getText()&&jb6.getText()!="")
	 {
		 win=true;
	 }
	 if(jb7.getText()==jb8.getText()&&jb8.getText()==jb9.getText()&&jb9.getText()!="")
	 {
          win=true;		 
	 }
	 else if(jb1.getText()==jb5.getText() && jb5.getText()==jb9.getText() && jb9.getText() != "")
     {
         win=true;
     }
     else if(jb3.getText()==jb5.getText() && jb5.getText()==jb7.getText() && jb7.getText() != "")
     {
         win=true;
     }
	 else if(jb1.getText()==jb4.getText()&&jb4.getText()==jb7.getText()&&jb7.getText()!="")
	 {
		 win=true;
	 }
	 if(jb2.getText()==jb5.getText()&&jb5.getText()==jb8.getText()&&jb8.getText()!="")
	 {
          win=true;		 
	 }
	 else if(jb3.getText()==jb6.getText()&&jb6.getText()==jb9.getText()&&jb9.getText()!="")
	 {
		 win=true;
	 }
	 else
	 {
		 win=false;
	 }
	}
       void whoWins()
       {
    	   
	}
	

}
