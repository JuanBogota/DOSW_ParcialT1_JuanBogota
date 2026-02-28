public class Profesor extends User{

    public Profesor(id, nombre, correo, puedeAsistirAEventos, puedeCrearEventos, tipo){
        this.id = id;
        this.nombre = nombre;
        this.correo = correo;
        this.puedeAsistirAEventos = true;
        this.puedeCrearEventos = true;
        this.tipo = "Profesor";
    }
}