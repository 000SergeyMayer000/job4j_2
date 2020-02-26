package ru.job4j2.oop.profession;

public class Doctor extends Profession {
    private String certificate;

    public String diagnoseHeal(Pacients pacients) {
        return pacients.getDiagnose();
    }
}
