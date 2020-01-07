package work.lince.commons.persistence.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import java.time.ZonedDateTime;

@Embeddable
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CreateDetail implements Detail {

    @Column(name = "DATE_CREATED")
    @Temporal(TemporalType.TIMESTAMP)
    private ZonedDateTime date;

    @NotNull
    @Column(name = "USER_CREATED", length = 50)
    private String user;

}
