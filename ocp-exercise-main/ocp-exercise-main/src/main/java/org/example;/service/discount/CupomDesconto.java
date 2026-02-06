package org.example.service.discount;

public class CupomDesconto implements org.example.service.discount.Desconto {

    @Override
    public double calcular(double valorBruto) {
        return valorBruto * 0.9;
    }
}
