package com.assignment.infotech.calendar;

import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;

import java.io.IOException;
// import com.microsoft.graph.models.Event;
import java.util.List;

@RestController
@RequestMapping("/api/calendar")
public class CalendarController {

    @GetMapping("/events")
    public ResponseEntity<List<Event>> getCalendarEvents() throws IOException {
        // Call Microsoft Graph API logic here
        GoogleCalendarAgent agent = new GoogleCalendarAgent();
        String accessToken = "YOUR_ACCESS_TOKEN"; // Replace with dynamic token retrieval
        List<Event> events = agent.getCalendarEvents(accessToken);

        return ResponseEntity.ok(events);
    }
}

