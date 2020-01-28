package com.kaushikam.billdesk.domain.model;

import java.util.Optional;

public interface IConsumerRepository {
    Optional<Consumer> findByConsumerId(String consumerId);
}
