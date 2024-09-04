package entities;

public class Rent {
    private String nome;
    private String email;
    private int room;

    public Rent(String nome, String email, int room) {
        this.nome = nome;
        this.email = email;
        this.room = room;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public int getRoom() {
        return room;
    }
}
