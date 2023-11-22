package saude;

import java.util.ArrayList;
import java.util.List;

public class CadastroUsuario {

	private List<Usuario> usuarios;
	
	
	
	public CadastroUsuario() {
		this.usuarios = new ArrayList<>();
		
}

	public void cadastrarUsuario(Usuario usuario) {
		usuarios.add(usuario);
		System.out.println("Usuario cadastrado com sucesso!");
		System.out.println("............");
	}
	

	 public void exibirUsuariosCadastrados() {
		 System.out.println("Usuarios cadastrados: ");
		 for (Usuario usuario : usuarios) {
			 usuario.exibirInformacoes();
			 System.out.println(".................");
			 
		 }
		 
	    
	      }
	    		  
	 }
		 
				 
			 
		 
	 

