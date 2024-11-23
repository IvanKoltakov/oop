package att_2.task_5.services;
import att_2.task_5.exceptions.UncheckedException;
public class UncheckedExceptionService {
    public void throwUncheckedException() {
        throw new UncheckedException("This is an unchecked exception.");
    }
}