/*package com.umg.data.structures.LinkedList.SLL;

import com.umg.data.structures.LinkedList.SinglyLinkedList;

import java.util.Scanner;

public class MainSL {
    public static void main(String[] args) {
        SinglyLinkedList sList = new SinglyLinkedList();
        Scanner scn = new Scanner(System.in);
        boolean x = true;
        while(x==true){
            System.out.println("LISTA ENLAZADA\n");
            System.out.println("1.Insertar al inicio");
            System.out.println("2.Insertar al Final");
            System.out.println("3.Recorrer");
            System.out.println("4.Buscar elemento");
            System.out.println("5.Borrar un Elemento");
            System.out.println("6.Salir");
            System.out.println("Escoja una opción:");
            int y = scn.nextInt();
            switch (y){
                case 1:
                    x=false;
                    System.out.println("Escribir elemento a insertar al inicio: ");
                    String E = scn.nextLine();
                    sList.insertAtHead(E);
                    break;

                case 2:
                    System.out.println("Escribir elemento a insertar al final");
                    sList.insertAtTail(scn.nextLine());
                    break;

                case 3:
                    System.out.println("");
                    sList.traverse();
                    break;

                case 4:
                    System.out.println("");
                    break;

                case 5:
                    System.out.println("");
                    break;

                case 6:
                    System.out.println("");
                    break;

                default:
                    System.out.println("");
                    break;



            }
        }

    }
}*/
