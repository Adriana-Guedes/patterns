package br.com.hcode.bridge;

import br.com.hcode.bridge.platforms.Facebook;
import br.com.hcode.bridge.platforms.IPlatform;
import br.com.hcode.bridge.platforms.TwitchTV;
import br.com.hcode.bridge.platforms.Youtube;
import br.com.hcode.bridge.transmissions.AdvancedLive;
import br.com.hcode.bridge.transmissions.Live;
import br.com.hcode.bridge.transmissions.RecordLive;

import java.sql.SQLOutput;


public class Main {



    public static void main(String[] args) {
        String divisao = ("""
                
                ===========================================
                ===========================================
                """);



        startLive(new Youtube());
        System.out.println(divisao);

        startLive(new Facebook());
        System.out.println(divisao);

        startLive(new TwitchTV());
        System.out.println(divisao);


    }

    public static void startLive(IPlatform platform){
         //================= UM DE CADA VEZ ===================

      /*
        System.out.println("======== Aguarde ========!");
        Live live = new Live(platform);
        live.broadcasting();
        live.result();
       */

        //================= CHAMADO DOS 3 AO MESMO TEMPO ===================
        System.out.println("Trasmissão Avançada... Aguarde");
        AdvancedLive advancedLive = new AdvancedLive(platform);
        advancedLive.broadcasting();
        advancedLive.comments();
        advancedLive.subtitles();
        advancedLive.result();

        RecordLive recordLive = new RecordLive(platform);
        recordLive.record();

    }


}