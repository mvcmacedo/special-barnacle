package pucrs.qp.gametime;

public enum DayHours {
    FULLDAY(24), HALFDAY(12);

    public int tempoEmHoras;

    DayHours(int valor) {
        tempoEmHoras = valor;
    }

    public int buscaTempoEmHoras() {
        return tempoEmHoras;
    }
}
