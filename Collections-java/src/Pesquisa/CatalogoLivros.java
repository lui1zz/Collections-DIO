package Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
 
    
    private List<Livro> livrolist;

    public CatalogoLivros(){
        this.livrolist = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao){
        livrolist.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor){
        List<Livro> livrosPorAutor = new ArrayList<>();
        if (!livrolist.isEmpty()){
            for (Livro l : livrolist){
                if (l.getAutor().equalsIgnoreCase(autor)) {
                    livrosPorAutor.add(l);
                }
            }
        }
        return livrosPorAutor;
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
        List<Livro> livrosPorIntervaloAnos = new ArrayList<>();
        if (!livrolist.isEmpty()){
            for (Livro l : livrolist){
                if (l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao()<= anoFinal) {
                    livrosPorIntervaloAnos.add(l);
                }
            }
        }
        return livrosPorIntervaloAnos;

    }


    public Livro pesquisarPorTitulo(String titulo){
        Livro livroPorTitulo = null;
        if (!livrolist.isEmpty()){
            for (Livro l : livrolist){
                if (l.getTitulo().equalsIgnoreCase(titulo)) {
                    livroPorTitulo = l;
                    break;
                }
            }
        }
        return livroPorTitulo;
    }


}
