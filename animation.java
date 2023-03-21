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
		jf3 = new JFrame("�ִϸ��̼�");
		makeMenu();
		tabpane1 = new JTabbedPane();
		
		JPanel m1 = new JPanel(new BorderLayout());
		m1.setBackground(new Color(247,231,82));
		
		JLabel t1 = new JLabel("                                  <�������>");
		Font font = new Font("���� ���",Font.PLAIN,30);
		t1.setFont(font);
		
		ImageIcon icon = new ImageIcon("./Image/wolf.jpg");
		Image img = icon.getImage();
		Image changeImg = img.getScaledInstance(500, 500, Image.SCALE_SMOOTH);
		ImageIcon changedIcon = new ImageIcon(changeImg);
		JLabel pic = new JLabel(changedIcon);
		
		JPanel p1 = new JPanel(new GridLayout(2,2));
		JLabel name1 = new JLabel("����");
		JLabel n1 = new JLabel("ȣ�Ҵ� �����");
		JLabel actor = new JLabel("�ֿ� ���");
		JLabel an = new JLabel("�̾���Ű �ƿ���, ������� Ÿī��, ���Ű �Ϸ�, �Ͻ��� ��Ű��, ���� ���ī");
		p1.add(name1);
		p1.add(n1);
		p1.add(actor);
		p1.add(an);
		
		JPanel p2 = new JPanel(new GridLayout(6,1));
		JLabel c1 = new JLabel("����� ����� '�ϳ�'�� ���ǽǿ��� �쿬�� ������ �� '��'���� ���ϰ� �ǰ�, �� ����� ������ �ȴ�.");
		JLabel c2 = new JLabel("������, '��'�� ����� ����� �ƴ� �����ΰ��̾���. ���� ������̶�� ���� ��ο��� ����̾�!");
		JLabel c3 = new JLabel("�����ΰ����� ��ȭ ���� ��� �Ŀ� ���� ���� �� ���̻�... �� ������ ���� �¾ ���� '��Ű', ");
		JLabel c4 = new JLabel("�� ������ �� �¾ ���� '�̸�'. �� ���̿��Դ� Ŀ�ٶ� ����� �ִµ�... �ٷ� ����ϸ� �Ͱ� �б�!");
		JLabel c5 = new JLabel("������ ���~ ������ ������̶�� ��! ����� ���� �ٸ� ����, ����� ��¦ �ٸ� ���!");
		JLabel c6 = new JLabel("�ź�ο� ����� ��ư��� ���ֿ� Ư���� �� ���̸� Ű��� ������ �̾߱Ⱑ ���۵˴ϴ�!");
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
		
		JLabel t2 = new JLabel("                            <��ĭ��: ������ ����>");
		t2.setFont(font);
		
		ImageIcon icon1 = new ImageIcon("./Image/encanto.jpg");
		Image img1 = icon1.getImage();
		Image changeImg1 = img1.getScaledInstance(500, 500, Image.SCALE_SMOOTH);
		ImageIcon changedIcon1 = new ImageIcon(changeImg1);
		JLabel pic1 = new JLabel(changedIcon1);
		
		JPanel p4 = new JPanel(new GridLayout(2,2));
		JLabel name2 = new JLabel("����");
		JLabel n2 = new JLabel("���̷� �Ͽ���, �ڷ��� �ν�, ä���� ī��Ʈ�� ���̽�");
		JLabel actor1 = new JLabel("�ֿ� ���");
		JLabel an1 = new JLabel("�����Ĵ� ��Ʈ����, ���� �ߴ���, ���̾� �Է���, ���� �����, ���� �縮��");
		p4.add(name2);
		p4.add(n2);
		p4.add(actor1);
		p4.add(an1);
		
		JPanel p5 = new JPanel(new GridLayout(6,1));
		JLabel c7 = new JLabel("�ݷҺ���� ���� �� ��, ���� ������ Ȱ���� �ŷ��� ��ġ�� ���� '��ĭ��'.");
		JLabel c8 = new JLabel("�װ����� Ư���� �ɷ��� ���� ���帮�� �йи��� ��� �ִ�. ' ��ĭ��'�� ���� ���п� �������� �� ��");
		JLabel c9 = new JLabel("������ Ư���� �ɷ��� ������ �¾ ���帮�� �йи�. ������ '�̶�'�� ���� �� �����ϰ� �ƹ��� �ɷ��� ����.");
		JLabel c10 = new JLabel("��� ��, '��ĭ��'�� �ѷ��� ������ ���� ���迡 ó���� '�̶�'�� �����ϰ� ����� �ڽ��� Ư���� �� ������");
		JLabel c11 = new JLabel("������ ������� �𸥴ٰ� �����ϴµ�..����� '�̶�'�� ���� ������ ���� �� ������?");
		JLabel c12 = new JLabel("�� ���� �����鿡�� ������ ������ ������ ������ ���� ���� ��ȭ! ������� ������ �� �ѹ� ���۵ȴ�");
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

		JLabel t3 = new JLabel("                                   <��Ǭ��>");
		t3.setFont(font);
		
		ImageIcon icon2 = new ImageIcon("./Image/��Ǭ��.jpg");
		Image img2 = icon2.getImage();
		Image changeImage2 = img2.getScaledInstance(500, 500, Image.SCALE_SMOOTH);
		ImageIcon changedIcon2 = new ImageIcon(changeImage2);
		JLabel pic2 = new JLabel(changedIcon2);
		
		JPanel p7 = new JPanel(new GridLayout(2,2));
		JLabel name3 = new JLabel("����");
		JLabel n3 = new JLabel("���̽� �׷���, ���̷� �Ͽ���");
		JLabel actor2 = new JLabel("�ֿ� ���");
		JLabel an2 = new JLabel("�ǵ� ����, ��Ŀ�� ����");
		p7.add(name3);
		p7.add(n3);
		p7.add(actor2);
		p7.add(an2);
		
		JPanel p8 = new JPanel(new GridLayout(6,1));
		JLabel c13 = new JLabel("�õ庸�̵� �� �ߵ��� ���� 18���� ž �ȿ����� ���� ���⸸���� �ҳ� ��Ǭ��");
		JLabel c14 = new JLabel("��� �� �ڽ��� ž�� ħ���� �ձ� �ְ��� �뵵�� �ѹ濡 ������´�.");
		JLabel c15 = new JLabel("�׸��� �׸� ������ �޿��� �׸��� ���������� ������ �����Ѵ�. ���׺�ȣ ��ģ�� �������� ������ �賭�� �����θ�");
		JLabel c16 = new JLabel("����ϴ� ��Ǭ��. �׷� �׳� �տ� ���� �� �� �ս� ��� �ƽøӽ��� �߰�, ���̴����� ������ Į���� ����");
		JLabel c17 = new JLabel("���º��� ������ ����, ��Ǭ���� ��¥ ���� ���� ������ ���� ���� ������ ���� ���� ��������� ��ǵ��� ������ �����Ѵ�.");
		JLabel c18 = new JLabel("�׷��� ������ ������ �츮�� ��Ǭ���� �ڽ� �տ� ������ ���� ��ġ�� ������ ���� ���µ�...");
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
		
		tabpane1.add("�������",m1);
		tabpane1.add("��ĭ��...",m2);
		tabpane1.add("��Ǭ��",m3);
		
		jf3.getContentPane().add(tabpane1,BorderLayout.CENTER);
		jf3.setJMenuBar(bar);
		jf3.setSize(900,900);
		jf3.setVisible(true);
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
