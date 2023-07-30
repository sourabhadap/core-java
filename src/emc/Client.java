package src.emc;

import src.emc.entities.Event;
import src.emc.entities.Organizer;

import java.util.Date;

public class Client {
    public static void main(String[] args) {
        Organizer organizer = new Organizer(12323L,"Apple Inc.");

        Event event = new Event(123L, "Apple Event 2023", "Apple WWDC 2023");
        event.setStartDate(new Date());
        event.setEndDate(new Date());
        event.setOrganizer(organizer);

        System.out.println(event);
    }
}
