public class Pessoa {

    String nomePessoa;
    double pesoPessoa;

    public Pessoa(String nomePessoa, double pesoPessoa) {

        this.nomePessoa = nomePessoa;
        this.pesoPessoa = pesoPessoa;
    }

    public void comer(Comida comida) {
        if (comida != null) {
            this.pesoPessoa += comida.pesoComida;
        }
    }

    String apresetar() {
        return "Olá eu sou o " + nomePessoa + " e tenho " + pesoPessoa + " kg.";
    }
}
