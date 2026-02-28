public class Estudiante extends User{


    public Estudiante(id, nombre, correo, puedeAsistirAEventos, puedeCrearEventos, tipo){
        this.id = id;
        this.nombre = nombre;
        this.correo = correo;
        this.puedeAsistirAEventos = true;
        this.puedeCrearEventos = false;
        this.tipo = "Estudiante";
    }



  
}