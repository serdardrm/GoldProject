package adc;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import javax.swing.JToggleButton;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class fr extends JFrame {

	private JPanel contentPane;
	static JLabel[][] Ldizi = new JLabel[20][20];

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					fr frame = new fr();
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

	public fr() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1920, 1080);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JTextPane textPane = new JTextPane();
		textPane.setBounds(1893, 34, 29, 209);
		contentPane.add(textPane);

		Image img5 = new ImageIcon(this.getClass().getResource("/5.png")).getImage();
		Image img10 = new ImageIcon(this.getClass().getResource("/10.png")).getImage();
		Image img15 = new ImageIcon(this.getClass().getResource("/15.png")).getImage();
		Image img20 = new ImageIcon(this.getClass().getResource("/20.png")).getImage();
		Image imgk = new ImageIcon(this.getClass().getResource("/kare.png")).getImage();

		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int x, a,b,n,t,y;

				x = 5;
				a = 10;
				int[][] dizi = hrt.haritaYap(x, a);
				textPane.setText("");
				for (int i = 0; i < 20; i++) {
					for (int j = 0; j < 20; j++) {
						textPane.setText(textPane.getText() + dizi[i][j] + " ");
					}
					textPane.setText(textPane.getText() + "\n");
				}
				for (int i = 0; i < 20; i++) {
					for (int j = 0; j < 20; j++) {

						Ldizi[i][j] = new JLabel("");
						if (dizi[i][j] == 0)
							Ldizi[i][j].setIcon(new ImageIcon(imgk));
						else if (dizi[i][j] == 5)
							Ldizi[i][j].setIcon(new ImageIcon(img5));
						else if (dizi[i][j] == 10)
							Ldizi[i][j].setIcon(new ImageIcon(img10));
						else if (dizi[i][j] == 15)
							Ldizi[i][j].setIcon(new ImageIcon(img15));
						else if (dizi[i][j] == 20)
							Ldizi[i][j].setIcon(new ImageIcon(img20));
						Ldizi[i][j].setBounds(j * 50, i * 50, 50, 50);
						contentPane.add(Ldizi[i][j]);
						Ldizi[i][j].repaint();

					}
				}
				a_plyr.target(dizi);
				b=a_plyrData.getHedefx();
				n=a_plyrData.getHedefy();
				System.out.print("A Oyuncusu Ýçin Hedef Belirlendi: ("+b+",");
				System.out.print(n+")\n");
				b_plyr.target(dizi);
				t=b_plyrData.getHedefx();
				y=b_plyrData.getHedefy();
				System.out.print("B Oyuncusu Ýçin Hedef Belirlendi: ("+t+",");
				System.out.print(y+")\n");
				c_plyr.target(dizi);
				t=c_plyrData.getHedefx();
				y=c_plyrData.getHedefy();
				System.out.print("C Oyuncusu Ýçin Hedef Belirlendi: ("+t+",");
				System.out.print(y+")\n");
				d_plyr.target(dizi);
				t=d_plyrData.getHedefx();
				y=d_plyrData.getHedefy();
				System.out.print("D Oyuncusu Ýçin Hedef Belirlendi: ("+t+",");
				System.out.print(y+")");

			}
		});
		btnNewButton.setBounds(1833, 0, 89, 23);
		contentPane.add(btnNewButton);

	}
}
