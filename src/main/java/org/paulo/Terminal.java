package org.paulo;

import java.util.Scanner;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;


public class Terminal {
    private final ConversorDeMoedas conversor;

    public Terminal() {
        conversor = new ConversorDeMoedas();
    }

    public void menu() {
        int opcao;

        // Formatar para duas casas decimais com vírgula como separador decimal
        DecimalFormatSymbols symbols = new DecimalFormatSymbols(Locale.getDefault());
        symbols.setDecimalSeparator(',');
        DecimalFormat df = new DecimalFormat("#,##0.00", symbols);

        opcao = this.getOpcao();
        while (opcao != 7) {

            switch (opcao) {
                case 1 -> {
                    // Real para Dólar
                    double valor = getDouble("Valor em Real (BRL)");
                    double convertido = this.conversor.converterMoeda(valor, "BRL", "USD");
                    System.out.println("Valor convertido: USD " + df.format(convertido));
                }
                case 2 -> {
                    // Dólar para Real
                    double valor = getDouble("Valor em Dólar (USD)");
                    double convertido = this.conversor.converterMoeda(valor, "USD", "BRL");
                    System.out.println("Valor convertido: BRL " + df.format(convertido));
                }
                case 3 -> {
                    // Real para Peso Argentino
                    double valor = getDouble("Valor em Real (BRL)");
                    double convertido = this.conversor.converterMoeda(valor, "BRL", "ARS");
                    System.out.println("Valor convertido: ARS " + df.format(convertido));
                }
                case 4 -> {
                    // Peso Argentino para Real
                    double valor = getDouble("Valor em Peso Argentino (ARS)");
                    double convertido = this.conversor.converterMoeda(valor, "ARS", "BRL");
                    System.out.println("Valor convertido: BRL " + df.format(convertido));
                }
                case 5 -> {
                    // Real para Iene
                    double valor = getDouble("Valor em Real (BRL)");
                    double convertido = this.conversor.converterMoeda(valor, "BRL", "JPY");
                    System.out.println("Valor convertido: JPY " + df.format(convertido));
                }
                case 6 -> {
                    // Iene para Real
                    double valor = getDouble("Valor em Iene (JPY)");
                    double convertido = this.conversor.converterMoeda(valor, "JPY", "BRL");
                    System.out.println("Valor convertido: BRL " + df.format(convertido));
                }
                default -> System.out.println("Opção inválida.");
            }
            opcao = getOpcao();
        }
    }

    private int getOpcao() {
        int opcao;
        do {
            // Ajustar o menu para várias opções de conversão de moeda
            System.out.println("\n==============$ CONVERSOR DE MOEDAS $==============\n" +
                    "1 - Real (BRL) para Dólar (USD)\n" +
                    "2 - Dólar (USD) para Real (BRL)\n" +
                    "3 - Real (BRL) para Peso Argentino (ARS)\n" +
                    "4 - Peso Argentino (ARS) para Real (BRL)\n" +
                    "5 - Real (BRL) para Iene (JPY)\n" +
                    "6 - Iene (JPY) para Real (BRL)\n\n" +
                    "7 - Sair do APP\n");

            opcao = getInt("");

            if (opcao < 1 || opcao > 7) {
                opcao = 0;  // Opção inválida
            }
        } while (opcao == 0);
        return opcao;
    }

    private int getInt(String string) {
        Scanner r = new Scanner(System.in);
        System.out.println("Digite a opção > " + string);
        if (r.hasNextInt()) {
            return r.nextInt();
        }
        String st = r.next();
        System.out.println("Erro na Leitura de Dados");
        return 0;
    }

    private double getDouble(String string) {
        Scanner r = new Scanner(System.in);
        System.out.println("Digite o Valor " + string + ">");
        if (r.hasNextDouble()) {
            return r.nextDouble();
        }
        String st = r.next();
        System.out.println("Erro na Leitura de Dados");
        return 0.0;
    }
}
