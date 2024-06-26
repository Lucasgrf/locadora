package model;


public class Endereco {
    private int id;
    private String logradouro;
    private String tipoLogradouro;
    private String complemento;
    private String cidade;
    private String uf;
    private String cep;
    private String numero;
    private String bairro;
    private static int contador;

    public Endereco() {
    }

    public Endereco(int id, String logradouro, String tipoLogradouro, String complemento,
                    String cidade, String uf, String cep, String numero, String bairro) {
        this.id = id;
        this.logradouro = logradouro;
        this.tipoLogradouro = tipoLogradouro;
        this.complemento = complemento;
        this.cidade = cidade;
        this.uf = uf;
        this.cep = cep;
        this.numero = numero;
        this.bairro = bairro;
    }

    public Endereco(String logradouro, String tipoLogradouro, String complemento,
                    String cidade, String uf, String cep, String numero, String bairro) {
        this.logradouro = logradouro;
        this.tipoLogradouro = tipoLogradouro;
        this.complemento = complemento;
        this.cidade = cidade;
        this.uf = uf;
        this.cep = cep;
        this.numero = numero;
        this.bairro = bairro;
    }

    public Endereco(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getTipoLogradouro() {
        return tipoLogradouro;
    }

    public void setTipoLogradouro(String tipoLogradouro) {
        this.tipoLogradouro = tipoLogradouro;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    @Override
    public String toString() {
        contador++;
        return "Endereco: " + String.format("%02d",contador) +
                "\nID: " + id +
                " | Logradouro: " + logradouro +
                " | Tipo_Logradouro: " + tipoLogradouro +
                " | Complemento='" + complemento +
                " | Cidade='" + cidade +
                " | UF: " + uf +
                " | Cep='" + cep +
                " | Numero: " + numero +
                " | Bairro: " + bairro + "\n" ;
    }
}
