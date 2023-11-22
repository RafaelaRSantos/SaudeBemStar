package saude;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
	private String nome;
	private int idade;
	private double peso;
	private String email;
	private String senha;
	private String orientaçaoAtividadeFisica;
	private String orientacaoAlimentacao;
	private String orientacaoAtividadeFisica;
	
	
	 public List<String> obterAtividadesRecomendadas() {
	        List<String> atividadesRecomendadas = new ArrayList<>();

	        if (peso < 60) {
	            atividadesRecomendadas.add("Caminhada");
	            atividadesRecomendadas.add("Yoga");
	        } else if (peso >= 60 && peso < 80) {
	            atividadesRecomendadas.add("Corrida leve");
	            atividadesRecomendadas.add("Natação");
	           
	        } else {
	            atividadesRecomendadas.add("Levantamento de peso");
	            atividadesRecomendadas.add("CrossFit");
	        }

	        return atividadesRecomendadas;
	    }
	 public String obterOrientacaoAlimentacao() {
	        if (peso < 60) {
	            return "Recomenda-se uma dieta equilibrada, rica em vegetais, frutas e proteínas magras.";
	        } else if (peso >= 60 && peso < 80) {
	            return "É importante manter uma dieta balanceada, incluindo carboidratos, proteínas e gorduras saudáveis.";
	        } else {
	            return "Para manter a energia necessária, considere uma dieta com foco em proteínas, carboidratos complexos e gorduras saudáveis.";
	        }
	    }

	    
	
	  
	
	
	public Usuario(String nome,int idade, double peso, String email, String senha, 
			String orientacaoAtividadeFisica, String orientacaoAlimentacao) {
		this.nome = nome;
		this.idade = idade;
		this.peso = peso;
		//this.email = email;
		this.setSenha(senha);
		this.setOrientacaoAtividadeFisica(orientacaoAtividadeFisica);
		this.orientacaoAlimentacao = orientacaoAlimentacao;
		
		
	}
	
 public String getNome() {
	 return nome;
 }
	 public int getIdade() {
		 return idade;
	 }
	 
	 public double getPeso() {
		 return peso;
	 }
	  public String getEmail() {
		  return email;
	  }
	  
	  
	  
	  public String getOrientaçaoAtividadeFisica() {
		return orientaçaoAtividadeFisica;
	}

	
	public String getOrientacaoAlimentacao() {
		return orientacaoAlimentacao;
	}

	

	public void exibirInformacoes() {
		  System.out.println("Nome"  + nome);
		  System.out.println("Idade" + idade); 
		  System.out.println("Peso"  + peso); 
		  //System.out.println("Email" + email); 
	  }

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getOrientacaoAtividadeFisica() {
		return orientacaoAtividadeFisica;
	}

	public void setOrientacaoAtividadeFisica(String orientacaoAtividadeFisica) {
		this.orientacaoAtividadeFisica = orientacaoAtividadeFisica;
	}
	  
		  
		 
	 
}
 
  


