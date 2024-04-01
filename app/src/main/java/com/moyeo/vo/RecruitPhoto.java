package com.moyeo.vo;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class RecruitPhoto implements Serializable {

  private static final long serialVersionUID = 100L;

  private int recruit_photo_id;       // 여행모집사진 식별자
  private int recruit_board_id;       // 여행멤버모집게시글 식별자
  private String photo;               // 사진 식별자
}