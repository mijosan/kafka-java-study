package com.example.simplekafkaproducer.service;

import java.util.Collection;

import org.apache.kafka.clients.consumer.ConsumerRebalanceListener;
import org.apache.kafka.common.TopicPartition;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class RebalanceListener implements ConsumerRebalanceListener {

    public void onPartitionsAssigned(Collection<TopicPartition> partitions) {
        log.warn("Partitions are assigned : " + partitions.toString());

    }

    public void onPartitionsRevoked(Collection<TopicPartition> partitions) {
        log.warn("Partitions are revoked : " + partitions.toString());
    }

}