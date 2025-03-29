#!/bin/bash
echo "Compilando o projeto..."
javac -d . src/common/*.java src/server/*.java src/client/*.java
echo "Compilação concluída!"