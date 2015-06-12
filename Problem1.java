package pruebas;
import java.util.ArrayList;
import java.util.List;

public class Problem1 {
    public static String numero="1";
    public static void main(String[] args) {
        System.out.println(""+numero);
        for(int i=0;i<20 ;i++){
            numero = (creaRenglon(numero));
        }
    }
    
    public static String creaRenglon(String renglon){
        String n="";
        int c=0;
        String nuevoRenglon="";
        List<String> row= new ArrayList<String>();
        for(int i=0;i<renglon.length();i++){
            row.add(i,Character.toString(renglon.charAt(i)));
            if(i==0){
                n=Character.toString(renglon.charAt(i));
                c=0;
            }
        }
        for(int j=0;j<=row.size();j++){
            if(j==row.size()){
                nuevoRenglon+= String.valueOf(c)+String.valueOf(n);
                break;
            }else{
                if(!row.get(j).equalsIgnoreCase(n)){
                    nuevoRenglon+= String.valueOf(c)+String.valueOf(n);
                    n=row.get(j);
                    c=0;
                }if(row.get(j).equalsIgnoreCase(n)){
                c++;
                }
            }
            
        }
        System.out.println(nuevoRenglon);
        return nuevoRenglon;
    } 
}
