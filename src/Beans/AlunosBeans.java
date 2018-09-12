package Beans;

/**
 *
 * @author Jeels
 */
public class AlunosBeans {

    private long cod_Aluno;
    private String nomeAluno;
    private String cpf;
    private String dataNascimento;
    private String endereco;
    private String email;
    private String dataPag;
    private String cep;
    private String telefone;
    private String dataCadastro;
    private String instrumento;
    private String horario;
    private String diasSemanais;
    private String ativo;
    private ProfessoresBeans cod_professor;

    public long getCod_Aluno() {
        return cod_Aluno;
    }

    public void setCod_Aluno(long cod_Aluno) {
        this.cod_Aluno = cod_Aluno;
    }

    public String getNomeAluno() {
        return nomeAluno;
    }

    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDataPag() {
        return dataPag;
    }

    public void setDataPag(String dataPag) {
        this.dataPag = dataPag;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(String dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public String getInstrumento() {
        return instrumento;
    }

    public void setInstrumento(String instrumento) {
        this.instrumento = instrumento;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getDiasSemanais() {
        return diasSemanais;
    }

    public void setDiasSemanais(String diasSemanais) {
        this.diasSemanais = diasSemanais;
    }

    public String getAtivo() {
        return ativo;
    }

    public void setAtivo(String ativo) {
        this.ativo = ativo;
    }

    public ProfessoresBeans getCod_professor() {
        return cod_professor;
    }

    public void setCod_professor(ProfessoresBeans cod_professor) {
        this.cod_professor = cod_professor;
    }
}