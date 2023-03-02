import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso java");
        curso1.setDescricao("Descrição do curso");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso java");
        curso2.setDescricao("Descrição do curso");
        curso2.setCargaHoraria(2);



        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria java");
        mentoria.setDescricao("Descrição da mentoria");
        mentoria.setData(LocalDate.now());


        Bootcamp bootcamp = new Bootcamp();

        bootcamp.setNome("Bootcamp java Developer");
        bootcamp.setDescricao("Descrição bootcamp Java Developer");
        Bootcamp.getConteudos().add(curso1);
        Bootcamp.getConteudos().add(curso2);
        Bootcamp.getConteudos().add(mentoria);

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);

        System.out.println("Conteudos Inscritos Camila"+ devCamila.getConteudosInscritos());
        devCamila.progredir();
        devCamila.progredir();
        System.out.println("-");
        System.out.println("Conteudos Concluidos Camila"+ devCamila.getConteudosConcluidos());
        System.out.println("Conteudos Inscritos Camila"+ devCamila.getConteudosInscritos());
        System.out.println("XP:" + devCamila.calcularTotalXp());

        System.out.println("--------------");

        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverBootcamp(bootcamp);

        System.out.println("Conteudos Inscritos Joao"+ devJoao.getConteudosInscritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("-");
        System.out.println("Conteudos Concluidos Joao"+ devJoao.getConteudosConcluidos());
        System.out.println("Conteudos Inscritos Joao"+ devJoao.getConteudosInscritos());
        System.out.println("XP:" + devJoao.calcularTotalXp());
    }
}