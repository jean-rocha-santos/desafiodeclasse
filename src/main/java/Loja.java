public class Loja {
    private String nomeLoja;
    private Integer qtdVendas;
    private Integer qtdMetaVendas;
    private Double valorTotalVendas;

    public Loja(Integer qtdVendas,
                Double valorTotalVendas) {
        this.qtdMetaVendas = 0;
        this.nomeLoja ="";
    }

    public Loja() {
        this(0,
                0.0);
    }

    public void realizarVenda(Double valorVenda) {
        valorTotalVendas += valorVenda;
        qtdVendas++;
    }

    public void realizarVenda(Double valorVenda,
                              Double valorDesconto) {
        valorVenda = ((valorVenda * valorDesconto) / 100) + valorVenda;
        valorTotalVendas += valorVenda;
        qtdVendas++;
    }

    public Boolean verificarMeta() {
        return qtdMetaVendas > qtdVendas;
    }

    @Override
    public String toString() {
        if (verificarMeta()) {
            return "Parabens, vc bateu a meta de " + qtdMetaVendas + " quantidade de vendas";
        } else {
            return "Que pena, você não bateu a meta de " + qtdMetaVendas + " quantidade de vendas";
        }
    }

    public String getNomeLoja() {
        return nomeLoja;
    }

    public void setNomeLoja(String nomeLoja) {
        this.nomeLoja = nomeLoja;
    }

    public Integer getQtdVendas() {
        return qtdVendas;
    }

    public void setQtdVendas(Integer qtdVendas) {
        this.qtdVendas = qtdVendas;
    }

    public Integer getQtdMetaVendas() {
        return qtdMetaVendas;
    }

    public void setQtdMetaVendas(Integer qtdMetaVendas) {
        this.qtdMetaVendas = qtdMetaVendas;
    }

    public Double getValorTotalVendas() {
        return valorTotalVendas;
    }

    public void setValorTotalVendas(Double valorTotalVendas) {
        this.valorTotalVendas = valorTotalVendas;
    }
}
