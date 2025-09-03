public class Estudiante{

    String nombre;
    int edad;
    int[] calificaciones;

    public Estudiante(String nombre, int edad, int[] calificaciones){

        this.nombre = nombre;
        this.edad = edad;
        this.calificaciones = calificaciones;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public int getEdad(){
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int[] getCalificaciones() {
        return calificaciones;
    }

    public void setCalificaciones(int[] calificaciones) {
        this.calificaciones = calificaciones;
    }

    public double promedioQualificaciones(){

        double sumacalificaciones = 0;

        for (int i = 0; i< calificaciones.length; i++){
            sumacalificaciones += calificaciones[i]; 
        }
        return (double) sumacalificaciones/calificaciones.length;
    }

    public boolean estudianteAprobado(double promedio){
        return promedio >= 6; //FORMA SIMPLIFICADA DE HACER EL IF / ELSE
    }
    


}