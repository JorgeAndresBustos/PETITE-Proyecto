package ENTIDADES;

//Clase del polimorfismo de la base de datos
public class prendas {
    
    private int id_prendas;
    private String identificativo;
    private String nombre;
    private String precio;
    private String imagenes;
    private boolean activo;

    //Metodo constructor de todos los atributos
    public prendas(int id_prendas, String identificativo, String nombre, String precio, String imagenes, boolean activo) {
        this.id_prendas = id_prendas;
        this.identificativo = identificativo;
        this.nombre = nombre;
        this.precio = precio;
        this.imagenes = imagenes;
        this.activo = activo;
    }

    //Metodos de get y set de todos los atributos
    public int getId_prendas() {
        return id_prendas;
    }

    public void setId_prendas(int id_prendas) {
        this.id_prendas = id_prendas;
    }

    public String getIdentificativo() {
        return identificativo;
    }

    public void setIdentificativo(String identificativo) {
        this.identificativo = identificativo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getImagenes() {
        return imagenes;
    }

    public void setImagenes(String imagenes) {
        this.imagenes = imagenes;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    //Metodo "toString" para todos los atributos
    @Override
    public String toString() {
        return "prendas{" + "id_prendas=" + id_prendas + ", identificativo=" + identificativo + ", nombre=" + nombre + ", precio=" + precio + ", imagenes=" + imagenes + ", activo=" + activo + '}';
    }
    
}

