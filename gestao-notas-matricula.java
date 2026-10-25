public class Matricula {

    private String nomeAluno;
    private String nomeDisciplina;
    private double primeiraNota;
    private double segundaNota;
    private double terceiraNota;

    public Matricula(String nomeAluno, String nomeDisciplina) {
        this.nomeAluno = nomeAluno;
        this.nomeDisciplina = nomeDisciplina;
    }

    public String getNomeAluno() {
        return nomeAluno;
    }

    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    public String getNomeDisciplina() {
        return nomeDisciplina;
    }

    public void setNomeDisciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
    }

    public double getPrimeiraNota() {
        return primeiraNota;
    }

    public void setPrimeiraNota(double primeiraNota) {
        if (primeiraNota < 0) {
            this.primeiraNota = 0;
        } else if (primeiraNota > 10) {
            this.primeiraNota = 10;
        } else {
            this.primeiraNota = primeiraNota;
        }
    }

    public double getSegundaNota() {
        return segundaNota;
    }

    public void setSegundaNota(double segundaNota) {
        if (segundaNota < 0) {
            this.segundaNota = 0;
        } else if (segundaNota > 10) {
            this.segundaNota = 10;
        } else {
            this.segundaNota = segundaNota;
        }
    }

    public double getTerceiraNota() {
        return terceiraNota;
    }

    public void setTerceiraNota(double terceiraNota) {
        if (terceiraNota < 0) {
            this.terceiraNota = 0;
        } else if (terceiraNota > 10) {
            this.terceiraNota = 10;
        } else {
            this.terceiraNota = terceiraNota;
        }
    }

    // calcula a media com o mesmo peso para todas as notas
    public double calcularMedia() {
        double media = (primeiraNota + segundaNota + terceiraNota) / 3;
        return media;
    }

    // calcula a media com pesos diferentes
    public double calcularMedia(double peso1, double peso2, double peso3) {
        double media = (primeiraNota * peso1 + segundaNota * peso2 + terceiraNota * peso3) / (peso1 + peso2 + peso3);
        return media;
    }

    // imprime os dados da matricula
    public void imprimirDados() {
        System.out.println("Nome do Aluno: " + nomeAluno);
        System.out.println("Nome da Disciplina: " + nomeDisciplina);
        System.out.println("Média Final: " + calcularMedia());
    }
}
