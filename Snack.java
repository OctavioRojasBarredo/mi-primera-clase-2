public class Snack {
    // Marca del snack
    private String marca;
    // Precio del snack
    private int precio;
    // Cantidad de snacks que tiene cada bolsa
    private int cantidad;
    // Dice si es bajo en calorías o no
    private boolean bajoEnCalorias;
    // Dice si son patatas o no
    private boolean patatas;

    public Snack (int precioDeSnack, String marcaDeSnack) {
        marca = marcaDeSnack;
        precio = precioDeSnack;
        bajoEnCalorias = bajoEnCalorias;
        patatas = true;
        cantidad = 0;
    }

    public void imprimirEstado(){
        String patatasNuevo;
        String caloriasNuevo;

        if (patatas = true){
            patatasNuevo = "Sí";
        }
        else {
            patatasNuevo = "No";
        }

        if (bajoEnCalorias = true){
            caloriasNuevo = "Sí";
        }
        else {
            caloriasNuevo = "No";
        }

        System.out.println("Marca del snack: " + marca + "| Precio: " + precio + "€ | Bajo en calorías: " + caloriasNuevo + " | Son patatas: " + patatasNuevo + " | Cantidad en bolsa: " + cantidad);
    }

    public String devolverEstado(){
        String patatasNuevo;
        String caloriasNuevo;

        if (patatas = true){
            patatasNuevo = "Sí";
        }
        else {
            patatasNuevo = "No";
        }

        if (bajoEnCalorias = true){
            caloriasNuevo = "Sí";
        }
        else {
            caloriasNuevo = "No";
        }

        String estado;
        estado = "Marca del snack: " + marca + "| Precio: " + precio + "€ | Bajo en calorías: " + caloriasNuevo + " | Son patatas: " + patatasNuevo + " | Cantidad en bolsa: " + cantidad;
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

    public void esBajoEnCalorías() {
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
    
    public int getCantidad() {
        return cantidad;
    }
    
    public void setCantidad(int nuevaCantidad) {
        cantidad = nuevaCantidad;
    }
    

}