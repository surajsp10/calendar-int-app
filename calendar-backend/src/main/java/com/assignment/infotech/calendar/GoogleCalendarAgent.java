package com.assignment.infotech.calendar;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.springframework.stereotype.Service;

@Service
public class GoogleCalendarAgent {
    private static final String GOOGLE_CALENDAR_API_URL = "https://www.googleapis.com/calendar/v3/calendars";

    public List<Event> getCalendarEvents(String accessToken) throws IOException {
        URL url = new URL(GOOGLE_CALENDAR_API_URL + "/primary/events");
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
        connection.setRequestProperty("Authorization", "Bearer " + accessToken);

        ObjectMapper mapper = new ObjectMapper();
        JsonNode jsonNode = mapper.readTree(connection.getInputStream());
        List<Event> events = new ArrayList<>();
        jsonNode.get("items").forEach(item -> {
            Event event = new Event();
            event.setSummary(item.get("summary").asText());
            event.setStart(item.get("start").get("dateTime").asText());
            events.add(event);
        });
        return events;
    }

}
