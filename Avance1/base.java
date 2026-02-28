public class base {
    private final int id;
    private final String nombre;

    // El constructor y los Getters/Setters son obligatorios para que Java maneje los datos
    public base(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }
    public int getId() { return id; }
    public String getNombre() { return nombre; }
}

