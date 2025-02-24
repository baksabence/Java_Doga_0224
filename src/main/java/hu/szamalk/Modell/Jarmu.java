package hu.szamalk.Modell;

import java.util.UUID;

public class Jarmu implements Cloneable{
    private UUID id;
    private String szin;
    private Tulajdonos tulajdonos;

    public Jarmu(UUID id, Tulajdonos tulajdonos, String szin) {
        this.id = UUID.randomUUID();
        this.tulajdonos = tulajdonos;
        this.szin = szin;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getSzin() {
        return szin;
    }

    public void setSzin(String szin) {
        this.szin = szin;
    }

    public Tulajdonos getTulajdonos() {
        return tulajdonos;
    }

    public void setTulajdonos(Tulajdonos tulajdonos) {
        this.tulajdonos = tulajdonos;
    }
}
