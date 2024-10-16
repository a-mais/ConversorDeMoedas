package org.paulo;

import com.google.gson.*;

public class ConversorDeMoedas {
    private Cotacao cotacao;

    public ConversorDeMoedas() {
        this.cotacao = new Cotacao();
    }

    public double converterMoeda(double valor, String moeda1, String moeda2) {

        String taxasDeConversao = cotacao.cotarMoeda(moeda1);

        if (taxasDeConversao == null) {
            System.out.println("Erro ao obter as taxas de conversão");
            return -1;
        }

        // Parse JSON para obter as taxas
        Gson gson = new Gson();
        JsonObject jsonObject = JsonParser.parseString(taxasDeConversao).getAsJsonObject();
        JsonObject conversionRates = jsonObject.getAsJsonObject("conversion_rates");

        // Taxas em relação ao USD
        double taxaMoeda1 = conversionRates.get(moeda1).getAsDouble();
        double taxaMoeda2 = conversionRates.get(moeda2).getAsDouble();

        // Calcular valor convertido
        double valorConvertido = valor * (taxaMoeda2 / taxaMoeda1);

        return valorConvertido;
    }
}
