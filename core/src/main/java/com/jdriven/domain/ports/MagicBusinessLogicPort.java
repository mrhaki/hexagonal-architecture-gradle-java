package com.jdriven.domain.ports;

import com.jdriven.domain.models.DomainData;

/**
 * Object for interpreting core data
 */
public interface MagicBusinessLogicPort {
    void interpretData(DomainData inputData);
}

