/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder01;

import modelo.Paciente;

/**
 *
 * @author wolley
 */
public class App {
    
    
    public static void main(String[] args) {
        
        
        PacienteBuilder builder = new PacienteBuilder();
        
        builder.comNome("Fulano");
        builder.comCPF("123.456.789-59");
        builder.nascidoEm("21/11/1989");
        
        Paciente paciente = builder.constroi();
               
        
        System.out.println(paciente);
        
        
    }
}
