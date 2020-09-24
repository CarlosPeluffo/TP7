package practico7;

public class Practico7 {

    public static void main(String[] args) {
        Cliente a=new Cliente("Carlos", "Peluffo", "VM","Potosi 375", 37505706);
        Cliente b=new Cliente("Bruno", "Oviedo", "VM","Lamadrir 1815", 38497121);
        Cliente c=new Cliente("Cintia", "Bazan","SL", "Balcarse 812", 32680487);
        Cliente d=new Cliente("Carlos", "Solari", "VM","25 de mayo 178", 29457801);
        DirectorioTelefonico direc= new DirectorioTelefonico();
        direc.agregarCliente(265730276, a);
        direc.agregarCliente(265730286, d);
        direc.agregarCliente(265735467, c);
        direc.agregarCliente(265722487, b);
        System.out.println(direc.buscarCliente(265730276));
        System.out.println(direc.buscarTelefono("Peluffo"));
        System.out.println(direc.buscarCiudad("VM"));
        direc.borrarCliente(37505706);
        System.out.println(direc.buscarTelefono("Peluffo"));
    }
    
}
