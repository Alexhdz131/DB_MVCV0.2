
package models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class ModelAgenda {

    private Connection conexion;
    private Statement st;
    private ResultSet rs;

    private String nombre;
    private String email;
    private int id;

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    
    public void conectarDB() {
        try {
            conexion = DriverManager.getConnection("jdbc:mysql://localhost:3307/agenda_mvc", "root", "");
            st = conexion.createStatement();
            rs = st.executeQuery("SELECT * FROM contactos;");
            rs.next();
            nombre = rs.getString("nombre");
            email = rs.getString("email");
        } catch (SQLException err) {
            JOptionPane.showMessageDialog(null, "Error ModelAgenda 001: " + err.getMessage());
        }
    }
    
    
    public void moverPrimerRegistro(){
        try {
            if (rs.isFirst() == false) {
                rs.first(); 

                this.setNombre(rs.getString("nombre"));
                this.setEmail(rs.getString("email"));
            }
        } catch (Exception err) {
            JOptionPane.showMessageDialog(null, "Error " + err.getMessage());
        }
    }
    
    
    public void moverAnteriorRegistro(){
        try {
            if (rs.isFirst() == false) {
                rs.previous(); 

                this.setNombre(rs.getString("nombre"));
                this.setEmail(rs.getString("email"));
            }
        } catch (Exception err) {
            JOptionPane.showMessageDialog(null, "Error " + err.getMessage());
        }
    }
    
    
    public void moverSiguienteRegistro(){
        try{
            if(rs.isLast()==false) {
                rs.next(); 
                
                this.setNombre(rs.getString("nombre"));
                this.setEmail(rs.getString("email"));
            }
        } catch(Exception err) {
            JOptionPane.showMessageDialog(null,"Error " + err.getMessage());
        }
    }
    
    
    public void moverUltimoRegistro(){
        try {
            if (rs.isLast() == false) {
                rs.last(); 

                this.setNombre(rs.getString("nombre"));
                this.setEmail(rs.getString("email"));
            }
        } catch (Exception err) {
            JOptionPane.showMessageDialog(null, "Error " + err.getMessage());
        }
    }
    
    
    
    public void insertarRegistro() {
        try {
            nombre = this.getNombre();
            email = this.getEmail();
            st.executeUpdate("INSERT INTO contactos (nombre, email)" + " VALUES ('"+ nombre +"','"+ email +"');");
            JOptionPane.showMessageDialog(null, "Registro guardado.");
            this.conectarDB();
            this.moverUltimoRegistro();
        }
        catch(SQLException err) { 
            JOptionPane.showMessageDialog(null,"Error "+err.getMessage()); 
        }
    }
    
  
    public void modificarRegistro() {
        try {
            id = rs.getInt("id_contacto");
            nombre = this.getNombre();
            email = this.getEmail();
            st.executeUpdate("UPDATE contactos SET nombre = '"+ nombre +"', email = '"+ email +"' WHERE id_contacto = "+ id +"; ");
            JOptionPane.showMessageDialog(null, "Se ha modificado el registro.");
            this.conectarDB();
            this.moverUltimoRegistro();
        }
        catch(SQLException err) { 
            JOptionPane.showMessageDialog(null,"Error "+err.getMessage()); 
        }
    }
    
   
    public void eliminarRegistro() {
        try {
            int respuesta = JOptionPane.showConfirmDialog(null, "¿Eliminar este registro?", "Borrar", JOptionPane.YES_NO_OPTION);
            if (respuesta == JOptionPane.YES_OPTION) {
                id = rs.getInt("id_contacto");
                st.executeUpdate("DELETE FROM contactos WHERE id_contacto = "+ id +"; ");
                
                this.conectarDB();
                this.moverUltimoRegistro();
            }
            else {
                this.conectarDB();
                this.moverUltimoRegistro();
            }
        }
        catch(SQLException err) { 
            JOptionPane.showMessageDialog(null,"Error "+err.getMessage()); 
        }
    }
    
}
