package com.mailwave.api.modules.sent.models;

public class SentAttachment {

    //TO DO: Implements

}

/*
--Referência para criação do modelo
CREATE SEQUENCE SEQ_SENT_ATTACHMENTS
    START WITH 1
    INCREMENT BY 1
    NOCACHE
    NOCYCLE;

CREATE TABLE TBL_SENT_ATTACHMENTS (
    ATTACHMENT_ID NUMBER PRIMARY KEY,
    MESSAGE_ID NUMBER NOT NULL,
    FILE_NAME VARCHAR2(255) NOT NULL,
    FILE_TYPE VARCHAR2(50),
    FILE_DATA BLOB,
    FOREIGN KEY (MESSAGE_ID) REFERENCES TBL_SENT_MESSAGES(MESSAGE_ID)
);
 */