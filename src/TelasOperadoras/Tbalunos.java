/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TelasOperadoras;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.math.BigInteger;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author GSantiago
 */
@Entity
@Table(name = "tbalunos", catalog = "escolamusica", schema = "")
@NamedQueries({
    @NamedQuery(name = "Tbalunos.findAll", query = "SELECT t FROM Tbalunos t")
    , @NamedQuery(name = "Tbalunos.findByCodAluno", query = "SELECT t FROM Tbalunos t WHERE t.codAluno = :codAluno")
    , @NamedQuery(name = "Tbalunos.findByNomeAluno", query = "SELECT t FROM Tbalunos t WHERE t.nomeAluno = :nomeAluno")
    , @NamedQuery(name = "Tbalunos.findByRg", query = "SELECT t FROM Tbalunos t WHERE t.rg = :rg")
    , @NamedQuery(name = "Tbalunos.findByCpf", query = "SELECT t FROM Tbalunos t WHERE t.cpf = :cpf")
    , @NamedQuery(name = "Tbalunos.findByDataNascimento", query = "SELECT t FROM Tbalunos t WHERE t.dataNascimento = :dataNascimento")
    , @NamedQuery(name = "Tbalunos.findByEndereco", query = "SELECT t FROM Tbalunos t WHERE t.endereco = :endereco")
    , @NamedQuery(name = "Tbalunos.findByComplemento", query = "SELECT t FROM Tbalunos t WHERE t.complemento = :complemento")
    , @NamedQuery(name = "Tbalunos.findByBairro", query = "SELECT t FROM Tbalunos t WHERE t.bairro = :bairro")
    , @NamedQuery(name = "Tbalunos.findByEmail", query = "SELECT t FROM Tbalunos t WHERE t.email = :email")
    , @NamedQuery(name = "Tbalunos.findByMunicipio", query = "SELECT t FROM Tbalunos t WHERE t.municipio = :municipio")
    , @NamedQuery(name = "Tbalunos.findByNumeroCasa", query = "SELECT t FROM Tbalunos t WHERE t.numeroCasa = :numeroCasa")
    , @NamedQuery(name = "Tbalunos.findByCep", query = "SELECT t FROM Tbalunos t WHERE t.cep = :cep")
    , @NamedQuery(name = "Tbalunos.findByTelefone", query = "SELECT t FROM Tbalunos t WHERE t.telefone = :telefone")
    , @NamedQuery(name = "Tbalunos.findByDataCadastro", query = "SELECT t FROM Tbalunos t WHERE t.dataCadastro = :dataCadastro")
    , @NamedQuery(name = "Tbalunos.findByInstrumentos", query = "SELECT t FROM Tbalunos t WHERE t.instrumentos = :instrumentos")
    , @NamedQuery(name = "Tbalunos.findByHorario", query = "SELECT t FROM Tbalunos t WHERE t.horario = :horario")
    , @NamedQuery(name = "Tbalunos.findByDiasSemanais", query = "SELECT t FROM Tbalunos t WHERE t.diasSemanais = :diasSemanais")
    , @NamedQuery(name = "Tbalunos.findByAtivo", query = "SELECT t FROM Tbalunos t WHERE t.ativo = :ativo")
    , @NamedQuery(name = "Tbalunos.findByCodProfessor", query = "SELECT t FROM Tbalunos t WHERE t.codProfessor = :codProfessor")})
public class Tbalunos implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "cod_Aluno")
    private Long codAluno;
    @Column(name = "nomeAluno")
    private String nomeAluno;
    @Column(name = "rg")
    private Integer rg;
    @Column(name = "cpf")
    private Integer cpf;
    @Column(name = "dataNascimento")
    private Integer dataNascimento;
    @Column(name = "endereco")
    private String endereco;
    @Column(name = "complemento")
    private String complemento;
    @Column(name = "bairro")
    private String bairro;
    @Column(name = "email")
    private String email;
    @Column(name = "municipio")
    private String municipio;
    @Column(name = "numeroCasa")
    private Integer numeroCasa;
    @Column(name = "cep")
    private Integer cep;
    @Column(name = "telefone")
    private Integer telefone;
    @Column(name = "dataCadastro")
    private Integer dataCadastro;
    @Column(name = "instrumentos")
    private String instrumentos;
    @Column(name = "horario")
    private String horario;
    @Column(name = "diasSemanais")
    private String diasSemanais;
    @Column(name = "ativo")
    private String ativo;
    @Column(name = "cod_Professor")
    private BigInteger codProfessor;

    public Tbalunos() {
    }

    public Tbalunos(Long codAluno) {
        this.codAluno = codAluno;
    }

    public Long getCodAluno() {
        return codAluno;
    }

    public void setCodAluno(Long codAluno) {
        Long oldCodAluno = this.codAluno;
        this.codAluno = codAluno;
        changeSupport.firePropertyChange("codAluno", oldCodAluno, codAluno);
    }

    public String getNomeAluno() {
        return nomeAluno;
    }

    public void setNomeAluno(String nomeAluno) {
        String oldNomeAluno = this.nomeAluno;
        this.nomeAluno = nomeAluno;
        changeSupport.firePropertyChange("nomeAluno", oldNomeAluno, nomeAluno);
    }

    public Integer getRg() {
        return rg;
    }

    public void setRg(Integer rg) {
        Integer oldRg = this.rg;
        this.rg = rg;
        changeSupport.firePropertyChange("rg", oldRg, rg);
    }

    public Integer getCpf() {
        return cpf;
    }

    public void setCpf(Integer cpf) {
        Integer oldCpf = this.cpf;
        this.cpf = cpf;
        changeSupport.firePropertyChange("cpf", oldCpf, cpf);
    }

    public Integer getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Integer dataNascimento) {
        Integer oldDataNascimento = this.dataNascimento;
        this.dataNascimento = dataNascimento;
        changeSupport.firePropertyChange("dataNascimento", oldDataNascimento, dataNascimento);
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        String oldEndereco = this.endereco;
        this.endereco = endereco;
        changeSupport.firePropertyChange("endereco", oldEndereco, endereco);
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        String oldComplemento = this.complemento;
        this.complemento = complemento;
        changeSupport.firePropertyChange("complemento", oldComplemento, complemento);
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        String oldBairro = this.bairro;
        this.bairro = bairro;
        changeSupport.firePropertyChange("bairro", oldBairro, bairro);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        String oldEmail = this.email;
        this.email = email;
        changeSupport.firePropertyChange("email", oldEmail, email);
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        String oldMunicipio = this.municipio;
        this.municipio = municipio;
        changeSupport.firePropertyChange("municipio", oldMunicipio, municipio);
    }

    public Integer getNumeroCasa() {
        return numeroCasa;
    }

    public void setNumeroCasa(Integer numeroCasa) {
        Integer oldNumeroCasa = this.numeroCasa;
        this.numeroCasa = numeroCasa;
        changeSupport.firePropertyChange("numeroCasa", oldNumeroCasa, numeroCasa);
    }

    public Integer getCep() {
        return cep;
    }

    public void setCep(Integer cep) {
        Integer oldCep = this.cep;
        this.cep = cep;
        changeSupport.firePropertyChange("cep", oldCep, cep);
    }

    public Integer getTelefone() {
        return telefone;
    }

    public void setTelefone(Integer telefone) {
        Integer oldTelefone = this.telefone;
        this.telefone = telefone;
        changeSupport.firePropertyChange("telefone", oldTelefone, telefone);
    }

    public Integer getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Integer dataCadastro) {
        Integer oldDataCadastro = this.dataCadastro;
        this.dataCadastro = dataCadastro;
        changeSupport.firePropertyChange("dataCadastro", oldDataCadastro, dataCadastro);
    }

    public String getInstrumentos() {
        return instrumentos;
    }

    public void setInstrumentos(String instrumentos) {
        String oldInstrumentos = this.instrumentos;
        this.instrumentos = instrumentos;
        changeSupport.firePropertyChange("instrumentos", oldInstrumentos, instrumentos);
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        String oldHorario = this.horario;
        this.horario = horario;
        changeSupport.firePropertyChange("horario", oldHorario, horario);
    }

    public String getDiasSemanais() {
        return diasSemanais;
    }

    public void setDiasSemanais(String diasSemanais) {
        String oldDiasSemanais = this.diasSemanais;
        this.diasSemanais = diasSemanais;
        changeSupport.firePropertyChange("diasSemanais", oldDiasSemanais, diasSemanais);
    }

    public String getAtivo() {
        return ativo;
    }

    public void setAtivo(String ativo) {
        String oldAtivo = this.ativo;
        this.ativo = ativo;
        changeSupport.firePropertyChange("ativo", oldAtivo, ativo);
    }

    public BigInteger getCodProfessor() {
        return codProfessor;
    }

    public void setCodProfessor(BigInteger codProfessor) {
        BigInteger oldCodProfessor = this.codProfessor;
        this.codProfessor = codProfessor;
        changeSupport.firePropertyChange("codProfessor", oldCodProfessor, codProfessor);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codAluno != null ? codAluno.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tbalunos)) {
            return false;
        }
        Tbalunos other = (Tbalunos) object;
        if ((this.codAluno == null && other.codAluno != null) || (this.codAluno != null && !this.codAluno.equals(other.codAluno))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "TelasOperadoras.Tbalunos[ codAluno=" + codAluno + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
