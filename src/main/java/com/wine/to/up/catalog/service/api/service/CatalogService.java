/*
 * Copyright (c) 2020 Andrsuh INC.
 * All Rights Reserved
 *
 * This software contains the intellectual property of Andrsuh INC or is
 * licensed to Dell EMC from third parties. Use of this software and the
 * intellectual property contained therein is expressly limited to the terms and
 * conditions of the License Agreement under which it is provided by or on behalf
 * of Andrsuh INC.
 */
package com.wine.to.up.catalog.service.api.service;

import java.util.List;

/**
 * Defines an interface for communicating with kafka
 */
public interface CatalogService {
    void printMessages(Integer messageId);

    List<String> getAllMessages();
}
