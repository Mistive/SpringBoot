package com.example.demo2.test.mapper;

import java.util.List;

import com.example.demo2.test.vo.TestVo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;


@Repository
@Mapper
public interface TestMapper {
    List<TestVo> selectTest();
}


