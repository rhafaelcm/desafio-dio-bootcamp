import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição cruso java");
        curso1.setCargaHoraria(8);
        
        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição cruso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descricao mentoria java");
        mentoria.setData(LocalDate.now());

        // System.out.println("-----------------------");
        // System.out.println(curso1);
        // System.out.println("-----------------------");
        // System.out.println(curso2);
        // System.out.println("-----------------------");
        // System.out.println(mentoria);
        // System.out.println("-----------------------");

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devRhafael = new Dev();
        devRhafael.setNome("Rhafael");
        devRhafael.inscreverBootcamp(bootcamp);
        devRhafael.progredir();
        devRhafael.progredir();
        System.out.println("Conteúdos Inscritos " + devRhafael.getNome() + ": " + devRhafael.getConteudosInscritos());
        System.out.println("=====================================");
        System.out.println("Conteúdos Concluídos " + devRhafael.getNome() + ": " + devRhafael.getConteudosConcluidos());
        System.out.println("=====================================");
        System.out.println("XP: " + devRhafael.calcularTotalXp());
        
        System.out.println("--------------------------------------------------------------------------");
        
        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.inscreverBootcamp(bootcamp);
        devJoao.progredir();
        System.out.println("Conteúdos Inscritos " + devJoao.getNome() + ": " + devJoao.getConteudosInscritos());
        System.out.println("=====================================");
        System.out.println("Conteúdos Concluídos " + devJoao.getNome() + ": " + devJoao.getConteudosConcluidos());
        System.out.println("=====================================");
        System.out.println("XP: " + devJoao.calcularTotalXp());


    }

}
