public class TesteHeranca1 {

    public void main (String[] args){
        //vejamos se alunos de graduaçao tem nome e idade
        //construtor que não recebe coisa nenhuma é : construtor padrao
        AlunoDeGraduacao aluno = new AlunoDeGraduacao();
        aluno.nome = "João";
        aluno.idade = 17;
        System.out.printf("Nome: %s, idade: %d\n", aluno.nome, aluno.idade);
    }
    
}
