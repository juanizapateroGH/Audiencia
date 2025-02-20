package com.ProyectoVeranoAudiencia.ProyectoVerano.Entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;

    @Entity
    @Table(name = "usuario")
    @Data
    public class Usuario {

        @Id
        @Column(name = "usr_id")
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long usr_id;

        @Column(name = "usr_nombre", nullable= false, length = 100)
        private String usr_nombre;

        @Getter
        @Column(name = "usr_estado")
        private boolean usr_estado;

        @Column(name = "usr_login")
        private boolean usr_login;

        @Column(name = "usr_password", nullable= false, length = 100)
        private String usr_password;

        @Column(name = "usr_isadmin")
        private boolean usr_isadmin;

        @Column(name = "usr_username", nullable= false, length = 100)
        private String usr_username;

        @Column(name = "usr_email", nullable= false, length = 100)
        private String usr_email;

        @ManyToOne
        @JoinColumn(name="dis_id")
        private Distrito distrito;

        public Usuario(){

        }

        public Long getUsr_id() {
            return usr_id;
        }

        public void setUsr_id(Long usr_id) {
            this.usr_id = usr_id;
        }

        public String getUsr_nombre() {
            return usr_nombre;
        }

        public void setUsr_nombre(String usr_nombre) {
            this.usr_nombre = usr_nombre;
        }

        public boolean isUsr_estado() {
            return usr_estado;
        }

        public void setUsr_estado(boolean usr_estado) {
            this.usr_estado = usr_estado;
        }

        public boolean isUsr_login() {
            return usr_login;
        }

        public void setUsr_login(boolean usr_login) {
            this.usr_login = usr_login;
        }

        public String getUsr_password() {
            return usr_password;
        }

        public void setUsr_password(String usr_password) {
            this.usr_password = usr_password;
        }

        public boolean isUsr_isadmin() {
            return usr_isadmin;
        }

        public void setUsr_isadmin(boolean usr_isadmin) {
            this.usr_isadmin = usr_isadmin;
        }

        public String getUsr_email() {
            return usr_email;
        }

        public void setUsr_email(String usr_email) {
            this.usr_email = usr_email;
        }

        public String getUsr_username() {
            return usr_username;
        }

        public void setUsr_username(String usr_username) {
            this.usr_username = usr_username;
        }

        public Distrito getDistrito() {
            return distrito;
        }

        public void setDistrito(Distrito distrito) {
            this.distrito = distrito;
        }
    }
