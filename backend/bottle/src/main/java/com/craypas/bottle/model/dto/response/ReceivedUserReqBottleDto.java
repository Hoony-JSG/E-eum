package com.craypas.bottle.model.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ReceivedUserReqBottleDto {

	private Long user_req_bottle_id;
	private CreatedReqBottleDto reqBottle;
}
