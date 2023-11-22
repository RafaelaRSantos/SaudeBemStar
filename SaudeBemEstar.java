package saude;

import java.util.List;
import java.util.Scanner;

public class SaudeBemEstar {

	public static void main(String[] args) {
		
      Scanner scanner = new Scanner(System.in);

      System.out.print("Nome:");
      String nome = scanner.nextLine();
      System.out.print("Idade: ");
      int idade = scanner.nextInt();
      System.out.print("Peso: ");
      double peso = scanner.nextDouble();
      scanner.nextLine();
      
      System.out.print("Email: ");
      String email = scanner.nextLine();
      System.out.print("Senha :" );
      String senha = scanner.nextLine();
      System.out.print("Cadastrando Usuario:");
      String orientacaoAtividadeFisica = scanner.nextLine();
      System.out.print("Orientacoes a seguir sao conforme seu peso!");
      String orientacaoAlimentacao = scanner.nextLine();
      
      Usuario novoUsuario = new Usuario(nome, idade, peso,email, senha,
    		  orientacaoAtividadeFisica, orientacaoAlimentacao);
      
      CadastroUsuario cadastro = new CadastroUsuario();
      
      cadastro.cadastrarUsuario(novoUsuario);
      
      cadastro.exibirUsuariosCadastrados();
      
      novoUsuario.exibirInformacoes();
    
      String orientacaoAlimentacao1 = novoUsuario.obterOrientacaoAlimentacao();
      System.out.println("Orientação de Alimentação com base no Peso:");
      System.out.println(orientacaoAlimentacao1);
      
      
      List<String> atividadesRecomendadas = novoUsuario.obterAtividadesRecomendadas();
      System.out.println("Atividades Recomendadas com base no Peso: ");
      for (String atividade : atividadesRecomendadas) {
          System.out.println("- " + atividade);
      }
    		 
   
  
      scanner.close();
	}

}
