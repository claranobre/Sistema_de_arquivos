
import java.rmi.*;

public interface RMIInterfaces extends Remote {
    
   public String getMensagem()
    throws RemoteException;
   
   public void setMensagem(String msg)
   	throws RemoteException;

   public List<String> getArquivosDaPasta()
   	throws RemoteException;
   
   public void receberComandos(List<String> comando)
   	throws RemoteException;

   public RMIClienteImplementacao()
   	throws RemoteException;

   public void enviarComandos(List<String> comando)
   	throws RemoteException;

}