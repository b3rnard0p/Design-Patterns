# Sistema de Streaming de Vídeos de Treinamento Corporativo

Este projeto implementa o padrão de projeto Proxy para resolver problemas de lentidão e controle de acesso em uma plataforma de treinamentos corporativos.

## Como o Padrão Proxy resolve os problemas

A implementação utiliza uma interface comum compartilhada entre o objeto real e o proxy para garantir o polimorfismo. As soluções aplicadas foram:

* **Desempenho (Proxy Virtual):** O sistema anterior apresentava extrema lentidão ao tentar carregar todos os vídeos pesados de uma vez. O problema de desempenho é resolvido pelo Proxy Virtual, pois o arquivo de vídeo real só é instanciado e carregado na memória no exato momento em que o usuário solicita a exibição.
* **Segurança (Proxy de Proteção):** O sistema antigo permitia que qualquer colaborador clicasse em vídeos restritos. O problema de segurança é resolvido pelo Proxy de Proteção, que valida se o usuário atual é gestor antes de prosseguir. O acesso é sumariamente barrado caso o usuário não tenha permissão, tudo isso antes mesmo de acionar o objeto real.

### Detalhamento: Lazy Initialization e Cache

A otimização de recursos acontece dentro da classe `VideoProxy`, especificamente no método `reproduzir()`, no seguinte trecho de código:

```
if (videoReal == null) {
    videoReal = new VideoReal(titulo);
}
```

Quando se chama o proxy ao inves do objeto, o proxy apenas salva as infomações do objeto e não ele em si e só carrega o objeto de fato quando é chamado.
Dentro dessa mesma lógica que funciona o cache, como o video é uma variavel dentro do proxy, se o video for chamado novamente, ele já esta na memória do proxy.

## Instruções de Execução

1. Certifique-se de ter o Java Development Kit (JDK) instalado no sistema.
2. Salve os 5 arquivos `.java` no mesmo diretório.
3. Abra o terminal e compile os arquivos utilizando o comando: `javac *.java`
4. Execute a classe principal utilizando o comando: `java Main`