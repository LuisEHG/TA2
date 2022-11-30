/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.utp.clase16.daolmpl;

import java.sql.SQLException;
/**
 *
 * @author gedua
 */
public class LibroDaolmpl {
    public int create(Libro t) {
        int x = 0;
        String SQL = "insert into libro (titulo, anio, npaginas, idautor) values(?,?,?,?)";
        try {
            cx = Conexion.getConex();
            ps = cx.prepareStatement(SQL);
            ps.setString(1, t.getTitulo());
            ps.setInt(2, t.getAnio());
            ps.setInt(3, t.getNpaginas());
            ps.setInt(4, t.getIdautor());
            x = ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error: "+e);
        }
        return x;
    }

    @Override
    public int update(Libro t) {
        int x = 0;
        String SQL = "update libro set titulo =?, anio = ?, npaginas = ?, idautor = ? where idlibro=?";
        try {
            cx = Conexion.getConex();
            ps = cx.prepareStatement(SQL);
            ps.setString(1, t.getTitulo());
            ps.setInt(2, t.getAnio());
            ps.setInt(3, t.getNpaginas());
            ps.setInt(4, t.getIdautor());
            ps.setInt(5, t.getIdlibro());
            x = ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error: "+e);
        }
        return x;
    }

    
}
