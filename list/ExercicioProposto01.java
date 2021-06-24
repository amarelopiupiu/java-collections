import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ExercicioProposto01 {
    public ExercicioProposto01() {
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Double> temperaturasSemestral = new ArrayList();
        double soma = 0.0D;

        for(int i = 1; i <= 6; ++i) {
            System.out.print("Qual a temperatura do mês " + i + ": ");
            double temp = scan.nextDouble();
            temperaturasSemestral.add(temp);
            soma += temp;
        }

        double mediaTemperaturasSemenstral = soma / (double)temperaturasSemestral.size();
        System.out.println("Temperaturas Semestral: " + temperaturasSemestral);
        System.out.println("Média temperaturas Semestral: " + mediaTemperaturasSemenstral + "oC");
        System.out.println("----------");
        Iterator var7 = temperaturasSemestral.iterator();

        while(var7.hasNext()) {
            Double temp = (Double)var7.next();
            if (temp > mediaTemperaturasSemenstral) {
                int index = temperaturasSemestral.indexOf(temp);
                switch(index) {
                case 0:
                    System.out.println(index + 1 + " - JANEIRO: " + temp + " oC");
                    break;
                case 1:
                    System.out.println(index + 1 + " - FEVEREIRO: " + temp + " oC");
                    break;
                case 2:
                    System.out.println(index + 1 + " - MARÇO: " + temp + " oC");
                    break;
                case 3:
                    System.out.println(index + 1 + " - ABRIL: " + temp + " oC");
                    break;
                case 4:
                    System.out.println(index + 1 + " - MAIO: " + temp + " oC");
                    break;
                case 5:
                    System.out.println(index + 1 + " - JUNHO: " + temp + " oC");
                }
            }
        }

    }
}