package com.cpf.validation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class CpfValidator implements ConstraintValidator<ValidCPF, String> {

    @Override
    public boolean isValid(String cpf, ConstraintValidatorContext context) {
        if (cpf == null || cpf.isEmpty()) {
            return false;
        }
        return validationCPF(cpf);
    }

    private boolean validationCPF(String cpf) {
        long longCpf = convertionToLong(cpf);
        long cpfOriginal = longCpf;

        int dv1 = DV.firstDV(cpfOriginal);

        longCpf = ((longCpf / 100) * 10) + dv1;

        int dv2 = DV.secondDV(longCpf);
        longCpf = (longCpf * 10) + dv2;

        return longCpf == cpfOriginal;
    }

    public static long convertionToLong(String cpf) {
        String cleanCpf = cpf.replaceAll("[^0-9]", "");
        return Long.parseLong(cleanCpf);
    }
}
