package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Color;

public class GirisEkrani extends javax.swing.JFrame {

	private static final long serialVersionUID = 1L;
	private JFrame frmSweetBankGiri;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GirisEkrani window = new GirisEkrani();
					window.frmSweetBankGiri.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GirisEkrani() {
		initialize();
		this.setLocationRelativeTo(null); // pencereyi ortalamak için kullanıyoruz
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmSweetBankGiri = new JFrame();
		frmSweetBankGiri.setTitle("Sweet Bank Giriş Ekranı");
		frmSweetBankGiri.setBounds(100, 100, 425, 250);
		frmSweetBankGiri.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel GirisEkraniPanel = new JPanel();
		GirisEkraniPanel.setBackground(new Color(152, 251, 152));
		
		JLabel lblNewLabel = new JLabel("New label");
		GroupLayout gl_GirisEkraniPanel = new GroupLayout(GirisEkraniPanel);
		gl_GirisEkraniPanel.setHorizontalGroup(
			gl_GirisEkraniPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_GirisEkraniPanel.createSequentialGroup()
					.addGap(160)
					.addComponent(lblNewLabel)
					.addContainerGap(203, Short.MAX_VALUE))
		);
		gl_GirisEkraniPanel.setVerticalGroup(
			gl_GirisEkraniPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_GirisEkraniPanel.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(153, Short.MAX_VALUE))
		);
		GirisEkraniPanel.setLayout(gl_GirisEkraniPanel);
		GroupLayout groupLayout = new GroupLayout(frmSweetBankGiri.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addComponent(GirisEkraniPanel, GroupLayout.DEFAULT_SIZE, 409, Short.MAX_VALUE)
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addComponent(GirisEkraniPanel, GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
		);
		frmSweetBankGiri.getContentPane().setLayout(groupLayout);
	}
}
