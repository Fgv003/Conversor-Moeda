package com.conversorMoeda.Principal;

import com.conversorMoeda.Model.ConversorMoeda;
import com.conversorMoeda.Service.ConsumoApi;
import com.conversorMoeda.Service.ConverteDados;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {

    Scanner sc = new Scanner(System.in);
    ConsumoApi consumoApi = new ConsumoApi();
    ConverteDados converteDados = new ConverteDados();

    List<ConversorMoeda> moedasConvertidas = new ArrayList<>();

    public void menuPrincipal() {
        int opc;
        double valor = 0;

        do {
            System.out.println("********************************************");
            System.out.println("Seja bem vindo ao conversor de moedas! =]");
            System.out.println(" ");
            System.out.println("1) Dólar =>> Peso argentino");
            System.out.println("2) Peso argentino =>> Dólar");
            System.out.println("3) Dólar =>> Real");
            System.out.println("4) Real =>> Dólar");
            System.out.println("5) Dólar =>> Euro");
            System.out.println("6) Euro =>> Dólar");
            System.out.println("7) Euro =>> Real");
            System.out.println("8) Real =>> Euro");
            System.out.println("9) Histórico de conversões");
            System.out.println("10) Sair");
            System.out.println("Escolha uma opção válida");
            System.out.println("********************************************");
            opc = sc.nextInt();

            if (opc <=8) {
                System.out.println("Qual valor gostaria de converter ?");
                valor = sc.nextDouble();
            }

            String endereco = "https://v6.exchangerate-api.com/v6/a2a94f2799edbd821c0e01d0/pair/";
            switch (opc){
                case 1:
                    var c1 = consumoApi.obterDados(endereco + "USD/ARS/" + valor);
                    ConversorMoeda dolarPeso = converteDados.obterDados(c1, ConversorMoeda.class);
                    moedasConvertidas.add(dolarPeso);
                    System.out.println("O valor " + valor + " [USD] corresponde ao valor final de " + dolarPeso.resultadoConversao() + " [ARS]");
                    break;
                case 2:
                    var c2 = consumoApi.obterDados(endereco + "ARS/USD/" + valor);
                    ConversorMoeda pesoDolar = converteDados.obterDados(c2, ConversorMoeda.class);
                    moedasConvertidas.add(pesoDolar);
                    System.out.println("O valor " + valor + " [ARS] corresponde ao valor final de " + pesoDolar.resultadoConversao() + " [USD]");
                    break;
                case 3:
                    var c3 = consumoApi.obterDados(endereco + "USD/BRL/" + valor);
                    ConversorMoeda dolarReal = converteDados.obterDados(c3, ConversorMoeda.class);
                    moedasConvertidas.add(dolarReal);
                    System.out.println("O valor " + valor + " [USD] corresponde ao valor final de " + dolarReal.resultadoConversao() + " [BRL]");
                    break;
                case 4:
                    var c4 = consumoApi.obterDados(endereco + "BRL/USD/" + valor);
                    ConversorMoeda realDolar = converteDados.obterDados(c4, ConversorMoeda.class);
                    moedasConvertidas.add(realDolar);
                    System.out.println("O valor " + valor + " [BRL] corresponde ao valor final de " + realDolar.resultadoConversao() + " [USD]");
                    break;
                case 5:
                    var c5 = consumoApi.obterDados(endereco + "USD/EUR/" + valor);
                    ConversorMoeda dolarEuro = converteDados.obterDados(c5, ConversorMoeda.class);
                    moedasConvertidas.add(dolarEuro);
                    System.out.println("O valor " + valor + " [USD] corresponde ao valor final de " + dolarEuro.resultadoConversao() + " [EUR]");
                    break;
                case 6:
                    var c6 = consumoApi.obterDados(endereco + "EUR/USD/" + valor);
                    ConversorMoeda euroDolar = converteDados.obterDados(c6, ConversorMoeda.class);
                    moedasConvertidas.add(euroDolar);
                    System.out.println("O valor " + valor + " [EUR] corresponde ao valor final de " + euroDolar.resultadoConversao() + " [USD]");
                    break;
                case 7:
                    var c7 = consumoApi.obterDados(endereco + "EUR/BRL/" + valor);
                    ConversorMoeda euroReal = converteDados.obterDados(c7, ConversorMoeda.class);
                    moedasConvertidas.add(euroReal);
                    System.out.println("O valor " + valor + " [EUR] corresponde ao valor final de " + euroReal.resultadoConversao() + " [BRL]");
                    break;
                case 8:
                    var c8 = consumoApi.obterDados(endereco + "BRL/EUR/" + valor);
                    ConversorMoeda realEuro = converteDados.obterDados(c8, ConversorMoeda.class);
                    moedasConvertidas.add(realEuro);
                    System.out.println("O valor " + valor + " [BRL] corresponde ao valor final de " + realEuro.resultadoConversao() + " [EUR]");
                    break;
                case 9:
                    System.out.println("Últimas conversões");
                    System.out.println(moedasConvertidas.toString());
                    break;
                case 10:
                    System.out.println("Até mais :)");
                    break;
                default:
                    System.out.println("Opção inválida - Digite novamente");
            }
        }while (opc != 10);
    }
}
