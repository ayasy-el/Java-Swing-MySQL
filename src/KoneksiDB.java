import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class KoneksiDB {
//    public static void main(String[] args) {
//        // Define the connection
//        Connection koneksi = null;
//        try {
//            koneksi = DriverManager.getConnection("jdbc:mysql://localhost:3306/", "root", "");
//            System.out.println("Koneksi Berhasil");
//        } catch (SQLException ex) {
//            System.err.println("Error: " + ex);
//            System.exit(1);
//        }
//    }
    
    public static Connection getConnection() {
        Connection koneksi = null;
        try {
            koneksi = DriverManager.getConnection("jdbc:mysql://localhost:3306/mahasiswa", "root", "");
            System.out.println("Koneksi Berhasil");
        } catch (SQLException ex) {
            System.err.println("Error: " + ex.getMessage());
        }
        return koneksi;
    }
    
    public static void main(String[] args) {
        Connection koneksi = KoneksiDB.getConnection();
        if (koneksi != null) {
            System.out.println("Koneksi berhasil di dalam dataMahasiswa");
        } else {
            System.out.println("Koneksi gagal di dalam dataMahasiswa");
        }
    }
}
