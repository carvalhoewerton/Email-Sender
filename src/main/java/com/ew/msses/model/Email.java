package com.ew.msses.model;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Email {
    private String from;
    private String to;
    private String subject;
    private String content;
}
