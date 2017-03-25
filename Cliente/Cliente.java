import static java.lang.Thread.sleep;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Cliente {

	public static void main(String[] args) throws RemoteException {

		Registry regcli = LocateRegistry.getRegistry("localhost", 1060);
		try{
			RMIInterfaces rmirequest = (RMIInterfaces) regcli.lookup("rmiserver");
			for(int i=0; i<=10; i++){
				sleep(500);
				System.out.println("Fatorial de: "+i+" é "+rmirequest.fatorial(i));
			}
		}catch(Exception e){
			System.out.println(e);
		}
	}
}