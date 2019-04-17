/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package exercicio4;

/**
 *
 * @author 2017953649
 */
public class Producer implements Runnable {
    PilhaSincronizada pilha;
 
    public Producer(PilhaSincronizada pilha) {
        this.pilha = pilha;
    }

    public void run() {
        int colorIdx;
        for (int i = 0; i < 40; i++) {
            colorIdx = (int) (Math.random()* 10);
            pilha.push(colorIdx);
            System.out.println("Criado: " + colorIdx);
            try {
                Thread.sleep((int) (Math.random() * 1000));
            } catch (InterruptedException e) {
            }
        }
    }
}