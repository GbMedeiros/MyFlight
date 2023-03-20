package entities;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.chrono.ChronoLocalDate;
import java.util.Date;

/*
    Vôo: é descrito por uma data e horário, duração, rota e estado.
*/
public class Voo {
    private LocalDate data;
    private LocalTime hora;
    private LocalTime duracao;
    private Rota rota;
    private String status;

    public Voo(int ano, int mes, int dia, int hora, int min, int h, int m, Rota rt, String sts) {
        data = LocalDate.of(ano,mes,dia);
        this.hora = LocalTime.of(hora, min);
        duracao = LocalTime.of(h, m);
        rota = rt;
        status = sts;
    }

    public LocalDate getData() {
        return data;
    }

    public LocalTime getHora() {
        return hora;
    }

    public LocalTime getDuracao() {
        return duracao;
    }

    public Rota getRota() {
        return rota;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String sts) {
        status = sts;
    }
    @Override
    public String toString(){
        return String.format("%tF | %s | %s | %s | %s", data, hora, duracao, rota.getRota(),status);
    }
}
