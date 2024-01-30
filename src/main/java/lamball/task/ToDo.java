package lamball.task;

import java.time.format.DateTimeParseException;

public class ToDo extends Task {

    /**
     * Constructor for ToDo task.
     *
     * @param description Name of todo task.
     */
    public ToDo(String description) {
        super(description);
    }


    @Override
    public String command() {
        return "todo " + description;
    }
    @Override
    public String toString() {
        return "[T]" + super.toString();
    }
}
