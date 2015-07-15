package starter.app;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Test;
import org.mockito.MockitoAnnotations;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

public class HelloControllerTest {

    private HelloController helloController;
    private MockHttpServletRequestBuilder requestBuilder;
    private MockMvc mockMvc;

    @Before
    public void onSetUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        helloController = new HelloController();
        mockMvc = MockMvcBuilders.standaloneSetup(helloController).build();

        requestBuilder = MockMvcRequestBuilders.get("/");
    }

    @Test
    public void upgradeSuccess() throws Exception {
        mockMvc.perform(requestBuilder)
                .andExpect(status().isOk())
                .andReturn();
    }
}
