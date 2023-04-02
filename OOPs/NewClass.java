import java.sql.*;
import java.util.*;
public class NewClass {

	public static void main(String[] args) {
		
        String url="jdbc:mysql://localhost:3306/vit";
		String user="root";
		String pwd="shrinivas@1";
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter rollNo: ");
		int rno = sc.nextInt();
		
		System.out.println("Enter Sname: ");
		String sname = sc.next();
		Connection con=null;
                PreparedStatement ps = null;
		try  {
			 Class.forName("jdbc:com.mysql.cj.jdbc.Driver");
                         con = DriverManager.getConnection(url,user,pwd);
			 Statement st=con.createStatement();
			 
			 String sqlInsert="insert into CSA values('"+rno+"','"+sname+"')";
			 st.executeUpdate(sqlInsert);
			 System.out.println("record inserted successfully");
			 
			 
			 String sql="select * from CSA";
			 ResultSet rs= st.executeQuery(sql);
			 while(rs.next()) {
				 System.out.println("RollNo: "+rs.getInt(1));
				 System.out.println("Sname: "+rs.getString(2));
				 
			 }

			 String sqlupdate="update CSA set sname='ABC' where rno=2";
			 st.executeUpdate(sqlupdate);
			 System.out.println("record updated successfully");
////			 
////			 
			 String sqldelete="delete from CSA where rno=40";
			 st.executeUpdate(sqldelete);
			 System.out.println("record deleted successfully");
			 
			 
			 
			 con.close();
		}
		catch(Exception exception){
			System.out.println(exception.getMessage());
		}
		
	}

}