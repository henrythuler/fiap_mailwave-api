package com.mailwave.api.modules.accounts;

public class Account {

    // TO DO: Implements

}

/*
--Referência para criação do modelo
CREATE SEQUENCE SEQ_ACCOUNTS
    START WITH 1
    INCREMENT BY 1
    NOCACHE
    NOCYCLE;

CREATE TABLE TBL_ACCOUNTS (
    ACCOUNT_ID NUMBER PRIMARY KEY,
    USER_ID NUMBER NOT NULL,
    EMAIL_ADDRESS VARCHAR2(255) NOT NULL,
    PROVIDER VARCHAR2(100) NOT NULL,
    PASSWORD_HASH VARCHAR2(255) NOT NULL,
    INCOMING_SERVER VARCHAR2(255) NOT NULL,
    INCOMING_PORT NUMBER NOT NULL,
    INCOMING_PROTOCOL VARCHAR2(10) NOT NULL,
    OUTGOING_SERVER VARCHAR2(255) NOT NULL,
    OUTGOING_PORT NUMBER NOT NULL,
    USE_SSL NUMBER(1) DEFAULT 0,
    USE_TLS NUMBER(1) DEFAULT 0,
    CREATED_AT TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    UPDATED_AT TIMESTAMP,
    FOREIGN KEY (USER_ID) REFERENCES TBL_USERS(USER_ID)
);
 */