package ArbolesBinarios;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        BinaryTree bt = new BinaryTree();
        Scanner scan = new Scanner(System.in);
        Scanner nodo = new Scanner(System.in);



        String menu = "";

        while(true!=menu.equals("8")){
            System.out.println("\n\n \uD83C\uDF33ÁRBOLES BINARIOS\uD83C\uDF33 \n");
            System.out.println("1. Insertar nodos");
            System.out.println("2. Encontrar elementos");
            System.out.println("3. Borrar elementos");
            System.out.println("4. Recorrer árbol en Inorden");
            System.out.println("5. Recorrer árbol en Preorden");
            System.out.println("6. Recorrer árbol en Postorden");
            System.out.println("7. Recorrer en amplitud");
            System.out.println("8. Salir");
            menu = scan.nextLine();

            switch(menu){
                case "1":
                    System.out.println("Ingrese un número entero: ");
                    bt.add(nodo.nextInt());
                    break;
                case "2":
                    System.out.println("Escriba el número a buscar:");
                    boolean buscar = bt.containsNode(nodo.nextInt());
                    if(buscar == true){
                        System.out.println("El elemento buscado "+buscar+" se encuentra en el árbol");
                    }
                    else{
                        System.out.println("Elemento "+buscar+" no fue encontrado dentro del árbol");
                    }
                    break;
                case "3":
                    System.out.println("ingrese elemento que desea eliminar: ");
                    int eliminar = nodo.nextInt();
                    if(bt== null){
                        System.out.println("No hay elementos a eliminar");
                    }
                    //AQUÍ ME QUEDÉ LOOOOOL
                    break;
                case "4":
                    break;
                case "5":
                    break;
                case "6":
                    break;
                case "7":
                    break;
                case "8":
                    break;
                default:
                    break;


            }



        }




    }
}
