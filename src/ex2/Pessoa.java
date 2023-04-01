package ex2;

public class Pessoa {
	private String CPF;
	private String nome;
	private String sobrenome;
	private String idade;
	
	public String getCPF() {
		return CPF;
	}
	public void setCPF(String cPF) {
		CPF = cPF;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public String getIdade() {
		return idade;
	}
	public void setIdade(String idade) {
		this.idade = idade;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "\nCPF: " + CPF + "\nNome: " + nome + "\nSobrenome: " + sobrenome + "\nIdade: " + idade;
	}
}
