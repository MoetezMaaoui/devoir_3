package com.moetez.driver.service;

import com.moetez.driver.dto.APIResponseDto;

public interface DriverService {
    APIResponseDto getDriverById(Long id);
}
