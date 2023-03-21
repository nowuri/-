package TermProject;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class romance implements ActionListener{
	JFrame jf6;
	JMenuBar bar;
	JMenu genre, menu;
	JMenuItem act, ani, hor, comi, sf, list, home;
	JTabbedPane tabpane4;
	
	public romance() {
		jf6 = new JFrame("로맨스");
		makeMenu();
		tabpane4 = new JTabbedPane();
		
		JPanel m1 = new JPanel(new BorderLayout());
		m1.setBackground(new Color(255,112,237));
		
		JLabel t1 = new JLabel("                                <해피뉴이어>");
		Font font = new Font("맑은 고딕",Font.PLAIN,30);
		t1.setFont(font);
		
		ImageIcon icon1 = new ImageIcon("./Image/해피뉴이어.jpg");
		Image img1 = icon1.getImage();
		Image changeImg1 = img1.getScaledInstance(500, 500, Image.SCALE_SMOOTH);
		ImageIcon changedIcon1 = new ImageIcon(changeImg1);
		JLabel pic1 = new JLabel(changedIcon1);
		
		JPanel p1 = new JPanel(new GridLayout(2,2));
		JLabel name1 = new JLabel("감독");
		JLabel n1 = new JLabel("곽재용");
		JLabel actor1 = new JLabel("주연 배우");
		JLabel an1 = new JLabel("한지민, 이동욱, 강하늘, 윤아, 원진아, 이혜영, 정진영, 김영광, 서강준...");
		p1.add(name1);
		p1.add(n1);
		p1.add(actor1);
		p1.add(an1);
		
		JPanel p2 = new JPanel(new GridLayout(6,1));
		JLabel c1 = new JLabel("15년째 남사친에게 고백을 망설이는 호텔리어 '소진' 그런 소진의 속도 모른 채 여자친구 '영주' 와의 초고속 깜짝 결혼을");
		JLabel c2 = new JLabel("발표하는 '승효' 모든 걸 다 가졌지만 짝수 강박증으로 고생하는 호텔 대표 '용진' 뮤지컬 배우의 꿈을 접고 생활전선에 뛰어든");
		JLabel c3 = new JLabel("하우스키퍼 '이영' 공무원 시험 낙방 5년차, 되는 일이 하나도 없는 호텔 투숙객 '재용'에게 결려온 뜻밖의 모닝콜");
		JLabel c4 = new JLabel("오랜 무명 끝 전성기를 맞이하고 함께하는 마지막 콘서트를 앞둔 가수 '이강'과 매니저 '상훈' 40년 만에 우연히 첫사랑 '캐서린'을");
		JLabel c5 = new JLabel("다시 만난 호텔 간판 도어맨 '상규' 매주 토요일 호텔 라운지에서 새로운 인연을 기다리는 맞선남 '진호'까지 때론 아찔하고,");
		JLabel c6 = new JLabel("때론 애틋하고, 때론 눈물나게 행복한 오래의 마지막, 호텔 엠로스에서 당신을 기다립니다.");
		p2.add(c1);
		p2.add(c2);
		p2.add(c3);
		p2.add(c4);
		p2.add(c5);
		p2.add(c6);
		
		JPanel p3 = new JPanel(new GridLayout(2,1));
		p3.add(p1);
		p3.add(p2);
		
		m1.add("North",t1);
		m1.add("Center",pic1);
		m1.add("South",p3);
		
		JPanel m2 = new JPanel(new BorderLayout());
		m2.setBackground(new Color(255,112,237));
		
		JLabel t2 = new JLabel("                                <어바웃타임>");
		t2.setFont(font);
		
		ImageIcon icon2 = new ImageIcon("./Image/abouttime.jpg");
		Image img2 = icon2.getImage();
		Image changeImg2 = img2.getScaledInstance(500, 500, Image.SCALE_SMOOTH);
		ImageIcon changedIcon2 = new ImageIcon(changeImg2);
		JLabel pic2 = new JLabel(changedIcon2);
		
		JPanel p4 = new JPanel(new GridLayout(2,2));
		JLabel name2 = new JLabel("감독");
		JLabel n2 = new JLabel("리차드 커티스");
		JLabel actor2 = new JLabel("주연 배우");
		JLabel an2 = new JLabel("도널 글리슨, 레이첼 맥아담스");
		p4.add(name2);
		p4.add(n2);
		p4.add(actor2);
		p4.add(an2);
		
		JPanel p5 = new JPanel(new GridLayout(6,1));
		JLabel c7 = new JLabel("모태솔로 팀은 성인이 된 날, 아버지로부터 놀랄만한 가문의 비밀을 듣게 된다. 바로 시간을 되돌릴 수 있는 능력이 있다는 것!");
		JLabel c8 = new JLabel("그것이 비록 히틀러를 죽이거나 여신과 뜨거운 사랑을 할 수는 없지만, 여자친구는 만들어줄 순 있으리... 꿈을 위해 런던으로 간");
		JLabel c9 = new JLabel("팀은 우연히 만난 사랑스러운 여인 메리에게 첫눈에 반하게 된다. 그녀의 사랑을 얻기 위해 자신의 특별한 능력을 마음껏 발휘하는 팀");
		JLabel c10 = new JLabel("어설픈 대시, 어색한 웃음은 리와인드! 뜨거웠던 밤은 더욱 뜨겁게 리플레이! 꿈에 그리던 그녀와 매일매일 최고의 순간을 보낸다.");
		JLabel c11 = new JLabel("하지만 그와 그녀의 사랑이 완벽해질수록 팀을 둘러싼 주변 상황들은 미묘하게 엇갈리고, 예상치 못한 사건들이 여기저기 나타나기 시작하는데...");
		JLabel c12 = new JLabel("어떠한 순간을 다시 살게 된다면, 과연 완벽한 사랑을 이룰 수 있을까?");
		p5.add(c7);
		p5.add(c8);
		p5.add(c9);
		p5.add(c10);
		p5.add(c11);
		p5.add(c12);
		
		JPanel p6 = new JPanel(new GridLayout(2,1));
		p6.add(p4);
		p6.add(p5);
		
		m2.add("North", t2);
		m2.add("Center",pic2);
		m2.add("South",p6);
		
		JPanel m3 = new JPanel(new BorderLayout());
		m3.setBackground(new Color(255,112,237));
		
		JLabel t3 = new JLabel("                               <뷰티인사이드>");
		t3.setFont(font);
		
		ImageIcon icon3 = new ImageIcon("./Image/beauty.jpg");
		Image img3 = icon3.getImage();
		Image changeImg3 = img3.getScaledInstance(500, 500, Image.SCALE_SMOOTH);
		ImageIcon changedIcon3 = new ImageIcon(changeImg3);
		JLabel pic3 = new JLabel(changedIcon3);
		
		JPanel p7 = new JPanel(new GridLayout(2,2));
		JLabel name3 = new JLabel("감독");
		JLabel n3 = new JLabel("백종열");
		JLabel actor3 = new JLabel("주연 배우");
		JLabel an3 = new JLabel("한효주, 김대명, 배성우, 박신혜, 이범수, 박서준, 김상호, 천우희, 이현우...");
		p7.add(name3);
		p7.add(n3);
		p7.add(actor3);
		p7.add(an3);
		
		JPanel p8 = new JPanel(new GridLayout(3,1));
		JLabel c13 = new JLabel("남자, 여자, 아이, 노인.. 심지어 외국인까지! 자고 일어나면 매일 다른 모습으로 변하는 남자, '우진'.");
		JLabel c14 = new JLabel("그에게 처음으로 비밀을 말하고 싶은 단 한사람이 생겼다. 드디어 D-DAY! '우진'은 그녀에게 자신의 마음을");
		JLabel c15 = new JLabel("고백하기로 하는데...\"초밥이 좋아요? 스테이크가 좋아요? 사실..연습 엄청 많이 했어요. 오늘 꼭 그쪽이랑 밥 먹고 싶어서..\"");
		p8.add(c13);
		p8.add(c14);
		p8.add(c15);
		
		JPanel p9 = new JPanel(new GridLayout(2,1));
		p9.add(p7);
		p9.add(p8);
		
		m3.add("North",t3);
		m3.add("Center",pic3);
		m3.add("South",p9);
		
		tabpane4.add("해피뉴이어",m1);
		tabpane4.add("어바웃타임", m2);
		tabpane4.add("뷰티인사이드", m3);
		
		jf6.getContentPane().add(tabpane4,BorderLayout.CENTER);
		jf6.setJMenuBar(bar);
		jf6.setSize(900,900);
		jf6.setVisible(true);
		
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
		
		sf = new JMenuItem("SF");
		sf.setMnemonic('S');
		genre.add(sf);
		sf.addActionListener(this);
		
		bar.add(genre);
		bar.add(menu);
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == home) {
			new Innermain();
			jf6.dispose();
		}
		else if(e.getSource() == act) {
			new action();
			jf6.dispose();
		}
		else if(e.getSource() == ani) {
			new animation();
			jf6.dispose();
		}
		else if(e.getSource()== hor) {
			new horror();
			jf6.dispose();
		}
		else if(e.getSource() == comi) {
			new comedy();
			jf6.dispose();
		}
		else if(e.getSource()==sf) {
			new SF();
			jf6.dispose();
		}
		else if(e.getSource()==list) {
			new list();
			jf6.dispose();
		}
	}
}
