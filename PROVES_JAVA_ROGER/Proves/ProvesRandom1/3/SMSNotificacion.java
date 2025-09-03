import java.util.ArrayList;

public class SMSNotificacion extends Notificacion {

    // Lista negra de números bloqueados
    private ArrayList<String> listaNegra = new ArrayList<>();

    public SMSNotificacion(int id, String destinatario, String mensaje, Prioridad prioridad, Estado estado) {
        super(id, destinatario, mensaje, prioridad, estado);
    }

    public void anadirAListaNegra(String numeroAListaNegra) {
        listaNegra.add(numeroAListaNegra);
    }

    @Override
    public void enviar() {
        System.out.println("Se ha enviado una notificación SMS a " + getDestinatario() +
                " con el siguiente mensaje: " + getMensaje());
        System.out.println("ID: " + getId() +
                " Prioridad: " + getPrioridad() +
                " Estado: " + getEstado());
        System.out.println("-------------");
        setEstado(Estado.ENVIADA); // Marcamos como enviada
    }

    @Override
    protected boolean validar() {
        String numero = getDestinatario();

        // 1. Comprobar que no sea null
        if (numero == null) {
            return false;
        }

        // 2. Comprobar longitud exacta (ejemplo: 9 dígitos para móvil nacional sin prefijo)
        if (numero.length() != 9) {
            return false;
        }

        // 3. Comprobar que solo tenga dígitos
        if (!numero.matches("\\d+")) {
            return false;
        }

        // 4. Comprobar que no esté en la lista negra
        if (listaNegra.contains(numero)) {
            return false;
        }

        return true;
    }
}
