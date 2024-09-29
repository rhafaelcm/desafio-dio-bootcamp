package br.com.dio.desafio.dominio;

public class Curso extends Conteudo {

    private int cargaHoraria;

    public double calcularXp() {
        return XP_PADRAO * this.cargaHoraria;
    }

    public Curso() {
    }

    public int getCargaHoraria() {
        return this.cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso:\ntitulo = " + getTitulo() +
                "\ndescricao = " + getDescricao() +
                "\ncargaHoraria = " + cargaHoraria;
    }

}
