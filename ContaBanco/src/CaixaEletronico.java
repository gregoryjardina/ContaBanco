public class CaixaEletronico {
    public static void main(String[] args) {
        /*for (int carneirinhos = 1; carneirinhos <= 20; carneirinhos++){
            System.out.println("Contando carneirinhos " + carneirinhos);
        }*/
        String alunos[] = {"Gregory", "Jane", "Baguinho", "Hannah"};

        /*for (int x = 0; x < alunos.length; x++){
            System.out.println("O aluno n° " + x + " é o(a): " + alunos[x]+"!");
        }*/
        for (String aluno : alunos){
            System.out.println("O aluno é: "+ aluno +".");
        }

    }    
}
