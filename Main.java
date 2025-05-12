public class Main {
    public static void main(String[] args) {
        //usuarios
        Usuario usuario1= new Usuario("Camila ", "Barrondo Gomez", 16, 2008);
        Usuario usuario2= new Usuario("Paula Izabel", "Mansilla Sandoval", 16, 2008);
   
        //metodos del objeto
        usuario1.setNombre("Nelson");
        usuario1.mostrarDatos();   
        usuario2.mostrarDatos();

        //USUARIO 1

        System.out.println(usuario1.getnombre());
        System.out.println(usuario1.getapellido());
        System.out.println(usuario1.getfechaNacimiento());
        System.out.println(usuario1.getEdad());

        if (usuario1.getEdad() >= 18) {
            System.out.println("Mayor de edad");
        }
        
        

        //USUARIO 2
        System.out.println(usuario2.getnombre());
        System.out.println(usuario2.getapellido());
        System.out.println(usuario2.getfechaNacimiento());
        System.out.println(usuario2.getEdad());
        if (usuario2.getEdad()>=18){
         System.out.println("El usuario es mayor de edad");
        }

    }
}

