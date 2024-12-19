import { Component, OnInit } from '@angular/core';
import { CalendarService, CalendarEvent } from './services/calendar.service';
import { HttpClientModule } from '@angular/common/http'; 

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  standalone: true,
  imports: [HttpClientModule],
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit {

  calendarEvents: CalendarEvent[] = [];

  constructor(private calendarService: CalendarService) { }

  ngOnInit() {
    this.fetchEvents();
  }

  fetchEvents() {
    this.calendarService.getCalendarEvents().subscribe({
      next: (events) => this.calendarEvents = events,
      error: (err) => console.error('Error fetching events:', err)
    });
  }
}
