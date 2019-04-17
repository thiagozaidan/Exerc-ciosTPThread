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
public class PilhaSincronizada {
    private int index = 0;
    private int[] buffer = new int[10];
 
    public synchronized int pop() {
        while(index == 0){
            try { this.wait();
        } catch (InterruptedException e) {}
        }
        this.notify();
        index--;
        return buffer[index];
    }
    
    public synchronized void push(int i) {
        while(index == buffer.length) {
            try { this.wait();
            } catch (InterruptedException e) {}
        }
        this.notify();
        buffer[index] = i;
        index++;
    }
}
