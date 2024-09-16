package com.mailwave.api.modules._sent.models;

import com.mailwave.api.modules.accounts.Account;
import com.mailwave.api.modules.folders.Folder;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.EqualsAndHashCode;
import java.time.LocalDateTime;

@Getter
@Setter
@EqualsAndHashCode
@Entity
@Table(name = "TBL_SENT_MESSAGES")
public class SentMessage {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_SENT_MESSAGES")
    @SequenceGenerator(name = "SEQ_SENT_MESSAGES", sequenceName = "SEQ_SENT_MESSAGES", allocationSize = 1)
    @Column(name = "MESSAGE_ID")
    private Long id;

    @Column(name = "SUBJECT")
    private String subject;

    @Lob
    @Column(name = "BODY")
    private String body;

    @Column(name = "SENT_AT")
    private LocalDateTime sentAt;

    @ManyToOne
    @JoinColumn(name = "ACCOUNT_ID", nullable = false)
    private Account account;

    @ManyToOne
    @JoinColumn(name = "FOLDER_ID")
    private Folder folder;

    public SentMessage(Long id, String subject, String body, LocalDateTime sentAt, Account account, Folder folder) {
        this.id = id;
        this.subject = subject;
        this.body = body;
        this.sentAt = sentAt;
        this.account = account;
        this.folder = folder;
    }

    public SentMessage() {}
}