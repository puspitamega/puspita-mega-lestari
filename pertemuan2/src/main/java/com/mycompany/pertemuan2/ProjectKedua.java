/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pertemuan2;

import java.util.Scanner;

/**
 *
 * @author A-26
 */
public class ProjectKedua {
    public static void main(String[] args) {
        int nilaiA = 10;
        int nilaiB = 20;
        double varA = 10.1;
        double varB = 20.1;
        boolean isPlus = true;
        
        System.out.println("nilaiA = " + nilaiA);
        System.out.println("nilaiB = " + nilaiB);
        System.out.println("varA = " + varA);
        System.out.println("varB = " + varB);
        System.out.println("isPlus = " + isPlus);
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Masukkan nilai baru nilai A (integer) = ");
        nilaiA = input.nextInt();
        
        System.out.println("Masukkan nilai baru nilai B (integer) = ");
        nilaiB = input.nextInt();
        
        System.out.println("Masukkan nilai baru variabel A (double) = ");
        varA = input.nextDouble();
        
        System.out.println("Masukkan nilai baru variabel B (double) = ");
        varB = input.nextDouble();
        
        System.out.println("Masukkan nilai baru isPlus (boolean) = ");
        isPlus = input.nextBoolean();
        
        System.out.println("nilaIA = " + nilaiA);
        System.out.println("nilaIB = " + nilaiB);
        System.out.println("varA = " + varA);
        System.out.println("varB = " + varB);
        System.out.println("isPlus = " + isPlus);
        
        input.nextLine();
        System.out.println("masukan nama anda = ");
        String nama = input.nextLine();
        System.out.println("nama = " + nama);
    }
}
