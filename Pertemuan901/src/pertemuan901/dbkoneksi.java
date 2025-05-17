
package pertemuan901;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author Ardina Jandrilia
 * TGL 17 Mei 2025
 */
public class dbkoneksi {
    static String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    static String DB_URL="jdbc:mysql://localhost/mahasiswa";
    static String DB_USER="root";
    static String DB_PASS="";
    
   public Connection koneksi (){
       try{
           Class.forName(JDBC_DRIVER);
           return DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
       }catch(ClassNotFoundException | SQLException err){
           System.out.println("Gagal koneksi ke DBMS MySQL");
       }
        
        return null;
    }
}
