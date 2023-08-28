import java.time.LocalDate;

import uniderp.br.com.dominio.Aluno;
import uniderp.br.com.dominio.Professor;

public class App {
    public static void main(String[] args) throws Exception {

        Professor teste1 = new Professor(0, "Professor", "Endereço", "1234-5678", LocalDate.now(), "1234543",
                "12343234543", LocalDate.now(), "Registro", LocalDate.now());
        System.out.println(teste1);

        System.out.println();

        Aluno teste2 = new Aluno(0, "Nome", "Endereço", "1234-5678", LocalDate.now(), "123454323", "12345434543",
                LocalDate.now(), "Matrícula", LocalDate.now());
        System.out.println(teste2);

    }
}
