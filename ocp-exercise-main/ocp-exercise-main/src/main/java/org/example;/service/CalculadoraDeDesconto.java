package org.example.service;

import org.example.model.Pedido;
import org.example.service.discount.Desconto;
import org.example.service.discount.DescontoFactory;

public class CalculadoraDeDesconto {

    public Pedido CalcularDesconto(Pedido pedido) {

        Desconto tipoDesconto = DescontoFactory.criarDesconto(pedido.getDesconto());

        var valorLimpo = tipoDesconto.calcular(pedido.getValorBruto());

        pedido.setValorLimpo(valorLimpo);

        return pedido;
    }
}
