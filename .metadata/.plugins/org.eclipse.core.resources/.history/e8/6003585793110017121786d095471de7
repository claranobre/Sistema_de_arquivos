package Servidor;

import java.rmi.server.*;
import java.rmi.*;
import java.io.File;

public class RMIServidorImplementacao {

	public class RMIServidorImplementacao extends UnicastRemoteObject implements RMIInterfaces{

		private String mensagem = "Iniciar";

		private String caminho = "/home/clara/Documents";

		public RMIServerImplementation() throws RemoteException{
			super();     
		}

		public String getMensagem() throws RemoteException{
			return mensagem;
		}

		public void setMensagem(String msg) throws RemoteException{
			mensagem = msg;
		}


		public List<String> getArquivosDaPasta(){

			ArrayList<String> arquivos = new ArrayList<String>();

			File diretorio = new File(caminho);
			File[] listOfFiles = diretorio.listFiles();

			for(int i = 0; i < listOfFiles.lenght; i++){
				arquivos.add(listOfFiles[i].getName());
			}
			return arquivos;
		}

		public void receberComando(List<String> comando) throws RemoteException{

			ArrayList<String> arquivos = new ArrayList<String>();

			if(comando == cat){

				BufferReader lerArq = new BufferReader(arquivos);

				try{
					FileReader arquivo = new FileReader(arquivo);
					BufferedReader lerArq = new BufferedReader(arquivos);

					String linha = ""; 

					while((linha = bufferedReader.readLine()) != null){
						System.out.printl(linha);
					}

					arquivo.close();
					lerArq.close();
				} catch (IOException e){
					e.printStackTrace();
				}
			}
			else if(comando == touch){
				File arquivo = new File("arquivo01.txt");

				try {
					boolean statusArq = arquivo.createNewFile();
					System.out.print(statusArq);
				} catch (IOException e) {
					e.printStackTrace(); 
				}
			}

			else if(comando == ls){
				getArquivosDaPasta();
			}
		}
	} 
}