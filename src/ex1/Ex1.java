package ex1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ex1 extends JFrame {

	private JPanel contentPane;
	private JTextField txtCPF;
	private JTextField txtNome;
	private JTextField txtIdade;
	private JTextField txtSobrenome;
	private JTextField txtPessoaCad;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ex1 frame = new Ex1();
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
	public Ex1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 386, 277);
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
		
		txtPessoaCad = new JTextField();
		txtPessoaCad.setColumns(10);
		txtPessoaCad.setBounds(193, 177, 167, 20);
		contentPane.add(txtPessoaCad);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Pessoa cadastrada:");
		lblNewLabel_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_1_1_1.setBounds(73, 180, 110, 14);
		contentPane.add(lblNewLabel_1_1_1_1);
		
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
				
				txtPessoaCad.setText(pessoa.toString());
			}
		});
		btnCadastrar.setBounds(271, 208, 89, 23);
		contentPane.add(btnCadastrar);
	}
}
