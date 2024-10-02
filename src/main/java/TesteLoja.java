public class TesteLoja {
    public static void main(String[] args) {
        Loja loja =new Loja();
        loja.setValorTotalVendas(0.0);
        loja.setQtdVendas(0);
        loja.setNomeLoja("Quitanda do seu Zé");
        loja.setQtdMetaVendas(10);
        loja.realizarVenda(10.0);
        loja.realizarVenda(15.0,10.0);
        loja.verificarMeta();
        System.out.println(loja);

    }
}
