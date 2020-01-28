package com.kaushikam.billdesk.domain.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "consumer")
public class Consumer {
    @Id
    @Column(name = "cons_id_no")
    private String consumerId;

    @Column(name = "cons_name")
    private String name;

    public Consumer() { }

    public Consumer(String consumerId, String name) {
        this.consumerId = consumerId;
        this.name = name;
    }

    public String getConsumerId() {
        return consumerId;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Consumer{" +
                "consumerId='" + consumerId + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}