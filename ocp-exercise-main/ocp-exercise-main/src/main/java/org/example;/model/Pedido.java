package org.example.model;

import lombok.Data;

@Data
public class Pedido {

    private String id;
    private double valorBruto;
    private double valorLimpo;
    private org.example.model.TipoDesconto desconto;
    private int quantidadeItens;
    private boolean isPago;
    private String emailCliente;

    public void setId(String number) {
    }

    public void setValorBruto(double v) {
    }

    public void setDesconto(org.example.model.TipoDesconto tipoDesconto) {
    }

    public void setPago(boolean b) {
    }

    public void setEmailCliente(String mail) {
    }

    public void setQuantidadeItens(int i) {
    }

    public org.example.model.TipoDesconto getDesconto() {
        return null;
    }

    public double getValorBruto() {
        return 0;
    }

    public void setValorLimpo(double valorLimpo) {
    }
}