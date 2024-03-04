package com.PlatformForClothesShop.PlatformForClothesShop;

import com.PlatformForClothesShop.PlatformForClothesShop.controllers.AccessoryController;
import com.PlatformForClothesShop.PlatformForClothesShop.dto.AddAccessoryDTO;
import com.PlatformForClothesShop.PlatformForClothesShop.repositories.AccessoryRepository;
import com.PlatformForClothesShop.PlatformForClothesShop.services.AccessoryService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentMatchers;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
@WebMvcTest(AccessoryController.class)
public class AccessoryTest {
@Autowired
    private MockMvc mockMvc;
@MockBean
    AccessoryService accessoryService;
    AccessoryRepository accessoryRepository;

@Autowired
    public AccessoryTest(MockMvc mockMvc) {
        this.mockMvc = mockMvc;
    }

    @Test
    void GetAllTest() throws Exception {
        this.mockMvc
                .perform(MockMvcRequestBuilders.get("/accessory/all"))
                .andExpect(status().isOk());
    }

//    @Test
//    public void AccessoryTest2() throws Exception {
//
//        AddAccessoryDTO body = new AddAccessoryDTO();
//        body.name = "testName";
//        body.quantity = 33;
//        body.model = "test Model";
//        ObjectMapper mapper = new ObjectMapper();
//
//        String bodyJson = mapper.writeValueAsString(body);
//
//        //Mockito.when(accessoryRepository.save(ArgumentMatchers.any())).thenReturn();
//        this.mockMvc
//                .perform(MockMvcRequestBuilders.post("/accessory/add").contentType(MediaType.APPLICATION_JSON).content(bodyJson))
//                .andExpect(status().isOk())
//                .andExpect(MockMvcResultMatchers.jsonPath("$.quantity").value(33));
//
//
//    }

}
