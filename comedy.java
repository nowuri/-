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
		jf5 = new JFrame("�ڹ̵�");
		makeMenu();
		tabpane3 = new JTabbedPane();
		
		JPanel m1 = new JPanel(new BorderLayout());
		m1.setBackground(new Color(255,193,85));
		
		JLabel t1 = new JLabel("                                <��������>");
		Font font = new Font("���� ���",Font.PLAIN,30);
		t1.setFont(font);
		
		ImageIcon icon1 = new ImageIcon("./Image/��������.jpg");
		Image img1 = icon1.getImage();
		Image changeImg1 = img1.getScaledInstance(500, 500, Image.SCALE_SMOOTH);
		ImageIcon changedIcon1 = new ImageIcon(changeImg1);
		JLabel pic1 = new JLabel(changedIcon1);
		
		JPanel p1 = new JPanel(new GridLayout(2,2));
		JLabel name1 = new JLabel("����");
		JLabel n1 = new JLabel("�̺���");
		JLabel actor1 = new JLabel("�ֿ� ���");
		JLabel an1 = new JLabel("���·�, ���ϴ�, ������, �̵���, ����");
		p1.add(name1);
		p1.add(n1);
		p1.add(actor1);
		p1.add(an1);
		
		JPanel p2 = new JPanel(new GridLayout(6,1));
		JLabel c1 = new JLabel("��ö�־� �޸��� �������� ������ �ٴ�, �ޱ�� ��ü ���⸦ �´� �����!");
		JLabel c2 = new JLabel("�� �̻� ������ ���� ���� ���� ���� ������� ���� ���������� ���� ���� �й��� ��Ȳ��");
		JLabel c3 = new JLabel("�����ϰ� ������, ������, ��ȣ, ���Ʊ��� 4���� ������� �Բ� �ẹ ���翡 ������. �������");
		JLabel c4 = new JLabel("24�ð� ���ø� ���� ���������� ����Ʈ �� ġŲ���� �μ��� ���� â���� �ϰ� �ǰ�, ����� ���� �̰���");
		JLabel c5 = new JLabel("���� �������� ���� ������� ġŲ���� �Ͼ� �������� �Լҹ��� ���� �����Ѵ�. ����� ����, ġŲ����");
		JLabel c6 = new JLabel("���� �� �� ���� �ٺ��� ����ݿ��� ��� �� ��ȣ�� ��ȸ�� ã�ƿ��µ�..������ ���� ���ΰ�, ���� ���� ���ΰ�!");
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
		
		JLabel t2 = new JLabel("                                  <����>");
		t2.setFont(font);
		
		ImageIcon icon2 = new ImageIcon("./Image/����.jpg");
		Image img2 = icon2.getImage();
		Image changeImg2 = img2.getScaledInstance(500, 500, Image.SCALE_SMOOTH);
		ImageIcon changedIcon2 = new ImageIcon(changeImg2);
		JLabel pic2 = new JLabel(changedIcon2);
		
		JPanel p4 = new JPanel(new GridLayout(2,2));
		JLabel name2 = new JLabel("����");
		JLabel n2 = new JLabel("���� ���̾");
		JLabel actor2 = new JLabel("�ֿ� ���");
		JLabel an2 = new JLabel("�� �켭����, �ι�Ʈ �� �Ϸ�");
		p4.add(name2);
		p4.add(n2);
		p4.add(actor2);
		p4.add(an2);
		
		JPanel p5 = new JPanel(new GridLayout(3,1));
		JLabel c7 = new JLabel("â�� 1�� �� ���� ���� 220���� ������ȭ�� �̷� �ٽ�. TPO�� �´� �мǼ���, ������ ���� �繫�ǿ����� ���Ӿ��� ü�°���,");
		JLabel c8 = new JLabel("�߱��ϴ� ���� ì���ְ�, ���� ���� �ڽ�������� ���� �ϴ� �������� 30�� ���� CEO! ����, ���� �� �����Ȱ���� ��Ե�");
		JLabel c9 = new JLabel("���Ͽ�� ���̸�ŭ ǳ���� �λ������� ������ ���� 70���� ���� �������� ä���ϰ� �Ǵµ�...");
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
		
		JLabel t3 = new JLabel("                                <�ƸḮ��>");
		t3.setFont(font);
		
		ImageIcon icon3 = new ImageIcon("./Image/�ƸḮ��.jpg");
		Image img3 = icon3.getImage();
		Image changeImg3 = img3.getScaledInstance(500, 500, Image.SCALE_SMOOTH);
		ImageIcon changedIcon3 = new ImageIcon(changeImg3);
		JLabel pic3 = new JLabel(changedIcon3);
		
		JPanel p7 = new JPanel(new GridLayout(2,2));
		JLabel name3 = new JLabel("����");
		JLabel n3 = new JLabel("�� �ǿ��� �ֳ�");
		JLabel actor3 = new JLabel("�ֿ����");
		JLabel an3 = new JLabel("���帮 ����, ��Ƽ�� ī�Һ���");
		p7.add(name3);
		p7.add(n3);
		p7.add(actor3);
		p7.add(an3);
		
		JPanel p8 = new JPanel(new GridLayout(4,1));
		JLabel c10 = new JLabel("�̸�: �ƸḮ Ǯ�� ����: ������Ʈ �ΰ��� Ǫ�� ī�� ���� Ư¡: ��� ���� �ݿ��� ����, ȥ�ڼ� ��ȭ���� ���� ���� �ƹи���");
		JLabel c11 = new JLabel("ũ�� ������� ĳ������ Ƽ��Ǭ���� ��Ʈ���ų� �� ������ ���Ͽ��� �ϴ� ��������߱⸦ �����Ѵ�. ���� ����ģ���� ������ �׳��� �ֺ���");
		JLabel c12 = new JLabel("�� ��Ư�� ������ ������ �����δ�. ������ �귯�� ȥ�ڸ��� �ð��� ������ ���� �ƸḮ���� �����, ����� ����� ã�ƿԴ�.");
		JLabel c13 = new JLabel("8�� 29��, 48�ð� �� �׳��� ���� ������ �ٲ� ���̴�! ���� �׳�� ���� �� ����� ���� ��������...");
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
		
		tabpane3.add("��������",m1);
		tabpane3.add("����",m2);
		tabpane3.add("�ƸḮ��",m3);
		
		jf5.getContentPane().add(tabpane3,BorderLayout.CENTER);
		jf5.setJMenuBar(bar);
		jf5.setSize(900,900);
		jf5.setVisible(true);
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
		
		hor = new JMenuItem("����");
		hor.setMnemonic('H');
		genre.add(hor);
		hor.addActionListener(this);
		
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
