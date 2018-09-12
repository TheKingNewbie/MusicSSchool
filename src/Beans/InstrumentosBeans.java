package Beans;

/**
 *
 * @author GSantiago
 */
public class InstrumentosBeans {
    
    private long idInstrumento;
    private String nomeCurso;
    private long cod_professor;

    public long getIdInstrumento() {
        return idInstrumento;
    }

    public void setIdInstrumento(long idInstrumento) {
        this.idInstrumento = idInstrumento;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public long getCod_professor() {
        return cod_professor;
    }

    public void setCod_professor(long cod_professor) {
        this.cod_professor = cod_professor;
    }
    
}
