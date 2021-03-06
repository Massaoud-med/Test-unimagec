package com.unimagec.models;

import com.fasterxml.jackson.annotation.JsonView;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "filemodel")
public class FileModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonView(View.FileInfo.class)
    private long id;

    @Column(name = "name")
    @JsonView(View.FileInfo.class)
    private String name;
    
    @Column(name = "Tele")
    @JsonView(View.FileInfo.class)
    private String tel;
    
    @Column(name = "Email")
    @JsonView(View.FileInfo.class)
    private String email;
    
    @Column(name = "Description")
    @JsonView(View.FileInfo.class)
    private String description;
    
    @Column(name = "mimetype")
    private String mimetype;

    @Lob
    @Column(name = "pic")
    private byte[] pic;



}
