package rs.ac.bg.fon.njt.softver_za_rezervaciju_sala.domain;

import jakarta.persistence.*;

@Entity
@Table(name = "svrha_rezervacije")
public class SvrhaRezervacije {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;
    @Column(name="svrha")
    private String svrha;
    @Column(name="opis")
    private String opis;
    @Column(name="organizator")
    private String organizator;

    public SvrhaRezervacije() {
    }

    public SvrhaRezervacije(String svrha, String opis, String organizator) {
        this.svrha = svrha;
        this.opis = opis;
        this.organizator = organizator;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSvrha() {
        return svrha;
    }

    public void setSvrha(String svrha) {
        this.svrha = svrha;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public String getOrganizator() {
        return organizator;
    }

    public void setOrganizator(String organizator) {
        this.organizator = organizator;
    }

    @Override
    public String toString() {
        return "SvrhaRezervacije{" +
                "id=" + id +
                ", svrha='" + svrha + '\'' +
                ", opis='" + opis + '\'' +
                ", organizator='" + organizator + '\'' +
                '}';
    }
}
