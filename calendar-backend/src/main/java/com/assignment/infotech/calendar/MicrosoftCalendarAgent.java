package com.assignment.infotech.calendar;

// import java.net.URL;
// import java.util.ArrayList;
// import java.util.List;
// import java.util.concurrent.CompletableFuture;

import org.springframework.stereotype.Service;

// import com.microsoft.graph.requests.GraphServiceClient;
// import com.microsoft.graph.authentication.IAuthenticationProvider;
// import com.microsoft.graph.models.Event;
// import okhttp3.Request;
@Service
public class MicrosoftCalendarAgent {
    public void getCalendarEvents(String accessToken) {
        // // Define the Authentication Provider to attach the Bearer token
        // IAuthenticationProvider authProvider = request -> {
        //     // Use the proper header for authorization
        //     request.newBuilder()
        //            .addHeader("Authorization", "Bearer " + accessToken)
        //            .build();
        // };

        // // Initialize Graph Client
        // GraphServiceClient<Request> graphClient = GraphServiceClient
        //         .builder()
        //         .authenticationProvider(authProvider)
        //         .buildClient();

        // // Fetch Outlook calendar events
        // List<Event> events = graphClient
        //         .me()
        //         .events()
        //         .buildRequest()
        //         .get()
        //         .getCurrentPage();

        // // Print the retrieved events
        // for (Event event : events) {
        //     System.out.println("Event: " + event.subject + " | Start: " + event.start.dateTime);
        // }
    }

    public static void main(String[] args) {
        // Replace with a valid OAuth2 access token
        String accessToken = "YOUR_ACCESS_TOKEN";

        MicrosoftCalendarAgent agent = new MicrosoftCalendarAgent();
        agent.getCalendarEvents(accessToken);
    }
}
