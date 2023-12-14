/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ymMVC.model;

import ymMVC.dao.YMdao;

/**
 *
 * @author 291500474
 */
public class YMmodel {
    int idRegistros;
    String Descricao;
    float valor;
    String categoria;
    String pagamento;
    String dia;
    int parcela;
    float valorTotal;

    public int getIdRegistros() {
        return idRegistros;
    }

    public void setIdRegistros(int idRegistros) {
        this.idRegistros = idRegistros;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String Descricao) {
        this.Descricao = Descricao;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getPagamento() {
        return pagamento;
    }

    public void setPagamento(String pagamento) {
        this.pagamento = pagamento;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public int getParcela() {
        return parcela;
    }

    public void setParcela(int parcela) {
        this.parcela = parcela;
    }

    public float getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(float valorTotal) {
        this.valorTotal = valorTotal;
    }

    
    public YMmodel(String descricao, float valor, String categoria, String pagamento, String dia, int parcela) {
        this.Descricao = descricao;
        this.valor = valor;
        this.categoria = categoria;
        this.pagamento = pagamento;
        this.dia = dia;
        this.parcela = parcela;
    }

    public YMmodel(int idRegistros, String Descricao, float valor, String categoria, String pagamento, String dia, int parcela, float valorTotal) {
        this.idRegistros = idRegistros;
        this.Descricao = Descricao;
        this.valor = valor;
        this.categoria = categoria;
        this.pagamento = pagamento;
        this.dia = dia;
        this.parcela = parcela;
        this.valorTotal = valorTotal;
    }
    
    

    public void incluir(YMmodel ym) {
        YMdao yDAO = new YMdao();
        yDAO.incluir(ym);
   
    }
    
}
