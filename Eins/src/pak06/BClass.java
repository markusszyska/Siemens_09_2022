package pak06;

public class BClass {
	public static void main(String[] args) {
		DBConnection dbc = DBConnection.getInstance();
		DBConnection dbc2 = DBConnection.getInstance();
		System.out.println(dbc==dbc2);
		Short s = 200;
		System.out.println(s);
		
		int i = 10;
		long l = 10;
		
		int erg = (int)(i+l);
		
		
	}
}

class DBConnection {
	
	private static DBConnection con;
	
	public synchronized static DBConnection getInstance(){
		synchronized (DBConnection.class) {
			if(con == null) {
				//<------ Thread 1 bleibt stehen
				con = new DBConnection();
			}			
		}
		return con;
	}
	
	
	private DBConnection() {
		
	}
}
