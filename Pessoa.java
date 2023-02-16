public class Pessoa{
    
    private long codigo;
    private String nome;
    private String documento;
    private Momento nascimento;


    //CONSTRUTOR VAZIO
    public Pessoa(){

    }

    public Pessoa(long codigo, String nome, String documento, Momento nascimento){
        this.setCodigo(codigo);
        this.setNome(nome);
        this.setDocumento(documento);
        this.setNascimento(nascimento);
    }


    public void setCodigo(long v) throws Exeception{
        if (v <= 0)
            throw new Exeception("Código tem que ser maior que 0.");
        this.codigo = v;
    }

    public long getCodigo(){
        return this.codigo;
    }

    public void setNome(String valor) trows Exception{
        if((valor == null ) || (valor.isEmpty()))
        throw new Exeception("Nome nulo ou vazio, insira um nome válido.");

        this.nome = valor;
    }

    public String getNome(){
        return this.nome;
    }

    public void setDocumento(String value) throws Exception{
        if((value == null) || (value.isEmpty()))

        throw new Exeception("Documento nulo ou vazio, insira um documento válido.")
    }


    public String getDocumento(){
        return this.documento;
    }

    public void setNascimento(Momento value) throws Exception{
        if((value == null) || (value.isEmpty()))

        throw new Exeception("Nascimento nulo ou vazio, insira um nascimento válido.")
    }


    public Momento getNascimento(){
        return this.nascimento;
    }



    //construtor de copia 
    public Pessoa(Pessoa outro) trhows Exeception{
        if (outro == null)
        throw new Exeception("Insira uma instancia para ser clonada.");

        this.codigo = outro.codigo;
        this.nome = outro.nome;
        this.documento = outro.documento;
        this.nascimento = outro.nascimento;
    }

    public boolean equals(Object outros){
        if(outros == null)
        return false;

        if(outros == this)
        return true;

        if(outros.gertClass() != this. getClass())
        return false;

        Pessoa outro = (pessoa) outros;

        if (this.codigo != outro.codigo)
        return false;
        
        if (!this.nome.equals(outro.nome))
        return false;
        
        if (!this.documento.equals(outro.documento))
        return false;

        if(!this.nascimeto.equals(outro.nascimento))
        return false;
        
        return true;
    }

    public String toString(){
        return "Codigo " + this.codigo + 
                ", Nome: " + this.nome + 
                ", Documento " + this.documetno +
                ", Nascimento " + this.nascimento + 
    }

}