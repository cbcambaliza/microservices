package com.cbcamba.customer;

public record CustomerRegistrationRequest(
        String firstName,
        String lastName,
        String email) {
}
