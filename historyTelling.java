// main class
public class historyTelling{
     
    public static void main(String[] args) {
        // capitulo 1 e introdução
        funcoes.saida(dados.capitulos.titulo);
        funcoes.saida(dados.capitulos.cap1);
        funcoes.saida(dados.escolhas.escolha_A +"\n" + dados.escolhas.escolha_B);
        int escolha = funcoes.entradaInt("Escolha uma opção: ");
        
        //verificacao se a escolha é valida
        while(escolha != 1 && escolha != 2){
            funcoes.saida("Opção inválida, digite novamente.");
            escolha = funcoes.entradaInt("Escolha uma opção: ");
        }

        //Caminho A
        if(escolha == 1){

            //capitulo A-2
            funcoes.saida(dados.capitulos.cap2);
            escolha = 0;

            funcoes.saida(dados.escolhas.escolha_A1 + "\n" + dados.escolhas.escolha_A2);
            escolha = funcoes.entradaInt("Escolha uma opção: ");
           
            //verificacao se a escolha é valida
            while(escolha != 1 && escolha != 2){
                funcoes.saida("Opção inválida, digite novamente.");
                escolha = funcoes.entradaInt("Escolha uma opção: ");
            }
            

            //Finais A
            if(escolha == 1){
                funcoes.saida(dados.finais.final_A1);
            }
            else if(escolha == 2){
                funcoes.saida(dados.finais.final_A2);
            }

        }

        //Caminho B
         else if (escolha == 2){

            //capitlo B-2
            funcoes.saida(dados.capitulos.cap2);
            escolha = 0;
            
            funcoes.saida(dados.escolhas.escolha_B1 + "\n" + dados.escolhas.escolha_B2);
            escolha = funcoes.entradaInt("Escolha uma opção: ");
            
            //verificacao se a escolha é valida
            while(escolha != 1 && escolha != 2){
                funcoes.saida("Opção inválida, digite novamente.");
                escolha = funcoes.entradaInt("Escolha uma opção: ");
            }

            //Finais B
            if(escolha == 1){
                funcoes.saida(dados.finais.final_B1);
            }
            else if(escolha == 2){
                funcoes.saida(dados.finais.final_B2);
            }
        }

       
    
    
    
    
    
    
    
    
    }
}