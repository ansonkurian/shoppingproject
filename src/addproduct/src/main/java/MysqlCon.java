import java.sql.*;
class MysqlCon{
public static void main(String args[]){
    try
    {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection( "jdbc:mysql://localhost:3306/boutique","anson","Anson@123");
        //here sonoo is database name, root is username and password
        String a=args[0];
           try {
                 float f=Float.parseFloat(args[1]);
                String qry="insert into product values(?,?)";
                PreparedStatement smt=con.prepareStatement(qry);
                smt.setString(1, a);
                smt.setFloat(2, f);
                int status = smt.executeUpdate();
         if(status > 0) {
            System.out.println("record "+ a+" Inserted") ;
         }
        }
        catch (NumberFormatException e){
               System.out.println(e);
           }
        con.close();
    }
    catch(Exception e){
        System.out.println(e);}
    }
}
