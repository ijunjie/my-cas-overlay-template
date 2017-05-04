package org.pac4j.demo.spring;

import org.pac4j.core.client.Client;
import org.pac4j.core.client.Clients;
import org.pac4j.core.config.Config;
import org.pac4j.core.context.J2EContext;
import org.pac4j.core.context.WebContext;
import org.pac4j.core.exception.HttpAction;
import org.pac4j.core.profile.CommonProfile;
import org.pac4j.core.profile.ProfileManager;
import org.pac4j.http.client.indirect.FormClient;
import org.pac4j.jwt.profile.JwtGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@Controller
public class Application {

    @Autowired
    private Config config;

    @RequestMapping("/")
    public String root(HttpServletRequest request, HttpServletResponse response, Map<String, Object> map) throws HttpAction {
        return index(request, response, map);
    }

    @RequestMapping("/index.html")
    public String index(HttpServletRequest request, HttpServletResponse response, Map<String, Object> map) throws HttpAction {
        final WebContext context = new J2EContext(request, response);
        map.put("profiles", getProfiles(context));
        return "index";
    }

    private List<CommonProfile> getProfiles(final WebContext context) {
        final ProfileManager manager = new ProfileManager(context);
        return manager.getAll(true);
    }


    @RequestMapping("/cas/index.html")
    public String cas(HttpServletRequest request, HttpServletResponse response, Map<String, Object> map) {
        return protectedIndex(request, response, map);
    }


    protected String protectedIndex(HttpServletRequest request, HttpServletResponse response, Map<String, Object> map) {
        final WebContext context = new J2EContext(request, response);
        map.put("profiles", getProfiles(context));
        return "protectedIndex";
    }
}
