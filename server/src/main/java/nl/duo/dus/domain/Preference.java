package nl.duo.dus.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.util.Set;

@Accessors(chain = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "PREFERENCE")
public class Preference {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "EXPRESS_CODE", nullable = false)
    private Long expressCode;

    @Column(name = "DESCRIPTION", length = 50, nullable = false)
    private String description;

    @Column(name = "EXTRAS", length = 100)
    private String extras;

    @OneToMany(mappedBy = "Preference")
    private Set<Person> persons;

    public Long getExpressCode() {
        return expressCode;
    }

    public void setExpressCode(final Long expressCode) {
        this.expressCode = expressCode;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(final String description) {
        this.description = description;
    }

    public String getExtras() {
        return extras;
    }

    public void setExtras(final String extras) {
        this.extras = extras;
    }

    public void setId(final Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
