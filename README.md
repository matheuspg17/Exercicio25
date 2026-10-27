# Resolução Exercicio25

## Descrição do problema
Escreva um programa em Java que faça a leitura de 20 números inteiros
quaisquer e armazene em um vetor. Após a leitura mostre a soma e a média
aritmética dos números lidos. 

## Como Funciona
1. **Inicialização do Vetor:** O programa define o tamanho do array através da variável `qtde = 5` e instancia o vetor dinamicamente como `int numeros[] = new int[qtde]`.
2. **Leitura e Armazenamento (Entrada):** Uma primeira estrutura de repetição `for` percorre os índices do vetor (de 0 a 4) preenchendo cada posição com o número inteiro digitado pelo usuário.
3. **Cálculo Acumulado (Processamento):** Um segundo laço `for` varre novamente o vetor, extraindo os valores salvos e somando-os linha por linha na variável `soma`.
4. **Cálculo da Média:** Fora dos laços, o algoritmo divide a soma total pela quantidade de elementos (`qtde`), aplicando um cast explícito para `(double)` para garantir precisão decimal na média real.
5. **Saída de Dados:** O programa imprime o resultado em uma única linha formatada utilizando `System.out.printf`.

