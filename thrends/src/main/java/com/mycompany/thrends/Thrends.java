/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.thrends;

/**
 *
 * @author diego
 */
public class Thrends {
    public static void main(String[] args) {
        Thread hilo1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 5; i++) {
                    System.out.println("Hilos 1: " + i);
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        Thread hilo2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 10; i <= 15; i++) {
                    System.out.println("Hilo 2: " + i);
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        hilo1.start();
        try {
            hilo1.join(); 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        hilo2.start();
        try {
            hilo2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

