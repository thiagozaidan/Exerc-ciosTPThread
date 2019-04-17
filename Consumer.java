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
public class Consumer implements Runnable {
    PilhaSincronizada pilha;
 
    public Consumer(PilhaSincronizada pilha) {
        this.pilha = pilha;
    }
      
    public void run() {
        int colorIdx;
        for (int i = 0; i < 20; i++) {
            colorIdx = pilha.pop();
            System.out.println("Usado: " + colorIdx);
            try {
                Thread.sleep((int) (Math.random() * 5000));
            } catch (InterruptedException e) {
            }
        }
    }
}
