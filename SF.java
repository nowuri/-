package TermProject;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class SF implements ActionListener{
	JFrame jf7;
	JMenuBar bar;
	JMenu genre, menu;
	JMenuItem act, ani, hor, comi, rom, list, home;
	JTabbedPane tabpane5;
	
	public SF() {
		jf7 = new JFrame("SF");
		makeMenu();
		tabpane5 = new JTabbedPane();
		
		JPanel m1 = new JPanel(new BorderLayout());
		m1.setBackground(new Color(153,101,205));
		
		JLabel t1 = new JLabel("                               <인터스텔라>");
		Font font = new Font("맑은 고딕",Font.PLAIN,30);
		t1.setFont(font);
		
		ImageIcon icon1 = new ImageIcon("./Image/인터스텔라.jpg");
		Image img1 = icon1.getImage();
		Image changeImg1 = img1.getScaledInstance(500, 500, Image.SCALE_SMOOTH);
		ImageIcon changedIcon1 = new ImageIcon(changeImg1);
		JLabel pic1 = new JLabel(changedIcon1);
		
		JPanel p1 = new JPanel(new GridLayout(2,2));
		JLabel name1 = new JLabel("감독");
		JLabel n1 = new JLabel("크리스토퍼 놀란");
		JLabel actor1 = new JLabel("주연 배우");
		JLabel an1 = new JLabel("매튜 맥커너히, 앤 해서웨이, 마이클 케인, 제시카 차스테인");
		p1.add(name1);
		p1.add(n1);
		p1.add(actor1);
		p1.add(an1);
		
		JPanel p2 = new JPanel(new GridLayout(5,1));
		JLabel c1 = new JLabel("세계 각국의 정부와 경제가 완전히 붕괴된 미래가 다가온다. 지난 20세기에 범한 잘못이");
		JLabel c2 = new JLabel("전 세계적인 식량 부족을 불러왔고, NASA도 해체되었다. 이때 시공간에 불가사의한 틈이 열리고,");
		JLabel c3 = new JLabel("남은 자들에게는 이 곳을 탐험해 인류를 구해야 하는 임무가 지워진다. 사랑하는 가족들을 뒤로 한 채");
		JLabel c4 = new JLabel("인류라는 더 큰 가족을 위해, 그들은 이제 희망을 찾아 우주로 간다. 그리고 우린 답을 찾을 것이다.");
		JLabel c5 = new JLabel("늘 그랬듯이...");
		p2.add(c1);
		p2.add(c2);
		p2.add(c3);
		p2.add(c4);
		p2.add(c5);
		
		JPanel p3 = new JPanel(new GridLayout(2,1));
		p3.add(p1);
		p3.add(p2);
		
		m1.add("North",t1);
		m1.add("Center",pic1);
		m1.add("South",p3);
		
		JPanel m2 = new JPanel(new BorderLayout());
		m2.setBackground(new Color(153,101,205));
		
		JLabel t2 = new JLabel("                                <아이언맨>");
		t2.setFont(font);
		
		ImageIcon icon2 = new ImageIcon("./Image/아이언맨.jpg");
		Image img2 = icon2.getImage();
		Image changeImg2 = img2.getScaledInstance(500,500,Image.SCALE_SMOOTH);
		ImageIcon changedIcon2 = new ImageIcon(changeImg2);
		JLabel pic2 = new JLabel(changedIcon2);
		
		JPanel p4 = new JPanel(new GridLayout(2,2));
		JLabel name2 = new JLabel("감독");
		JLabel n2 = new JLabel("존 파브로");
		JLabel actor2 = new JLabel("주연 배우");
		JLabel an2 = new JLabel("로버트 다우니 주니어, 테렌스 하워드, 제프 브리지스, 가네스 팰트로");
		p4.add(name2);
		p4.add(n2);
		p4.add(actor2);
		p4.add(an2);
		
		JPanel p5 = new JPanel(new GridLayout(6,1));
		JLabel c6 = new JLabel("천재적인 두뇌와 재능으로 세계 최강의 무기업체를 이끄는 CEO이자, 타고난 매력으로 셀러브리티 못지 않은");
		JLabel c7 = new JLabel("화려한 삶을 살아가던 억만장자 토니 스타크. 신무기 발표 후 돌아가던 중 게릴라군에게 납치가 된다.");
		JLabel c8 = new JLabel("게릴라군의 위협 때문에 만들게 된 첫 수트 'Mark1'을 입고 탈출에 성공한다. 탈출 당시 부서진 Mark1을");
		JLabel c9 = new JLabel("바탕으로 업그레이드 된 Mark2를 만들고 그 후 Mark3까지 완성하게 되어 '아이언맨'으로 거듭난다.");
		JLabel c10 = new JLabel("게릴라군은 토니가 회수하지 못한 Mark1의 설계도와 그가 갖고 있던 에너지원을 훔쳐 '아이언맨'을 능가하는");
		JLabel c11 = new JLabel("거대하고 강력한 '아이언 몽거'를 완성한다. 그들은 세계 평화를 위협하고 토니는 그들의 음모와 배후세력이 누구인지 알게 되는데..!");
		p5.add(c6);
		p5.add(c7);
		p5.add(c8);
		p5.add(c9);
		p5.add(c10);
		p5.add(c11);
		
		JPanel p6 = new JPanel(new GridLayout(2,1));
		p6.add(p4);
		p6.add(p5);
		
		m2.add("North",t2);
		m2.add("Center",pic2);
		m2.add("South",p6);
		
		JPanel m3 = new JPanel(new BorderLayout());
		m3.setBackground(new Color(153,101,205));
		
		JLabel t3 = new JLabel("                                <그래비티>");
		t3.setFont(font);
		
		ImageIcon icon3 = new ImageIcon("./Image/gravity.jpg");
		Image img3 = icon3.getImage();
		Image changeImg3 = img3.getScaledInstance(500, 500, Image.SCALE_SMOOTH);
		ImageIcon changedIcon3 = new ImageIcon(changeImg3);
		JLabel pic3 = new JLabel(changedIcon3);
		
		JPanel p7 = new JPanel(new GridLayout(2,2));
		JLabel name3 = new JLabel("감독");
		JLabel n3 = new JLabel("알폰소 쿠아론");
		JLabel actor3 = new JLabel("주연 배우");
		JLabel an3 = new JLabel("산드라 블록, 조지 클루니");
		p7.add(name3);
		p7.add(n3);
		p7.add(actor3);
		p7.add(an3);
		
		JPanel p8 = new JPanel(new GridLayout(2,1));
		JLabel c12 = new JLabel("허블 우주 망원경을 수리하기 위해 우주를 탐사하던 라이언 스톤 박사는 폭파된 인공위성의 잔해와 부딪히면서");
		JLabel c13 = new JLabel("소리도 산소도 없는 우주 한 가운데에 홀로 남겨지는데...");
		p8.add(c12);
		p8.add(c13);
		
		JPanel p9 = new JPanel(new GridLayout(2,1));
		p9.add(p7);
		p9.add(p8);
		
		m3.add("North",t3);
		m3.add("Center",pic3);
		m3.add("South",p9);
		
		tabpane5.add("인터스텔라",m1);
		tabpane5.add("아이언맨",m2);
		tabpane5.add("그래비티",m3);
		
		jf7.getContentPane().add(tabpane5,BorderLayout.CENTER);
		jf7.setJMenuBar(bar);
		jf7.setSize(900,900);
		jf7.setVisible(true);
	}
	
	public void makeMenu() {
		bar = new JMenuBar();
		genre = new JMenu("장르");
		genre.setMnemonic('G');
		
		menu = new JMenu("메뉴");
		menu.setMnemonic('M');
		
		list = new JMenuItem("list");
		list.setMnemonic('L');
		menu.add(list);
		list.addActionListener(this);
		
		home = new JMenuItem("HOME");
		home.setMnemonic('h');
		menu.add(home);
		home.addActionListener(this);
		
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
		
		bar.add(genre);
		bar.add(menu);
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == home) {
			new Innermain();
			jf7.dispose();
		}
		else if(e.getSource()==act) {
			new action();
			jf7.dispose();
		}
		else if(e.getSource()== ani) {
			new animation();
			jf7.dispose();
		}
		else if(e.getSource()== hor) {
			new horror();
			jf7.dispose();
		}
		else if(e.getSource()==comi) {
			new comedy();
			jf7.dispose();
		}
		else if(e.getSource() == rom) {
			new romance();
			jf7.dispose();
		}
		else if(e.getSource()==list) {
			new list();
			jf7.dispose();
		}
	}
}
