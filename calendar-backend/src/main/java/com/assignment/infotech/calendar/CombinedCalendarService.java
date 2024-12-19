package com.assignment.infotech.calendar;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class CombinedCalendarService {

    @Autowired
    private GoogleCalendarAgent googleAgent;

    // @Autowired
    //private MicrosoftCalendarAgent microsoftAgent;

    public List<Event> getAllEvents(String googleToken, String microsoftToken) throws Exception {
        List<Event> combinedEvents = new ArrayList<>();
        combinedEvents.addAll(googleAgent.getCalendarEvents(googleToken));
       // combinedEvents.addAll(microsoftAgent.getCalendarEvents(microsoftToken));
        return combinedEvents;
    }
}
