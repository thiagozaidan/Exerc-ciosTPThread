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
public class Exercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PilhaSincronizada pi = new PilhaSincronizada();
    
        Producer producer = new Producer(pi);
        Consumer consumer = new Consumer(pi);
 
        Thread t1 = new Thread(producer);
        Thread t2 = new Thread(consumer);
 
        t1.start();
        t2.start();
 
    }
}
