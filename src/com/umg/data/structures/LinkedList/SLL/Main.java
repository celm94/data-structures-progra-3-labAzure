package com.umg.data.structures.LinkedList.SLL;

import com.umg.data.structures.LinkedList.SinglyLinkedList;

import java.util.Scanner;



public class Main {
   public static void main(String[] args) {
       SinglyLinkedList sList = new SinglyLinkedList();
       Scanner scn = new Scanner(System.in);
       Scanner datos = new Scanner(System.in);
       String menu = "";
       while(true!= menu.equals("6")){
           System.out.println("\n \uD83D\uDD87 ⛓️ \uD83D\uDD87️LISTA ENLAZADA \uD83D\uDD87  ⛓️\uD83D\uDD87️\n");
           System.out.println("1.Insertar al inicio");
           System.out.println("2.Insertar al Final");
           System.out.println("3.Recorrer");
           System.out.println("4.Buscar elemento");
           System.out.println("5.Borrar un Elemento");
           System.out.println("6.Salir");
           menu = scn.nextLine();
           switch(menu){
               case "1":
                   System.out.println("2. INSERTAR AL INICIO");
                   System.out.println("Escriba elemento a insertar al inicio: ");
                   /*String E1 = scn.nextLine();*/
                   sList.insertAtHead(datos.nextLine());
                   break;
               case "2":
                   System.out.println("2. INSERTAR AL FINAL");
                   System.out.println("Escriba elemento a insertar al final: ");
                   sList.insertAtTail(datos.nextLine());
                   break;

               case "3":
                   System.out.println("3. RECORRER LISTA");
                   if(sList == null){
                       System.out.println("No hay elementos en la Lista");
                   }
                   else{
                       System.out.println("Los elementos de la Lista son: ");sList.traverse();}
                   break;

               case "4":
                   System.out.println("4. BUSCAR UN ELEMENTO");
                   System.out.println("Escriba el índice del elemento que desea buscar: ");
                   /*String Ebuscar = scn.nextLine();
                   SinglyLinkedList<String>.Node<String> ebuscado = sList.searchByValue(Ebuscar);
                   if(ebuscado == null){
                       sList.isEmpty();
                   }
                   else{
                       System.out.println(ebuscado.toString()+ "Fue encontrado en la lista");
                       sList.traverse();
                   }

                   SinglyLinkedList<String>.Node<String> buscado = sList.searchByValue(scn.nextLine());*/

                   SinglyLinkedList<String>.Node<String> buscar = sList.searchByIndex(datos.nextInt());
                   if(buscar != null){
                       System.out.println("ELEMENTO  ENCONTRADO EN LA LISTA CON EL VALOR "+buscar);
                   }
                   else{
                       System.out.println("No se encontró el elemento que buscaba");
                   }
                   break;

               case "5":
                   System.out.println("5. BORRAR UN ELEMENTO");
                   System.out.println("Escriba la posición del elemento que desea borrar: ");
                  int borrar = datos.nextInt();
                  if(borrar == 0){
                      sList.deleteFromHead();
                  }
                  else if(borrar == sList.size()-1){
                      sList.deleteFromTail();
                  }
                  else{
                      sList.deleteFromPosition(borrar);
                  }


                   break;
                   /*System.out.println("Escriba la posición del elemento que desea borrar: ");
                   String Ebuscar1 = scn.nextLine();
                   SinglyLinkedList<String>.Node<String> ebuscado1 = sList.searchByIndex(Integer.parseInt(Ebuscar1));
                   if(ebuscado1 == null){
                       System.out.println("Elemento no encontrado");
                   }
                   else{

                       System.out.println("encontrado");
                   }*/


               case "6":
                   System.out.println("Hasta pronto");
                   break;

               default:
                   System.out.println("Ingrese una opción válida");
                   break;

           }



       }


   }
}
