package com.managersystem.admin.handleRequest.controller.dto;

import lombok.Data;

@Data
public class RewardSegmentDetailUpdateDto {

  protected Long priority; //do uu tien nhan qua theo ti le

  protected Long segmentRate; //do uu tien nhan qua theo loai nguoi dung

  protected Long position;
}
