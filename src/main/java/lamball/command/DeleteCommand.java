package lamball.command;

import lamball.TaskList;

/**
 * Command that creates a given task
 */
public class DeleteCommand extends Command {
    private TaskList taskList;
    private int idx;

    /**
     * Constructor for delete command.
     *
     * @param idx Index of list to delete.
     * @param tasks TaskList to delete from.
     */
    public DeleteCommand(int idx, TaskList tasks) {
        this.taskList = tasks;
        this.idx = idx;
    }

    @Override
    public boolean run() {
        assert idx > 0 : "index should be non-negative and non-zero";
        assert idx <= taskList.size() : "index should be within the bound of task list";

        taskList.deleteFromList(idx);
        return true;
    }
}
