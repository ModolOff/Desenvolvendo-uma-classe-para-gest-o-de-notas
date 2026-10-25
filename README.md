# Classe Matrícula - Gestão de Notas

Projeto desenvolvido em Java para a atividade de desenvolvimento de uma classe de gestão de notas, como parte de um software de gestão para uma universidade.

A classe `Matricula` guarda os dados de um aluno em uma disciplina (nome do aluno, nome da disciplina e três notas) e calcula a média final.

## Funcionalidades

- Armazena o nome do aluno e o nome da disciplina.
- Armazena três notas (valores de 0 a 10, aceitando números decimais).
- Calcula a média final com o mesmo peso para todas as notas.
- Calcula a média final com pesos diferentes, enviados por parâmetro.
- Imprime os dados da matrícula (nome do aluno, nome da disciplina e média final).

## Regras das notas

Ao atribuir uma nota, a classe faz o seguinte tratamento:

| Valor enviado | Nota atribuída |
|---------------|----------------|
| Menor que 0   | 0              |
| Maior que 10  | 10             |
| Entre 0 e 10  | O próprio valor |

## Conceitos utilizados

- Classe e objeto
- Encapsulamento (atributos `private` com getters e setters)
- Construtor com parâmetros (nome do aluno e nome da disciplina são obrigatórios)
- Sobrecarga de métodos (`calcularMedia()` com e sem parâmetros)
- Método sem retorno (`imprimirDados()`)

## Estrutura do projeto

```
.
├── Matricula.java
└── README.md
```

## Como executar

É necessário ter o JDK (Java Development Kit) instalado.

1. Clone o repositório:

```bash
git clone <url-do-repositorio>
cd <nome-da-pasta>
```

2. Crie um arquivo `Main.java` na mesma pasta para testar a classe:

```java
public class Main {
    public static void main(String[] args) {
        Matricula matricula = new Matricula("Maria Silva", "Programação Orientada a Objetos");

        matricula.setPrimeiraNota(8.5);
        matricula.setSegundaNota(12);   // será ajustada para 10
        matricula.setTerceiraNota(-3);  // será ajustada para 0

        matricula.imprimirDados();

        double mediaPonderada = matricula.calcularMedia(2, 3, 5);
        System.out.println("Média ponderada: " + mediaPonderada);
    }
}
```

3. Compile e execute:

```bash
javac Matricula.java Main.java
java Main
```

## Exemplo de saída

```
Nome do Aluno: Maria Silva
Nome da Disciplina: Programação Orientada a Objetos
Média Final: 6.166666666666667
Média ponderada: 4.25
```

## Métodos principais

| Método | Descrição |
|--------|-----------|
| `Matricula(String nomeAluno, String nomeDisciplina)` | Construtor da classe |
| `setPrimeiraNota(double)` / `setSegundaNota(double)` / `setTerceiraNota(double)` | Atribuem as notas, aplicando as regras de 0 a 10 |
| `calcularMedia()` | Retorna a média com pesos iguais |
| `calcularMedia(double, double, double)` | Retorna a média ponderada com os pesos informados |
| `imprimirDados()` | Imprime nome do aluno, nome da disciplina e média final |

## Autor

Desenvolvido por Otávio Modolon Neto (ModolOff) como atividade acadêmica.
