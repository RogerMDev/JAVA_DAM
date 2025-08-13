public abstract class Notificacion implements Enviable,Cancelable {
    private int id;
    private String destinatario;
    private String mensaje;
    private Prioridad prioridad;
    private Estado estado;

    public enum Prioridad {
        BAJA,
        MEDIA,
        ALTA
    }

    public enum Estado {
        PENDIENTE,
        ENVIADA,
        CANCELADA,
        FALLIDA
    }

    public Notificacion(int id, String destinatario, String mensaje, Prioridad prioridad, Estado estado) {
        this.id = id;
        this.destinatario = destinatario;
        this.mensaje = mensaje;
        this.prioridad = prioridad;
        this.estado = estado;
    }
    @Override
    public abstract void enviar();

    @Override
    public boolean cancelar() {
        if (getEstado() == Estado.ENVIADA || getEstado() == Estado.CANCELADA) {
            return false;
        }
        setEstado(Estado.CANCELADA);
        return true;
    }


    public int getId() {
        return id;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public String getMensaje() {
        return mensaje;
    }

    public Prioridad getPrioridad() {
        return prioridad;
    }

    public Estado getEstado() {
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

    public void setPrioridad(Prioridad prioridad) {
        this.prioridad = prioridad;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }
}