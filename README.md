Instruções do jogo:

O programa gera sempre um novo número aleatório, no limite de 0 a 100, que o usuário deve adivinhar em, no máximo, 5 tentativas.

O jogo guia o usuário para que ele saiba se o número inserido por ele é maior ou menor que o número a ser descoberto.

Caso o usuário não adivinhe em até 5 tentativas, ele perde o jogo e tem a possibilidade de re-executar o código novamente para jogar e tentar adivinhar o novo número sorteado pelo algoritmo.

Não se esqueça de inserir "OK" para começar o jogo (do contrário, ele não inicia).

_______________________________________________________________________________________

Explicação do código:

O jogo está programado dentro de um laço do-while e, para ser inicializado, necessita de uma confirmação do usuário por meio da entrada "OK" (que independe de estar escrito com capslock).
Enquanto o usuário não inserir a palavra "ok", o jogo não inicia.

Os números aleatórios são gerados pela classe "Random" numa faixa de 0 a 100.

As tentativas do jogador são contabilizadas por meio de um laço for.

O laço for contém condicionais if-else que avaliarão o número inserido pelo jogador, exibirão uma mensagem personalizada dependendo da entrada do usuário e 
contabilizarão a quantidade de tentativas restantes do usuário.

Caso o usuário chegue a 0 tentativas sem acertar o número sorteado pelo algoritmo, o programa exibe uma mensagem de derrota do usuário e o número sorteado pelo algoritmo.