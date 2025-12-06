package com.ufrn.DTO;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ReservaIndividualDTO {
    private LocalDate data;
    private LocalTime horarioInicial;
    private LocalTime horarioFinal;
    private String aluno;
    private Integer sala;
    private int qntEquipamentos;
    
    public LocalDate getData() {
        return data;
    }
    public void setData(LocalDate data) {
        this.data = data;
    }
    public LocalTime getHorarioInicial() {
        return horarioInicial;
    }
    public void setHorarioInicial(LocalTime horarioInicial) {
        this.horarioInicial = horarioInicial;
    }
    public LocalTime getHorarioFinal() {
        return horarioFinal;
    }
    public void setHorarioFinal(LocalTime horarioFinal) {
        this.horarioFinal = horarioFinal;
    }
    public String getAluno() {
        return aluno;
    }
    public void setAluno(String aluno) {
        this.aluno = aluno;
    }
    
    public Integer getSala() {
        return sala;
    }
    public void setSala(Integer sala) {
        this.sala = sala;
    }
    public int getQntEquipamentos() {
        return qntEquipamentos;
    }
    public void setQntEquipamentos(int qntEquipamentos) {
        this.qntEquipamentos = qntEquipamentos;
    }
    
    
}
