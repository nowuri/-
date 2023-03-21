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
		
		JLabel t1 = new JLabel("                               <���ͽ��ڶ�>");
		Font font = new Font("���� ���",Font.PLAIN,30);
		t1.setFont(font);
		
		ImageIcon icon1 = new ImageIcon("./Image/���ͽ��ڶ�.jpg");
		Image img1 = icon1.getImage();
		Image changeImg1 = img1.getScaledInstance(500, 500, Image.SCALE_SMOOTH);
		ImageIcon changedIcon1 = new ImageIcon(changeImg1);
		JLabel pic1 = new JLabel(changedIcon1);
		
		JPanel p1 = new JPanel(new GridLayout(2,2));
		JLabel name1 = new JLabel("����");
		JLabel n1 = new JLabel("ũ�������� ���");
		JLabel actor1 = new JLabel("�ֿ� ���");
		JLabel an1 = new JLabel("��Ʃ ��Ŀ����, �� �ؼ�����, ����Ŭ ����, ����ī ��������");
		p1.add(name1);
		p1.add(n1);
		p1.add(actor1);
		p1.add(an1);
		
		JPanel p2 = new JPanel(new GridLayout(5,1));
		JLabel c1 = new JLabel("���� ������ ���ο� ������ ������ �ر��� �̷��� �ٰ��´�. ���� 20���⿡ ���� �߸���");
		JLabel c2 = new JLabel("�� �������� �ķ� ������ �ҷ��԰�, NASA�� ��ü�Ǿ���. �̶� �ð����� �Ұ������� ƴ�� ������,");
		JLabel c3 = new JLabel("���� �ڵ鿡�Դ� �� ���� Ž���� �η��� ���ؾ� �ϴ� �ӹ��� ��������. ����ϴ� �������� �ڷ� �� ä");
		JLabel c4 = new JLabel("�η���� �� ū ������ ����, �׵��� ���� ����� ã�� ���ַ� ����. �׸��� �츰 ���� ã�� ���̴�.");
		JLabel c5 = new JLabel("�� �׷�����...");
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
		
		JLabel t2 = new JLabel("                                <���̾��>");
		t2.setFont(font);
		
		ImageIcon icon2 = new ImageIcon("./Image/���̾��.jpg");
		Image img2 = icon2.getImage();
		Image changeImg2 = img2.getScaledInstance(500,500,Image.SCALE_SMOOTH);
		ImageIcon changedIcon2 = new ImageIcon(changeImg2);
		JLabel pic2 = new JLabel(changedIcon2);
		
		JPanel p4 = new JPanel(new GridLayout(2,2));
		JLabel name2 = new JLabel("����");
		JLabel n2 = new JLabel("�� �ĺ��");
		JLabel actor2 = new JLabel("�ֿ� ���");
		JLabel an2 = new JLabel("�ι�Ʈ �ٿ�� �ִϾ�, �׷��� �Ͽ���, ���� �긮����, ���׽� ��Ʈ��");
		p4.add(name2);
		p4.add(n2);
		p4.add(actor2);
		p4.add(an2);
		
		JPanel p5 = new JPanel(new GridLayout(6,1));
		JLabel c6 = new JLabel("õ������ �γ��� ������� ���� �ְ��� �����ü�� �̲��� CEO����, Ÿ�� �ŷ����� �����긮Ƽ ���� ����");
		JLabel c7 = new JLabel("ȭ���� ���� ��ư��� �︸���� ��� ��Ÿũ. �Ź��� ��ǥ �� ���ư��� �� �Ը��󱺿��� ��ġ�� �ȴ�.");
		JLabel c8 = new JLabel("�Ը����� ���� ������ ����� �� ù ��Ʈ 'Mark1'�� �԰� Ż�⿡ �����Ѵ�. Ż�� ��� �μ��� Mark1��");
		JLabel c9 = new JLabel("�������� ���׷��̵� �� Mark2�� ����� �� �� Mark3���� �ϼ��ϰ� �Ǿ� '���̾��'���� �ŵ쳭��.");
		JLabel c10 = new JLabel("�Ը����� ��ϰ� ȸ������ ���� Mark1�� ���赵�� �װ� ���� �ִ� ���������� ���� '���̾��'�� �ɰ��ϴ�");
		JLabel c11 = new JLabel("�Ŵ��ϰ� ������ '���̾� ����'�� �ϼ��Ѵ�. �׵��� ���� ��ȭ�� �����ϰ� ��ϴ� �׵��� ����� ���ļ����� �������� �˰� �Ǵµ�..!");
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
		
		JLabel t3 = new JLabel("                                <�׷���Ƽ>");
		t3.setFont(font);
		
		ImageIcon icon3 = new ImageIcon("./Image/gravity.jpg");
		Image img3 = icon3.getImage();
		Image changeImg3 = img3.getScaledInstance(500, 500, Image.SCALE_SMOOTH);
		ImageIcon changedIcon3 = new ImageIcon(changeImg3);
		JLabel pic3 = new JLabel(changedIcon3);
		
		JPanel p7 = new JPanel(new GridLayout(2,2));
		JLabel name3 = new JLabel("����");
		JLabel n3 = new JLabel("������ ��Ʒ�");
		JLabel actor3 = new JLabel("�ֿ� ���");
		JLabel an3 = new JLabel("���� ���, ���� Ŭ���");
		p7.add(name3);
		p7.add(n3);
		p7.add(actor3);
		p7.add(an3);
		
		JPanel p8 = new JPanel(new GridLayout(2,1));
		JLabel c12 = new JLabel("��� ���� �������� �����ϱ� ���� ���ָ� Ž���ϴ� ���̾� ���� �ڻ�� ���ĵ� �ΰ������� ���ؿ� �ε����鼭");
		JLabel c13 = new JLabel("�Ҹ��� ��ҵ� ���� ���� �� ����� Ȧ�� �������µ�...");
		p8.add(c12);
		p8.add(c13);
		
		JPanel p9 = new JPanel(new GridLayout(2,1));
		p9.add(p7);
		p9.add(p8);
		
		m3.add("North",t3);
		m3.add("Center",pic3);
		m3.add("South",p9);
		
		tabpane5.add("���ͽ��ڶ�",m1);
		tabpane5.add("���̾��",m2);
		tabpane5.add("�׷���Ƽ",m3);
		
		jf7.getContentPane().add(tabpane5,BorderLayout.CENTER);
		jf7.setJMenuBar(bar);
		jf7.setSize(900,900);
		jf7.setVisible(true);
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
		
		comi = new JMenuItem("�ڹ̵�");
		comi.setMnemonic('C');
		genre.add(comi);
		comi.addActionListener(this);
		
		rom = new JMenuItem("�θǽ�");
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
