package ex2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class Ex2 extends JFrame {

	private JPanel contentPane;
	private JTextField txtCPF;
	private JTextField txtNome;
	private JTextField txtIdade;
	private JTextField txtSobrenome;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ex2 frame = new Ex2();
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
	public Ex2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 386, 550);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("CPF:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setBounds(10, 20, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblPrimeiroNome = new JLabel("Primeiro nome:");
		lblPrimeiroNome.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblPrimeiroNome.setBounds(10, 60, 95, 14);
		contentPane.add(lblPrimeiroNome);
		
		JLabel lblNewLabel_1_1 = new JLabel("Sobrenome:");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_1.setBounds(10, 100, 75, 14);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Data de nascimento:");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_1_1.setBounds(10, 140, 128, 14);
		contentPane.add(lblNewLabel_1_1_1);
		
		txtCPF = new JTextField();
		txtCPF.setBounds(193, 17, 167, 20);
		contentPane.add(txtCPF);
		txtCPF.setColumns(10);
		
		txtNome = new JTextField();
		txtNome.setColumns(10);
		txtNome.setBounds(193, 57, 167, 20);
		contentPane.add(txtNome);
		
		txtIdade = new JTextField();
		txtIdade.setColumns(10);
		txtIdade.setBounds(193, 137, 167, 20);
		contentPane.add(txtIdade);
		
		txtSobrenome = new JTextField();
		txtSobrenome.setColumns(10);
		txtSobrenome.setBounds(193, 97, 167, 20);
		contentPane.add(txtSobrenome);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Pessoa cadastrada:");
		lblNewLabel_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_1_1_1.setBounds(10, 180, 110, 14);
		contentPane.add(lblNewLabel_1_1_1_1);
		
		JTextArea txtPessoaCad = new JTextArea();
		txtPessoaCad.setBounds(10, 220, 350, 194);
		contentPane.add(txtPessoaCad);
		
		ArrayList<Pessoa> listaPessoa = new ArrayList<>();
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Pessoa pessoa = new Pessoa();
				String cpf = txtCPF.getText();
				String nome = txtNome.getText();
				String sobrenome = txtSobrenome.getText();
				String idade = txtIdade.getText();
				
				pessoa.setCPF(cpf);
				pessoa.setNome(nome);
				pessoa.setSobrenome(sobrenome);
				pessoa.setIdade(idade);
				
				listaPessoa.add(pessoa);
				
				
			}
		});
		btnCadastrar.setBounds(193, 440, 167, 23);
		contentPane.add(btnCadastrar);
		
		JButton btnExibir = new JButton("Exibir cadastros");
		btnExibir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtPessoaCad.setText(listaPessoa.toString());
			}
		});
		btnExibir.setBounds(193, 480, 167, 23);
		contentPane.add(btnExibir);
		
		
	}
}
