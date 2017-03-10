package testlearn;

import learn.partTwo.springMVC.controller.LearnWebSocketController;
import learn.partTwo.springMVC.service.EchoService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.mockito.Matchers.any;
import static org.mockito.Mockito.when;

/**
 * Created by clz on 2017/2/2.
 */
@RunWith(SpringJUnit4ClassRunner.class)
public class ControllerMain {
    @InjectMocks
    private LearnWebSocketController controller;

    @Mock
    private EchoService echoService;
    private MockMvc mockMvc;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        this.mockMvc = MockMvcBuilders.standaloneSetup(controller).build();
        when(echoService.saySome(Mockito.anyString())).thenReturn("sssss");
    }

    @Test
    public void testNormalController() throws Exception {
        ResultActions ras = this.mockMvc.perform(
                MockMvcRequestBuilders.get("/greeting/echo/sssss"));
        MvcResult mr = ras.andReturn();
        System.out.println(mr.getResponse().getContentAsString());
    }

    @Test
    public void testMessageController()throws Exception{
        ResultActions ras = this.mockMvc.perform(
                MockMvcRequestBuilders.get("/welcome"));
        MvcResult mr = ras.andReturn();
        System.out.println(mr.getResponse().getContentAsString());
    }

}
