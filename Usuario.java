public class Usuario {

    //propiedades de un objeto
    //para crear un objeto se cesetita una clase,  propiedades generales.
   private String nombre;
   private String apellido;
   private int edad;
   private int fechaNacimiento;

    //METODO CONSTRUCTOR
    public Usuario(String nombre, String apellido, int edad, int fechaNacimiento){
     this.nombre = nombre;
     this.apellido = apellido;
     this.edad = edad;
     this.fechaNacimiento = fechaNacimiento;
    }


    //METODO GETTS
    public int getEdad(){                //edad
        return this.edad;
    }

    public String getnombre(){           //nombre
        return this.nombre;
    }

    public String getapellido(){         //apellido
        return this.apellido;
    }

    public int getfechaNacimiento(){     //fehca de nacimiento
        return this.fechaNacimiento;
    }


    //METODO SETS


    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setApellido (String apellido){
        this.apellido = apellido;
    }

    public void setEdad(int edad){
        this.edad = edad;
    }

    public void setFEchaNacimiento(int fechaNacimiento){
        this.fechaNacimiento = fechaNacimiento;
    }



    //metodos (para que se muestre en consola)
   public void mostrarDatos () {
    System.out.println("Nombre: " + nombre);
    System.out.println("Apellidos: " + apellido);
    System.out.println("Edad: " + edad);
    System.out.println("Fecha Nacimiento: " + fechaNacimiento);
   }
}