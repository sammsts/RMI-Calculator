📌 # RMI Project – Distributed Calculator

## 📖 Description
This project implements a distributed system using Java Remote Method Invocation (JMI). The goal is to provide a **remote calculator**, where a client can perform basic mathematical operations by connecting to an RMI server.

## 🔹 Operation
1. The server makes mathematical operations available and registers them in the RMI Registry.
2. The client connects to the server and requests a mathematical operation.
3. The server processes the request and returns the result to the client.

## 🔹 Technologies Used
✅ Java RMI for remoting
✅ **Client-Server Architecture**
✅ **Modularization** for code organization

## 🔹 Project Structure
```
RMI_Calculadora/
│── src/
│   ├── common/
│   │   ├── Calculadora.java        # Remote interface
│   ├── server/
│   │   ├── Servidor.java           # Server Deployment
│   │   ├── CalculadoraImpl.java    # Remote UI Implementation
│   ├── client/
│   │   ├── Cliente.java            # Customer Implementation
    ├── scripts/                    # Facilitate server, client, and project build execution
    │   ├── windows                 
│   │   ├── linux_mac               
│── run_server.bat / run_server.sh  # script to run the server
│── run_client.bat / run_client.sh  # script to run the client
│── compile.bat / compile.sh        # Script to build the project
│── .gitignore
│── README.md
```

## 🔹 How to Execute the Project
### 1️⃣ Compile the Java files
```sh
javac -d . src/common/*.java src/server/*.java src/client/*.java
```
### 2️⃣ Start RMI Registry
```sh
rmiregistry &
```
### 3️⃣ Run Server
```sh
java server.Servidor
```
### 4️⃣ Run the Client
```sh
java client.Cliente
```

## 🔹 Ou faça pelos scrpits
### Windows
- **Compilar o projeto**: 
  - Run the script `scripts/compile.bat`.
  
- **Rodar o servidor**:
  - Run the script `scripts/run_server.bat`.
  
- **Rodar o cliente**:
  - Run the script `scripts/run_client.bat`.

## Linux/Mac
- **Compilar o projeto**: 
  - Run the script `scripts/compile.sh`.

- **Rodar o servidor**:
  - Run the script `scripts/run_server.sh`.

- **Rodar o cliente**:
  - Run the script `scripts/run_client.sh`.

## 📌
Developed as part of the **Distributed Systems** course of the **Computer Science** course. 🚀