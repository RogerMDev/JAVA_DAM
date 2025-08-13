public abstract class Notificacion {
    private int id;
    private String destinatario;
    private String mensaje;
    private int prioridad;
    private String estado;

    public Notificacion(int id, String destinatario, String mensaje, int prioridad, String estado){
        this.id = id;
        this.destinatario = destinatario;
        this.mensaje = mensaje;
        this.prioridad = prioridad;
        this.estado = estado;
    }

    public int getId(){
        return id;
    }

    public String getDestinatario(){
        return destinatario;
    }

    public String getMensaje() {
        return mensaje;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public String getEstado() {
        return estado;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public abstract void enviar();
}
