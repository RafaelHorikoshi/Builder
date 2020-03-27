/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder02;

import modelo.Paciente;

/**
 *
 * @author wolley
 */
public class App {
    
    public static void main(String[] args) {
        
        Paciente paciente = PacienteBuilder.novoPacienteBuilder()
                .comCodigo(1)             
                .comNome("Fulano")
                .doSexo('M')
                .Doador(true)
                .comCPF("123.456.789-59")
                .nascidoEm("21/11/1989")
                .comRG("32575195-x")
                .comAltura(175.2)
                .comPeso(70.5)
                .doTipoSanguineo("A+")
                .doCep("08750")
                .daCidade("Mogi")
                .doLogradouro("Rua")
                .doNumero(735)
                .doUf("SP")                 
                .constroi();
        
        System.out.println(paciente);
        
    }
    
}
