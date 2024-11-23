package att_2.test.task_5;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertThrows;

import att_2.task_5.exceptions.UncheckedException;
import att_2.task_5.services.UncheckedExceptionService;
public class UncheckedExceptionServiceTest {
    private final UncheckedExceptionService service = new UncheckedExceptionService();

    @Test
    public void testThrowUncheckedException() {
        assertThrows(UncheckedException.class, service::throwUncheckedException);
    }
}
