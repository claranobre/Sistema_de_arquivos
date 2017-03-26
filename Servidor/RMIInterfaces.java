
import java.rmi.*;

public interface RMIInterfaces extends Remote {
    
   public String getMensagem()
           throws RemoteException;
   
   public void setMensagem(String msg)
           throws RemoteException;
}