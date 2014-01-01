package com.longx.nothing.mapper;

import com.longx.nothing.vo.Lab;
import java.util.List;

public interface LabMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Lab record);

    int insertSelective(Lab record);

    Lab selectByPrimaryKey(Integer id);

    List selectByCdt(Lab record);

    int updateByPrimaryKeySelective(Lab record);

    int updateByPrimaryKeyWithBLOBs(Lab record);

    int updateByPrimaryKey(Lab record);
}