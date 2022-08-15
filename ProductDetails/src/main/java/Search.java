import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import javax.servlet.http.*;
public class Search extends HttpServlet
{
    public void doGet (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {

        PrintWriter out = response.getWriter ();
        String pid = request.getParameter ("pid");

        try
        {
            Class.forName ("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection ("jdbc:mysql://localhost:3306/mphasis", "root", "root");
            System.out.println("connection created..../");
            
            PreparedStatement ps =con.prepareStatement ("select * from productdetails where pid=?");
            ps.setString (1, pid);
            out.print("<center>");
            out.print ("<table width=50% border=1>");
            out.print ("<caption>Product Details:</caption>");

            ResultSet rs = ps.executeQuery ();

            /* Printing column names */
            out.print ("</br></br>");
            ResultSetMetaData rsmd = rs.getMetaData ();
            int total = rsmd.getColumnCount ();

            out.print ("<tr>");
            for (int i = 1; i <= total; i++)
         {
             out.print ("<th>" + rsmd.getColumnName (i) + "</th>");
         }
            out.print ("</tr>");

            /* Printing result */
            while (rs.next ())
         {
             out.print ("<tr><td>" + rs.getString (1) + "</td><td>" +  rs.getString (2) + " </td><td>" + rs.getString (3) + " </td><td>" +rs.getInt (4) + "</td></tr>");
         }
           
            out.print ("</table>");
            out.print("</center>");
            
        }
        
        catch (Exception e2)
        {
            e2.printStackTrace ();
        }
        finally
        {
            out.close ();
        }
    }
}