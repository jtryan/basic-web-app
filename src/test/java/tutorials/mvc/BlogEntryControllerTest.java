package tutorials.mvc;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultMatcher;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import tutorial.mvc.BlogEntryController;

import static org.hamcrest.Matchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

/**
 * Created by john on 2/21/16.
 * Copyright 2016
 */
public class BlogEntryControllerTest {
    @InjectMocks
    private BlogEntryController controller;

    private MockMvc mockMvc;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);

        mockMvc = MockMvcBuilders.standaloneSetup(controller).build();
    }

    @Test
    public void test() throws Exception {
        // mockMvc.perform(get("/test")).andDo(print());
        mockMvc.perform(post("/test")
                .content("{\"title\":\"Test Blog Entry Send n Recieve\"}")
                .contentType(MediaType.APPLICATION_JSON)
        )
                .andExpect(jsonPath("$.title", is("Test Blog Entry Send n Recieve")))
                .andDo(print());
    }
}
