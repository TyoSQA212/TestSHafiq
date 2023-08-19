package com.Test_Shafiq.Utils;

public enum TestScenarios {


    T1("User invalid login"),
    T2("User valid login"),
    T3("TCC.JC.081 User Buka Menu Benefit"),
    T4("User tambah data benefit"),
    T5("User tambah data benefit angka huruf"),
    T6("User tambah symbol"),
    T7("TCC.JC.069 Input Judul satu kosong"),
    T8("TCC.JC.070 Input Judul satu angka huruf"),
    T9("TCC.JC.071 Input Judul satu simbol"),
    T10("TCC.JC.072 Input deskripsi satu kosong"),
    T11("TCC.JC.073 Input deskripsi satu angka huruf"),
    T12("TCC.JC.074 Input deskripsi satu simbol"),
    T13("TCC.JC.075 Input Judul dua kosong"),
    T14("TCC.JC.076 Input Judul dua angka huruf"),
    T15("TCC.JC.077 Input Judul dua simbol"),
    T16("TCC.JC.078 Input deskripsi dua kosong"),
    T17("TCC.JC.079 Input deskripsi dua angka huruf"),
    T18("TCC.JC.080 Input deskripsi dua simbol"),
    T19("TCC.JC.081 Input Judul tiga kosong"),
    T20("TCC.JC.082 Input Judul tiga angka huruf"),
    T21("TCC.JC.083 Input Judul tiga simbol"),
    T22("TCC.JC.084 Input deskripsi tiga kosong"),
    T23("TCC.JC.085 Input deskripsi tiga angka huruf"),
    T24("TCC.JC.086 Input deskripsi tiga simbol"),
    T25("TCC.JC.087 Input Judul empat kosong"),
    T26("TCC.JC.088 Input Judul empat angka huruf"),
    T27("TCC.JC.089 Input Judul empat simbol"),
    T28("TCC.JC.090 Input deskripsi empat kosong"),
    T29("TCC.JC.091 Input deskripsi empat angka huruf"),
    T30("TCC.JC.092 Input deskripsi empat simbol"),
    T31("TCC.JCC.109 Edit Judul Semua"),
    T32("TCC.JCC.110 Edit Semua Angka Huruf"),
    T33("TCC.JCC.111 Edit Semua Data Simbol"),
    T34("TCC.JCC.112 Edit Judul Satu"),
    T35("TCC.JCC.113 Edit Judul Satu Angka Huruf"),
    T36("TCC.JCC.114 Edit Judul Satu Simbol"),
    T37("TCC.JC.141 User Masuk Ke Menu Blog"),
    T38("TCC.JC.148 User Input Judul Blog"),
    T39("TCC.JC.149 Kosongkan Judul Blog"),
    T40("TCC.JC.150 User Publish Active Blog"),
    T41("TCC.JC.151 User Publish Noactive Blog"),
    T42("TCC.JC.152 User Pilih Set To Home Yes Blog"),
    T43("TCC.JC.153 User Pilih Set To Home No Blog"),
    T44("TCC.JC.154 User Input Content Priview Blog"),
    T45("TCC.JC.155 kosongkan Content Priview Blog"),
    T46("TCC.JC.156 User Content Blog"),
    T47("TCC.JC.157 Kosongkan Content Blog"),
    T48("TCC.JC.160 User Edit Foto Blog"),
    T49("TCC.JC.161 User Edit Judul Blog"),
    T50("TCC.JC.162 User Edit Active Blog"),
    T51("TCC.JC.163 User Edit Noactive Blog"),
    T52("TCC.JC.164 User Edit Settohome Yes Blog"),
    T53("TCC.JC.165 User Edit Settohome No Blog"),
    T54("TCC.JC.166 User Edit Content Priview Blog"),
    T55("TCC.JC.167 User Edit Content Blog");





    private String testName;

    TestScenarios(String value) {
        testName = value;
    }

    public String getTestName() {
        return testName;
    }


}
