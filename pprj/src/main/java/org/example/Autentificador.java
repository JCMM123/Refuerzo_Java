package org.example;
import java.util.Objects;
import java.util.Scanner;

public class Autentificador {
    private String nombre;
    private String password;
    public Autentificador() {
       Scanner lectorTeclado = new Scanner(System.in);

        System.out.println("Usuario:");
        this.nombre = lectorTeclado.nextLine();
        System.out.println("Contraseña");
        this.password = lectorTeclado.nextLine();
    }

    //Metodo para comparar
    protected String verificacion(){
        Funcionario funcionario = new Funcionario();

        if (Objects.equals(funcionario.getUsuario(),this.nombre) && Objects.equals(funcionario.getPassword(),this.password)){
            return "Felicidades " + funcionario.getNombre() + " " + funcionario.getApellido() + "\nTu rol es: " + funcionario.getRol();
        }else {
            return "Las credenciales son incorrectas";
        }
    }
}
