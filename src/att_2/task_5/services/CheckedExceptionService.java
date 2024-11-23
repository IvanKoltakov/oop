package att_2.task_5.services;
import att_2.task_5.exceptions.CheckedException;
public class CheckedExceptionService {
    public void throwCheckedException() throws CheckedException {
        throw new CheckedException("This is a checked exception.");
    }

    public void catchCheckedException() {
        try {
            throwCheckedException();
        } catch (CheckedException e) {
            System.out.println("Caught CheckedException: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed.");
        }
    }
}
