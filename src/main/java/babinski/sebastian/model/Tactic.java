package babinski.sebastian.model;

import org.hibernate.validator.constraints.URL;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name = "tactic")
public class Tactic {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Column(name = "tactic_name")
    private String tacticName;

    @NotBlank
    @Column(name = "tactic_map")
    private String tacticMap;

    @NotBlank
    @Column(name = "tactic_side")
    private String tacticSide;

    @NotBlank
    @Column(name = "tactic_round")
    private String tacticRound;

    @NotBlank
    @Size(max = 400)
    @Column(name = "tactic_text")
    private String tacticText;

    @URL
    @Column(name = "tactic_url")
    private String tacticURL;

    @ManyToOne
    private User user;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTacticName() {
        return tacticName;
    }

    public void setTacticName(String tacticName) {
        this.tacticName = tacticName;
    }

    public String getTacticMap() {
        return tacticMap;
    }

    public void setTacticMap(String tacticMap) {
        this.tacticMap = tacticMap;
    }

    public String getTacticRound() {
        return tacticRound;
    }

    public void setTacticRound(String tacticRound) {
        this.tacticRound = tacticRound;
    }

    public String getTacticText() {
        return tacticText;
    }

    public void setTacticText(String tacticText) {
        this.tacticText = tacticText;
    }

    public String getTacticURL() {
        return tacticURL;
    }

    public void setTacticURL(String tacticURL) {
        this.tacticURL = tacticURL;
    }

    public String getTacticSide() {
        return tacticSide;
    }

    public void setTacticSide(String tacticSide) {
        this.tacticSide = tacticSide;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

}
