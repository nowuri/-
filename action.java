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
		jf2 = new JFrame("�׼�");
		makeMenu();
		
		tabpane = new JTabbedPane();
		
		JPanel m1 = new JPanel(new BorderLayout());
		
		m1.setBackground(new Color(68,80,159));
		
		JLabel t1 = new JLabel("                                 <�����̴���2>");
		Font font = new Font("���� ���",Font.PLAIN,30);
		t1.setFont(font);
		
		ImageIcon icon1 = new ImageIcon("./Image/spiderman2.jpg");
		Image img = icon1.getImage();
		Image changeImg = img.getScaledInstance(500, 500, Image.SCALE_SMOOTH);
		ImageIcon changedIcon1 = new ImageIcon(changeImg);
		JLabel pic = new JLabel(changedIcon1);
		
		JPanel p1 = new JPanel(new GridLayout(2,2));
		JLabel name= new JLabel("����");
		JLabel n= new JLabel("�� ���̹�");
		JLabel actor = new JLabel("�ֿ� ���");
		JLabel an = new JLabel("��� �����̾�, ����ƾ ����Ʈ, ���ӽ� ������, �������� ������");
		p1.add(name);
		p1.add(n);
		p1.add(actor);
		p1.add(an);
		
		JPanel p3 = new JPanel(new GridLayout(5,1));
		JLabel cont = new JLabel("'�����̴���'�� ���ƿ´�. �쿬�� ���� Ư���� �ɷ��� ���Ե� ���� ��Ŀ�� ");
		JLabel cont1 = new JLabel("���л��� ���� ������� �ź��� ������ ¥���� ��Ȱ�� ������ ��� �ϴ� �޸� ���ο������� ");
		JLabel cont2 = new JLabel("�ڽ��� ������ �� �� ���� ������ �׵��� ��Ÿ��� �θǽ��� �̲���. ���� �����̴��ǿ��� �ƹ����� �Ұ� �����ɿ� ��Ÿ�� ");
		JLabel cont3 = new JLabel("������ ģ�� �ظ��� ���� �� ���߷� ����˼��� ��û�� �Ŀ��� ���Ե� ���� �����۽����� �Ѹ�ġ�� ���� ");
		JLabel cont4 = new JLabel("������ �ϸ鼭 �����̴����� ����� ���� �����Ұ����� ��Ȳ���� �����Ǵµ�...");
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
		
		JLabel t2 = new JLabel("                       <ŷ����: �۽�Ʈ ������Ʈ>");
		t2.setFont(font);
		
		ImageIcon icon2 = new ImageIcon("./Image/kingsman.jpg");
		Image img1 = icon2.getImage();
		Image changeImg1 = img1.getScaledInstance(500,500,Image.SCALE_SMOOTH);
		ImageIcon changedIcon2 = new ImageIcon(changeImg1);
		JLabel pic1 = new JLabel(changedIcon2);
		
		JPanel p2 = new JPanel(new GridLayout(2,2));
		JLabel name1= new JLabel("����");
		JLabel n1= new JLabel("��Ʃ ��");
		JLabel actor1 = new JLabel("�ֿ� ���");
		JLabel an1 = new JLabel("���� ������, ���� ����ư ���� ����, �ظ��� ��Ų��, ��� �Ͽ��");
		p2.add(name1);
		p2.add(n1);
		p2.add(actor1);
		p2.add(an1);
		
		JPanel p5 = new JPanel(new GridLayout(3,1));
		JLabel cont5 = new JLabel("����� �־��� ������� �����ڵ��� �� ���鸸���� ������ ������ ������ �����ϴ� ������ �ô�");
		JLabel cont6 = new JLabel("�̵��� �������� �� ����� �װ� ��и��� � ���� ���� �������,'ŷ����'�� ���� �̼��� ���۵ȴ�!");
		JLabel cont7 = new JLabel("���Ͽ� �������� ŷ������ ź���� ����϶�!");
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
		
		JLabel t3 = new JLabel("                                 <�𰡵�>");
		t3.setFont(font);
		
		ImageIcon icon3 = new ImageIcon("./Image/mogadisu.jpg");
		Image img2 = icon3.getImage();
		Image changeImg2 = img2.getScaledInstance(500, 500, Image.SCALE_SMOOTH);
		ImageIcon changedIcon3 = new ImageIcon(changeImg2);
		JLabel pic2 = new JLabel(changedIcon3);
		
		JPanel p7 = new JPanel(new GridLayout(2,2));
		JLabel name2= new JLabel("����");
		JLabel n2= new JLabel("���¿�");
		JLabel actor2 = new JLabel("�ֿ� ���");
		JLabel an2 = new JLabel("������, ���μ�, ����ȣ, ����ȯ, �����, ������");
		p7.add(name2);
		p7.add(n2);
		p7.add(actor2);
		p7.add(an2);
		
		JPanel p8 = new JPanel(new GridLayout(5,1));
		JLabel cont8 = new JLabel("�������� ���� ���� ����, �𰡵� ���ݺ��� �츮�� ��ǥ�� ������ �����̴�!");
		JLabel cont9 = new JLabel("���ѹα��� UN������ ���� ���м����ϴ� �ñ� 1991�� �Ҹ������� ���� �𰡵𽴿����� ��������� ������ �Ͼ��.");
		JLabel cont10 = new JLabel("��Ÿ��� ���� �� ���� ���� ���ѹα� ������ ������ �������� �Ѿ˰� ��ź�� ����ġ�� ���,");
		JLabel cont11 = new JLabel("��ƴԱ� ���� �Ϸ��Ϸ縦 ���߳���. �׷��� ��� �� ��, ���� ������ ������� ������ ��û�ϸ� ���� �ε帮�µ�");
		JLabel cont12 = new JLabel("��ǥ�� �ϳ�, �𰡵𽴿��� Ż���ؾ� �Ѵ�.");
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

		tabpane.add("�����̴���2",m1);
		tabpane.add("ŷ����...",m2);
		tabpane.add("�𰡵�",m3);
		
		jf2.getContentPane().add(tabpane,BorderLayout.CENTER);
		jf2.setJMenuBar(bar);
		jf2.setSize(900,900);
		jf2.setVisible(true);
		
	}
	
	public void makeMenu() {
		bar = new JMenuBar();
		genre = new JMenu("�帣");
		genre.setMnemonic('G');
		
		Menu = new JMenu("�޴�");
		Menu.setMnemonic('M');
				
		list = new JMenuItem("list");
		list.setMnemonic('L');
		Menu.add(list);
		list.addActionListener(this);
		
		home = new JMenuItem("HOME");
		home.setMnemonic('O');
		Menu.add(home);
		home.addActionListener(this);
		
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
