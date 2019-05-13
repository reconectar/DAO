
public class App{	

	public static void main(String[] args) {		
		try {
			new Server();		
		}catch(Exception e) {
			System.out.println("Se fudeu...");
			e.printStackTrace();
		}finally{
			System.out.println("Saindo...");
		}

	}

}
