package com.craypas.bottle.model.dto.response;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CreatedReqBottleDto {
	private long id;
	private long writerId;
	private String content;
	private int type;
	private int sentiment;
	private String ttsPath;
	private String regTime;
	private int status;
}
