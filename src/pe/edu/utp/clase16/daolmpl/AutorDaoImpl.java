package pe.edu.utp.clase16.daolmpl;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.ArrayList;
import java.util.List;
import pe.edu.utp.clase16.config.Conexion;
import pe.edu.utp.clase16.dao.Operaciones;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import pe.edu.utp.clase16.model.Autor;



/**
 *
 * @author gedua
 */
 public class AutorDaoImpl implements Operaciones<Autor>{
    private PreparedStatement ps;
    private ResultSet rs;
    private Connection cx;
    @Override
    public int create(Autor t) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int update(Autor t) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Autor read(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Autor> readAll() {
        String SQL = "select *from autor";
        List<Autor> datos = new ArrayList<>();
        try {
            cx = Conexion.getConex();
            ps = cx.prepareStatement(SQL);            
            rs = ps.executeQuery();
            while(rs.next()){
                Autor a = new Autor();
                a.setIdautor(rs.getInt("idautor"));
                a.setNombres(rs.getString("nombres"));
                a.setApellidos(rs.getString("apellidos"));
                a.setPais(rs.getString("pais"));                
                datos.add(a);
            }
        } catch (SQLException e) {
            System.out.println("Error: "+e);
        }
        return datos;
    }
    }