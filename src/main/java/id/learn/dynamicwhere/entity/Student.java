package id.learn.dynamicwhere.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.*;

import java.io.Serial;
import java.io.Serializable;
import java.util.Objects;

/**
 * Project Name: dynamic-where
 * Date Time: 6/10/2020
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
    @Column(name = "id")
    private Long id;

    @NotBlank
    @NotEmpty
    @NotNull
    @Column(name = "name")
    private String name;

    @NotNull
    @Positive
    @Column(name = "age")
    private Integer age;

    @NotEmpty
    @NotNull
    @Column(name = "address")
    private String address;

    @NotNull
    @Column(name = "kota_address")
    private String kotaAddress;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student student)) return false;

        if (!getId().equals(student.getId())) return false;
        if (!getName().equals(student.getName())) return false;
        if (!getAge().equals(student.getAge())) return false;
        if (!getAddress().equals(student.getAddress())) return false;
        return Objects.equals(getKotaAddress(), student.getKotaAddress());
    }

    @Override
    public int hashCode() {
        int result = getId().hashCode();
        result = 31 * result + getName().hashCode();
        result = 31 * result + getAge().hashCode();
        result = 31 * result + getAddress().hashCode();
        result = 31 * result + getKotaAddress().hashCode();
        return result;
    }
}
