public class abstract User{

    private long id;
    private String tipo;
    private String correo;
    private String nombre;
    private boolean puedeCrearEventos;
    private boolean puedeAsistirAEventos;

    public String getNombre(){
        return nombre;
    }

    public String getTipo(){
        return tipo;
    }

    public String getCorreo(){
        return correo;
    }

    public long getId(){
        return id;
    }




}