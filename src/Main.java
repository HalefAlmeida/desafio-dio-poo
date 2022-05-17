import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();

        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição do curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();

        curso2.setTitulo("Curso JS");
        curso2.setDescricao("Descrição do curso JS");
        curso2.setCargaHoraria(10);

//        System.out.println(curso1);
//        System.out.println(curso2);

        Mentoria mentoria1 = new Mentoria();

        mentoria1.setTitulo("Mentoria de Java");
        mentoria1.setDescricao("Descrição da mentoria Java");
        mentoria1.setData(LocalDate.now()); // Atribui a hora atual para a data de criação

//        System.out.println(mentoria1);

        Bootcamp bootcamp1 = new Bootcamp();
        bootcamp1.setNome("Bootcamp Java Developer");
        bootcamp1.setDescricao("Bootcamp Java");
        bootcamp1.getConteudos().add(curso1);
        bootcamp1.getConteudos().add(curso2);
        bootcamp1.getConteudos().add(mentoria1);

        Dev dev1 = new Dev();
        dev1.setNome("Halef");
        dev1.inscreverBootcamp(bootcamp1);
        dev1.progredir();
        dev1.progredir();
        System.out.println("Conteúdos inscritos: " + dev1.getConteudosInscritos());
        System.out.println("Conteúdos concluídos: " + dev1.getConteudosConcluidos());
        System.out.println("XP: " + dev1.calcularTotalXP());

        System.out.println("-------------------------");

        Dev dev2 = new Dev();
        dev2.setNome("Halvx");
        dev2.inscreverBootcamp(bootcamp1);
        dev2.progredir();
        System.out.println("Conteúdos inscritos: " + dev2.getConteudosInscritos());
        System.out.println("Conteúdos concluídos: " + dev2.getConteudosConcluidos());
        System.out.println("XP: " + dev2.calcularTotalXP());



    }
}
