package Problem;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Problem problemInstance = new Problem(15, 42, 10, 1);
        System.out.println("Liczba rodzajów przedmiotów: " + problemInstance.getNum_of_items());
        System.out.println("Ziarno losowania: " + problemInstance.getSeed());
        System.out.println("Dolny zakres: " + problemInstance.getDolnaGranica());
        System.out.println("Górny zakres: " + problemInstance.getGornaGranica());
        System.out.println("Lista przedmiotów: " + problemInstance.getItemList());

        Wynik wynik = problemInstance.Solve(20);

        System.out.println(wynik.toString());
    }
}