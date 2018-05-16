package com.company;

import java.util.Scanner;

public class Main {

    private String nombre;
    private String direccion;
    private int ruc;

    private String nombreProducto;
    private String marca;
    private int codigo;
    private String tipo;
    private double precio;

    public Main(String nombre, String direccion, int ruc) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.ruc = ruc;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public int getCodigo() {
        return codigo;
    }


    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getRuc() {
        return ruc;
    }

    public void setRuc(int ruc) {
        this.ruc = ruc;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = " electrodomesticos, ropa, alimento";


    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public static void main(String[] args) {

int opcion;
String acumulador="" ;
        String espacio = " ";
        double factura=0.0;

                Scanner scan = new Scanner( System.in);
                System.out.println("Bienvenidos a mi tienda");

                do{
                    System.out.println("1. Ingresa nuevo producto");
                    System.out.println("2. Visualizar lista de productos");
                    System.out.println("3. Salir");
                    System.out.println("Ingrese la opcion que desea");
                   opcion = scan.nextInt();

                    switch(opcion){

                        case 1:

                            //tienda
                            System.out.println("\tIngrese producto");
                            scan.nextLine();

                            System.out.println("ingrese nombre de la tienda:");
                            String nombre = scan.nextLine();
                            System.out.println("ingrese la direccion de la tienda:");
                            String direccion = scan.nextLine();
                            System.out.println("ingrese el ruc de la tienda:");
                            int ruc = scan.nextInt();

                            //producto
                           scan.nextLine();
                            System.out.println("ingrese nombre del producto:");
                            String nombreProducto = scan.nextLine();
                            System.out.println("ingrese la marca del producto:");
                            String marca = scan.nextLine();
                            System.out.println("ingrese el codigo del producto:");
                            int codigo = scan.nextInt();
                            System.out.println("ingrese el tipo de producto -Electrodoméstico-Ropa-Alimento:");
                            String tipo = scan.nextLine();
                            scan.nextLine();
                            System.out.println("ingrese el precio del producto:");
                            double precio = scan.nextDouble();


                          acumulador= acumulador+ espacio + nombreProducto ;
                            factura= factura+precio;


                            break;

                        case 2:

                            System.out.println("\tMostrar producto");
                            System.out.println("productos:\n"+ acumulador);
                            System.out.println("Factura:\n"+ factura);

                            break;
                        case 3:
                            //Salir
                            break;
                        default:
                            System.out.println("OPCION NO VALIDA");


                    }


                }while(opcion != 3);


    }
}
