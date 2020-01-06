import java.sql.*;
public class MysqlCon {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stu
		try{  
		Class.forName("com.mysql.jdbc.Driver");  
		Connection con=DriverManager.getConnection(  
		"jdbc:mysql://localhost:3306/customer","root","AdventurE21$");
		//Insertion
		/*PreparedStatement stmt=con.prepareStatement("insert into emp values(?,?)");
		stmt.setInt(1,102);  
		stmt.setString(2,"Banu"); 
		int i=stmt.executeUpdate();  
		System.out.println(i+"records inserted"); 
		Statement stmt=con.createStatement();*/
		//Updation
		/*PreparedStatement stmt=con.prepareStatement("update emp set name=? where id=?");
		stmt.setString(1,"Vijay");
		stmt.setInt(2,101);
		int i=stmt.executeUpdate();
		System.out.println(i+" records updated");*/
		//Deletion
		PreparedStatement stmt=con.prepareStatement("delete from emp where id=?");
		stmt.setInt(1, 102);
		int i=stmt.executeUpdate();
		System.out.println(i+" records deleted");
		//Retrieve
		//PreparedStatement stmt=con.prepareStatement("select * from emp");  
		ResultSet rs=stmt.executeQuery("select * from emp");  
		while(rs.next())  
		System.out.println(rs.getInt(1)+"  "+rs.getString(2));
		// Database metadata
		DatabaseMetaData dbmd=con.getMetaData();  
		System.out.println("Driver Name: "+dbmd.getDriverName());  
		System.out.println("Driver Version: "+dbmd.getDriverVersion());  
		System.out.println("UserName: "+dbmd.getUserName());  
		System.out.println("Database Product Name: "+dbmd.getDatabaseProductName());  
		System.out.println("Database Product Version: "+dbmd.getDatabaseProductVersion());  
		/*Result set metadata
		ResultSetMetaData rsmd=rs.getMetaData();
		System.out.println("Number of columns: "+rsmd.getColumnCount());
		System.out.println("Column Name: "+rsmd.getColumnName(1));
		System.out.println("Column Type: "+rsmd.getColumnType(1));
		System.out.println("Table Name: "+rsmd.getTableName(1));*/
		con.close();  
		}
		catch(Exception e)
		{ 
			System.out.println(e);
			}  

	}

}
