package sentenciaif.elsehombreomujer;
import java.util.*;
public class SentenciaIfElsehombreomujer {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String sexo;
        System.out.print("Digita si eres homnre o mujer: ");
        sexo=entrada.nextLine();
        if("mujer".equals(sexo)||("Mujer".equals(sexo))){
            System.out.println("Eres del sexo femenino, eres "+sexo);
        }
        else if("hombre".equals(sexo)||("Hombre".equals(sexo))){
            System.out.println("Eres del sexo masculino, eres "+sexo);
        }
        else{
            System.out.println("Es un sexo indistinto");
        }
    }
}

