public class Snack {
    // Marca del snack
    private String marca;
    // Precio del snack
    private int precio;
    // Dice si es bajo en calor�as o no
    private boolean bajoEnCalorias;
    // Dice si son patatas o no
    private boolean patatas;
    public Snack (int precioDeSnack, String marcaDeSnack) {
        marca = marcaDeSnack;
        precio = precioDeSnack;
        bajoEnCalorias = bajoEnCalorias;
        patatas = true;
    }

    public void imprimirEstado(){
        String patatasNuevo;
        String caloriasNuevo;
        if (patatas = true){
            patatasNuevo = "S�";
        }
        else {
            patatasNuevo = "No";
        }
        if (bajoEnCalorias = true){
            caloriasNuevo = "S�";
        }
        else {
            caloriasNuevo = "No";
        }
        System.out.println("Marca del snack: " + marca + "| Precio: " + precio + "� | Bajo en calor�as: " + caloriasNuevo + " | Son patatas: " + patatasNuevo);
    }

    public String devolverEstado(){
        String patatasNuevo;
        String caloriasNuevo;
        if (patatas = true){
            patatasNuevo = "S�";
        }
        else {
            patatasNuevo = "No";
        }
        if (bajoEnCalorias = true){
            caloriasNuevo = "S�";
        }
        else {
            caloriasNuevo = "No";
        }
        String estado;
        estado = "Marca del snack: " + marca + "| Precio: " + precio + "� | Bajo en calor�as: " + caloriasNuevo + " | Son patatas: " + patatasNuevo;
        return estado;
    }

    public String getMarca() {
        return marca;
    }

    public int getPrecio() {
        return precio;
    }

    public boolean getBajoEnCalorias() {
        return bajoEnCalorias;  
    }

    public void setMarca(String marcaSnack) {
        marca = marcaSnack;
    }

    public void descontarPrecio(int cantidadDescuento) {
        precio = precio - cantidadDescuento ;
    }

    public void esBajoEnCalor�as() {
        if (bajoEnCalorias == true) {
            bajoEnCalorias = false;
        }
        else {
            bajoEnCalorias = true;
        }
    }

    public boolean getPatatas(){
        return patatas;
    }

    public void setPatatas(boolean sonPatatas){
        patatas = sonPatatas;
    }

}