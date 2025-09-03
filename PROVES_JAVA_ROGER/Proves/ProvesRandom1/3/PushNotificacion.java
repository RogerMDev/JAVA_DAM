public class PushNotificacion extends Notificacion {

    public PushNotificacion(int id, String destinatario, String mensaje, Prioridad prioridad, Estado estado){
        super(id, destinatario, mensaje, prioridad, estado);
    }

    @Override
    public void enviar(){
    System.out.print("Se ha enviado una notificación sobre un Push a " + getDestinatario() + 
    " con el siguiente mensaje: " + getMensaje());
    System.out.println();
    System.out.println("ID: " + getId() +
    " Prioridad: " + getPrioridad() +
    " Estado: " + getEstado());
    System.out.println("-------------");
    }
}
