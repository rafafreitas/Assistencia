package basicClass;

public class Endereco {
	
	private int end_Id;
	private String end_Rua;
	private int end_Numero;
	private String end_bairro;
	private String end_Cidade;
	private String end_Estado;
	
	public int emp_Id;
	
	
	public int getEnd_Id() {
		return end_Id;
	}
	
	public String getEnd_Rua() {
		return end_Rua;
	}
	public void setEnd_Rua(String end_Rua) {
		this.end_Rua = end_Rua;
	}
	public int getEnd_Numero() {
		return end_Numero;
	}
	public void setEnd_Numero(int end_Numero) {
		this.end_Numero = end_Numero;
	}
	public String getEnd_bairro() {
		return end_bairro;
	}
	public void setEnd_bairro(String end_bairro) {
		this.end_bairro = end_bairro;
	}
	public String getEnd_Cidade() {
		return end_Cidade;
	}
	public void setEnd_Cidade(String end_Cidade) {
		this.end_Cidade = end_Cidade;
	}
	public String getEnd_Estado() {
		return end_Estado;
	}
	public void setEnd_Estado(String end_Estado) {
		this.end_Estado = end_Estado;
	}
}
