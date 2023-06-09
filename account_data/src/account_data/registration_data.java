package account_data;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Component;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class registration_data {

	private JFrame frame;
	private JTextField tb;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					registration_data window = new registration_data();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public registration_data() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.PINK);
		frame.setBounds(100, 100, 576, 331);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("registration");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBounds(198, 11, 105, 37);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Name");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_1.setBounds(10, 63, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Gender");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_2.setBounds(10, 104, 76, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		tb = new JTextField();
		tb.setBounds(157, 59, 115, 29);
		frame.getContentPane().add(tb);
		tb.setColumns(10);
		
		JRadioButton r1 = new JRadioButton("female");
		r1.setBackground(Color.PINK);
		r1.setBounds(153, 103, 76, 23);
		frame.getContentPane().add(r1);
		
		JRadioButton r2 = new JRadioButton("male");
		r2.setBackground(Color.PINK);
		r2.setBounds(254, 103, 76, 23);
		frame.getContentPane().add(r2);
		ButtonGroup bg=new ButtonGroup();
		bg.add(r1);
		bg.add(r2);
		
		JLabel lblNewLabel_3 = new JLabel("Branch");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_3.setBounds(10, 155, 76, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel(" programming language");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_4.setBounds(10, 192, 148, 45);
		frame.getContentPane().add(lblNewLabel_4);
		
		JComboBox co = new JComboBox();
		co.setModel(new DefaultComboBoxModel(new String[] {"Select", "cseaiml", "cseds", "csecs", "cse", "cseiot", "it", "civil", "ece", "eee", "mech"}));
		co.setBounds(167, 154, 76, 23);
		frame.getContentPane().add(co);
		
		JCheckBox cb1 = new JCheckBox("java\r\n\r\n");
		cb1.setBackground(Color.PINK);
		cb1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		cb1.setBounds(163, 204, 53, 23);
		frame.getContentPane().add(cb1);
		
		JCheckBox cb2 = new JCheckBox("python");
		cb2.setBackground(Color.PINK);
		cb2.setBounds(233, 204, 59, 23);
		frame.getContentPane().add(cb2);
		
		JCheckBox cb3 = new JCheckBox("c");
		cb3.setBackground(Color.PINK);
		cb3.setBounds(352, 204, 46, 23);
		frame.getContentPane().add(cb3);
		
		JButton btn1 = new JButton("submit");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String n=tb.getText();
				String g;
				if(r1.isSelected())
				{
					g="female";
				}
				else if(r2.isSelected())
				{
					g="male";
				}
				else
				{
					g="invalid";
				}
				String b= (String) co.getSelectedItem();
				String pl = " ";
				if(cb1.isSelected())
				{
					pl=pl+" java";
				}
				if(cb2.isSelected())
				{
					pl=pl+" python";
				}
				if(cb3.isSelected())
				{
					pl=pl+"c";
				}
				try {
					Connection con=DriverManager.getConnection
							("jdbc:mysql://localhost:3306/aiml","root","mrec");
					String q="insert into registration values('"+n+"','"+g+"','"+b+"','"+pl+"')";
							Statement sta=con.createStatement();
					sta.execute(q);
					con.close();
					Component btnNewButton = null;
					JOptionPane.showMessageDialog(btnNewButton,"Done");
				}
				catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btn1.setFont(new Font("Tahoma", Font.BOLD, 17));
		btn1.setBounds(127, 248, 128, 23);
		frame.getContentPane().add(btn1);
	}
}
