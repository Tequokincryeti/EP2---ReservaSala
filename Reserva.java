import java.time.LocalDateTime;

public class Reserva extends Sala{   
    private String nome;
    private LocalDateTime inicio;
    private LocalDateTime fim;

    public Reserva(){        
    }
    
    public Reserva(String nome){
        super(nome);
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }
    public void setInicio(LocalDateTime inicio) {
        this.inicio = inicio;
    }
    public LocalDateTime getInicio() {
        return inicio;
    }
    public void setFim(LocalDateTime fim) {
        this.fim = fim;
    }
    public LocalDateTime getFim() {
        return fim;
    }
}