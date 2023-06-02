package br.com.SMCEA.Fabrica;

public class Fabrica implements ConsumoEletricidade, ConsumoAgua {
    private int idFabrica;
    private int idEnergiaRenovavel;
    private int idEnergiaEletrica;
    private int idConsumoAgua;
    private double valorConsumoAgua;
    private double valorConsumoEletricidade;
    static int quantFabricas;


    public Fabrica(int idFabrica) {
        this.idFabrica = idFabrica;
        quantFabricas +=1;
    }

    public void exibeFichaTecnica(){
        System.out.println(String.format(
                "Fábrica: %d%nConsumo de Água: %.2f%nConsumo de Eletricidade: %.2f%n",
                idFabrica, getValorConsumoAgua(), getValorConsumoEletricidade()
        ));
    }

    //getter & setter
    public int getIdFabrica() {
        return idFabrica;
    }

    public double getValorConsumoAgua() {
        return valorConsumoAgua;
    }

    public double getValorConsumoEletricidade() {
        return valorConsumoEletricidade;
    }

    public void setIdFabrica(int idFabrica) {
        this.idFabrica = idFabrica;
    }

    public int getIdEnergiaRenovavel() {
        return idEnergiaRenovavel;
    }

    public void setIdEnergiaRenovavel(int idEnergiaRenovavel) {
        this.idEnergiaRenovavel = idEnergiaRenovavel;
    }

    public int getIdEnergiaEletrica() {
        return idEnergiaEletrica;
    }

    public void setIdEnergiaEletrica(int idEnergiaEletrica) {
        this.idEnergiaEletrica = idEnergiaEletrica;
    }

    public int getIdConsumoAgua() {
        return idConsumoAgua;
    }

    public void setIdConsumoAgua(int idConsumoAgua) {
        this.idConsumoAgua = idConsumoAgua;
    }

    //interface
    @Override
    public double setvalorConsumoAgua(double valorAgua) {
        this.valorConsumoAgua = valorAgua;
        return this.valorConsumoAgua;
    }

    @Override
    public double setValorConsumoEletricidade(double valorEletricidade) {
        this.valorConsumoEletricidade = valorEletricidade;
        return this.valorConsumoEletricidade;
    }

    @Override
    public double getConsumoTotalEnergRenov() {
        return ConsumoEletricidade.super.getConsumoTotalEnergRenov();
    }


}

