package test.java;

import cards.User;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import server.RouteManager;

import static org.mockito.Mockito.*;


@ExtendWith(MockitoExtension.class)
public class MockitoTesting {



    @Mock
    public User userMock;


    User user;

    @Mock
    private ObjectMapper objectMapper;

    @InjectMocks
    private RouteManager classUnderTest=new RouteManager();

   @Mock
    private RouteManager classUnderTest2=new RouteManager();


    @Test
    void testPostUsersRoute() throws JsonProcessingException {
        when(objectMapper.readValue(anyString(), eq(User.class))).thenReturn(userMock);
        classUnderTest.handleRoute("POST /users","dummyUserObject","dummyToken");
        verify(userMock).register();
    }



}