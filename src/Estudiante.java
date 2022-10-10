public class Estudiante {
    public String nombre;
    public int Promedio;
    int getCreditos(){
        if(Promedio < 11){
            return 16;
        }else if(Promedio <= 16){
            return 22;
           
        }
        return 27;
    }
    
}
