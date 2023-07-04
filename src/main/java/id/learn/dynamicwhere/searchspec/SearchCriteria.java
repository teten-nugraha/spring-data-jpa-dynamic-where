package id.learn.dynamicwhere.searchspec;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;

/**
 * Project Name     : dynamic-where
 * Date Time        : 6/10/2020
 *
 * @author Teten Nugraha
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SearchCriteria implements Serializable {

    @Serial
    private static final long serialVersionUID = 2535708513751973761L;

    private String key;
    private transient Object value;

    @NotNull
    @Enumerated(EnumType.STRING)
    private SearchOperation operation;

}