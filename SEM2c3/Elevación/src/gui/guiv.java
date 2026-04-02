package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import clase.Métodos;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class guiv extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtnum;
	private JLabel lblNewLabel;
	private JTextArea txtarea;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					guiv frame = new guiv();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public guiv() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 291, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		{
			txtnum = new JTextField();
			txtnum.setBounds(79, 10, 96, 19);
			contentPane.add(txtnum);
			txtnum.setColumns(10);
		}
		{
			lblNewLabel = new JLabel("Número:");
			lblNewLabel.setBounds(25, 13, 44, 12);
			contentPane.add(lblNewLabel);
		}
		{
			txtarea = new JTextArea();
			txtarea.setBounds(25, 53, 242, 183);
			contentPane.add(txtarea);
		}
		{
			btnNewButton = new JButton("Procesar");
			btnNewButton.addActionListener(this);
			btnNewButton.setBounds(183, 9, 84, 20);
			contentPane.add(btnNewButton);
		}
		
		

	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnNewButton) {
			do_btnNewButton_actionPerformed(e);
		}
	}
	
	protected void do_btnNewButton_actionPerformed(ActionEvent e) {
		Métodos me = new Métodos();
		txtarea.append("EL cuardardo es:"+ me.Cuadrado(Integer.parseInt(txtnum.getText())));
		txtarea.append("\nEL cubo es:"+ me.Cubo(Integer.parseInt(txtnum.getText())));
	}
}
