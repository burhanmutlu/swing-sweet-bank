package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.Cursor;

public class GirisEkrani extends javax.swing.JFrame {

	private static final long serialVersionUID = 1L;
	private JFrame frmSweetBankGiri;
	private JTextField kimlikText;
	private JPasswordField sifreText;
	private JButton girisButton;
	private JLabel soruLabel;
	private JButton basvurButton;

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

	public GirisEkrani() {
		initialize();
		this.setLocationRelativeTo(null); // pencereyi ortalamak için kullanıyoruz
		//girisEkraniPanel.setFocusable(true);
	}

	private void initialize() {
		frmSweetBankGiri = new JFrame();
		frmSweetBankGiri.setTitle("Sweet Bank Giriş Ekranı");
		frmSweetBankGiri.setBounds(100, 100, 520, 395);
		frmSweetBankGiri.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel girisEkraniPanel = new JPanel();
		girisEkraniPanel.setBackground(new Color(152, 251, 152));
		
		JLabel hosgeldinizLabel = new JLabel("SWEET BANKAYA HOŞ GELDİNİZ");
		hosgeldinizLabel.setForeground(new Color(72, 61, 139));
		hosgeldinizLabel.setHorizontalTextPosition(SwingConstants.CENTER);
		hosgeldinizLabel.setHorizontalAlignment(SwingConstants.CENTER);
		hosgeldinizLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		
		kimlikText = new JTextField();
		kimlikText.setFont(new Font("Tahoma", Font.PLAIN, 18));
		kimlikText.setColumns(10);
		
		sifreText = new JPasswordField();
		
		girisButton = new JButton("Giriş");
		girisButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		girisButton.setBackground(new Color(238, 130, 238));
		
		soruLabel = new JLabel("Halen müşterimiz değil misiniz?");
		
		basvurButton = new JButton("Başvur");
		basvurButton.setBackground(new Color(238, 130, 238));
		GroupLayout gl_girisEkraniPanel = new GroupLayout(girisEkraniPanel);
		gl_girisEkraniPanel.setHorizontalGroup(
			gl_girisEkraniPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_girisEkraniPanel.createSequentialGroup()
					.addGap(104)
					.addGroup(gl_girisEkraniPanel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_girisEkraniPanel.createParallelGroup(Alignment.LEADING)
							.addGroup(gl_girisEkraniPanel.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_girisEkraniPanel.createSequentialGroup()
									.addGap(62)
									.addComponent(soruLabel)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(basvurButton, GroupLayout.PREFERRED_SIZE, 88, GroupLayout.PREFERRED_SIZE))
								.addComponent(hosgeldinizLabel))
							.addGroup(gl_girisEkraniPanel.createSequentialGroup()
								.addGap(37)
								.addGroup(gl_girisEkraniPanel.createParallelGroup(Alignment.TRAILING)
									.addComponent(kimlikText, GroupLayout.PREFERRED_SIZE, 193, GroupLayout.PREFERRED_SIZE)
									.addComponent(sifreText, GroupLayout.PREFERRED_SIZE, 193, GroupLayout.PREFERRED_SIZE))))
						.addGroup(Alignment.TRAILING, gl_girisEkraniPanel.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED, 85, GroupLayout.PREFERRED_SIZE)
							.addComponent(girisButton, GroupLayout.PREFERRED_SIZE, 96, GroupLayout.PREFERRED_SIZE)
							.addGap(116)))
					.addContainerGap(103, Short.MAX_VALUE))
		);
		gl_girisEkraniPanel.setVerticalGroup(
			gl_girisEkraniPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_girisEkraniPanel.createSequentialGroup()
					.addGap(60)
					.addComponent(hosgeldinizLabel, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(kimlikText, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(sifreText, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(girisButton, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
					.addGroup(gl_girisEkraniPanel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_girisEkraniPanel.createSequentialGroup()
							.addGap(23)
							.addComponent(soruLabel))
						.addGroup(gl_girisEkraniPanel.createSequentialGroup()
							.addGap(19)
							.addComponent(basvurButton, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(59, Short.MAX_VALUE))
		);
		girisEkraniPanel.setLayout(gl_girisEkraniPanel);
		GroupLayout groupLayout = new GroupLayout(frmSweetBankGiri.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addComponent(girisEkraniPanel, GroupLayout.DEFAULT_SIZE, 409, Short.MAX_VALUE)
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addComponent(girisEkraniPanel, GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
		);
		frmSweetBankGiri.getContentPane().setLayout(groupLayout);
	}
}
