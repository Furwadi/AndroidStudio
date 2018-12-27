package com.project.pung.submdicoding;

import java.util.ArrayList;

public class BinatangData {
    public static String[][] data = new String[][]{
            {"Harimau", "Harimau (bahasa Latin: Panthera tigris) adalah hewan yang tergolong dalam filum Chordata, subfilum vertebrata, kelas mamalia, pemakan daging (karnivora), keluarga felidae (kucing), genus panthera, dan tergolong dalam spesies tigris.\n" +
                    "\n" +
                    "Harimau adalah jenis kucing terbesar dari spesiesnya, bahkan lebih besar dari singa. Harimau juga adalah kucing tercepat kedua dalam berlari, setelah citah. Dalam keseluruhan karnivora, harimau adalah kucing karnivora terbesar dan karnivora terbesar ketiga setelah beruang kutub dan beruang coklat.\n" +
                    "\n" +
                    "Harimau biasanya memburu mangsa yang agak besar seperti rusa sambar, kijang, babi, atau kancil. Namun, harimau akan memburu hewan kecil seperti landak apabila mangsa yang agak besar itu tidak ada. Meskipun berasal dari keluarga yang sama, harimau berbeda dengan kucing biasa yang kecil, harimau sangat suka berenang, dan pada dasarnya kucing takut dengan air.\n" +
                    "\n" +
                    "Sumber: Wikipedia",  "http://1.bp.blogspot.com/-Zv0JikVxMUE/T4DtIJSaD9I/AAAAAAAAF1M/sMORUFA8K88/s1600/indo-chinese-tiger.jpg"},
            {"Kangguru", "Kanguru atau kangguru adalah hewan mamalia yang memiliki kantung (marsupialia). Hewan ini termasuk hewan khas Australia. Kata kanguru diambil dari bahasa Aborigin gangguru.\n" +
                    "\n" +
                    "Sumber: Wikipedia", "https://2.bp.blogspot.com/-wmb4Jp521Vg/WCr-JzsA7MI/AAAAAAAADNo/JqJVK2QUiYUs8A99WYmdIDhgrzF0hV5xQCLcB/s1600/a.jpg"},
            {"Komodo", "Komodo, atau yang selengkapnya disebut biawak komodo (Varanus komodoensis[1]), adalah spesies kadal terbesar di dunia yang hidup di pulau Komodo, Rinca, Flores, Gili Motang, dan Gili Dasami di Nusa Tenggara.[2] Biawak ini oleh penduduk asli pulau Komodo juga disebut dengan nama setempat ora.\n" +
                    "\n" +
                    "Sumber: Wikipedia", "http://1.bp.blogspot.com/--Dt_v4Azd4c/VBSmFuwwcxI/AAAAAAAAE8M/_IseAzxnghg/s1600/Akomodo.jpg"},
            {"Laba-laba", "Laba-laba, atau disebut juga labah-labah, adalah sejenis hewan berbuku-buku (arthropoda) dengan dua segmen tubuh, empat pasang kaki, tak bersayap, dan tak memiliki mulut pengunyah. Semua jenis laba-laba digolongkan ke dalam ordo Araneae; dan bersama dengan kalajengking, ketonggeng, tungau —semuanya berkaki delapan— dimasukkan ke dalam kelas Arachnida. Bidang studi mengenai laba-laba disebut arachnologi.\n" +
                    "\n" +
                    "Araneae adalah ordo terbesar dalam arachnida dan peringkat ketujuh dalam total keragaman spesies di antara seluruh ordo organismse.[2] Laba-laba dapat ditemukan di seluruh dunia di setiap benua kecuali di Antartika, dan telah bertahan lama di hampir semua habitat dengan perkecualian kolonisasi udara dan laut. Hingga Februari 2016, sedikitnya 45.800 spesies[3] dan 114 suku laba-laba telah dicatat oleh para taksonomis.[1] Tetapi, telah terjadi perpecahan di dalam komunitas ilmiah mengenai cara semua suku-suku tersebut diklasifikasikan karena sejak tahun 1900 telah ada lebih dari 20 klasifikasi berbeda telah diusulkan.[4]\n" +
                    "\n" +
                    "Laba-laba merupakan hewan pemangsa (karnivora), bahkan kadang-kadang kanibal. Mangsa utamanya adalah serangga. Hampir semua jenis laba-laba, dengan perkecualian sekitar 150 spesies dari suku Uloboridae dan Holarchaeidae, dan subordo Mesothelae, mampu menginjeksikan bisa melalui sepasang taringnya kepada musuh atau mangsanya. Meski demikian, dari puluhan ribu spesies yang ada, hanya sekitar 200 spesies yang gigitannya dapat membahayakan manusia.\n" +
                    "\n" +
                    "Tidak semua laba-laba membuat jaring untuk menangkap mangsa, akan tetapi semuanya mampu menghasilkan benang sutera—yakni helaian serat protein yang tipis namun kuat—dari kelenjar (disebut spinneret) yang terletak di bagian belakang tubuhnya. Serat sutera ini amat berguna untuk membantu pergerakan laba-laba, berayun dari satu tempat ke tempat lain, menjerat mangsa, membuat kantung telur, melindungi lubang sarang, dan lain-lain. \n" +
                    "\n" +
                    "Sumber: Wikipedia", "https://cdn1-production-images-kly.akamaized.net/59IB3fKHakgQChPWKBZKbSJknVw=/640x360/smart/filters:quality(75):strip_icc():format(jpeg)/kly-media-production/medias/1826523/original/043281900_1515574199-800px-Hogna_lenta_18.jpg"},

    };

    public static ArrayList<Binatang> getListData(){
        Binatang binatang = null;
        ArrayList<Binatang> list = new ArrayList<>();
        for (int i = 0; i <data.length; i++) {
            binatang = new Binatang();
            binatang.setName(data[i][0]);
            binatang.setRemarks(data[i][1]);
            binatang.setPhoto(data[i][2]);

            list.add(binatang);
        }

        return list;
    }
}
