package TermProject;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class horror implements ActionListener{
	JFrame jf4;
	JMenuBar bar;
	JMenu genre, menu;
	JMenuItem act, ani, comi, rom, sf, list, home;
	JTabbedPane tabpane2;
	
	public horror() {
		jf4 = new JFrame("공포");
		makeMenu();
		tabpane2 = new JTabbedPane();
		
		JPanel m1 = new JPanel(new BorderLayout());
		m1.setBackground(new Color(175,35,35));
		
		JLabel t1 = new JLabel("                                <컨저링>");
		Font font = new Font("맑은 고딕",Font.PLAIN,30);
		t1.setFont(font);
		
		ImageIcon icon1 = new ImageIcon("./Image/conjuring.jpg");
		Image img1 = icon1.getImage();
		Image changeImg1 = img1.getScaledInstance(500, 500, Image.SCALE_SMOOTH);
		ImageIcon changedIcon1 = new ImageIcon(changeImg1);
		JLabel pic1 = new JLabel(changedIcon1);
		
		JPanel p1 = new JPanel(new GridLayout(2,2));
		JLabel name1 = new JLabel("감독");
		JLabel n1 = new JLabel("제임스 완");
		JLabel actor1 = new JLabel("주연 배우");
		JLabel an1 = new JLabel("베라 피미가, 패트릭 윌슨, 릴리 테일러, 론 리빙스턴, 조이 킹, 매켄지 포이");
		p1.add(name1);
		p1.add(n1);
		p1.add(actor1);
		p1.add(an1);
		
		JPanel p2 = new JPanel(new GridLayout(5,1));
		JLabel c1 = new JLabel("1971년 로드 아일랜드, 해리스빌. 페론 가족은 꿈에 그리던 새 집으로 이사를 간다.");
		JLabel c2 = new JLabel("물론 1863년에 그 집에서 일어난 끔찍한 살인 사건을 전혀 몰랐다.");
		JLabel c3 = new JLabel("또한 그 이후에 일어난 많은 무서운 사건에 대해서도 알지 못했다.");
		JLabel c4 = new JLabel("이 가족은 그 집에서 겪은 일이 너무 무서워서 한 마디라도 외부에 언급하는 것을 거절했었다.");
		JLabel c5 = new JLabel("지금까지는...");
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
		m1.add("South", p3);
		
		JPanel m2 = new JPanel(new BorderLayout());
		m2.setBackground(new Color(175,35,35));
		
		JLabel t2 = new JLabel("                                   <곤지암>");
		t2.setFont(font);
		
		ImageIcon icon2 = new ImageIcon("./Image/곤지암.jpg");
		Image img2 = icon2.getImage();
		Image changeImg2 = img2.getScaledInstance(500, 500, Image.SCALE_SMOOTH);
		ImageIcon changedIcon2 = new ImageIcon(changeImg2);
		JLabel pic2 = new JLabel(changedIcon2);
		
		JPanel p4 = new JPanel(new GridLayout(2,2));
		JLabel name2 = new JLabel("감독");
		JLabel n2 = new JLabel("정범식");
		JLabel actor2 = new JLabel("주연 배우");
		JLabel an2 = new JLabel("위하준, 박지현, 오아연, 문예원, 박성훈, 이승욱, 유제윤");
		p4.add(name2);
		p4.add(n2);
		p4.add(actor2);
		p4.add(an2);
		
		JPanel p5 = new JPanel(new GridLayout(5,1));
		JLabel c6 = new JLabel("1979년 환자 42명의 집단 자살과 병원장의 실종 이후, 섬뜩한 괴담으로 둘러싸인");
		JLabel c7 = new JLabel("곤지암 정신병원으로 공포체험을 떠난 7명의 멤버들 원장실, 집단 치료실, 실험실,");
		JLabel c8 = new JLabel("열리지 않는 4.2호... 괴담의 실체를 담아내기 이ㅜ해 병원 내부를 촬영하기 시작하던");
		JLabel c9 = new JLabel("멤버들에게 상상도 못한 기이하고 공포스러운 일들이 실제로 벌어지기 시작하는데...");
		JLabel c10 = new JLabel("가지 말라는 곳에는 반드시 이유가 있다. 소름 끼치는 '곤지암 정신병원'의 실체를 경험하라!");
		p5.add(c6);
		p5.add(c7);
		p5.add(c8);
		p5.add(c9);
		p5.add(c10);
		
		JPanel p6 = new JPanel(new GridLayout(2,1));
		p6.add(p4);
		p6.add(p5);
		
		m2.add("North",t2);
		m2.add("Center",pic2);
		m2.add("South",p6);
		
		JPanel m3 = new JPanel(new BorderLayout());
		m3.setBackground(new Color(175,35,35));
		
		JLabel t3 = new JLabel("                            <라스트 나잇 인 소호> ");
		t3.setFont(font);
		
		ImageIcon icon3 = new ImageIcon("./Image/last.jpg");
		Image img3 = icon3.getImage();
		Image changeImg3 = img3.getScaledInstance(500, 500, Image.SCALE_SMOOTH);
		ImageIcon changedIcon3 = new ImageIcon(changeImg3);
		JLabel pic3 = new JLabel(changedIcon3);
		
		JPanel p7 = new JPanel(new GridLayout(2,2));
		JLabel name3 = new JLabel("감독");
		JLabel n3 = new JLabel("에드가 라이트");
		JLabel actor3 = new JLabel("주연 배우");
		JLabel an3 = new JLabel("토마신 맥켄지, 안야 테일러 조이, 맷 스미스, 리타 터싱햄");
		p7.add(name3);
		p7.add(n3);
		p7.add(actor3);
		p7.add(an3);
		
		JPanel p8 = new JPanel(new GridLayout(4,1));
		JLabel c11 = new JLabel("패션 디자이너의 꿈을 안고 런던 소호로 온 '엘리'는 매일 밤 꿈에서 1960년대");
		JLabel c12 = new JLabel("소호의 매혹적인 가수 '샌디'를 만나게 되고, 그녀에게 매료된다. '엘리'는 '샌디'에게");
		JLabel c13 = new JLabel("화려한 삶이 펼쳐질 것이라 생각했지만 꿈은 점점 악몽이 되어가고 '샌디'는 누군가에게 ");
		JLabel c14 = new JLabel("살해당하고 만다. 유일한 목격자가 된 '엘리', '샌디'를 죽인 범인은 '엘리'의 시간 속에 살고 있다.");
		p8.add(c11);
		p8.add(c12);
		p8.add(c13);
		p8.add(c14);
		
		JPanel p9 = new JPanel(new GridLayout(2,1));
		p9.add(p7);
		p9.add(p8);
		
		m3.add("North",t3);
		m3.add("Center",pic3);
		m3.add("South",p9);
		
		tabpane2.add("컨저링",m1);
		tabpane2.add("곤지암",m2);
		tabpane2.add("라스트...",m3);
		
		jf4.getContentPane().add(tabpane2,BorderLayout.CENTER);
		jf4.setJMenuBar(bar);
		jf4.setSize(900,900);
		jf4.setVisible(true);
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
		bar.add(menu);
	}
	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == home) {
			new Innermain();
			jf4.dispose();
		}
		else if(e.getSource() == act) {
			new action();
			jf4.dispose();
		}
		else if(e.getSource() == ani) {
			new animation();
			jf4.dispose();
		}
		else if(e.getSource()== comi) {
			new comedy();
			jf4.dispose();
		}
		else if(e.getSource() == rom) {
			new romance();
			jf4.dispose();
		}
		else if(e.getSource()==sf) {
			new SF();
			jf4.dispose();
		}
		else if(e.getSource()==list) {
			new list();
			jf4.dispose();
		}
	}
}
