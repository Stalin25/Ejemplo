import java.rmi.server.UnicastRemoteObject;
import java.rmi.RemoteException;

public class ImplementacionRmi extends UnicastRemoteObject implements InterfazRmi{
	public ImplementacionRmi() throws RemoteException{

	}

	public int factorial(int numero){
		int factorial = 1;
		for(int i=1;i<numero;i++){
			factorial = factorial*i;
		};
		return factorial;
	}
}
