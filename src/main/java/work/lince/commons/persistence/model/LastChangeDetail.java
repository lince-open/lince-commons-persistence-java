package work.lince.commons.persistence.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;
import java.time.ZonedDateTime;

@Embeddable
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LastChangeDetail implements Detail {

    @Column(name = "DATE_LAST")
    private ZonedDateTime date;

    @NotNull
    @Column(name = "USER_LAST", length = 50)
    private String user;

}
