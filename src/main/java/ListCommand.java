import java.text.ParseException;
import java.util.ArrayList;

public class ListCommand extends Command {
    public ListCommand() {}

    @Override
    public void execute(TaskList tasks, Ui ui, Storage storage) throws ParseException {
        super.execute(tasks, ui, storage);
        ArrayList<Task> list = tasks.getTasks();
        ui.list(list);
    }
}