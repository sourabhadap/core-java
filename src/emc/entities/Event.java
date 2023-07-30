package src.emc.entities;

import java.util.Date;

public class Event extends EMBase {
    private String description;
    private Date startDate;

    public Event(Long id, String name, String description) {
        super(id, name);
        this.description = description;
    }

    private Date endDate;
    private Organizer organizer;


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Organizer getOrganizer() {
        return organizer;
    }

    public void setOrganizer(Organizer organizer) {
        this.organizer = organizer;
    }
}
