package TermProject;
import javax.swing.*;
import java.awt.event.*;
import java.awt.Color;
import java.awt.*;

public class action implements ActionListener{
	JFrame jf2;
	JMenuBar bar;
	JMenu genre, Menu;
	JMenuItem ani, hor, comi, rom, sf,list, home;
	JTabbedPane tabpane;
	
	public action() {
		jf2 = new JFrame("액션");
		makeMenu();
		
		tabpane = new JTabbedPane();
		
		JPanel m1 = new JPanel(new BorderLayout());
		
		m1.setBackground(new Color(68,80,159));
		
		JLabel t1 = new JLabel("                                 <스파이더맨2>");
		Font font = new Font("맑은 고딕",Font.PLAIN,30);
		t1.setFont(font);
		
		ImageIcon icon1 = new ImageIcon("./Image/spiderman2.jpg");
		Image img = icon1.getImage();
		Image changeImg = img.getScaledInstance(500, 500, Image.SCALE_SMOOTH);
		ImageIcon changedIcon1 = new ImageIcon(changeImg);
		JLabel pic = new JLabel(changedIcon1);
		
		JPanel p1 = new JPanel(new GridLayout(2,2));
		JLabel name= new JLabel("감독");
		JLabel n= new JLabel("샘 레이미");
		JLabel actor = new JLabel("주연 배우");
		JLabel an = new JLabel("토비 매콰이어, 저스틴 던스트, 제임스 프랭코, 앨프리드 몰리나");
		p1.add(name);
		p1.add(n);
		p1.add(actor);
		p1.add(an);
		
		JPanel p3 = new JPanel(new GridLayout(5,1));
		JLabel cont = new JLabel("'스파이더맨'이 돌아온다. 우연한 사고로 특별한 능력을 갖게된 피터 파커는 ");
		JLabel cont1 = new JLabel("대학생과 슈퍼 히어로의 신분을 오가며 짜릿한 생활을 하지만 사랑 하는 메리 제인에게조차 ");
		JLabel cont2 = new JLabel("자신의 마음을 열 수 없는 현실은 그들을 안타까운 로맨스로 이끈다. 한편 스파이더맨에게 아버지를 잃고 복수심에 불타는 ");
		JLabel cont3 = new JLabel("피터의 친구 해리가 연구 중 폭발로 기계촉수와 엄청난 파워를 갖게된 닥터 옥토퍼스에게 뿌리치지 못할 ");
		JLabel cont4 = new JLabel("제안을 하면서 스파이더맨의 운명은 점차 예측불가능한 상황으로 전개되는데...");
		p3.add(cont);
		p3.add(cont1);
		p3.add(cont2);
		p3.add(cont3);
		p3.add(cont4);
	
		JPanel p4 = new JPanel(new GridLayout(2,1));
		p4.add(p1);
		p4.add(p3);
		
		m1.add("North",t1);
		m1.add("Center",pic);
		m1.add("South",p4);
		
		JPanel m2 = new JPanel(new BorderLayout());
		
		m2.setBackground(new Color(68,80,159));
		
		JLabel t2 = new JLabel("                       <킹스맨: 퍼스트 에이전트>");
		t2.setFont(font);
		
		ImageIcon icon2 = new ImageIcon("./Image/kingsman.jpg");
		Image img1 = icon2.getImage();
		Image changeImg1 = img1.getScaledInstance(500,500,Image.SCALE_SMOOTH);
		ImageIcon changedIcon2 = new ImageIcon(changeImg1);
		JLabel pic1 = new JLabel(changedIcon2);
		
		JPanel p2 = new JPanel(new GridLayout(2,2));
		JLabel name1= new JLabel("감독");
		JLabel n1= new JLabel("매튜 본");
		JLabel actor1 = new JLabel("주연 배우");
		JLabel an1 = new JLabel("랄프 파인즈, 젬마 아터튼 리스 이판, 해리스 딕킨스, 디몬 하운수");
		p2.add(name1);
		p2.add(n1);
		p2.add(actor1);
		p2.add(an1);
		
		JPanel p5 = new JPanel(new GridLayout(3,1));
		JLabel cont5 = new JLabel("역사상 최악의 폭군들과 범죄자들이 모여 수백만명의 생명을 위협할 전댕을 모의하는 광기의 시대");
		JLabel cont6 = new JLabel("이들을 막으려는 한 사람과 그가 비밀리에 운영 중인 독립 정보기관,'킹스맨'의 최초 미션이 시작된다!");
		JLabel cont7 = new JLabel("베일에 감춰졌던 킹스맨의 탄생을 목격하라!");
		p5.add(cont5);
		p5.add(cont6);
		p5.add(cont7);
		
		JPanel p6 = new JPanel(new GridLayout(2,1));
		p6.add(p2);
		p6.add(p5);
		
		m2.add("North", t2);
		m2.add("Center",pic1);
		m2.add("South",p6);
		
		JPanel m3 = new JPanel(new BorderLayout());
		
		m3.setBackground(new Color(68,80,159));
		
		JLabel t3 = new JLabel("                                 <모가디슈>");
		t3.setFont(font);
		
		ImageIcon icon3 = new ImageIcon("./Image/mogadisu.jpg");
		Image img2 = icon3.getImage();
		Image changeImg2 = img2.getScaledInstance(500, 500, Image.SCALE_SMOOTH);
		ImageIcon changedIcon3 = new ImageIcon(changeImg2);
		JLabel pic2 = new JLabel(changedIcon3);
		
		JPanel p7 = new JPanel(new GridLayout(2,2));
		JLabel name2= new JLabel("감독");
		JLabel n2= new JLabel("류승완");
		JLabel actor2 = new JLabel("주연 배우");
		JLabel an2 = new JLabel("김윤석, 조인성, 허준호, 구교환, 김소진, 정만식");
		p7.add(name2);
		p7.add(n2);
		p7.add(actor2);
		p7.add(an2);
		
		JPanel p8 = new JPanel(new GridLayout(5,1));
		JLabel cont8 = new JLabel("내전으로 고립된 낯선 도시, 모가디슈 지금부터 우리의 목표는 오로지 생존이다!");
		JLabel cont9 = new JLabel("대한민국이 UN가입을 위해 동분서주하던 시기 1991년 소말리아의 수도 모가디슈에서는 일촉즉발의 내전이 일어난다.");
		JLabel cont10 = new JLabel("통신마저 끊긴 그 곳에 고립된 대한민국 대사관의 직원과 가족들은 총알과 포탄이 빗발치는 가운데,");
		JLabel cont11 = new JLabel("살아님기 위해 하루하루를 버텨낸다. 그러던 어느 날 밤, 북한 대사관의 일행들이 도움을 요청하며 문을 두드리는데");
		JLabel cont12 = new JLabel("목표는 하나, 모가디슈에서 탈출해야 한다.");
		p8.add(cont8);
		p8.add(cont9);
		p8.add(cont10);
		p8.add(cont11);
		p8.add(cont12);
		
		JPanel p9 = new JPanel(new GridLayout(2,1));
		p9.add(p7);
		p9.add(p8);
		
		m3.add("North",t3);
		m3.add("Center",pic2);
		m3.add("South",p9);

		tabpane.add("스파이더맨2",m1);
		tabpane.add("킹스맨...",m2);
		tabpane.add("모가디슈",m3);
		
		jf2.getContentPane().add(tabpane,BorderLayout.CENTER);
		jf2.setJMenuBar(bar);
		jf2.setSize(900,900);
		jf2.setVisible(true);
		
	}
	
	public void makeMenu() {
		bar = new JMenuBar();
		genre = new JMenu("장르");
		genre.setMnemonic('G');
		
		Menu = new JMenu("메뉴");
		Menu.setMnemonic('M');
				
		list = new JMenuItem("list");
		list.setMnemonic('L');
		Menu.add(list);
		list.addActionListener(this);
		
		home = new JMenuItem("HOME");
		home.setMnemonic('O');
		Menu.add(home);
		home.addActionListener(this);
		
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
		
		bar.add(genre);
		bar.add(Menu);
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == home) {
			new Innermain();
			jf2.dispose();
		}
		else if(e.getSource()== ani) {
			new animation();
			jf2.dispose();
		}
		else if(e.getSource() == hor) {
			new horror();
			jf2.dispose();
		}
		else if(e.getSource() == comi) {
			new comedy();
			jf2.dispose();
		}
		else if(e.getSource()== rom) {
			new romance();
			jf2.dispose();
		}
		else if(e.getSource()==sf) {
			new SF();
			jf2.dispose();
		}
		else if(e.getSource()==list) {
			new list();
			jf2.dispose();
		}
	}
}
