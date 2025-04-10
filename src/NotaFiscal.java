public class NotaFiscal {

    private final Integer numero;
    private final String descricao;
    private final double valor;
    private StatusNotaFiscal status = StatusNotaFiscal.NAO_EMITIDA;

    public NotaFiscal(Integer numero, String descricao, double valor) {
        this.numero = numero;
        this.descricao = descricao;
        this.valor = valor;
    }

    public Integer getNumero() {
        return numero;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getValor() {
        return valor;
    }

    public StatusNotaFiscal getStatus() {
        return status;
    }

    public void cancelar(double valor) {
        status = status.cancelar(valor);
    }

    public void emitir(double valor) {
      status = status.emitir(valor);
    }

    public String getDescricaoCompleta() {

        return String.format("Nota fiscal #%d (%s) no valor de R$%.2f está %s",
                getNumero(), getDescricao(), getValor(), status.getDescricao());
    }

}