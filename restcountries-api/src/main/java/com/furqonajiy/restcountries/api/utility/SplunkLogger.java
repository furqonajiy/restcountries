package com.furqonajiy.restcountries.api.utility;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.furqonajiy.restcountries.api.logging.TransactionLog;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class SplunkLogger {
    @Autowired
    private ObjectMapper objectMapper;

    public void info(TransactionLog transactionLog) {
        if (log.isInfoEnabled()) {
            try {
                log.info(objectMapper.writeValueAsString(transactionLog));
            } catch (Exception e) {
                log.debug("Error Splunk Logger", e);
            }
        }
    }

    public void error(TransactionLog transactionLog) {
        if (log.isErrorEnabled()) {
            try {
                log.error(objectMapper.writeValueAsString(transactionLog));
            } catch (Exception e) {
                log.debug("Error Splunk Logger", e);
            }
        }
    }
}
