package TermProject;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class animation implements ActionListener{
	JFrame jf3;
	JMenuBar bar;
	JMenu genre, menu;
	JMenuItem act, hor, comi, rom, sf,list,home;
	JTabbedPane tabpane1;
	
	public animation() {
		jf3 = new JFrame("애니메이션");
		makeMenu();
		tabpane1 = new JTabbedPane();
		
		JPanel m1 = new JPanel(new BorderLayout());
		m1.setBackground(new Color(247,231,82));
		
		JLabel t1 = new JLabel("                                  <늑대아이>");
		Font font = new Font("맑은 고딕",Font.PLAIN,30);
		t1.setFont(font);
		
		ImageIcon icon = new ImageIcon("./Image/wolf.jpg");
		Image img = icon.getImage();
		Image changeImg = img.getScaledInstance(500, 500, Image.SCALE_SMOOTH);
		ImageIcon changedIcon = new ImageIcon(changeImg);
		JLabel pic = new JLabel(changedIcon);
		
		JPanel p1 = new JPanel(new GridLayout(2,2));
		JLabel name1 = new JLabel("감독");
		JLabel n1 = new JLabel("호소다 마모루");
		JLabel actor = new JLabel("주연 배우");
		JLabel an = new JLabel("미야자키 아오이, 오오사와 타카오, 쿠로키 하루, 니시이 유키토, 오노 모모카");
		p1.add(name1);
		p1.add(n1);
		p1.add(actor);
		p1.add(an);
		
		JPanel p2 = new JPanel(new GridLayout(6,1));
		JLabel c1 = new JLabel("평번한 여대생 '하나'는 강의실에서 우연히 만나게 된 '그'에게 반하게 되고, 곧 사랑에 빠지게 된다.");
		JLabel c2 = new JLabel("하지만, '그'는 평범한 사람이 아닌 늑대인간이었다. 너희가 늑대아이라는 것은 모두에게 비밀이야!");
		JLabel c3 = new JLabel("늑대인간과의 동화 같은 사랑 후에 남은 것은 두 아이뿐... 눈 내리는 날에 태어난 누이 '유키', ");
		JLabel c4 = new JLabel("비 내리는 날 태어난 동생 '이메'. 두 아이에게는 커다란 비밀이 있는데... 바로 흥분하면 귀가 쫑긋!");
		JLabel c5 = new JLabel("꼬리가 쏘옥~ 나오는 늑대아이라는 것! 남들과 조금 다른 육아, 남들과 살짝 다른 고민!");
		JLabel c6 = new JLabel("신비로운 운명을 살아가는 남애와 특별한 두 아이를 키우는 엄마의 이야기가 시작됩니다!");
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
		m1.add("Center",pic);
		m1.add("South",p3);
		
		JPanel m2 = new JPanel(new BorderLayout());
		m2.setBackground(new Color(247,231,82));
		
		JLabel t2 = new JLabel("                            <엔칸토: 마법의 세계>");
		t2.setFont(font);
		
		ImageIcon icon1 = new ImageIcon("./Image/encanto.jpg");
		Image img1 = icon1.getImage();
		Image changeImg1 = img1.getScaledInstance(500, 500, Image.SCALE_SMOOTH);
		ImageIcon changedIcon1 = new ImageIcon(changeImg1);
		JLabel pic1 = new JLabel(changedIcon1);
		
		JPanel p4 = new JPanel(new GridLayout(2,2));
		JLabel name2 = new JLabel("감독");
		JLabel n2 = new JLabel("바이론 하워드, 자레드 부시, 채리스 카스트로 스미스");
		JLabel actor1 = new JLabel("주연 배우");
		JLabel an1 = new JLabel("스테파니 비트리즈, 윌머 발더라마, 다이앤 게레로, 앤지 세페다, 렌지 펠리즈");
		p4.add(name2);
		p4.add(n2);
		p4.add(actor1);
		p4.add(an1);
		
		JPanel p5 = new JPanel(new GridLayout(6,1));
		JLabel c7 = new JLabel("콜롬비아의 깊은 산 속, 놀라운 마법과 활기찬 매력이 넘치는 세계 '엔칸토'.");
		JLabel c8 = new JLabel("그곳에는 특별한 능력을 지닌 마드리갈 패밀리가 살고 있다. ' 엔칸토'의 마법 덕분에 초인적인 힘 등");
		JLabel c9 = new JLabel("저마다 특별한 능력을 가지고 태어난 마드리갈 패밀리. 하지만 '미라벨'은 가족 중 유일하게 아무런 능력이 없다.");
		JLabel c10 = new JLabel("어느 날, '엔칸토'를 둘러싼 마법의 힘이 위험에 처하자 '미라벨'은 유일하게 평범한 자신이 특별한 이 가족의");
		JLabel c11 = new JLabel("마지막 희망일지 모른다고 생각하는데..평범한 '미라벨'은 과연 기적을 만들 수 있을까?");
		JLabel c12 = new JLabel("전 세대 관객들에게 따뜻한 웃음과 감동을 선사할 마법 같은 영화! 디즈니의 매직이 또 한번 시작된다");
		p5.add(c7);
		p5.add(c8);
		p5.add(c9);
		p5.add(c10);
		p5.add(c11);
		p5.add(c12);
		
		JPanel p6 = new JPanel(new GridLayout(2,1));
		p6.add(p4);
		p6.add(p5);
		
		m2.add("North",t2);
		m2.add("Center",pic1);
		m2.add("South",p6);
		
		JPanel m3 = new JPanel(new BorderLayout());
		
		m3.setBackground(new Color(247,231,82));

		JLabel t3 = new JLabel("                                   <라푼젤>");
		t3.setFont(font);
		
		ImageIcon icon2 = new ImageIcon("./Image/라푼젤.jpg");
		Image img2 = icon2.getImage();
		Image changeImage2 = img2.getScaledInstance(500, 500, Image.SCALE_SMOOTH);
		ImageIcon changedIcon2 = new ImageIcon(changeImage2);
		JLabel pic2 = new JLabel(changedIcon2);
		
		JPanel p7 = new JPanel(new GridLayout(2,2));
		JLabel name3 = new JLabel("감독");
		JLabel n3 = new JLabel("네이슨 그레노, 바이론 하워드");
		JLabel actor2 = new JLabel("주연 배우");
		JLabel an2 = new JLabel("맨디 무어, 제커리 레비");
		p7.add(name3);
		p7.add(n3);
		p7.add(actor2);
		p7.add(an2);
		
		JPanel p8 = new JPanel(new GridLayout(6,1));
		JLabel c13 = new JLabel("올드보이도 못 견뎠을 장장 18년을 탑 안에서만 지낸 끈기만점의 소녀 라푼젤");
		JLabel c14 = new JLabel("어느 날 자신의 탑에 침입한 왕국 최고의 대도를 한방에 때려잡는다.");
		JLabel c15 = new JLabel("그리고 그를 협박해 꿈에도 그리던 집밖으로의 모험을 단행한다. 과잉보호 모친의 영향으로 세상을 험난한 곳으로만");
		JLabel c16 = new JLabel("상상하던 라푼젤. 그런 그녀 앞에 군기 빡 쎈 왕실 경비마 맥시머스의 추격, 라이더에게 복수의 칼날을 가는");
		JLabel c17 = new JLabel("스태빙턴 형제의 위협, 라푼젤의 가짜 엄마 고델의 무서운 음모 등이 얽히고 설켜 점점 흥미진진한 사건들이 터지기 시작한다.");
		JLabel c18 = new JLabel("그러나 세상물정 깜깜한 우리의 라푼젤은 자신 앞에 펼쳐진 스릴 넘치는 세상을 맘껏 즐기는데...");
		p8.add(c13);
		p8.add(c14);
		p8.add(c15);
		p8.add(c16);
		p8.add(c17);
		p8.add(c18);
		
		JPanel p9 = new JPanel(new GridLayout(2,1));
		p9.add(p7);
		p9.add(p8);
		
		m3.add("North",t3);
		m3.add("Center",pic2);
		m3.add("South",p9);
		
		tabpane1.add("늑대아이",m1);
		tabpane1.add("엔칸토...",m2);
		tabpane1.add("라푼젤",m3);
		
		jf3.getContentPane().add(tabpane1,BorderLayout.CENTER);
		jf3.setJMenuBar(bar);
		jf3.setSize(900,900);
		jf3.setVisible(true);
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
		bar.add(menu);
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == home) {
			new Innermain();
			jf3.dispose();
		}
		else if(e.getSource() == act) {
			new action();
			jf3.dispose();
		}
		else if(e.getSource() == hor) {
			new horror();
			jf3.dispose();
		}
		else if(e.getSource() == comi) {
			new comedy();
			jf3.dispose();
		}
		else if(e.getSource()== rom) {
			new romance();
			jf3.dispose();
		}
		else if(e.getSource()==sf) {
			new SF();
			jf3.dispose();
		}
		else if(e.getSource()==list) {
			new list();
			jf3.dispose();
		}
	}
}
