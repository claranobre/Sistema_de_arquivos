package Servidor;

import java.net.MalformedURLException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Servidor {

	public static void main(String[] args) throws RuntimeException, MalformedURLException {
	}static{

		try{    
			Registry reg = LocateRegistry.createRegistry(1060); //RMI Registry: serviço de nomes (localização do objeto remoto)
			reg.rebind("SERVIDOR RMI", new RMIServerImplementation());
			System.out.println("Servidor Iniciando...");
		}catch(Exception e){

			System.out.println("Erro! Não foi possível conectar" +e);

		}   
	}
}