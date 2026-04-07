# Avaliação Prática - Matrizes e Ordenação

## Integrante
- Rafael Lima
---
## Sobre o projeto
Este projeto foi desenvolvido em Java com o objetivo de trabalhar com **matrizes bidimensionais** e **algoritmos de ordenação**.

O sistema permite:
- Criar uma matriz com tamanho definido pelo usuário
- Preencher a matriz manualmente ou automaticamente
- Exibir a matriz
- Ordenar os dados de diferentes formas

---

## Funcionalidades

### Preenchimento da matriz
- Manual → o usuário digita os valores
- Automático → valores aleatórios são gerados

### Exibição
A matriz é mostrada em formato de tabela no console.

---
## Tipos de ordenação

### Por linhas
Cada linha é ordenada separadamente.

### Por colunas
Cada coluna é ordenada separadamente.

### Matriz completa
A matriz é transformada em um vetor, ordenada e depois reconstruída.

---

## Algoritmos utilizados

### Bubble Sort
- Algoritmo simples
- Funciona comparando elementos vizinhos
- Mais fácil de entender

Complexidade: O(n²)

---

### Merge Sort
- Algoritmo recursivo
- Divide o problema em partes menores
- Mais eficiente

Complexidade: O(n log n)

---

## Comparação dos algoritmos

- Bubble Sort é iterativo, simples de entender, porém lento
- Merge Sort é recursivo, mais rápido, porém mais complexo
- Bubble Sort funciona melhor com poucos dados
- Merge Sort funciona melhor com muitos dados
---

## Aprendizados
- Manipulação de matrizes
- Uso de vetores
- Diferença entre algoritmos iterativos e recursivos
- Organização de código em classes e métodos

---

## Dificuldades
- Ordenar colunas corretamente
- Transformar matriz em vetor e reconstruir

---

## Conclusão
O projeto ajudou a reforçar conceitos importantes de programação, principalmente sobre estruturas de dados e algoritmos de ordenação.

---

## Como executar

1. Compile o projeto:
```bash
javac Main.java