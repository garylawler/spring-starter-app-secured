package starter.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import starter.app.dao.HelloDao;

@Service
public class HelloService {

    @Autowired
    protected HelloDao helloDao;

    public String getHelloViewLocation() {
        return helloDao.getHelloViewLocation();
    }
}
