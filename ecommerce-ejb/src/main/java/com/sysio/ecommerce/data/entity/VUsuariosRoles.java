/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sysio.ecommerce.data.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Carlos Cesar Rosas<face_less@hotmail.com>
 */
@Entity
@Table(name = "VUsuariosRoles")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "VUsuariosRoles.findAll", query = "SELECT v FROM VUsuariosRoles v"),
    @NamedQuery(name = "VUsuariosRoles.findByIdUsuario", query = "SELECT v FROM VUsuariosRoles v WHERE v.idUsuario = :idUsuario"),
    @NamedQuery(name = "VUsuariosRoles.findByUsuario", query = "SELECT v FROM VUsuariosRoles v WHERE v.usuario = :usuario"),
    @NamedQuery(name = "VUsuariosRoles.findByContrasena", query = "SELECT v FROM VUsuariosRoles v WHERE v.contrasena = :contrasena"),
    @NamedQuery(name = "VUsuariosRoles.findByIdRol", query = "SELECT v FROM VUsuariosRoles v WHERE v.idRol = :idRol"),
    @NamedQuery(name = "VUsuariosRoles.findByDescripcion", query = "SELECT v FROM VUsuariosRoles v WHERE v.descripcion = :descripcion")})
public class VUsuariosRoles implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idUsuario")
    private int idUsuario;
    @Size(max = 45)
    @Column(name = "Usuario")
    private String usuario;
    @Size(max = 63)
    @Column(name = "Contrasena")
    private String contrasena;
    @Basic(optional = false)
    @NotNull
    @Column(name = "idRol")
    private int idRol;
    @Size(max = 45)
    @Column(name = "Descripcion")
    private String descripcion;

    public VUsuariosRoles() {
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public int getIdRol() {
        return idRol;
    }

    public void setIdRol(int idRol) {
        this.idRol = idRol;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
}
