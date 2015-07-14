/*
 * Copyright 2015 Technology Nexus. All rights reserved.
 * Nexus Technology PROPRIETARY/CONFIDENTIAL.
 * Use is subject to license terms. www.nexusgroup.com
 */
package demo.web;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@RestController
public class OneController {

    private Map<Integer, SessionInfo> sessions = new HashMap<>();

    @RequestMapping(value = "/sessionInfo/{id}", method = RequestMethod.GET)
    public SessionInfo sessionInfo(@PathVariable int id) {
        return sessions.get(id);
    }

    @RequestMapping(value = "/sessionInfo", method = RequestMethod.PUT)
    public void createSession(String queryData) {
        int id = sessions.size();
        SessionInfo si = new SessionInfo();
        si.setId(id);
        si.setQuery(queryData);
        si.setSalt(UUID.randomUUID().toString());
        sessions.put(id, si);
    }

    @RequestMapping(value = "/sessionInfo/{id}", method = RequestMethod.POST)
    public void createSession(@PathVariable int id, @RequestBody SessionInfo sessionInfo) {
        sessions.put(sessionInfo.getId(), sessionInfo);
    }

}
