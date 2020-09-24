package practico7;

import java.util.*;

public class DirectorioTelefonico {
    Map<Long, Cliente> directorio= new HashMap<>();
    
    public void agregarCliente(long telefono, Cliente cliente){
        directorio.put(telefono, cliente);
    }
    public Cliente buscarCliente(long telefono){
        if(directorio.containsKey(telefono)){
            return directorio.get(telefono);
        }
        else {
            return null;
        }
    }
    public Set<Long> buscarTelefono(String apellido){
        Set<Long> telefonos = new HashSet<>();
        for(long telefono : directorio.keySet()){
            Cliente c=directorio.get(telefono);
            if(c.getApellido().equals(apellido)){
                telefonos.add(telefono);
            }
        }
        return telefonos;
    }
    public List<Cliente> buscarCiudad(String ciudad){
        List<Cliente> ciudades = new ArrayList<>();
        for(long telefono : directorio.keySet()){
            Cliente c=directorio.get(telefono);
            if(c.getCiudad().equals(ciudad)){
                ciudades.add(c);
            }
        }
        return ciudades;
    }
    public void borrarCliente(long doc){
        long key = 0;
        for(long telefono : directorio.keySet()){
            Cliente c=directorio.get(telefono);
                if(c.getDni() == doc){
                    key = telefono;
            } 
        }
        directorio.remove(key);
    }
}

