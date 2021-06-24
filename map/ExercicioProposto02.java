import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Map.Entry;

public class ExercicioProposto02 {
    public ExercicioProposto02() {
    }

    public static void main(String[] args) {
        int quantLancamentos = 100;
        List<Integer> valores = new ArrayList();
        Random geradorDeLancamento = new Random();

        int i;
        for(int i = 0; i < quantLancamentos; ++i) {
            i = geradorDeLancamento.nextInt(6) + 1;
            valores.add(i);
        }

        Map<Integer, Integer> lancamentos = new HashMap();
        Iterator var9 = valores.iterator();

        while(var9.hasNext()) {
            Integer resultado = (Integer)var9.next();
            if (lancamentos.containsKey(resultado)) {
                lancamentos.put(resultado, (Integer)lancamentos.get(resultado) + 1);
            } else {
                lancamentos.put(resultado, 1);
            }
        }

        System.out.print("Jogando");

        for(i = 0; i < 3; ++i) {
            try {
                Thread.sleep(3000L);
                System.out.print(".");
            } catch (InterruptedException var7) {
                var7.printStackTrace();
            }
        }

        System.out.println("\nValor  Quant. de vezes");
        var9 = lancamentos.entrySet().iterator();

        while(var9.hasNext()) {
            Entry<Integer, Integer> entry = (Entry)var9.next();
            System.out.printf("%3d %10d\n", entry.getKey(), entry.getValue());
        }

    }
}
