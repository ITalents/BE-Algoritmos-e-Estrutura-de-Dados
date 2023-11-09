package Projeto;

import java.util.List;

public class Pizza {
    private List<String> sabores;
    private double preco;
    private TamanhoPizza tamanho;

    public enum TamanhoPizza{
        BROTO,
        GRANDE,
        GIGA;

        public static TamanhoPizza getByIndex(int index){
            TamanhoPizza[] tamanhos = TamanhoPizza.values();
            if (index >= 0 && index < tamanhos.length) {
                return tamanhos[index];
            }else{
                throw new IllegalArgumentException("Posição incorreta do index");
            }
        }
    }

    public Pizza(List<String> sabores, double preco, TamanhoPizza tamanho){
        this.sabores = sabores;
        this.preco = preco;
        this.tamanho = tamanho;
    }

    public List<String> getSabores(){
        return sabores;
    }

    public double getPreco(){
        return preco;
    }

    public TamanhoPizza getTamanho(){
        return tamanho;
    }

    public void setSabores(List<String> sabores){
        this.sabores = sabores;
    }

    public void setPreco(double preco){
        this.preco = preco;
    }

    public void setTamanho(TamanhoPizza tamanho){
        this.tamanho = tamanho;
    }
    
}
