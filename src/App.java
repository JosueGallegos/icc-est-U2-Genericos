import models.Persona;
import models.genericos.Caja;
import models.genericos.Par;

public class App {
    public static void main(String[] args) throws Exception {
       // System.out.println("Hello, World!");
        //Persona[] personas = new Persona[10];

        Persona[] personas = new Persona[10];

        for(int i=0; i<personas.length; i++) {
            personas[i] = new Persona();
            personas[i].setNombre("Persona " + i);
            personas[i].setEdad(i + 10);
        }


        personas[0].setDato("Alice",25);
        personas[1].setDato("Juan",15);
        personas[2].setDato("Maria",17);
        personas[3].setDato("MArio",20);
        personas[4].setDato("Jose",14);
        personas[5].setDato("David",10);
        personas[6].setDato("Andrea",17);
        personas[7].setDato("Fernando",20);
        personas[8].setDato("Pedro",19);
        personas[9].setDato("Jesus",26);

        System.out.println(personas);
        
        int personasMayores = 0;
        int personasMenores = 0;

        for(int i=0; i<personas.length; i++){
            if(personas[i].getEdad() >= 18){
                personasMayores++;
            }else{
                personasMenores++;
            }
        }
        Par<String,Integer>[] mayores = new Par[personasMayores];
        Par<Integer, String>[] menores = new Par[personasMenores];

        int contadorMayores=0;
        int contadorMenores=0; 

        for(int i=0; i<personas.length; i++){
            if(personas[i].getEdad() >= 18){
                mayores[contadorMayores] = new Par<String, Integer>();
                mayores[contadorMayores].establecerClave(personas[i].getNombre());
                mayores[contadorMayores].establecerValor(personas[i].getEdad());
                contadorMayores++;
            }else{
                menores[contadorMenores] = new Par<Integer, String>();
                menores[contadorMenores].establecerValor(personas[i].getNombre());
                menores[contadorMenores].establecerClave(personas[i].getEdad());
                contadorMenores++;
            }
        }
        System.out.println("Mayores  de edad");
        System.out.println("---------------------------------");
        for (Par<String,Integer> parr : mayores) {
            System.out.println(parr.obtenerClave()+" -- "+parr.obtenerValor());
        }
        System.out.println("Menores de edad");
        System.out.println("---------------------------------");
        for (Par<Integer,String> par3 : menores) {
            System.out.println(par3.obtenerValor()+" --- "+par3.obtenerClave());
        }


       /*Persona persona = new Persona("Alice", 25);
       persona.setNombre("Juan");
       persona.setEdad(25);
       System.out.println(persona);*/

       Caja<String> cajaString = new Caja<>();
       Caja<Integer> cajaInteger = new Caja<>();
       //Caja<Persona> cajaPersona = new Caja<>();

       cajaString.guardar("Guardar Un String");
       cajaInteger.guardar(10);
       //cajaPersona.guardar(persona);

       System.out.println(cajaString.getObjeto());
       System.out.println(cajaInteger.getObjeto());
       //System.out.println(cajaPersona.obtener(persona));

       Par<Integer, String> par1 = new Par<>();
       Par<String, Integer> par2 = new Par<>();

       par1.establecerClave(10);
       par1.establecerValor("25");

       par2.establecerValor(25);
       par2.establecerClave("2565");

       System.out.println(par1.obtenerClave());
       System.out.println(par1.obtenerValor());

       System.out.println(par2.obtenerClave());
       System.out.println(par2.obtenerValor());


       
        


       

    }
}
