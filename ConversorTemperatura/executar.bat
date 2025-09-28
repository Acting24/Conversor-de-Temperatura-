@echo off
echo =========================================
echo    Conversor de Temperatura - Java
echo =========================================
echo.

REM Verifica se o javac está disponível
where javac >nul 2>nul
if %ERRORLEVEL% NEQ 0 (
    echo ERRO: javac não encontrado!
    echo Por favor, instale o JDK e configure as variáveis de ambiente.
    echo Consulte o arquivo README.md para instruções detalhadas.
    pause
    exit /b 1
)

REM Verifica se o java está disponível
where java >nul 2>nul
if %ERRORLEVEL% NEQ 0 (
    echo ERRO: java não encontrado!
    echo Por favor, instale o JDK e configure as variáveis de ambiente.
    pause
    exit /b 1
)

echo Compilando arquivos Java...
javac *.java
if %ERRORLEVEL% NEQ 0 (
    echo ERRO: Falha na compilação!
    pause
    exit /b 1
)

echo Compilação bem-sucedida!
echo.
echo Executando o programa...
echo =========================================
java ConversorTemperaturaApp
echo =========================================
echo.
echo Programa finalizado.
pause
