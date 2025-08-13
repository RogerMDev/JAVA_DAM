public class main {
    public static void main(String[] args) {
        Notificador n = new Notificador();

        SMSNotificacion sms1 = new SMSNotificacion(0, "José", "HOLA JOSÉ BUENOS DIAS",Notificacion.Prioridad.ALTA,Notificacion.Estado.PENDIENTE);
        PushNotificacion push1 = new PushNotificacion(0, "Maria", "Debes actualizar el software", Notificacion.Prioridad.MEDIA, Notificacion.Estado.PENDIENTE);
        EmailNotificacion email1 = new EmailNotificacion(0, "rogermateom@gmail.com", "Buenos días Roger", Notificacion.Prioridad.ALTA, Notificacion.Estado.CANCELADA);

        n.procesar(sms1);
        n.procesar(push1);
        n.procesar(email1);


    }
}
