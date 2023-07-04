package id.learn.dynamicwhere.entity;

import id.learn.dynamicwhere.enums.KotaAddress;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import org.hibernate.proxy.HibernateProxy;

import java.io.Serial;
import java.io.Serializable;
import java.util.Objects;

/**
 * Project Name     : dynamic-where
 * Date Time        : 6/10/2020
 *
 * @author Teten Nugraha
 */

@Table(name = "students")
@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Student implements Serializable {

    @Serial
    private static final long serialVersionUID = 7992605505968336945L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @NotEmpty
    private String name;

    @NotNull
    private Integer age;

    @NotBlank
    @NotEmpty
    private String address;

    @NotNull
    @Enumerated(EnumType.STRING)
    private KotaAddress kotaAddress;

    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (getClass() != o.getClass()) return false;
        Class<?> oEffectiveClass = o instanceof HibernateProxy hibernateProxy ? (hibernateProxy).getHibernateLazyInitializer().getPersistentClass() : o.getClass();
        Class<?> thisEffectiveClass = this instanceof HibernateProxy hibernateProxy ? (hibernateProxy).getHibernateLazyInitializer().getPersistentClass() : this.getClass();
        if (thisEffectiveClass != oEffectiveClass) return false;
        Student student = (Student) o;
        return getId() != null && Objects.equals(getId(), student.getId());
    }

    @Override
    public final int hashCode() {
        return getClass().hashCode();
    }
}
