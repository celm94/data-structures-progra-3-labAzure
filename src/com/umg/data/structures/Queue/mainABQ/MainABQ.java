package com.umg.data.structures.Queue.mainABQ;

import java.util.Scanner;

public class MainABQ {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        String menu = "";
        while(true!=menu.equals("3")){
            System.out.println("1.BASADA EN ARRAYS");
            System.out.println("2.BASADA EN LISTAS");
            System.out.println("3.SALIR");

            menu = scn.nextLine();

            switch(menu){
                case "1":
                    //Encolar
                    //Desencolar
                    //cima
                    //Tamaño
                    String menuArr = "";
                    while(true!=menuArr.equals("5")){
                        System.out.println("1. Encolar");
                        System.out.println("2. Desencolar");
                        System.out.println("3. Cima");
                        System.out.println("4.Tamaño");
                        System.out.println("5. Salir");
                        menuArr= scn.nextLine();

                        switch (menuArr){

                            case "1":
                                System.out.println("1.ENCOLAR:");


                        }

                    }

                    break;


                case "2":
                    String menuL = "";
                    while(true!=menuL.equals("5")){
                        
                        System.out.println("1. Encolar");
                        System.out.println("2. Desencolar");
                        System.out.println("3. Cima");
                        System.out.println("4.Tamaño");
                        System.out.println("5. Salir");
                        menuL= scn.nextLine();

                    }
                    break;


                case "3":
                    System.out.println("HASTA PRONTO...");
                    break;

                default:
                    System.out.println("opción inválida");
            }

        }

    }
}
