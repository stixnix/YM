/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ymMVC.dao;

import javax.swing.JOptionPane;
import ymMVC.model.YMmodel;

/**
 *
 * @author 291500474
 */
public class YMdao {

    public void incluir(YMmodel ym) {
        String sql = "INSERT INTO Livros (Descricao, valor, categoria, dia, parcela, pagamento) VALUES ("
                + " '" + ym.getDescricao() + "' ,  "
                + " " + ym.getValor() + " , "
                + " '" + ym.getCategoria() + "' , "
                + " " + ym.getDia() + "  , "
                + " " + ym.getParcela() + "  , "
                + " " + ym.getPagamento() + "  ) ";
        Conexao.executar(sql);
        JOptionPane.showMessageDialog(null, "Registro incluido com sucesso!!!");

    }
    
}
