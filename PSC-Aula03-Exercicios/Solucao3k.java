import javax.swing.JOptionPane;

public class Solucao3k {
    /***
         
        Uma empresa de fornecimento de energia elétrica faz a leitura mensal dos
        medidores de consumo.
        
        Para cada consumidor são digitados os seguintes dados:

        código do consumidor, 
        quantidade de kWh consumidos durante o mês, 
        tipo do consumidor.
        
        Os tipos podem ser 
        1 - residencial, preço por kWh = R$ 0,3; 
        2 - comercial,   preço por kWh = 0,5; 
        3 - industrial,  preço por kWh = 0,7;
        
        Os dados devem ser lidos até que seja encontrado um consumidor com código 0 (zero).
        
        Calcular e imprimir o custo total para cada consumidor, o total de consumo para os três tipos de consumidor, a
        média de consumo dos tipos 1 e 2. 

    ***/
    public static void main(String[] args) {
        double totalGeral = 0;
        double totalResidencial = 0;
        double totalComercial = 0;
        double totalIndustrial = 0;
        int contadorResidencial = 0;
        int contadorComercial = 0;
        boolean flag = true;

        while (flag) {
            String codigoConsumidor = JOptionPane.showInputDialog("Digite o código do consumidor:");
            int codigo = Integer.parseInt(codigoConsumidor);

            if (codigo == 0) {
                flag = false; 
            } else {
                String quantidadeKWh = JOptionPane.showInputDialog("Digite a quantidade de KWh consumido durante o mês:");
                double kwh = Double.parseDouble(quantidadeKWh);

                String tipo = JOptionPane.showInputDialog("Digite o tipo de consumidor (residencial, comercial, industrial):");
                double custo = 0;

                if (tipo.equalsIgnoreCase("residencial"))
                {
                    custo = kwh * 0.3;
                    totalResidencial += kwh;
                    contadorResidencial++;
                } else if (tipo.equalsIgnoreCase("comercial"))
                {
                    custo = kwh * 0.5;
                    totalComercial += kwh;
                    contadorComercial++;
                } else if (tipo.equalsIgnoreCase("industrial"))
                {
                    custo = kwh * 0.7;
                    totalIndustrial += kwh;
                } 

                JOptionPane.showMessageDialog(null, "Custo do consumidor " + tipo + " é: R$ " + custo);
            
                totalGeral = totalResidencial + totalComercial + totalIndustrial;
                
                String resultado = "Total de consumo do tipo residencial: " + totalResidencial + " KWh\n" +
                                   "Total de consumo do tipo comercial: " + totalComercial + " KWh\n" +
                                   "Total de consumo do tipo industrial: " + totalIndustrial + " KWh\n" +
                                   "Consumo geral: " + totalGeral + " KWh\n" +
                                   "Média de consumo do tipo residencial: " + (contadorResidencial > 0 ? totalResidencial / contadorResidencial : 0) + " KWh\n" +
                                   "Média de consumo do tipo comercial: " + (contadorComercial > 0 ? totalComercial / contadorComercial : 0) + " KWh";

                JOptionPane.showMessageDialog(null, resultado);
            }
        }
    }
}
