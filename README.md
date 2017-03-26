# Sistema de Arquivos Distribuídos
Projeto de RMI da disciplina de Programação Distribuída

# RMI
O RMI (Remote Method Invocation) é uma interface de programação que permite a execução de chamadas remotas no estilo RPC em aplicações desenvolvidas em Java. É uma das abordagens da plataforma Java para prover as funcionalidades de uma plataforma de objetos distribuídos. Esse sistema de objetos distribuídos faz parte do núcleo básico de Java desde a versão ```JDK 1.1```, com sua API sendo especificada através do pacote ```java.rmi``` e seus subpacotes.

Através da utilização da arquitetura RMI, é possível que um objeto ativo em uma máquina virtual Java possa interagir com objetos de outras máquinas virtuais Java, independentemente da localização dessas máquinas virtuais.

A API RMI fornece ferramentas para que seja possível ao programador desenvolver uma aplicação sem se preocupar com detalhes de comunicação entre os diversos possíveis elementos (```hosts```) de um sistema.

# Descrição do que foi solicitado

* Implemente um servidor de arquivos distribuídos que permita aos clientes:
a. Criar um diretório ou um arquivo
b. Navegar no sistema de arquivos, podendo visualizar arquivos internos, abrir arquivos, remover arquivos. 
c. Do lado do cliente deve existir shell de comandos que permite ao usuário navegar pelo sistema de arquivos, listar o conteudo do diretório, mudar de diretórios, copiar um arquivo de um diretório para outro, mostrar o conteúdo de um arquivo.

# O Projeto

* Cliente
A interface do cliente possui a tentativa de conexão ao servidor e os comandos dados pelo usuário. Permitindo quê este em sua conexão estabelecida possa navegar no sistema de arquivos, podendo visualizar os arquivos existentes dentro do diretório, abrir um determinado arquivo (independente de sua extensão) e remover arquivos.
Não foi implementado a navegação entre diretórios nem a copia de um arquivo para outro diretório justamente pela árvore de diretórios não ter sido implementada, como solicitado.

* Servidor
A interface do servidor possui as configurações de conexão para permitir o acesso do cliente, o controle de acesso, assim como a cadeia de comandos que pode ser recebida pelo cliente, permitindo então ele executar as ações desejadas.
Como não foi implementado a árvore de diretórios para navegação, também não existe essa possibilidade de acesso e manipulação dentro do servidor.

# Objetivo
Implementar a interface RMI(Remote Method Invocation) mostrada em sala de aula para clarificar como é uma comunicação distribuída.