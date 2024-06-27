package com.example.demo.Landmark.entity;

import com.example.demo.member.entity.Member;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.*;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Landmark {

//  여행지 idx
    @Id
    int landmarkNo;

//  유저 아이디 (외래키)
    @ManyToOne
    Member writer;

//  여행지 정보 출저 (유저가 쓴글인지 받아온 데이터인지)
    @Column(length = 11,nullable = false)
    boolean landmarkOrigin;

//  여행지 이름
    @Column(length = 30,nullable = false)
    String landmarkName;

//  여행지 주소
    @Column(length = 255,nullable = false)
    String landmarkAddress;

//  여행지 전화번호
    @Column(length = 11)
    int landmarkPhone;

//  여행지 간단소개
    @Column(length = 255)
    String landmarkShortDesc;

//  여행지 소개글
    @Column(length = 1000)
    String landmarkDesc;

//  경도
    @Column(length = 255,nullable = false)
    String longitude;

//  위도
    @Column(length = 255,nullable = false)
    String latitude;

//  이미지 경로
    @Column(length = 1000)
    String landmarkImgPath;
}
