package com.company;

import java.util.ArrayList;

import java.util.Collections;

public class Main {

    public static void main(String[] args) {
	// whererite your code

        ArrayList <String> sehirler=new ArrayList<String>();
        sehirler.add("Ankara");
        sehirler.add("İstanbul");
        sehirler.add("İzmir");

        sehirler.remove("İstanbul");
        //ArrayList içindeki veriler sıralandı
        Collections.sort(sehirler);
        for(String sehir:sehirler){
            System.out.println(sehir);
        }

    }
}
