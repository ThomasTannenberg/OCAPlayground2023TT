package Uebung7.Kalender;

public enum Uhrzeit {
    _00_00, _01_00, _02_00, _03_00, _04_00, _05_00,
    _06_00, _07_00, _08_00, _09_00, _10_00, _11_00,
    _12_00, _13_00, _14_00, _15_00, _16_00, _17_00,
    _18_00, _19_00, _20_00, _21_00, _22_00, _23_00;

    @Override
    public String toString() {
        return name().substring(1).replace('_', ':');
    }
}

