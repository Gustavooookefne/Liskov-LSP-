package org.example.service.discount;

public class SazonalDesconto implements org.example.service.discount.Desconto {

    @Override
    public double calcular(double valorBruto) {
        return valorBruto * 0.95;
    }
}
