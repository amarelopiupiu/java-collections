import java.io.PrintStream;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.Map.Entry;

public class ExercicioProposto01 {
    public ExercicioProposto01() {
    }

    public static void main(String[] args) {
        System.out.println("Crie um dicionário que relacione os estados e suas respectivas populações: ");
        Map<String, Integer> populaçãoEstadosNE = new HashMap<String, Integer>() {
            {
                this.put("PE", 9616621);
                this.put("AL", 3351543);
                this.put("CE", 9187103);
                this.put("RN", 3534265);
            }
        };
        System.out.println(populaçãoEstadosNE);
        System.out.println("Substitua a população do estado RN por : 3.534.165");
        populaçãoEstadosNE.put("RN", 3534165);
        System.out.println(populaçãoEstadosNE);
        System.out.println("Confira se o estado da Paraíba (PB) tucson está no dicionário, caso não, adicione PB - 4.039.277: ");
        populaçãoEstadosNE.put("PB", 4039277);
        System.out.println(populaçãoEstadosNE);
        System.out.println("Exiba a população do estado PE: " + populaçãoEstadosNE.get("PE"));
        System.out.println("Exiba todos os estados e suas populaçãos na ordem em que foram informados: ");
        Map<String, Integer> populaçãoEstadosNE2 = new LinkedHashMap<String, Integer>() {
            {
                this.put("PE", 9616621);
                this.put("AL", 3351543);
                this.put("CE", 9187103);
                this.put("RN", 3534265);
                this.put("PB", 4039277);
            }
        };
        System.out.println(populaçãoEstadosNE2);
        System.out.println("Exiba todos os estados e suas populações na ordem alfabética: ");
        Map<String, Integer> populaçãoEstadosNE3 = new TreeMap(populaçãoEstadosNE);
        System.out.println(populaçãoEstadosNE3);
        Collection<Integer> populacao = populaçãoEstadosNE.values();
        String estadoMaiorPopulacao = "";
        String estadoMenorPopulacao = "";
        Iterator var7 = populaçãoEstadosNE.entrySet().iterator();

        while(var7.hasNext()) {
            Entry<String, Integer> entry = (Entry)var7.next();
            if (((Integer)entry.getValue()).equals(Collections.max(populacao))) {
                estadoMaiorPopulacao = (String)entry.getKey();
            }

            if (((Integer)entry.getValue()).equals(Collections.min(populacao))) {
                estadoMenorPopulacao = (String)entry.getKey();
            }
        }

        System.out.printf("Exiba o estado com o menor população (%s) e seu respectivo valor (%d)\n", estadoMenorPopulacao, Collections.min(populacao));
        System.out.printf("Exiba o estado com a maior população (%s) e seu respectivo valor (%d)\n", estadoMaiorPopulacao, Collections.max(populacao));
        int soma = 0;

        for(Iterator iterator = populaçãoEstadosNE.values().iterator(); iterator.hasNext(); soma += (Integer)iterator.next()) {
        }

        System.out.println("Exiba a soma da população desses estados: " + soma);
        PrintStream var10000 = System.out;
        int var10001 = soma / populaçãoEstadosNE.size();
        var10000.println("Exiba a média da população deste dicionário de estados: " + var10001);
        System.out.println("Remova os estados com a população menor que 4.000.000: ");
        Iterator iterator1 = populaçãoEstadosNE.values().iterator();

        while(iterator1.hasNext()) {
            if ((Integer)iterator1.next() <= 4000000) {
                iterator1.remove();
            }
        }

        System.out.println(populaçãoEstadosNE);
        System.out.println("Apague o dicionario de estados com suas respectivas populações estimadas: ");
        populaçãoEstadosNE.clear();
        System.out.println(populaçãoEstadosNE);
        System.out.println("Confira se a lista está vazia: " + populaçãoEstadosNE.isEmpty());
    }
}
