package Cliente;

import java.rmi.client.*;
import java.rmi.*;
impor java.util.Scanner;

public class RMIClienteImplementacao {

	public class RMIClienteImplementacao extends UnicastRemoteObject implements RMIInterfaces{

		public RMIClienteImplementacao() throws RemoteException{
			super();
		}

		public void enviarComandos(List<String> comando){
			
			ArrayList<String> arquivos = new ArrayList<String>();
			Scanner ler = new Scanner(System.in);

			if(ler.comando == cat){

			}
			else if(ler.comando == touch){

			}
			else if(ler.comando == ls){

			}
			else if(ler.comando == rm){
				
			}
		}
	}
}