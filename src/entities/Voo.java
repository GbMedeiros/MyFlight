package entities;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.chrono.ChronoLocalDate;
import java.util.Date;

/*
    Vôo: é descrito por uma data e horário, duração, rota e estado.
*/
public abstract class Voo {
    private LocalDate data;
    private LocalTime hora;
    private Duration duracao;
    private Rota rota;
    private Status status;
    private static int qtd = 0;

    public Voo(int ano, int mes, int dia, int hora, int min, int m, Rota rt, Status sts) {
        data = LocalDate.of(ano, mes, dia);
        this.hora = LocalTime.of(hora, min);
        duracao = Duration.ofMinutes(m);
        rota = rt;
        status = sts;
        qtd++;
    }
    public Voo(int m, Rota rt, Status sts){
        data = LocalDate.of(2016, 8, 12);
        this.hora = LocalTime.of(12,00);
        duracao = Duration.ofMinutes(m);
        rota = rt;
        status = sts;
        qtd++;
    }

    public LocalDate getData() {
        return data;
    }

    public LocalTime getHora() {
        return hora;
    }

    public Duration getDuracao() {
        return duracao;
    }

    public Rota getRota() {
        return rota;
    }

    public Status getStatus() {
        return status;
    }


    public void setData(LocalDate data) {
        this.data = data;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    public void setDuracao(Duration duracao) {
        this.duracao = duracao;
    }

    public void setRota(Rota rota) {
        this.rota = rota;
    }

    public void setStatus(Status sts) {
        status = sts;
    }

    public static int getQtd() {
        return qtd;
    }

    @Override
    public String toString() {
        return String.format("%tF | %s | %s | %s | %s", data, hora, duracao.toMinutes(), rota.getRota(), status);
    }
}
