@echo off
echo Compilando o projeto...
echo.

rem Exibindo o diretório atual
echo Diretório atual: %CD%
echo.

rem Subindo dois níveis para alcançar o diretório 'src'
cd /d "%~dp0\..\.."
echo.

rem Exibindo o diretório após a mudança
echo Novo diretório atual: %CD%
echo.

rem Verificando se o diretório 'src' existe
if not exist "%CD%" (
    echo Erro: Diretório 'src' não encontrado.
    pause
    exit /b
)

rem Limpando qualquer classe antiga
echo Limpando qualquer classe antiga...
del /Q "%CD%\*.class"
del /Q "%CD%\**\*.class"
echo.

rem Compilando os arquivos .java
echo Procurando todos os arquivos .java dentro de %CD% e suas subpastas...
for /R "%CD%" %%f in (*.java) do (
    echo Compilando %%f
    javac "%%f"
)
echo.

echo Compilação concluída!
pause
