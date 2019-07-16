import java.sql.Connection ;
import java.sql.DriverManager ;
import java.sql.SQLException ;
public class ConnectionDemo02{
	// ����MySQL�����ݿ���������
	public static final String DBDRIVER = "com.mysql.jdbc.driver" ;
	// ����MySQL���ݿ�����ӵ�ַ
	public static final String DBURL = "jdbc:mysql://localhost:3306/test" ;
	// MySQL���ݿ�������û���
	public static final String DBUSER = "root" ;
	// MySQL���ݿ����������
	public static final String DBPASS = "123" ;
	public static void main(String args[]){
		Connection conn = null ;		// ���ݿ�����
		try{
			Class.forName(DBDRIVER) ;	// ������������
		}catch(ClassNotFoundException e){
			e.printStackTrace() ;
		}
		try{
			conn = DriverManager.getConnection(DBURL,DBUSER,DBPASS) ;
		}catch(SQLException e){
			e.printStackTrace() ;
		}
		System.out.println(conn) ;	// �����ʱ���Դ�ӡ��ʾ��������
		try{
			conn.close() ;			// ���ݿ�ر�
		}catch(SQLException e){
			e.printStackTrace() ;
		}
	}
};