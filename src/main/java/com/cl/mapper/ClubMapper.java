package com.cl.mapper;

import org.apache.ibatis.annotations.Param;

import com.cl.entity.Club;

public interface ClubMapper {

	Club selectClubByActID(@Param("actID") Integer actID);
	
}
