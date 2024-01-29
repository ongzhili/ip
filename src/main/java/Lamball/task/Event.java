package Lamball.task;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.time.format.DateTimeFormatter;
public class Event extends Task {
    protected LocalDate from;
    protected LocalDate to;
    public Event(String description, String from, String to) throws DateTimeParseException {
        super(description);
        this.from = LocalDate.parse(from);
        this.to = LocalDate.parse(to);
    }
    @Override
    public String command() {
        return "event " + description + " /from " + from + " /to " + to;
    }
    @Override
    public String toString() {
        String formattedFrom = from.format(DateTimeFormatter.ofPattern("MMM d yyyy"));
        String formattedTo = to.format(DateTimeFormatter.ofPattern("MMM d yyyy"));
        return "[E]" + super.toString() + " (from: " + formattedFrom + " to: " + formattedTo + ")";
    }
}
