public class Main {
    public static void main(String[] args) {
        NotaFiscal tenis = new NotaFiscal(123, "Tenis Nike", 990);
        System.out.println(tenis.getDescricaoCompleta());

        tenis.emitir(tenis.getValor());
        System.out.println(tenis.getDescricaoCompleta());

        tenis.cancelar(tenis.getValor());
        System.out.println(tenis.getDescricaoCompleta());


        NotaFiscal nf = new NotaFiscal(123, "Macbook Pro", 18_000);
        System.out.println(nf.getDescricaoCompleta());

        nf.emitir(nf.getValor());
        System.out.println(nf.getDescricaoCompleta());

        nf.cancelar(nf.getValor()); // IllegalStateException
        System.out.println(nf.getDescricaoCompleta());
    }

}
