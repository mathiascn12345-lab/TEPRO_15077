package pack1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class v1 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtcod;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					v1 frame = new v1();
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
	public v1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		
		JTextArea txtS = new JTextArea();
		txtS.setBounds(27, 60, 377, 161);
		contentPane.add(txtS);
		
		JLabel lblNewLabel = new JLabel("Código:");
		lblNewLabel.setBounds(27, 10, 84, 12);
		contentPane.add(lblNewLabel);
		
		txtcod = new JTextField();
		txtcod.setBounds(27, 31, 96, 18);
		contentPane.add(txtcod);
		txtcod.setColumns(10);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int cod=Integer.parseInt(txtcod.getText());
				Empleado e1=new Empleado(cod);
				e1.setCod(e1.getCod()+20);
				txtS.append("El código es"+e1.getCod());
			}
		});
		btnNewButton.setBounds(157, 10, 84, 20);
		contentPane.add(btnNewButton);

	}
}
