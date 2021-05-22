package br.com.impacta.models;

public class Produto {

    public int codigo ;
    public String descricao; 
    public Double valor;
		
    public String montarResumo(Produto prod){

        String resumo = "codigo: "      + prod.codigo + 
                        ", descricao: "  + prod.descricao + 
                        ", valor: "      + prod.valor ;
        
        return resumo;
    } 

}