package com.example.Interactions;
import static org.mockito.Mockito.*;
import org.junit.jupiter.api.Test;

public class NotificationServiceTest {
	 @Test
	    public void testEmailIsSent() {
	        EmailSender mockSender = mock(EmailSender.class);
	        NotificationService service = new NotificationService(mockSender);
	        service.notifyUser();
	        verify(mockSender).sendEmail("user@example.com");
	    }

}
