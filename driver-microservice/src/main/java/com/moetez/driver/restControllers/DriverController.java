package com.moetez.driver.restControllers;

import com.moetez.driver.dto.APIResponseDto;
import com.moetez.driver.service.DriverService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/drivers")
@AllArgsConstructor
public class DriverController {
    private DriverService driverService;

    @GetMapping("{id}")
    public ResponseEntity<APIResponseDto> getDriverById(@PathVariable("id") Long id) {
        return new ResponseEntity<APIResponseDto>(
                driverService.getDriverById(id), HttpStatus.OK);
    }
}