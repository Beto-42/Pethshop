package org.example;

public class Main {
    public static void main(String[] args) {
        // Criação de uma instância da classe de testes
        PetStoreTests tests = new PetStoreTests();

        // Chamada dos métodos de teste
        System.out.println("Iniciando testes da API Petstore...");

        tests.testCreatePet();
        tests.testGetPet();
        tests.testUpdatePet();
        tests.testDeletePet();

        System.out.println("Testes concluídos.");
    }
}

