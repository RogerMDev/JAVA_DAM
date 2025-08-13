
public class main {
    public static void main(String[] args) {
        Notificador n = new Notificador();

        SMSNotificacion sms1 = new SMSNotificacion(0, "José", "HOLA JOSÉ BUENOS DIAS",1,"ENVIADO");
        PushNotificacion push1 = new PushNotificacion(0, "Maria", "Debes actualizar el software", 4, "ENVIADO");
        EmailNotificacion email1 = new EmailNotificacion(0, "rogermateom@gmail.com", "Buenos días Roger", 0, "ENVIADO");

        n.procesar(sms1);
        n.procesar(push1);
        n.procesar(email1);

        
    }
}
