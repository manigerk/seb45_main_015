package com.project15.server.Entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class ProfileImage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long profileImageId;

    @ManyToOne
    @JoinColumn(name = "member_id")
    private Member member;

    private String imageName;
    private String imageUrl;
    private String imageType;
}
