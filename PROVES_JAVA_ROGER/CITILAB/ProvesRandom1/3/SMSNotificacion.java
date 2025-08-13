public class SMSNotificacion extends Notificacion {
    
    public SMSNotificacion(int id, String destinatario, String mensaje, int prioridad, String estado){
        super(id, destinatario, mensaje, prioridad, estado);
    }

    @Override
    public void enviar(){
        
    }
}
