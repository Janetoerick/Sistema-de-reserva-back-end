package com.ufrn.DTO;

import java.util.List;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class TurmaDTO {

    private String descricao;
    private String professor;
    private List<String> alunos;
    
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public String getProfessor() {
        return professor;
    }
    public void setProfessor(String professor) {
        this.professor = professor;
    }
    public List<String> getAlunos() {
        return alunos;
    }
    public void setAlunos(List<String> alunos) {
        this.alunos = alunos;
    }
    
    
    
    
}
