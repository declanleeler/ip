package duke.task;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Event extends Task {

    private LocalDate date;

    public Event(String details, LocalDate date) {
        super(details);
        this.date = date;
    }

    @Override
    public String toString() {
        return "E" + super.toString() + " | " + this.date.format(DateTimeFormatter.ofPattern("MMM dd, yyyy"));
    }

}
