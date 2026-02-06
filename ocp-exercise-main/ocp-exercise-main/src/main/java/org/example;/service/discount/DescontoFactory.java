package org.example.service.discount;

import org.example.model.TipoDesconto;

public class DescontoFactory {

    public static org.example.service.discount.SemDesconto criarDesconto(TipoDesconto tipoDesconto) {

        if (tipoDesconto == null) {

            return new org.example.service.discount.SemDesconto();
        }

        return switch (tipoDesconto) {

            case CUPOM -> new org.example.service.discount.CupomDesconto();
            case VIP -> new org.example.service.discount.VipDesconto();
            case SAZONAL -> new org.example.service.discount.SazonalDesconto();
            case ANIVERSARIO -> new org.example.service.discount.AniversarioDesconto();

            default -> throw new IllegalArgumentException("Desconto de Tipo: " + tipoDesconto + " é inválido.");
        };
    }
}
