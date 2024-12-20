package vehiculos;

import java.util.ArrayList;

public class Vehiculo {

    public static ArrayList<Vehiculo> lista = new ArrayList<>();
    public String placa;
    public int puertas;
    public int velocidadMaxima;
    public String nombre;
    public int precio;
    public int peso;
    public String traccion;
    public Fabricante fabricante;
    private static int CantidadVehiculos;

    public Vehiculo(String placa, int puertas, int velocidadMaxima, String nombre, int precio, int peso, String traccion, Fabricante fabricante){
        this.placa = placa;
        this.puertas = puertas;
        this.velocidadMaxima = velocidadMaxima;
        this.nombre = nombre;
        this.precio = precio;
        this.peso = peso;
        this.traccion = traccion;
        this.fabricante = fabricante;
        CantidadVehiculos += 1;
        lista.add(this);
        fabricante.setContador(fabricante.getContador() + 1);
        fabricante.pais.setContador(fabricante.pais.getContador() + 1);
    }

    public static String vehiculosPorTipo(){
        return "Automoviles: " + Automovil.getCantidadAutomoviles() + "\n" +  
			    "Camionetas: " + Camioneta.getCantidadCamionetas() + "\n" +
			    "Camiones: " + Camion.getCantidadCamiones();
    }

    public String getPlaca() {
        return placa;
    }
    public int getPuertas() {
        return puertas;
    }
    
    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public int getPrecio() {
        return precio;
    }
    
    public String getTraccion() {
        return traccion;
    }
    
    public int getPeso() {
        return peso;
    }
    
    public Fabricante getFabricante() {
        return fabricante;
    }
    
    public static int getCantidadVehiculos() {
        return CantidadVehiculos;
    }
    
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public void setTraccion(String traccion) {
        this.traccion = traccion;
    }

    public void setFabricante(Fabricante fabricante) {
        this.fabricante = fabricante;
    }

    public static void setCantidadVehiculos(int cantidad) {
        CantidadVehiculos = cantidad;
    }
    
    public static ArrayList<Vehiculo> getLista(){
        return lista;
    }
}
