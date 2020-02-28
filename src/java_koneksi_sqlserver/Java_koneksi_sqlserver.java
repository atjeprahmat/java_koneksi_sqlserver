/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_koneksi_sqlserver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author atjep
 */
public class Java_koneksi_sqlserver {
    
    private Connection koneksi;
    
    public Connection getKoneksi(){
        if (koneksi == null){
            try{
                Class.forName("net.sourceforge.jtds.jdbc.Driver");
                System.out.println("Class Driver Ditemukan");
                try{
                    String url = "jdbc:jtds:sqlserver://127.0.0.1:1433/AdventureWorks2017";
                    koneksi = DriverManager.getConnection(url, "atjeprahmat", "445622");
                    System.out.println("Koneksi Berhasil");
                }catch (SQLException se){
                    System.out.print("Koneksi Error :" +se);
                    System.exit(0);
                }
            }catch (ClassNotFoundException cnfe){
                System.out.print("Class tidak ditemukan, error:" +cnfe);
                System.exit(0);
            }
        }
        return koneksi;
    }
}

    /**
     * @param args the command line arguments
     */
    //public static void main(String[] args) {
        // TODO code application logic here
    //}
    
//}
