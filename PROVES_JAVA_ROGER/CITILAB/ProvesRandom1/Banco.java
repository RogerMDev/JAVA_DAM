import java.util.ArrayList;
import java.util.HashMap;

public class Banco {

    private HashMap<Integer, Cliente> mapaClientes = new HashMap<>();
    private HashMap<Integer, ArrayList<Cuenta>> mapaCuentas = new HashMap<>();
    

    public void anadirCliente(Cliente cliente){
        mapaClientes.put(cliente.getId(),cliente);
        mapaCuentas.put(cliente.getId(),new ArrayList<>());
    }

    public void crearCuentaParaCliente(int clienteID, Cuenta cuentaCliente) {
        if (mapaCuentas.containsKey(clienteID)) {
            mapaCuentas.get(clienteID).add(cuentaCliente);
        } else {
            System.out.println("⚠️ Cliente no encontrado. No se puede crear la cuenta.");
        }
    }

    public Cliente buscarCliente(int id) throws Exception{

        if (mapaClientes.containsKey(id)){
            return mapaClientes.get(id);
        } else {
            throw new Exception ("⚠️Cliente con id " + id + " no encontrado.");
        }
    }

    public ArrayList<Cuenta> obtenerCuentas(int id) throws Exception{

        if (mapaCuentas.containsKey(id)){
            return mapaCuentas.get(id);
        } else{
            throw new Exception ("No se ha encontrado un cliente con id: " + id);
        }
    }

    //FALTAN DOS FUNCIONES 

}
