import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class ExemploSet {
    public ExemploSet() {
    }

    public static void main(String[] args) {
        System.out.println("Crie um conjunto e adicione as notas: ");
        Set<Double> notas = new HashSet(Arrays.asList(7.0D, 8.5D, 9.3D, 5.0D, 7.0D, 0.0D, 3.6D));
        System.out.println(notas.toString());
        System.out.println("Confira se a nota 5.0 está no conjunto: " + notas.contains(5.0D));
        System.out.println("Exiba a menor nota: " + Collections.min(notas));
        System.out.println("Exiba a maior nota: " + Collections.max(notas));
        Iterator<Double> iterator = notas.iterator();

        Double soma;
        Double next;
        for(soma = 0.0D; iterator.hasNext(); soma = soma + next) {
            next = (Double)iterator.next();
        }

        System.out.println("Exiba a soma dos valores: " + soma);
        System.out.println("Exiba a média das notas: " + soma / (double)notas.size());
        System.out.println("Remova a nota 0: ");
        notas.remove(0.0D);
        System.out.println(notas);
        System.out.println("Remova as notas menores que 7 e exiba a lista: ");
        Iterator iterator1 = notas.iterator();

        while(iterator1.hasNext()) {
            Double next = (Double)iterator1.next();
            if (next < 7.0D) {
                iterator1.remove();
            }
        }

        System.out.println(notas);
        System.out.println("Exiba todas as notas na ordem em que foram informados: ");
        Set<Double> notas2 = new LinkedHashSet();
        notas2.add(7.0D);
        notas2.add(8.5D);
        notas2.add(9.3D);
        notas2.add(5.0D);
        notas2.add(7.0D);
        notas2.add(0.0D);
        notas2.add(3.6D);
        System.out.println(notas2);
        System.out.println("Exiba todas as notas na ordem crescente: ");
        Set<Double> notas3 = new TreeSet(notas2);
        System.out.println(notas3);
        System.out.println("Apague todo o conjunto");
        notas.clear();
        System.out.println("Confira se o conjunto está vazio: " + notas.isEmpty());
        System.out.println("Confira se o conjunto 2 está vazio: " + notas2.isEmpty());
        System.out.println("Confira se o conjunto 3 está vazio: " + notas3.isEmpty());
    }
}
