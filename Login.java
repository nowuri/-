package TermProject;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.Calendar;

public class Login extends JFrame implements ActionListener{
	JFrame jf;
	JButton button;
	JTextField idt;
	JPasswordField pwt;
	JLabel title, id, pw;
	JPanel p1, p2, idp, pwp, blank;
	
	public Login() {
		jf = new JFrame("�α��� ȭ��");
		jf.setLayout(new GridLayout(3,1));
		
		title = new JLabel("��ȭ ����Ʈ ���α׷�");
		Font font = new Font("���� ���", Font.PLAIN,20);
		title.setFont(font);
		
		p1 = new JPanel();
		p1.add(title);
		
		id = new JLabel("ID");
		idt = new JTextField(30);
		
		idp = new JPanel();
		idp.add(id);
		idp.add(idt);
		
		pw = new JLabel("PW");
		pwt = new JPasswordField(30);
		
		pwp = new JPanel();
		pwp.add(pw);
		pwp.add(pwt);
		
		button = new JButton("�α���");
		button.addActionListener(this);
		
		blank = new JPanel();
		
		p2 = new JPanel();
		p2.add(idp);
		p2.add(pwp);
		p2.add(button);
		
		jf.add("Center",p1);
		jf.add(blank);
		jf.add(p2);
		jf.setSize(400,500);
		jf.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String idt1 = idt.getText().trim();
		String pwt1 = pwt.getText().trim();
		if(idt1.equals("Java") && pwt1.equals("great")) {
			new Innermain();
			jf.dispose();
		}
		else {
			JOptionPane.showMessageDialog(null, "ID Ȥ�� PW�� Ʋ�Ƚ��ϴ�.");
		}
	}
}

