package TermProject;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Innermain implements ActionListener{
	JFrame jf1;
	JLabel label;
	JButton logout;
	JMenuBar bar;
	JMenu genre, menu;
	JMenuItem act, ani, hor, comi, rom, sf, list;
	
	public Innermain() {
		jf1 = new JFrame("영화 리스트 메인");
		makeMenu();
		
		JPanel p1 = new JPanel();
		p1.setLayout(null);
		ImageIcon icon = new ImageIcon("./Image/movie1.png");
		Image img = icon.getImage();
		Image changeImg = img.getScaledInstance(700, 700, Image.SCALE_SMOOTH);
		ImageIcon changeIcon = new ImageIcon(changeImg);
		label = new JLabel(changeIcon);
		label.setBounds(30, 35, 800, 800);
		
		logout = new JButton("로그아웃");
		logout.setBounds(350,800,100,30);
		logout.addActionListener(this);
		
		p1.setBackground(Color.ORANGE);
		p1.add(label);
		p1.add(logout);
		
		jf1.add(p1);
		jf1.setJMenuBar(bar);
		
		jf1.setSize(900,900);
		jf1.setVisible(true);
	}
	
	public void makeMenu() {
		bar = new JMenuBar();
		genre = new JMenu("장르");
		genre.setMnemonic('G');
		
		menu = new JMenu("menu");
		menu.setMnemonic('M');
		
		act = new JMenuItem("액션");
		act.setMnemonic('A');
		genre.add(act);
		act.addActionListener(this);
		
		ani = new JMenuItem("애니메이션");
		ani.setMnemonic('N');
		genre.add(ani);
		ani.addActionListener(this);
		
		hor = new JMenuItem("공포");
		hor.setMnemonic('H');
		genre.add(hor);
		hor.addActionListener(this);
		
		comi = new JMenuItem("코미디");
		comi.setMnemonic('C');
		genre.add(comi);
		comi.addActionListener(this);
		
		rom = new JMenuItem("로맨스");
		rom.setMnemonic('R');
		genre.add(rom);
		rom.addActionListener(this);
		
		sf = new JMenuItem("SF");
		sf.setMnemonic('S');
		genre.add(sf);
		sf.addActionListener(this);
		
		list = new JMenuItem("list");
		list.setMnemonic('L');
		menu.add(list);
		list.addActionListener(this);
		
		bar.add(genre);
		bar.add(menu);		
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == logout) {
			new Login();
			jf1.dispose();
		}
		else if(e.getSource() == act) {
			new action();
			jf1.dispose();
		}
		else if(e.getSource() == ani){
			new animation();
			jf1.dispose();
		}
		else if(e.getSource() == hor) {
			new horror();
			jf1.dispose();
		}
		else if(e.getSource() == comi) {
			new comedy();
			jf1.dispose();
		}
		else if(e.getSource() == rom) {
			new romance();
			jf1.dispose();
		}
		else if(e.getSource()==sf) {
			new SF();
			jf1.dispose();
		}
		else if(e.getSource()==list) {
			new list();
			jf1.dispose();
		}
	}
	
}
