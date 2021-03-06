/*
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See LICENSE in the project root for
 * license information.
 */

package com.example;

import com.microsoft.azure.spring.integration.eventhub.EventHubOperation;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * {@link EventHubOperation} code sample.
 *
 * @author Warren Zhu
 */
@SpringBootApplication
public class EventHubOperationApplication {

    public static void main(String[] args) {
        SpringApplication.run(EventHubOperationApplication.class, args);
    }
}
