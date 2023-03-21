package TermProject;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class comedy implements ActionListener{
	JFrame jf5;
	JMenuBar bar;
	JMenu genre, menu;
	JMenuItem act, ani, hor, rom, sf, list, home;
	JTabbedPane tabpane3;
	
	public comedy() {
		jf5 = new JFrame("코미디");
		makeMenu();
		tabpane3 = new JTabbedPane();
		
		JPanel m1 = new JPanel(new BorderLayout());
		m1.setBackground(new Color(255,193,85));
		
		JLabel t1 = new JLabel("                                <극한직업>");
		Font font = new Font("맑은 고딕",Font.PLAIN,30);
		t1.setFont(font);
		
		ImageIcon icon1 = new ImageIcon("./Image/극한직업.jpg");
		Image img1 = icon1.getImage();
		Image changeImg1 = img1.getScaledInstance(500, 500, Image.SCALE_SMOOTH);
		ImageIcon changedIcon1 = new ImageIcon(changeImg1);
		JLabel pic1 = new JLabel(changedIcon1);
		
		JPanel p1 = new JPanel(new GridLayout(2,2));
		JLabel name1 = new JLabel("감독");
		JLabel n1 = new JLabel("이병헌");
		JLabel actor1 = new JLabel("주연 배우");
		JLabel an1 = new JLabel("류승룡, 이하늬, 진선규, 이동휘, 공명");
		p1.add(name1);
		p1.add(n1);
		p1.add(actor1);
		p1.add(an1);
		
		JPanel p2 = new JPanel(new GridLayout(6,1));
		JLabel c1 = new JLabel("불철주야 달리고 구르지만 실적은 바닥, 급기야 해체 위기를 맞는 마약반!");
		JLabel c2 = new JLabel("더 이상 물러설 곳이 없는 팀의 맏형 고반장은 국제 범죄조직의 국내 마약 밀반입 정황을");
		JLabel c3 = new JLabel("포착하고 장형사, 마형사, 영호, 재훈까지 4명의 팀원들과 함께 잠복 수사에 나선다. 마약반은");
		JLabel c4 = new JLabel("24시간 감시를 위해 범죄조직의 아파트 앞 치킨집을 인수해 위장 창업을 하게 되고, 뜻밖의 절대 미각을");
		JLabel c5 = new JLabel("지닌 마형사의 숨은 재능으로 치킨집은 일약 맛집으로 입소문이 나기 시작한다. 수사는 뒷전, 치킨장사로");
		JLabel c6 = new JLabel("눈코 뜰 새 없이 바빠진 마약반에게 어느 날 절호의 기회가 찾아오는데..범인을 잡을 것인가, 닭을 잡을 것인가!");
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
		m2.setBackground(new Color(255,193,85));
		
		JLabel t2 = new JLabel("                                  <인턴>");
		t2.setFont(font);
		
		ImageIcon icon2 = new ImageIcon("./Image/인턴.jpg");
		Image img2 = icon2.getImage();
		Image changeImg2 = img2.getScaledInstance(500, 500, Image.SCALE_SMOOTH);
		ImageIcon changedIcon2 = new ImageIcon(changeImg2);
		JLabel pic2 = new JLabel(changedIcon2);
		
		JPanel p4 = new JPanel(new GridLayout(2,2));
		JLabel name2 = new JLabel("감독");
		JLabel n2 = new JLabel("낸시 마이어스");
		JLabel actor2 = new JLabel("주연 배우");
		JLabel an2 = new JLabel("앤 헤서웨이, 로버트 드 니로");
		p4.add(name2);
		p4.add(n2);
		p4.add(actor2);
		p4.add(an2);
		
		JPanel p5 = new JPanel(new GridLayout(3,1));
		JLabel c7 = new JLabel("창업 1년 반 만에 직원 220명의 성공신화를 이룬 줄스. TPO에 맞는 패션센스, 업무를 위해 사무실에서도 끊임없는 체력관리,");
		JLabel c8 = new JLabel("야근하는 직원 챙겨주고, 고객을 위해 박스포장까지 직접 하는 열정적인 30세 여성 CEO! 한편, 수십 년 직장생활에서 비롯된");
		JLabel c9 = new JLabel("노하우와 나이만큼 풍부한 인생경험이 무기인 만능 70세의 벤을 인턴으로 채용하게 되는데...");
		p5.add(c7);
		p5.add(c8);
		p5.add(c9);
		
		JPanel p6 = new JPanel(new GridLayout(2,1));
		p6.add(p4);
		p6.add(p5);

		m2.add("North",t2);
		m2.add("Center",pic2);
		m2.add("South",p6);
		
		JPanel m3 = new JPanel(new BorderLayout());
		m3.setBackground(new Color(255,193,85));
		
		JLabel t3 = new JLabel("                                <아멜리에>");
		t3.setFont(font);
		
		ImageIcon icon3 = new ImageIcon("./Image/아멜리에.jpg");
		Image img3 = icon3.getImage();
		Image changeImg3 = img3.getScaledInstance(500, 500, Image.SCALE_SMOOTH);
		ImageIcon changedIcon3 = new ImageIcon(changeImg3);
		JLabel pic3 = new JLabel(changedIcon3);
		
		JPanel p7 = new JPanel(new GridLayout(2,2));
		JLabel name3 = new JLabel("감독");
		JLabel n3 = new JLabel("장 피에르 주네");
		JLabel actor3 = new JLabel("주연배우");
		JLabel an3 = new JLabel("오드리 토투, 마티유 카소비츠");
		p7.add(name3);
		p7.add(n3);
		p7.add(actor3);
		p7.add(an3);
		
		JPanel p8 = new JPanel(new GridLayout(4,1));
		JLabel c10 = new JLabel("이름: 아멜리 풀랑 직업: 몽마르트 두개의 푸차 카페 직원 특징: 취미 부자 금요일 저녁, 혼자서 영화보는 것을 즐기는 아밀리는");
		JLabel c11 = new JLabel("크림 브륄레의 캐러멜을 티스푼으로 깨트리거나 생 마르탱 운하에서 하는 물수제비뜨기를 좋아한다. 현재 남자친구는 없으며 그녀이 주변은");
		JLabel c12 = new JLabel("늘 독특한 성격의 사람들로 북적인다. 세월이 흘러도 혼자만의 시간과 여유를 즐기던 아멜리에게 어느날, 움녕의 사건이 찾아왔다.");
		JLabel c13 = new JLabel("8월 29일, 48시간 뒤 그녀의 삶은 완전히 바뀔 것이다! 물론 그녀는 아직 이 사실을 알지 못하지만...");
		p8.add(c10);
		p8.add(c11);
		p8.add(c12);
		p8.add(c13);
		
		JPanel p9 = new JPanel(new GridLayout(2,1));
		p9.add(p7);
		p9.add(p8);
		
		m3.add("North",t3);
		m3.add("Center",pic3);
		m3.add("South",p9);
		
		tabpane3.add("극한직업",m1);
		tabpane3.add("인턴",m2);
		tabpane3.add("아멜리에",m3);
		
		jf5.getContentPane().add(tabpane3,BorderLayout.CENTER);
		jf5.setJMenuBar(bar);
		jf5.setSize(900,900);
		jf5.setVisible(true);
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
		if(e.getSource() == home) {
			new Innermain();
			jf5.dispose();
		}
		else if(e.getSource() == act) {
			new action();
			jf5.dispose();
		}
		else if(e.getSource() == ani) {
			new animation();
			jf5.dispose();
		}
		else if(e.getSource() == hor) {
			new horror();
			jf5.dispose();
		}
		else if(e.getSource()== rom) {
			new romance();
			jf5.dispose();
		}
		else if(e.getSource()==sf) {
			new SF();
			jf5.dispose();
		}
		else if(e.getSource()==list) {
			new list();
			jf5.dispose();
		}
	}
}
