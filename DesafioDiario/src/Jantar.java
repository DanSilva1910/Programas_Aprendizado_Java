public class Jantar {

    public static void main(String[] args) {

        Pessoa p1 = new Pessoa("Danilo", 99.70);

        Comida c1 = new Comida("arroz", .300);
        Comida c2 = new Comida("feijão", .330);

        System.out.println(p1.apresetar());

        p1.comer(c1);

        System.out.println(p1.apresetar());

        p1.comer(c2);

        System.out.println(p1.apresetar());

    }

}
