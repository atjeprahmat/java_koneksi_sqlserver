/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.sql.SQLException;
import java_koneksi_sqlserver.Java_koneksi_sqlserver;
/**
 *
 * @author atjep
 */
public class test_koneksi {
    public static void main(String[] args) throws SQLException{
        Java_koneksi_sqlserver connection = new Java_koneksi_sqlserver();
        connection.getKoneksi();
    }

}
