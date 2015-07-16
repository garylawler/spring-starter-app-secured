package starter.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class SimpleViewMappingController {

    @RequestMapping(value = "/authenticate")
    public String getLoginPage() {
        return "authenticate";
    }

    @RequestMapping(value = "/loggedOut")
    public String getLogoutPage(HttpServletRequest request) {
        request.getSession().invalidate();
        return "loggedOut";
    }
}
