package com.svistunovich.spring.database.repository;

import com.svistunovich.spring.database.pool.ConnectionPool;

public class UserRepository {
    private final ConnectionPool connectionPool;


    public UserRepository(ConnectionPool connectionPool) {
        this.connectionPool = connectionPool;
    }
}
