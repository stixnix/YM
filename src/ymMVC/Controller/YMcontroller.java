/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ymMVC.Controller;

import ymMVC.model.YMmodel;

/**
 *
 * @author 291500474
 */
public class YMcontroller {
    public void incluir(String descricao, float valor, String categoria, String pagamento, String dia, int parcela ){
        if(!descricao.isEmpty() && valor != 0 && !categoria.isEmpty() && !pagamento.isEmpty() && !dia.isEmpty() && parcela !=0)
        {
        YMmodel ym = new YMmodel(descricao, valor, categoria, pagamento, dia, parcela);
        ym.incluir(ym);
    }
    }
}
