<h1> Jogo de Adivinhação </h1>

<h2> Descrição do Projeto </h2>

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

Caso o usuário chegue a 0 tentativas sem acertar o número sorteado pelo algoritmo, o programa exibe uma mensagem de que o usuário perdeu o jogo e o número sorteado pelo algoritmo naquele jogo.
<br />


<h2> Linguagens Utilizadas: </h2>

- <b> Java 17 </b> 

<h2> Ambiente utilizado: </h2>

- <b> Windows 11 </b>
- <b> IntelliJ IDEA </b>

<h2> Ilustrações do programa: </h2>

<p align="center">
Launch the utility: <br/>
<img src="https://i.imgur.com/62TgaWL.png" height="80%" width="80%" alt="Disk Sanitization Steps"/>
<br />
<br />
Select the disk:  <br/>
<img src="https://i.imgur.com/tcTyMUE.png" height="80%" width="80%" alt="Disk Sanitization Steps"/>
<br />
<br />
Enter the number of passes: <br/>
<img src="https://i.imgur.com/nCIbXbg.png" height="80%" width="80%" alt="Disk Sanitization Steps"/>
<br />
<br />
Confirm your selection:  <br/>
<img src="https://i.imgur.com/cdFHBiU.png" height="80%" width="80%" alt="Disk Sanitization Steps"/>
<br />
<br />
Wait for process to complete (may take some time):  <br/>
<img src="https://i.imgur.com/JL945Ga.png" height="80%" width="80%" alt="Disk Sanitization Steps"/>
<br />
<br />
Sanitization complete:  <br/>
<img src="https://i.imgur.com/K71yaM2.png" height="80%" width="80%" alt="Disk Sanitization Steps"/>
<br />
<br />
Observe the wiped disk:  <br/>
<img src="https://i.imgur.com/AeZkvFQ.png" height="80%" width="80%" alt="Disk Sanitization Steps"/>
</p>
