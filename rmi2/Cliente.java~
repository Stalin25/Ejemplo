import java.rmi.Naming;

public class Cliente{
	public Cliente(){
		try{
			
			InterfazRmi i = (InterfazRmi)Naming.lookup("rmi://localhost/factorial");
			//System.out.println("El servidor se ha levantado");
			System.out.println("cliente conectado");
			System.out.println("El factorial de 5 es: "+i.factorial(5));
		}catch(Exception ex){

		}
	}
	public static void main(String [] args){
		new Cliente();

	}
}
