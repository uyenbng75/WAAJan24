package miu.edu.waa_jan24.service.impl;

import miu.edu.waa_jan24.entity.Logger;
import miu.edu.waa_jan24.repo.LoggerRepo;
import miu.edu.waa_jan24.service.LoggerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoggerServiceImpl implements LoggerService {

    @Autowired
    LoggerRepo loggerRepo;

    @Override
    public void saveLogger (Logger l){
        loggerRepo.save(l);
    }
}
