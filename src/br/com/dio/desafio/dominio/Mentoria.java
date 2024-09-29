package br.com.dio.desafio.dominio;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Mentoria extends Conteudo {
    
    private LocalDate data;
    
    public double calcularXp() {
        return XP_PADRAO + 20d;
    }
    public Mentoria() {
    }

    public LocalDate getData() {
        return this.data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public String toString() {
        return "Mentoria \ntitulo = " + getTitulo() +
                "\ndescricao = " + getDescricao() +
                "\ndata = " + data.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }


}
