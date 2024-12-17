package vehiculos;

import java.util.ArrayList;

public class Pais {

    public String nombre;
	public int contador;

    public Pais(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public static Pais paisMasVendedor() {
        ArrayList<Fabricante> listaFabricantes = Fabricante.getListaFabricantes();
        int maximo = 0;
        Pais paisMaximo = null;
        for(Fabricante x : listaFabricantes){
            if (x.getPais().getContador() >= maximo) { 
                maximo = x.getPais().getContador();
                paisMaximo = x.getPais();
            }
        }
        return paisMaximo;
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }
}