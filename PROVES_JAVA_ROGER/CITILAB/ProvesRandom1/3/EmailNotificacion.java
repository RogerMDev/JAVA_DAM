public class EmailNotificacion extends Notificacion{

public EmailNotificacion(int id, String destinatario, String mensaje, Prioridad prioridad, Estado estado){
    super(id, destinatario, mensaje, prioridad, estado);
}


@Override
    public void enviar(){
    System.out.print("Se ha enviado una notificación sobre un Email a " + getDestinatario() + 
    " con el siguiente mensaje: " + getMensaje());
    System.out.println();
    System.out.println("ID: " + getId() +
    " Prioridad: " + getPrioridad() +
    " Estado: " + getEstado());
    System.out.println("-------------");
    }

@Override
    protected boolean validar(){
        return getDestinatario().contains("@");
    }
 
}