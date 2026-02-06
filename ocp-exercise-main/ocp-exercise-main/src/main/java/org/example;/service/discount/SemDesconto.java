package org.example.service.discount;

public class SemDesconto implements org.example.service.discount.Desconto {

    @Override
    public double calcular(double valorBruto) {
        return valorBruto;
    }
}