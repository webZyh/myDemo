public class ConnectionDemo01{
	// ����MySQL�����ݿ���������
	// public static final String DBDRIVER = "org.gjt.mm.mysql.Driver" ;
	public static final String DBDRIVER = "com.mysql.jdbc.driver" ;
	public static void main(String args[]){
		try{
			Class.forName(DBDRIVER) ;	// ������������
		}catch(ClassNotFoundException e){
			// e.printStackTrace() ;
		}
	}
};