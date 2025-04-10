public enum StatusNotaFiscal {
    NAO_EMITIDA {
        @Override
        public StatusNotaFiscal emitir(double valor) {
            return EMITIDA;
        }

        @Override
        public StatusNotaFiscal cancelar(double valor) {
            return CANCELADA;
        }

        @Override
        public String getDescricao() {
            return "Nao emitida";
        }
    }, EMITIDA {
        @Override
        public StatusNotaFiscal emitir(double valor) {
            throw new IllegalStateException("Nota fiscal Emitida, nao pode ser emitida novamente");
        }

        @Override
        public StatusNotaFiscal cancelar(double valor) {
            if(valor >= 1000){
                throw new IllegalStateException("Nota fiscal no valor acima de 1000 reais nao podem ser canceladas");
            }

            return CANCELADA;
        }

        @Override
        public String getDescricao() {
            return "Emitida";
        }
    }, CANCELADA {
        @Override
        public StatusNotaFiscal emitir(double valor) {
            throw new IllegalStateException("Nota fiscal Cancelada, nao pode ser emitida");
        }

        @Override
        public StatusNotaFiscal cancelar(double valor) {
            throw new IllegalStateException("Nota fiscal Cancelada, nao pode ser cancelada");
        }

        @Override
        public String getDescricao() {
            return "Cancelada";
        }
    };


    public abstract StatusNotaFiscal emitir(double valor);
    public abstract StatusNotaFiscal cancelar(double valor);
    public abstract String getDescricao();

}
