
/*package com.umg.data.structures.LinkedList.SLL;

import java.util.Scanner;

public class Main {

    private static int num=0;
    private static DoublyLinkedList<String> lista = new DoublyLinkedList<>();
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner entrada = new Scanner(System.in);
        while(num!=6) {

            System.out.println("Bienvenido a las listas enlazadas");
            System.out.println("[1]. Insertar inicio");
            System.out.println("[2]. Insertar final");
            System.out.println("[3]. Recorrar");
            System.out.println("[4]. Buscar elemento");
            System.out.println("[5]. Eliminar elemento");
            System.out.println("[6]. Salir");
            num=entrada.nextInt();
            entrada.nextLine();
            switch(num) {
                case 1:{
                    System.out.println("Escriba el dato que quiere agregar");
                    String dato = entrada.nextLine();
                    lista.insertAtHead(dato);
                    break;
                }
                case 2:{
                    System.out.println("Escriba el dato que quiere agregar");
                    lista.insertAtTail(entrada.nextLine());
                    break;
                }
                case 3:{
                    lista.traverseForward();
                    break;
                }
                case 4:{
                    lista.searchByValue(entrada.nextLine());
                    break;
                }
                case 5:{
                    lista.deleteFromPosition(entrada.nextInt());
                    break;
                }
                case 6:{
                    System.out.println("Vuelva pronto");
                    break;
                }
                default:
                    System.out.println("Escoja uno de los datos del menu...");
                    System.out.println(" ");

            }

        }
    }

}*/
