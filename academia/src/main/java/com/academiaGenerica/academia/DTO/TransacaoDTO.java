package com.academiaGenerica.academia.DTO;

public record TransacaoDTO(String razaoPagamento, Long cpfDoRecebedor, 
Long cpfDoEnviador, double valorDoPagamento, long idTransaction) {
}
