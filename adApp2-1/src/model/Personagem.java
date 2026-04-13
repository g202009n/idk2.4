package model;

public class Personagem {

    private String nome;
    private String classe;
    private double vida;

    public Personagem(String nome, String classe, double vida) {
        this.nome = nome;
        this.classe = classe;

        if (vida < 0) {
            this.vida = 0.00;
        } else {
            this.vida = vida;
        }
    }

    public void curar(double valor) {
        if (valor > 0) {
            this.vida += valor;
        } else {
            System.out.println("Valor de cura inválido.");
        }
    }

    public void recDano(double valor) {
        if (valor > 0 && this.vida >= valor) {
            this.vida -= valor;
        } else {
            System.out.println("Vida insuficiente para receber o dano.");
        }
    }

    public double getVida() {
        return this.vida;
    }

    public String getNome() {
        return this.nome;
    }

    public String getClasse() {
        return this.classe;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public void setVida(double vida) {
        if (vida < 0) {
            this.vida = 0.00;
        } else {
            this.vida = vida;
        }
    }

    @Override
    public String toString() {
        return String.format(
            "Personagem: %s | Classe: %s | Vida: %.2f",
            nome, classe, vida
        );
    }
}