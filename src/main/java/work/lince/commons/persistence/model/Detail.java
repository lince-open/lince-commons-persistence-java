package work.lince.commons.persistence.model;

import java.time.ZonedDateTime;

public interface Detail {

    ZonedDateTime getDate();
    void setDate(ZonedDateTime date);
    String getUser();
    void setUser(String user);

}
