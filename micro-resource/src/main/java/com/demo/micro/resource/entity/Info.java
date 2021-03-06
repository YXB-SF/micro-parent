package com.demo.micro.resource.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.sql.Blob;
import java.sql.Timestamp;

@Data
@ApiModel(value = "Info", description = "信息")
public class Info {
    @ApiModelProperty("id")
    private Long id;
    @ApiModelProperty("标题")
    private String infoTitle;
    @ApiModelProperty("详情")
    private String infoDetailString;
    @ApiModelProperty("详情(Blob格式)")
    private Object infoDetail;
    @ApiModelProperty("经度(数值较大的)")
    private Double locationX;
    @ApiModelProperty("纬度（数值较小的）")
    private Double locationY;
    @ApiModelProperty("类型id")
    private Long typeId;
    @ApiModelProperty("类型名称")
    private String typeName;
    @ApiModelProperty("时间")
    private Timestamp createDate;
    @ApiModelProperty("是否单次可用。0：不是。1：是")
    private int isSingle;
    @ApiModelProperty("用户id")
    private Long userId;

}
