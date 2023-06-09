package App_first;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ecom {

	private JFrame frame;
	int i=0;
	int b=0;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ecom window = new Ecom();
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
	public Ecom() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(128, 128, 128));
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nature");
		lblNewLabel.setFont(new Font("Tahoma", Font.ITALIC, 30));
		lblNewLabel.setForeground(new Color(240, 255, 255));
		lblNewLabel.setBounds(233, 11, 153, 29);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\online lab\\Downloads\\moonlight.jfif"));
		lblNewLabel_1.setBounds(36, 69, 172, 104);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\online lab\\Downloads\\skybird.jfif"));
		lblNewLabel_2.setBounds(240, 72, 128, 104);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\online lab\\Downloads\\feather.jfif"));
		lblNewLabel_3.setBounds(379, 51, 96, 144);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("RS.1000");
		lblNewLabel_4.setForeground(new Color(240, 248, 255));
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_4.setBounds(90, 187, 72, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("RS.1500");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_5.setForeground(new Color(240, 255, 240));
		lblNewLabel_5.setBounds(269, 187, 78, 14);
		frame.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("RS.2000");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_6.setForeground(new Color(240, 255, 255));
		lblNewLabel_6.setBounds(400, 199, 75, 14);
		frame.getContentPane().add(lblNewLabel_6);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"select", "2D", "3D", "Glass", "Glitter"}));
		comboBox.setBounds(62, 212, 112, 22);
		frame.getContentPane().add(comboBox);
		
		JLabel lb = new JLabel("cart:0");
		lb.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lb.setForeground(new Color(240, 248, 255));
		lb.setBounds(485, 24, 46, 14);
		frame.getContentPane().add(lb);
		JLabel lb2 = new JLabel("bill:0");
		lb2.setFont(new Font("Tahoma", Font.BOLD, 18));
		lb2.setForeground(new Color(240, 255, 240));
		lb2.setBounds(485, 51, 77, 14);
		frame.getContentPane().add(lb2);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"select", "2D", "3D", "Glass", "Glitter"}));
		comboBox_1.setBounds(255, 212, 72, 22);
		frame.getContentPane().add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"select", "2D", "3D", "Glass", "Glitter"}));
		comboBox_2.setBounds(410, 225, 65, 22);
		frame.getContentPane().add(comboBox_2);
		
		JButton btnNewButton = new JButton("Add to cart");
		btnNewButton.addActionListener(new ActionListener() {
		
			public void actionPerformed(ActionEvent e) {
			   i++;
			   lb.setText("cart:"+i);
			   b=b+1000;
			   lb2.setText("bill:"+b);
			}
		});
		btnNewButton.setBounds(73, 264, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Add to cart");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 i++;
				   lb.setText("cart:"+i);
				   b=b+1500;
				   lb2.setText("bill:"+b);
			}
		});
		btnNewButton_1.setBounds(240, 264, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Add to cart");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				i++;
				   lb.setText("cart:"+i);
				   b=b+2000;
				   lb2.setText("bill:"+b);	
			}
		});
		btnNewButton_2.setBounds(386, 264, 89, 23);
		frame.getContentPane().add(btnNewButton_2);
		
		
		
		
	}

}
