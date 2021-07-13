package br.com.alura.mvc.mudi.Model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Pedido {

    private String nomeProduto;

    private BigDecimal valorNegociado;

    private LocalDateTime dataDeEntrega;

    private String Descricao;

    private String urlProduto;

    private String urlImagem;

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public BigDecimal getValorNegociado() {
        return valorNegociado;
    }

    public void setValorNegociado(BigDecimal valorNegociado) {
        this.valorNegociado = valorNegociado;
    }

    public LocalDateTime getDataDeEntrega() {
        return dataDeEntrega;
    }

    public void setDataDeEntrega(LocalDateTime dataDeEntrega) {
        this.dataDeEntrega = dataDeEntrega;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String descricao) {
        Descricao = descricao;
    }

    public String getUrlProduto() {
        return urlProduto;
    }

    public void setUrlProduto(String urlProduto) {
        this.urlProduto = urlProduto;
    }

    public String getUrlImagem() {
        return urlImagem;
    }

    public void setUrlImagem(String urlImagem) {
        this.urlImagem = urlImagem;
    }
}
