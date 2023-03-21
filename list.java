package TermProject;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import java.awt.event.*;
import java.awt.*;

public class list implements ActionListener{
	JTable table;
	JFrame jf8;
	JMenuBar bar;
	JMenu genre,menu;
	JMenuItem act, ani, hor, comi, rom, sf, list, home;

	public list() {
		jf8 = new JFrame("영화 리스트");
		makeMenu();
		String[] columnName = {"영화 제목","날짜","감상평"};
		Object[][] data = {{"영화제목1","00.00.00","감상평"}};
		
		JPanel panel = new JPanel();
		panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));
		
		DefaultTableModel model = new DefaultTableModel(data, columnName);
		table = new JTable(model);
		JScrollPane scrollpane = new JScrollPane(table);
		
		JTextField nameField = new JTextField(7);
		JTextField date = new JTextField(5);
		JTextField review = new JTextField(30);
		
		panel.add(nameField);
		panel.add(date);
		panel.add(review);
		
		JButton add = new JButton("추가");
		add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String inputStr[] = new String[2];
				
				inputStr[0] = nameField.getText();
				inputStr[1] = date.getText();
				inputStr[2] = review.getText();
				model.addRow(inputStr);
				
				nameField.setText("");
				date.setText("");
				review.setText("");
			}
		});
		
		JButton cancel = new JButton("삭제");
		cancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(table.getSelectedRow()==-1) {
					return;
				}
				else {
					model.removeRow(table.getSelectedRow());
				}
			}
		});
		
		panel.add(add);
		panel.add(cancel);		
		
		jf8.add(scrollpane,BorderLayout.CENTER);
		jf8.add(panel,BorderLayout.SOUTH);
		jf8.setJMenuBar(bar);
		jf8.setSize(900,900);
		jf8.setVisible(true);
	}
	
	public void makeMenu() {
		bar = new JMenuBar();
		genre = new JMenu("장르");
		genre.setMnemonic('G');
		
		menu = new JMenu("메뉴");
		menu.setMnemonic('M');
		
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
		if(e.getSource()== home) {
			new Innermain();
			jf8.dispose();
		}
		else if(e.getSource()==act) {
			new action();
			jf8.dispose();
		}
		else if(e.getSource()==ani) {
			new animation();
			jf8.dispose();
		}
		else if(e.getSource()==hor) {
			new horror();
			jf8.dispose();
		}
		else if(e.getSource()==comi) {
			new comedy();
			jf8.dispose();
		}
		else if(e.getSource()==rom) {
			new romance();
			jf8.dispose();
		}
		else if(e.getSource()==sf) {
			new SF();
			jf8.dispose();
		}
	}
	
}


