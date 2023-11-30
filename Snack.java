public class Snack {
    // Marca del snack
    private String marca;
    // Precio del snack
    private int precio;
    // Dice si es bajo en calor�as o no
    private boolean bajoEnCalorias;

    public Snack (int precioDeSnack, String marcaDeSnack) {
        marca = marcaDeSnack;
        precio = precioDeSnack;
        bajoEnCalorias = bajoEnCalorias;
    }
    
    public void imprimirEstado(){
        System.out.println("Marca del snack: " + marca + "| Precio: " + precio + "� | Bajo en calor�as: " + bajoEnCalorias);
    }
    
    public String devolverEstado(){
        String estado;
        estado = "Marca del snack: " + marca + "| Precio: " + precio + "� | Bajo en calor�as: " + bajoEnCalorias;
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

}