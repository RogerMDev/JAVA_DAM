public class EmailNotificacion extends Notificacion{

public EmailNotificacion(int id, String destinatario, String mensaje, int prioridad, String estado){
    super(id, destinatario, mensaje, prioridad, estado);
}



@Override
public void enviar(){
    System.out.println("Se ha enviado una notificación sobre un Email a " + getDestinatario() + 
    " con el siguiente mensaje: " + getMensaje() + 
    " ID: " + getId() +
    " Prioridad: " + getPrioridad() +
    " Estado: " + getEstado());
    }
}