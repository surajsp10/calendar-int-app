package com.assignment.infotech.calendar;
public class Event {
    private String summary; // Event title/subject
    private String start;   // Event start date-time
    private String end;     // Event end date-time

    // Default constructor
    public Event() {}

    // Parameterized constructor
    public Event(String summary, String start, String end) {
        this.summary = summary;
        this.start = start;
        this.end = end;
    }

    // Getters and Setters
    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    @Override
    public String toString() {
        return "Event{" +
                "summary='" + summary + '\'' +
                ", start='" + start + '\'' +
                ", end='" + end + '\'' +
                '}';
    }
}
