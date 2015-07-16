package starter.app.dao;

import org.springframework.stereotype.Repository;

@Repository
public class HelloDao {

    private static final String INDEX = "index";

    public String getHelloViewLocation() {
        return INDEX;
    }
}
