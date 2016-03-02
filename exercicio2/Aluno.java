/**
 * Created by Pelegolas O Elfo on 02/03/2016.
 */
public class Aluno{
    String nome, matricula;
    int idade;

    public void ImprimirDados(){
        System.out.println ("Nome: " + this.nome);
        System.out.println ("Idade: " + this.idade);
        System.out.println ("Numero Matricula: " + this.matricula);
    }

    public static void main (String [] args){
        Aluno aluno1 = new Aluno();
        aluno1.nome = "Pedro";
        aluno1.matricula = "201418110213";
        aluno1.idade = 17;
        aluno1.ImprimirDados();

        Aluno aluno2 = new Aluno();
        aluno2.nome = "Vitor";
        aluno2.matricula = "201418110023";
        aluno2.idade = 17;
        aluno2.ImprimirDados();

        Aluno aluno3 = new Aluno();
        aluno3.nome = "Afonso";
        aluno3.matricula = "20141811069";
        aluno3.idade = 16;
        aluno3.ImprimirDados();

        Aluno aluno4 = new Aluno();
        aluno4.nome = "Edgard";
        aluno4.matricula = "201418110296";
        aluno4.idade = 16;
        aluno4.ImprimirDados();

    }

}
