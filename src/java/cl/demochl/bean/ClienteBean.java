/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.demochl.bean;

import cl.demochl.dao.ClienteDAO;
import cl.demochl.model.Cliente;
import cl.demochl.model.Factura;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author BlueOcean
 */
@Named(value = "clienteBean")
@SessionScoped
public class ClienteBean implements Serializable {

    private Integer idCliente;
    private String razonSocial;
    private String rfc;
    private String direccion;
    private String email;

    /**
     * Creates a new instance of ClienteBean
     */
    public ClienteBean() {
    }

    public void addCliente() {
        Cliente cliente = new Cliente(getRazonSocial(), getRfc(), getDireccion(), getEmail());
        ClienteDAO clienteDAO = new ClienteDAO();
        clienteDAO.addCliente(cliente);
    }

    /**
     * @return the idCliente
     */
    public Integer getIdCliente() {
        return idCliente;
    }

    /**
     * @param idCliente the idCliente to set
     */
    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }

    /**
     * @return the razonSocial
     */
    public String getRazonSocial() {
        return razonSocial;
    }

    /**
     * @param razonSocial the razonSocial to set
     */
    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    /**
     * @return the rfc
     */
    public String getRfc() {
        return rfc;
    }

    /**
     * @param rfc the rfc to set
     */
    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    /**
     * @return the direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }
}
