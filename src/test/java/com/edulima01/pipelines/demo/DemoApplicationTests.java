package com.edulima01.pipelines.demo;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
@SpringBootTest
@AutoConfigureMockMvc
class DemoApplicationTests {

    @Autowired
    private MockMvc mockMvc;

	@Test
	void contextLoads() {
	}
	
	@Test
	void thatDivisionsByZeroThrowBadRequestException() throws Exception {
		this.mockMvc.perform(get("/Math/Divide?first=4&second=0")).andExpect(status().isBadRequest());
	}

}
