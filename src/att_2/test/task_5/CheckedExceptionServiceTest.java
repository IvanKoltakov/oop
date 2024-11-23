package att_2.test.task_5;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

import att_2.task_5.exceptions.CheckedException;
import att_2.task_5.services.CheckedExceptionService;

public class CheckedExceptionServiceTest {
    private final CheckedExceptionService service = new CheckedExceptionService();

    @Test
    public void testThrowCheckedException() {
        assertThrows(CheckedException.class, service::throwCheckedException);
    }

    @Test
    public void testCheckedException() {
        assertDoesNotThrow(service::catchCheckedException);
    }
}
