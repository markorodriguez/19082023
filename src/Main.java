import Entities.Product;
import Entities.Students;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        studentsExercise();
    }

    public static void productExample() {
        Scanner scanner = new Scanner(System.in);
        List<Product> inventory = new ArrayList<>();

        // Explicar While
        while (true) {
            System.out.println("Menú:");
            System.out.println("1. Agregar producto");
            System.out.println("2. Mostrar lista de productos");
            System.out.println("3. Calcular valor total del inventario");
            System.out.println("4. Buscar producto por nombre");
            System.out.println("5. Actualizar cantidad en stock");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");
            int menuOption = scanner.nextInt();
            scanner.nextLine();  // Consumir el salto de línea

            // Explicar Switch
            switch (menuOption) {
                case 1:
                    System.out.print("Ingrese el nombre del producto: ");
                    String name = scanner.nextLine();
                    System.out.print("Ingrese el precio del producto: ");
                    double price = scanner.nextDouble();
                    System.out.print("Ingrese la cantidad en stock: ");
                    int stock = scanner.nextInt();
                    scanner.nextLine(); // Consume the newline character
                    System.out.print("Ingrese la disponibilidad (S / N): ");
                    String available = scanner.nextLine();
                    boolean isAvailable = Objects.equals(available.toUpperCase(), "S");
                    inventory.add(new Product(name, price, stock, isAvailable));
                    break;
                case 2:
                    System.out.println("Lista de productos:");
                    for (Product product : inventory) {
                        System.out.println("Nombre: " + product.getName());
                        System.out.println("Precio: " + product.getPrice());
                        System.out.println("Cantidad en stock: " + product.getStock());
                        System.out.println("¿Disponible en tienda?: " + (product.isAvailableHere() ? "Sí" : "No"));
                        System.out.println("------------------------------");
                    }
                    break;
                case 3:
                    double valorTotal = 0;
                    for (Product product : inventory) {
                        valorTotal += (product.getPrice() * product.getStock()) ;
                    }
                    System.out.println("Valor total del inventario: " + valorTotal);
                    break;
                case 4:
                    System.out.print("Ingrese el nombre del producto a buscar: ");
                    String searchedProduct = scanner.nextLine();
                    boolean isFound = false;
                    for (Product product : inventory) {
                        if (product.getName().equalsIgnoreCase(searchedProduct)) {
                            System.out.println("Producto encontrado:");
                            System.out.println("Nombre: " + product.getName());
                            System.out.println("Precio: " + product.getPrice());
                            System.out.println("Cantidad en stock: " + product.getStock());
                            isFound = true;
                            break;
                        }
                    }
                    if (!isFound) {
                        System.out.println("Producto no encontrado.");
                    }
                    break;
                case 5:
                    System.out.print("Ingrese el nombre del producto a actualizar: ");
                    String productToUpdate = scanner.nextLine();
                    boolean isUpdated = false;
                    for (Product product : inventory) {
                        if (product.getName().equalsIgnoreCase(productToUpdate)) {
                            System.out.print("Ingrese la nueva cantidad en stock: ");
                            int newStockProduct = scanner.nextInt();
                            product.setStock(newStockProduct);
                            System.out.println("Cantidad en stock actualizada.");
                            isUpdated = true;
                            break;
                        }
                    }
                    if (!isUpdated) {
                        System.out.println("Producto no encontrado.");
                    }
                    break;
                case 6:
                    System.out.println("¡Hasta luego!");
                    return;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }


        }
    }

    public static void studentsExercise(){
        /*
         * TEMAS
         * -----
         * CONDICIONALES
         * CLASES
         * ARREGLOS
         * TIPOS DE DATOS
         * CONVERSIÓN |CASTEO DE DATOS
         *
         * */
        Scanner scanner = new Scanner(System.in);
        List<Students> studentsGroup = new ArrayList<>();

        while (true) {
            System.out.println("Menú:");
            System.out.println("1. Registrar alumno y sus notas");
            System.out.println("2. Mostrar alumnos y si aprobó o no");
            System.out.println("3. Buscar alumno e indicar si no existe");
            System.out.println("4. Actualizar las notas de un alumno");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            int menuOption = scanner.nextInt();
            scanner.nextLine();  // Consumir el salto de línea

            switch (menuOption) {
                case 1:
                    System.out.print("Ingrese el nombre del alumno: ");

                    System.out.print("Ingrese su primera nota: ");

                    System.out.print("Ingrese su segunda nota: ");

                    System.out.print("Ingrese su tercera nota: ");


                    System.out.println("¡Alumno registrado!");
                    break;
                case 2:
                    System.out.println("Estado de alumnos");

                    break;
                case 3:
                    System.out.println("Buscar alumno...");

                    break;
                case 4:
                    System.out.println("Ingrese el nombre del alumno...");

                    break;
                case 5:
                    System.out.println("¡Hasta luego!");
                    return;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }

        }



    }
}