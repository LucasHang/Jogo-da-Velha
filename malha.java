package jogoDaVelha;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.DropMode;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class malha extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField nome2;
	private JTextField nome1;
	private JTextField cursor;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		 try {
	            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
	                if ("Nimbus".equals(info.getName())) {
	                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
	                    break;
	                }
	            }
	        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
	        	System.err.println(ex);
	        }
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					malha frame = new malha();
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
	public malha() {
		
		Teste teste = new Teste();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(700, 230, 476, 517);
		getContentPane().setLayout(null);
		
		nome1 = new JTextField();
		nome1.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_ENTER){
		            nome2.requestFocus();
				}
			}
		});
		
		JLabel jogador_da_vez = new JLabel("<nome do jogador da vez>");
		jogador_da_vez.setFont(new Font("Verdana", Font.BOLD, 14));
		jogador_da_vez.setBounds(138, 123, 226, 23);
		getContentPane().add(jogador_da_vez);
		nome1.setDropMode(DropMode.INSERT);
		nome1.setFont(new Font("Arial", Font.PLAIN, 14));
		nome1.setColumns(10);
		nome1.setBounds(117, 50, 226, 25);
		getContentPane().add(nome1);
		
		nome2 = new JTextField();
		nome2.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_ENTER){
					jogador_da_vez.setText(nome1.getText());
				}
			}
		});
		nome2.setDropMode(DropMode.INSERT);
		nome2.setFont(new Font("Arial", Font.PLAIN, 14));
		nome2.setColumns(10);
		nome2.setBounds(117, 92, 226, 25);
		getContentPane().add(nome2);
		
		cursor = new JTextField();
		cursor.setEditable(false);
		cursor.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		cursor.setBounds(376, 118, 32, 31);
		getContentPane().add(cursor);
		cursor.setColumns(10);
		cursor.setText("X");
		
		JButton posicao00 = new JButton("Empty");
		posicao00.setFont(new Font("Arial Black", Font.ITALIC, 18));
		posicao00.setBounds(40, 166, 105, 72);
		getContentPane().add(posicao00);
		
		JButton posicao01 = new JButton("Empty");
		posicao01.setBounds(181, 166, 105, 72);
		getContentPane().add(posicao01);
		posicao01.setFont(new Font("Arial Black", Font.ITALIC, 18));
		
		JButton posicao02 = new JButton("Empty");
		posicao02.setBounds(311, 166, 105, 72);
		getContentPane().add(posicao02);
		posicao02.setFont(new Font("Arial Black", Font.ITALIC, 18));
		
		JButton posicao10 = new JButton("Empty");
		posicao10.setBounds(40, 272, 105, 72);
		getContentPane().add(posicao10);
		posicao10.setFont(new Font("Arial Black", Font.ITALIC, 18));
		
		JButton posicao11 = new JButton("Empty");
		posicao11.setBounds(183, 271, 105, 72);
		getContentPane().add(posicao11);
		posicao11.setFont(new Font("Arial Black", Font.ITALIC, 18));
		
		JButton posicao12 = new JButton("Empty");
		posicao12.setBounds(311, 270, 105, 72);
		getContentPane().add(posicao12);
		posicao12.setFont(new Font("Arial Black", Font.ITALIC, 18));
		
		JButton posicao20 = new JButton("Empty");
		posicao20.setBounds(40, 372, 105, 72);
		getContentPane().add(posicao20);
		posicao20.setFont(new Font("Arial Black", Font.ITALIC, 18));
		
		JButton posicao21 = new JButton("Empty");
		posicao21.setBounds(185, 369, 105, 72);
		getContentPane().add(posicao21);
		posicao21.setFont(new Font("Arial Black", Font.ITALIC, 18));
		
		JButton posicao22 = new JButton("Empty");
		posicao22.setBounds(311, 368, 105, 72);
		getContentPane().add(posicao22);
		posicao22.setFont(new Font("Arial Black", Font.ITALIC, 18));
		
		bota_letra(posicao00,posicao00,posicao01,posicao02,posicao10,posicao11,posicao12,posicao20,posicao21,posicao22,teste,cursor,nome1,nome2,jogador_da_vez);
		bota_letra(posicao01,posicao00,posicao01,posicao02,posicao10,posicao11,posicao12,posicao20,posicao21,posicao22,teste,cursor,nome1,nome2,jogador_da_vez);
		bota_letra(posicao02,posicao00,posicao01,posicao02,posicao10,posicao11,posicao12,posicao20,posicao21,posicao22,teste,cursor,nome1,nome2,jogador_da_vez);
		bota_letra(posicao10,posicao00,posicao01,posicao02,posicao10,posicao11,posicao12,posicao20,posicao21,posicao22,teste,cursor,nome1,nome2,jogador_da_vez);
		bota_letra(posicao11,posicao00,posicao01,posicao02,posicao10,posicao11,posicao12,posicao20,posicao21,posicao22,teste,cursor,nome1,nome2,jogador_da_vez);
		bota_letra(posicao12,posicao00,posicao01,posicao02,posicao10,posicao11,posicao12,posicao20,posicao21,posicao22,teste,cursor,nome1,nome2,jogador_da_vez);
		bota_letra(posicao20,posicao00,posicao01,posicao02,posicao10,posicao11,posicao12,posicao20,posicao21,posicao22,teste,cursor,nome1,nome2,jogador_da_vez);
		bota_letra(posicao21,posicao00,posicao01,posicao02,posicao10,posicao11,posicao12,posicao20,posicao21,posicao22,teste,cursor,nome1,nome2,jogador_da_vez);
		bota_letra(posicao22,posicao00,posicao01,posicao02,posicao10,posicao11,posicao12,posicao20,posicao21,posicao22,teste,cursor,nome1,nome2,jogador_da_vez);
		
		JLabel lblUmDosMaiores = new JLabel("Um dos maiores jogos da velha da face do planeta terra...");
		lblUmDosMaiores.setFont(new Font("Arial", Font.PLAIN, 14));
		lblUmDosMaiores.setBounds(40, 11, 376, 23);
		getContentPane().add(lblUmDosMaiores);
		
		JLabel lblPlayer = new JLabel("Player 1: ");
		lblPlayer.setFont(new Font("Verdana", Font.BOLD, 14));
		lblPlayer.setBounds(40, 50, 82, 23);
		getContentPane().add(lblPlayer);
		
		JLabel lblPlayer_1 = new JLabel("Player 2: ");
		lblPlayer_1.setFont(new Font("Verdana", Font.BOLD, 14));
		lblPlayer_1.setBounds(40, 94, 82, 23);
		getContentPane().add(lblPlayer_1);
		
		JLabel lblVezDe = new JLabel("Vez de: ");
		lblVezDe.setFont(new Font("Verdana", Font.PLAIN, 16));
		lblVezDe.setBounds(69, 123, 76, 23);
		getContentPane().add(lblVezDe);
		
		JLabel o_x = new JLabel("X");
		o_x.setFont(new Font("Arial Black", Font.BOLD, 18));
		o_x.setBounds(355, 51, 25, 19);
		getContentPane().add(o_x);
		
		JLabel o_o = new JLabel("O");
		o_o.setFont(new Font("Arial Black", Font.BOLD, 18));
		o_o.setBounds(355, 94, 25, 19);
		getContentPane().add(o_o);
		
	}
	
	 public static class Teste {
		
		 int contador = 0;
		 
		 public void incrementar(){
			 contador++;
		 }
		 
		 public int mostra() {
			 return contador;
		 }
	}
	
	public String JogadorDaVez(Teste teste) {
		
		if(teste.mostra()%2==0) {
			return "X";
		}else {
			return "O";
		}
	}
	
	public void SimboloDaVez(Teste teste,JTextField cursor) {
		
		if(teste.mostra()%2==0) {
			cursor.setText("O");
		}else {
			cursor.setText("X");
		}
	}
	
	public String NomeDaVez(Teste teste,JTextField nome1,JTextField nome2) {
		
		if(teste.mostra()%2==0) {
			return nome1.getText();
		}else {
			return nome2.getText();
		}
	}
	
	public void bota_letra(JButton botao,JButton p00,JButton p01,JButton p02,JButton p10,JButton p11,JButton p12,JButton p20,JButton p21,JButton p22,Teste teste,JTextField cursor,JTextField nome1,JTextField nome2,JLabel jogador_da_vez) {
		
		botao.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				SimboloDaVez(teste,cursor);
				botao.setText(JogadorDaVez(teste));
				botao.setEnabled(false);
				SeVenceu(p00,p01,p02,p10,p11,p12,p20,p21,p22,teste,cursor,nome1,nome2);
				teste.incrementar();
				jogador_da_vez.setText(NomeDaVez(teste,nome1,nome2));
				cursor.requestFocus();
			}
		});
	}
	
	public void Acabou(JButton p00,JButton p01,JButton p02,JButton p10,JButton p11,JButton p12,JButton p20,JButton p21,JButton p22,JTextField cursor) {
		
		p00.setEnabled(false);
		p01.setEnabled(false);
		p02.setEnabled(false);
		p10.setEnabled(false);
		p11.setEnabled(false);
		p12.setEnabled(false);
		p20.setEnabled(false);
		p21.setEnabled(false);
		p22.setEnabled(false);
		cursor.setText(":)");
		cursor.setEnabled(false);
	}
	
	public boolean Preenchidos (JButton bt1,JButton bt2,JButton bt3) {
		
		boolean verdade=true;
		boolean falso=false;
		
		if(bt1.getText() != "Empty" & bt1.getText()==bt2.getText() & bt2.getText()==bt3.getText()) {
			return verdade;
		}else {
			return falso;
		}
	}
	
	
	
	public void SeVenceu(JButton p00,JButton p01,JButton p02,JButton p10,JButton p11,JButton p12,JButton p20,JButton p21,JButton p22,Teste teste,JTextField cursor,JTextField nome1,JTextField nome2) {
		
		String message1=" Parabéns "+NomeDaVez(teste,nome1,nome2)+", meu bom :)";
		String message2="É rapaze, deu velha, vão ter que resolver na mão :)";
		
		if(Preenchidos(p00,p01,p02) | Preenchidos(p10,p11,p12) | Preenchidos(p20,p21,p22) | Preenchidos(p00,p10,p20) | Preenchidos(p01,p11,p21) | Preenchidos(p02,p12,p22) | Preenchidos(p00,p11,p22) | Preenchidos(p02,p11,p20)) {
			Acabou(p00,p01,p02,p10,p11,p12,p20,p21,p22,cursor);
			JOptionPane.showMessageDialog(null, message1, "Vitória!!", NORMAL);
			System.exit(0);
		}else {
			if(teste.mostra()==8) {
				Acabou(p00,p01,p02,p10,p11,p12,p20,p21,p22,cursor);
				JOptionPane.showMessageDialog(null, message2, "Velha pora" , NORMAL);
				System.exit(0);
			}
		}
	}
}
