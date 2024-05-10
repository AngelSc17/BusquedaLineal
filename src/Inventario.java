import java.util.Scanner;

public class Inventario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
           
            System.out.print("Ingrese la cantidad de productos en el inventario: ");
            int cantidadProductos = scanner.nextInt();
            scanner.nextLine(); 

          
            String[] inventario = new String[cantidadProductos];

            for (int i = 0; i < cantidadProductos; i++) {
                System.out.print("Ingrese el nombre del producto " + (i + 1) + ": ");
                inventario[i] = scanner.nextLine();
            }

           
            System.out.print("Ingrese el nombre del producto que desea buscar: ");
            String productoBuscado = scanner.nextLine();

            
            int target = -1;

            
            for (int i = 0; i < inventario.length; i++) {
                if (inventario[i].equalsIgnoreCase(productoBuscado)) {
                    target = i;
                    break;
                }
            }

            
            if (target != -1) {
                System.out.println("El producto está disponible en el inventario.");
            } else {
                System.out.println("El producto no está disponible en el inventario.");
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
