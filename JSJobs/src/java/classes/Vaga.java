package classes;

import java.util.Date;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


public class Vaga {
    @Id
    @GeneratedValue
    private Long id;
    private String titulo;
    private String descricao;
    private String habildades;
    private String tipoContratacao;
    private String faixaSalarial;
    private Date dataCriacao;
    private String flagInicio;
    //private int idEmpresa;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getHabildades() {
        return habildades;
    }

    public void setHabildades(String habildades) {
        this.habildades = habildades;
    }

    public String getTipoContratacao() {
        return tipoContratacao;
    }

    public void setTipoContratacao(String tipoContratacao) {
        this.tipoContratacao = tipoContratacao;
    }

    public String getFaixaSalarial() {
        return faixaSalarial;
    }

    public void setFaixaSalarial(String faixaSalarial) {
        this.faixaSalarial = faixaSalarial;
    }

    public Date getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(Date dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public String getFlagInicio() {
        return flagInicio;
    }

    public void setFlagInicio(String flagInicio) {
        this.flagInicio = flagInicio;
    }
}
