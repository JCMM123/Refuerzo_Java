package org.example;

    public class Funcionario extends Persona {

            private String usuario;
            private String password;
            private String rol;

            public Funcionario() {
                this.usuario = getCedula();
                this.password = "1234";
                this.rol = "Contador";
            }
            protected String getUsuario() {
                return usuario;
            }

            protected void setUsuario(String usuario) {
                this.usuario = usuario;
            }

            protected String getPassword() {
                return password;
            }

            protected void setPassword(String password) {
                this.password = password;
            }
            protected String getRol() {
                return rol;
            }

            protected void setRol(String rol) {
                this.rol = rol;
            }
}
