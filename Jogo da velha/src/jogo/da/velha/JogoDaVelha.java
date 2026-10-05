/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jogo.da.velha;

import java.util.Scanner;

/**
 *
 * @author augusto62977786
 */
public class JogoDaVelha {
    
    
    Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        Tabuleiro tabuleiro = new Tabuleiro("1 - UCada jogador deve escolher um simbolo; 2 - O jogador 1 inicia a partida");
        
        Jogador jogador1 = new Jogador(1, "Augusto", 'X');
        Jogador jogador = new Jogador(2, "Yuri", 'O');
        
        tabuleiro.mostrarTabuleiro();
        
        do{
            tabuleiro.mostrarTabuleiro();
            
            if(tabuleiro.getJogadorDaVez() == 1){
                System.out.println("Jogador 1, escolha onde jogar: ");
            }
            else{
                
            }
            System.out.println("Jogador 2, escolha onde jogar: ");
            
            tabuleiro.setHouveGanhadorUltimaRodada(true);
      
        }while(tabuleiro.isHouveGanhadorUltimaRodada()== false);
        
       
   }     
}