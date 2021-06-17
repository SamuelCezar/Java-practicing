/*
Crie uma conjunto contendo as cores do arco-íris e:
a) Exiba todas as cores o arco-íris uma abaixo da outra;
b) A quantidade de cores que o arco-íris tem;
c) Exiba as cores em ordem alfabética;
d) Exiba as cores na ordem inversa da que foi informada;
e) Exiba todas as cores que começam com a letra ”v”;
f) Remova todas as cores que não começam com a letra “v”;
g) Limpe o conjunto;
h) Confira se o conjunto está vazio;
 */

import java.util.*;

public class ExerciciosSetList {

    public static void main(String[] args) {
        Set<String> rainbow = new HashSet<>();
        rainbow.add("Azul");
        rainbow.add("Anil");
        rainbow.add("Violeta");
        rainbow.add("Amarelo");
        rainbow.add("Vermelho");
        rainbow.add("Verde");
        rainbow.add("Laranja");

        System.out.println("Exiba todas as cores o arco-íris uma abaixo da outra: ");
        for (String color : rainbow){
            System.out.println(color);
        }

        //--------------------------------//

        System.out.println("");
        System.out.println("A quantidade de cores que o arco-íris tem:");
        System.out.println(rainbow.size() + " cores.");

        //--------------------------------//

        System.out.println("");
        System.out.println("Exiba as cores em ordem alfabética:");
        List<String> sortedList = new ArrayList<>(rainbow);
        Collections.sort(sortedList);
        for (String color : sortedList){
            System.out.println(color);
        }

        //--------------------------------//

        System.out.println("");
        System.out.println("Exiba as cores na ordem inversa da que foi informada: \n");
        Set<String> rainbow1 = new LinkedHashSet<>(
                Arrays.asList("violeta", "anil", "azul", "verde", "amarelo", "laranja", "vermelho"));
        System.out.println(rainbow1);
        List<String> reverseColors = new ArrayList<>(rainbow1);
        Collections.reverse(reverseColors);
        System.out.println(reverseColors);

        //--------------------------------//

        System.out.println("");
        System.out.println("Exiba todas as cores que começam com a letra ”v”;");
        for(String cor : rainbow) {
            if (cor.startsWith("V")){
                System.out.println(cor);
            }
        }

        //--------------------------------//

        System.out.println("");
        System.out.println("Remova todas as cores que não começam com a letra “v”");
        for (Iterator<String> it = rainbow.iterator(); it.hasNext();){
            String letter = it.next();
            if (letter.startsWith("V")){
                it.remove();
            }
        }
        System.out.println(rainbow);

        //--------------------------------//

        System.out.println("");
        System.out.println("Limpe o conjunto.");
        rainbow.clear();
        System.out.println(rainbow);

        //--------------------------------//

        System.out.println("");
        System.out.println("Confira se o conjunto está vazio:");

        System.out.println(rainbow.isEmpty());
    }
}
