package exercicio01;

public class Carro {
    private String marca;
    private String modelo;
    private String ano;

    public Carro(String marca, String modelo, String ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getAno() {
        return ano;
    }
}
