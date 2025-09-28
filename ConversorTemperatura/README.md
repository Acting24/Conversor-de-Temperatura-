# Conversor de Temperatura - Guia de Implementação

Este projeto Java converte temperaturas entre Celsius e Fahrenheit usando a fórmula: TC/5 = (TF-32)/9

## Arquivos Criados

- `Converter.java` - Classe utilitária com métodos de conversão
- `ConversorTemperaturaApp.java` - Classe principal com interface do usuário

## Opções de Implementação

### Opção 1: Instalar JDK (Recomendado)

Para compilar e executar o projeto, você precisa do Java Development Kit (JDK):

1. **Baixar JDK:**
   - Visite: https://www.oracle.com/java/technologies/downloads/
   - Ou use OpenJDK: https://adoptium.net/
   - Baixe a versão mais recente para Windows

2. **Instalar JDK:**
   - Execute o instalador baixado
   - Durante a instalação, anote o diretório de instalação (ex: C:\Program Files\Java\jdk-17)

3. **Configurar variáveis de ambiente:**
   - Abra o Painel de Controle → Sistema → Configurações avançadas do sistema
   - Clique em "Variáveis de Ambiente"
   - Adicione uma nova variável de sistema:
     - Nome: JAVA_HOME
     - Valor: caminho do JDK (ex: C:\Program Files\Java\jdk-17)
   - Edite a variável PATH e adicione: %JAVA_HOME%\bin

4. **Compilar o projeto:**
   ```powershell
   cd "C:\Users\dell\ConversorTemperatura"
   javac *.java
   ```

5. **Executar o programa:**
   ```powershell
   java ConversorTemperaturaApp
   ```

### Opção 2: Usar IDE Online

Se você não quiser instalar o JDK localmente:

1. **Visite um IDE online:**
   - https://www.jdoodle.com/compile-java-online/
   - https://replit.com/
   - https://www.onlinegdb.com/online_java_compiler

2. **Copiar os arquivos:**
   - Copie o conteúdo de `Converter.java`
   - Copie o conteúdo de `ConversorTemperaturaApp.java`
   - Cole nos respectivos arquivos no IDE online

3. **Executar diretamente no navegador**

### Opção 3: Usar Visual Studio Code com Extensão Java

1. **Instalar VS Code:**
   - https://code.visualstudio.com/

2. **Instalar Extension Pack for Java:**
   - Abra VS Code
   - Vá para Extensions (Ctrl+Shift+X)
   - Procure por "Extension Pack for Java"
   - Instale (isso também instalará o JDK automaticamente)

3. **Abrir o projeto:**
   - File → Open Folder → Selecione "C:\Users\dell\ConversorTemperatura"
   - O VS Code compilará automaticamente
   - Use F5 para executar

## Funcionamento do Programa

O programa solicita:
1. Uma temperatura em Celsius para converter para Fahrenheit
2. Uma temperatura em Fahrenheit para converter para Celsius

### Exemplo de Execução:
```
Digite a temperatura em Celsius (C) para conversão: 25
25.00 °C equivalem a 77.00 °F.

Digite a temperatura em Fahrenheit (F) para conversão: 77
77.00 °F equivalem a 25.00 °C.
```

## Fórmulas Utilizadas

- **Celsius para Fahrenheit:** TF = TC × (9.0/5.0) + 32
- **Fahrenheit para Celsius:** TC = (TF - 32) × (5.0/9.0)

## Próximos Passos

Escolha uma das opções acima para compilar e executar seu conversor de temperatura!
