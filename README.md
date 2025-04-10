# 💡 Aprendendo Enum em Java

Este repositório contém uma implementação prática de enumerações (`enum`) em Java, com foco em boas práticas, encapsulamento de regras de negócio e legibilidade.

## 📌 Descrição

O desafio consiste em modelar o comportamento de uma **Nota Fiscal** com estados distintos (`NAO_EMITIDA`, `EMITIDA`, `CANCELADA`) usando `enum`, substituindo parâmetros booleanos e centralizando regras dentro do próprio `enum`.

## 📁 Estrutura

- `StatusNotaFiscal.java`: enum que define os estados da nota fiscal e suas regras de transição.
- `NotaFiscal.java`: classe que representa a nota fiscal, interagindo com o `enum`.
