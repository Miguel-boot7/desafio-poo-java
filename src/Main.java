import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso = new Curso();
        Curso curso1 = new Curso();


        curso.setTitulo("Java");
        curso.setDescricao("Curos de Java da Dio");
        curso.setCargaHoraria(10);


        System.out.println();

        curso1.setTitulo("Schap");
        curso1.setDescricao("Curos de Schap da Dio");
        curso1.setCargaHoraria(20);
        /*
        System.out.println(curso.getTitulo());
        System.out.println(curso.getDescricao());
        System.out.println(curso.getCargaHoraria());
        System.out.println(curso1.getTitulo());
        System.out.println(curso1.getDescricao());
        System.out.println(curso1.getCargaHoraria());
        */
        //Conteudo conteudo = new Curso();

       // Conteudo conteudo1 = new Mentoria();

        Mentoria mentoria = new Mentoria();
        /*
        mentoria.setTitulo("Mentoria java Dio");
        mentoria.setDescricao("Mentoria java Dio");
        mentoria.setDate(LocalDate.now());

        System.out.println(mentoria);
        */

        Bootcamp bootcamp = new Bootcamp();

        bootcamp.setNome("Bootcamp Java Developer.");
        bootcamp.setDescricao("Criação Bootcamp java Developer.");
        bootcamp.getConteudos().add(curso);
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(mentoria);

        Dev devFred = new Dev();
        devFred.setNome("Fred");
        devFred.inscreverBoocamp(bootcamp);
        System.out.println("Conteúdos inscritos: " + devFred.getConteudosInscritos());
        devFred.progredir();
        devFred.progredir();
        devFred.progredir();
        System.out.println("-");
        System.out.println("Conteúdos inscritos: " + devFred.getConteudosInscritos());
        System.out.println("Conteúdos concluídos: " + devFred.getConteudosConcluidos());
        System.out.println("xp: " + devFred.calcularTotalXp());

        System.out.println("============================================================");

        System.out.println();
        Dev devMiguel = new Dev();
        devMiguel.setNome("Miguel");
        devMiguel.inscreverBoocamp(bootcamp);
        System.out.println("Conteúdos inscritos: " + devMiguel.getConteudosInscritos());
        devMiguel.progredir();
        System.out.println("-");
        System.out.println("Conteúdos inscritos: " + devMiguel.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos: " + devMiguel.getConteudosConcluidos());
        System.out.println("xp: " + devMiguel.calcularTotalXp());






    }
}