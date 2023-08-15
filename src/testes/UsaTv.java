package testes;

import classes.Tv;

import javax.swing.*;
import java.util.Random;

public class UsaTv {

    public static void main(String[] args) {

        String[] menu = {"ligarTV/desligarTV", "mudarVolume", "trocarCanal", "MostrarTV", "sairTV"};
        String opcao;

        Random canalRandom = new Random();

        int canal = canalRandom.nextInt(700);
        Tv tv = new Tv(false, canal, 0);

        do {

            opcao = JOptionPane.showInputDialog(null, "Controle", "TV", JOptionPane.QUESTION_MESSAGE, null, menu, "ligarTV/desligarTV").toString();

            switch (opcao) {
                case "ligarTV/desligarTV" :

                    String[] ligar_desliga = {"Ligar", "Desligar"};
                    int ligartv;

                    ligartv = JOptionPane.showOptionDialog(null, "Ligar / Desligar", "TV", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, ligar_desliga, "Ligar");

                    if (ligartv == 0) {
                        tv.ligarTv();
                    }else{
                        tv.desligarTv();
                    }

                    break;

                case "mudarVolume" :

                    String[] volume = {"Aumentar", "Diminuir"};
                    String mudar_Volume;

                    mudar_Volume = (String) JOptionPane.showInputDialog(null, "Mudar Volume", "TV", JOptionPane.QUESTION_MESSAGE, null, volume, "Aumentar");

                    switch (mudar_Volume){
                        case "Aumentar" :
                            int aumentarVolume;
                            aumentarVolume = Integer.parseInt(JOptionPane.showInputDialog(null, "Aumentar Quanto?", "TV", JOptionPane.QUESTION_MESSAGE));

                            tv.mudarVolume(aumentarVolume);

                            break;

                        case "Diminuir" :
                            int diminuirVolume;
                            diminuirVolume = Integer.parseInt(JOptionPane.showInputDialog(null, "Aumentar Quanto?", "TV", JOptionPane.QUESTION_MESSAGE));

                            tv.mudarVolume(diminuirVolume);

                            break;

                        case "MostrarTV" :


                            break;
                    }

                    break;

                case "trocarCanal" :

                    int canalTrocado;

                    canal = Integer.parseInt(JOptionPane.showInputDialog(null, "Escolha um Canal", "TV", JOptionPane.QUESTION_MESSAGE));

                    break;


            }

        } while (opcao != "sairTV");




    }

}
