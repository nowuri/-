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
		jf4 = new JFrame("����");
		makeMenu();
		tabpane2 = new JTabbedPane();
		
		JPanel m1 = new JPanel(new BorderLayout());
		m1.setBackground(new Color(175,35,35));
		
		JLabel t1 = new JLabel("                                <������>");
		Font font = new Font("���� ���",Font.PLAIN,30);
		t1.setFont(font);
		
		ImageIcon icon1 = new ImageIcon("./Image/conjuring.jpg");
		Image img1 = icon1.getImage();
		Image changeImg1 = img1.getScaledInstance(500, 500, Image.SCALE_SMOOTH);
		ImageIcon changedIcon1 = new ImageIcon(changeImg1);
		JLabel pic1 = new JLabel(changedIcon1);
		
		JPanel p1 = new JPanel(new GridLayout(2,2));
		JLabel name1 = new JLabel("����");
		JLabel n1 = new JLabel("���ӽ� ��");
		JLabel actor1 = new JLabel("�ֿ� ���");
		JLabel an1 = new JLabel("���� �ǹ̰�, ��Ʈ�� ����, ���� ���Ϸ�, �� ��������, ���� ŷ, ������ ����");
		p1.add(name1);
		p1.add(n1);
		p1.add(actor1);
		p1.add(an1);
		
		JPanel p2 = new JPanel(new GridLayout(5,1));
		JLabel c1 = new JLabel("1971�� �ε� ���Ϸ���, �ظ�����. ��� ������ �޿� �׸��� �� ������ �̻縦 ����.");
		JLabel c2 = new JLabel("���� 1863�⿡ �� ������ �Ͼ ������ ���� ����� ���� ������.");
		JLabel c3 = new JLabel("���� �� ���Ŀ� �Ͼ ���� ������ ��ǿ� ���ؼ��� ���� ���ߴ�.");
		JLabel c4 = new JLabel("�� ������ �� ������ ���� ���� �ʹ� �������� �� ����� �ܺο� ����ϴ� ���� �����߾���.");
		JLabel c5 = new JLabel("���ݱ�����...");
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
		
		JLabel t2 = new JLabel("                                   <������>");
		t2.setFont(font);
		
		ImageIcon icon2 = new ImageIcon("./Image/������.jpg");
		Image img2 = icon2.getImage();
		Image changeImg2 = img2.getScaledInstance(500, 500, Image.SCALE_SMOOTH);
		ImageIcon changedIcon2 = new ImageIcon(changeImg2);
		JLabel pic2 = new JLabel(changedIcon2);
		
		JPanel p4 = new JPanel(new GridLayout(2,2));
		JLabel name2 = new JLabel("����");
		JLabel n2 = new JLabel("������");
		JLabel actor2 = new JLabel("�ֿ� ���");
		JLabel an2 = new JLabel("������, ������, ���ƿ�, ������, �ڼ���, �̽¿�, ������");
		p4.add(name2);
		p4.add(n2);
		p4.add(actor2);
		p4.add(an2);
		
		JPanel p5 = new JPanel(new GridLayout(5,1));
		JLabel c6 = new JLabel("1979�� ȯ�� 42���� ���� �ڻ�� �������� ���� ����, ������ �������� �ѷ�����");
		JLabel c7 = new JLabel("������ ���ź������� ����ü���� ���� 7���� ����� �����, ���� ġ���, �����,");
		JLabel c8 = new JLabel("������ �ʴ� 4.2ȣ... ������ ��ü�� ��Ƴ��� �̤��� ���� ���θ� �Կ��ϱ� �����ϴ�");
		JLabel c9 = new JLabel("����鿡�� ��� ���� �����ϰ� ���������� �ϵ��� ������ �������� �����ϴµ�...");
		JLabel c10 = new JLabel("���� ����� ������ �ݵ�� ������ �ִ�. �Ҹ� ��ġ�� '������ ���ź���'�� ��ü�� �����϶�!");
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
		
		JLabel t3 = new JLabel("                            <��Ʈ ���� �� ��ȣ> ");
		t3.setFont(font);
		
		ImageIcon icon3 = new ImageIcon("./Image/last.jpg");
		Image img3 = icon3.getImage();
		Image changeImg3 = img3.getScaledInstance(500, 500, Image.SCALE_SMOOTH);
		ImageIcon changedIcon3 = new ImageIcon(changeImg3);
		JLabel pic3 = new JLabel(changedIcon3);
		
		JPanel p7 = new JPanel(new GridLayout(2,2));
		JLabel name3 = new JLabel("����");
		JLabel n3 = new JLabel("���尡 ����Ʈ");
		JLabel actor3 = new JLabel("�ֿ� ���");
		JLabel an3 = new JLabel("�丶�� ������, �Ⱦ� ���Ϸ� ����, �� ���̽�, ��Ÿ �ͽ���");
		p7.add(name3);
		p7.add(n3);
		p7.add(actor3);
		p7.add(an3);
		
		JPanel p8 = new JPanel(new GridLayout(4,1));
		JLabel c11 = new JLabel("�м� �����̳��� ���� �Ȱ� ���� ��ȣ�� �� '����'�� ���� �� �޿��� 1960���");
		JLabel c12 = new JLabel("��ȣ�� ��Ȥ���� ���� '����'�� ������ �ǰ�, �׳࿡�� �ŷ�ȴ�. '����'�� '����'����");
		JLabel c13 = new JLabel("ȭ���� ���� ������ ���̶� ���������� ���� ���� �Ǹ��� �Ǿ�� '����'�� ���������� ");
		JLabel c14 = new JLabel("���ش��ϰ� ����. ������ ����ڰ� �� '����', '����'�� ���� ������ '����'�� �ð� �ӿ� ��� �ִ�.");
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
		
		tabpane2.add("������",m1);
		tabpane2.add("������",m2);
		tabpane2.add("��Ʈ...",m3);
		
		jf4.getContentPane().add(tabpane2,BorderLayout.CENTER);
		jf4.setJMenuBar(bar);
		jf4.setSize(900,900);
		jf4.setVisible(true);
	}
	
	public void makeMenu() {
		bar = new JMenuBar();
		genre = new JMenu("�帣");
		genre.setMnemonic('G');
		
		menu = new JMenu("�޴�");
		menu.setMnemonic('M');
		
		list = new JMenuItem("list");
		list.setMnemonic('L');
		menu.add(list);
		list.addActionListener(this);
		
		home = new JMenuItem("HOME");
		home.setMnemonic('h');
		menu.add(home);
		home.addActionListener(this);
		
		act = new JMenuItem("�׼�");
		act.setMnemonic('A');
		genre.add(act);
		act.addActionListener(this);
		
		ani = new JMenuItem("�ִϸ��̼�");
		ani.setMnemonic('N');
		genre.add(ani);
		ani.addActionListener(this);
		
		comi = new JMenuItem("�ڹ̵�");
		comi.setMnemonic('C');
		genre.add(comi);
		comi.addActionListener(this);
		
		rom = new JMenuItem("�θǽ�");
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
