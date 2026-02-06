package org.example.service.discount;

public class AniversarioDesconto implements org.example.service.discount.Desconto {

    @Override
    public double calcular(double valorBruto) {
        return valorBruto * 0.8;
    }
}
