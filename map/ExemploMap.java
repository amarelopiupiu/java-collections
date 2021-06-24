import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

public class ExemploMap {
    public ExemploMap() {
    }

    public static void main(String[] args) {
        System.out.println("Crie um dicionário que relacione os modelos e seus respectivos consumos: ");
        Map<String, Double> carrosPopulares = new HashMap<String, Double>() {
            {
                this.put("gol", 14.4D);
                this.put("uno", 15.6D);
                this.put("mobi", 16.1D);
                this.put("hb20", 14.5D);
                this.put("kwid", 15.6D);
            }
        };
        System.out.println(carrosPopulares.toString());
        System.out.println("Substitua o consumo do gol por 15,2 km/l: ");
        carrosPopulares.put("gol", 15.2D);
        System.out.println(carrosPopulares);
        System.out.println("Confira se o modelo tucson está no dicionário: " + carrosPopulares.containsKey("tucson"));
        System.out.println("Exiba o consumo do uno: " + carrosPopulares.get("uno"));
        System.out.println("Exiba os modelos: ");
        Set<String> modelos = carrosPopulares.keySet();
        System.out.println(modelos);
        System.out.println("Exiba os consumos dos carros: ");
        Collection<Double> consumos = carrosPopulares.values();
        System.out.println(consumos);
        System.out.println("Exiba o modelo mais econômico e seu consumo: ");
        Double consumoMaisEficiente = (Double)Collections.max(carrosPopulares.values());
        Set<Entry<String, Double>> entries = carrosPopulares.entrySet();
        String modeloMaisEficiente = "";
        Iterator var7 = entries.iterator();

        while(var7.hasNext()) {
            Entry<String, Double> entry = (Entry)var7.next();
            if (((Double)entry.getValue()).equals(consumoMaisEficiente)) {
                modeloMaisEficiente = (String)entry.getKey();
                System.out.println("Modelo mais eficiente: " + modeloMaisEficiente + " - " + consumoMaisEficiente);
            }
        }

        System.out.println("Exiba o modelo menos econômico e seu consumo: ");
        Double consumoMenosEficiente = (Double)Collections.min(carrosPopulares.values());
        String modeloMenosEficiente = "";
        Iterator iterator = carrosPopulares.entrySet().iterator();

        while(iterator.hasNext()) {
            Entry<String, Double> entry = (Entry)iterator.next();
            if (((Double)entry.getValue()).equals(consumoMenosEficiente)) {
                modeloMenosEficiente = (String)entry.getKey();
                System.out.println("Modelo menos eficiente: " + modeloMenosEficiente + " - " + consumoMenosEficiente);
            }
        }

        iterator = carrosPopulares.values().iterator();

        Double soma;
        for(soma = 0.0D; iterator.hasNext(); soma = soma + (Double)iterator.next()) {
        }

        System.out.println("Exiba a soma dos consumos: " + soma);
        System.out.println("Exiba a média dos consumos deste dicionário de carros: " + soma / (double)carrosPopulares.size());
        System.out.println(carrosPopulares);
        System.out.println("Remova os modelos com o consumo igual a 15,6 km/l: ");
        Iterator iterator1 = carrosPopulares.values().iterator();

        while(iterator1.hasNext()) {
            if (((Double)iterator1.next()).equals(15.6D)) {
                iterator1.remove();
            }
        }

        System.out.println(carrosPopulares);
        System.out.println("Exiba todos os carros na ordem em que foram informados: ");
        Map<String, Double> carrosPopulares1 = new LinkedHashMap<String, Double>() {
            {
                this.put("gol", 14.4D);
                this.put("uno", 15.6D);
                this.put("mobi", 16.1D);
                this.put("hb20", 14.5D);
                this.put("kwid", 15.6D);
            }
        };
        System.out.println(carrosPopulares1.toString());
        System.out.println("Exiba o dicionário ordenado pelo modelo: ");
        Map<String, Double> carrosPopulares2 = new TreeMap(carrosPopulares1);
        System.out.println(carrosPopulares2.toString());
        System.out.println("Apague o dicionario de carros: ");
        carrosPopulares.clear();
        System.out.println("Confira se o dicionário está vazio: " + carrosPopulares.isEmpty());
    }
}
