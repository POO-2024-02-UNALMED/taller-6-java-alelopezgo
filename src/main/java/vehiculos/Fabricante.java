package vehiculos;

import java.util.ArrayList;

public class Fabricante {
    
    public String nombre;
    public Pais pais;
	public static ArrayList<Fabricante> listadoFabricantes = new ArrayList<>();
    public int contador;
    
    public Fabricante(String nombre, Pais pais) {
        this.nombre = nombre;
        this.pais = pais;
        listadoFabricantes.add(this);
    }
    
    public static Fabricante fabricaMayorVentas() {
        int maximo = 0;
        Fabricante fabricante = null;
        for(Fabricante x : listadoFabricantes){
            if(x.getContador() >= maximo){
                maximo = x.getContador();
                fabricante = x;
            }
        }
        return fabricante;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

    public static ArrayList<Fabricante> getListadoFabricantes() {
        return listadoFabricantes;
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }
    
}