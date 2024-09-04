package com.cpf.validation;

public class DV {

    public static int firstDV(long cpf) {
        cpf = cpf / 100;

        int n9 = (int) (cpf % 10) * 2;
        int n8 = (int) ((cpf / 10) % 10) * 3;
        int n7 = (int) ((cpf / 100) % 10) * 4;
        int n6 = (int) ((cpf / 1000) % 10) * 5;
        int n5 = (int) ((cpf / 10000) % 10) * 6;
        int n4 = (int) ((cpf / 100000) % 10) * 7;
        int n3 = (int) ((cpf / 1000000) % 10) * 8;
        int n2 = (int) ((cpf / 10000000) % 10) * 9;
        int n1 = (int) ((cpf / 100000000) % 10) * 10;

        int soma = n9 + n8 + n7 + n6 + n5 + n4 + n3 + n2 + n1;
        soma = soma % 11;

        int result = 11 - soma;

        if (result > 9) {
            return 0;
        } else {
            return result;
        }
    }

    public static int secondDV(long cpf) {
        int n10 = (int) (cpf % 10) * 2;
        int n9 = (int) ((cpf / 10) % 10) * 3;
        int n8 = (int) ((cpf / 100) % 10) * 4;
        int n7 = (int) ((cpf / 1000) % 10) * 5;
        int n6 = (int) ((cpf / 10000) % 10) * 6;
        int n5 = (int) ((cpf / 100000) % 10) * 7;
        int n4 = (int) ((cpf / 1000000) % 10) * 8;
        int n3 = (int) ((cpf / 10000000) % 10) * 9;
        int n2 = (int) ((cpf / 100000000) % 10) * 10;
        int n1 = (int) ((cpf / 1000000000) % 10) * 11;

        int soma = n10 + n9 + n8 + n7 + n6 + n5 + n4 + n3 + n2 + n1;

        int result = 11 - (soma % 11);

        if (result > 9) {
            return 0;
        } else {
            return result;
        }
    }
}
