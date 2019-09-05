package tws.repository;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

 import tws.entity.ToPackage;

import java.util.List;

@Mapper
public interface  ToPackageMapper {
//	List<Employee> selectAll();
//    void insert(@Param("employee") Employee employee);
	@Select("select * from toPackage")
	List<ToPackage> selectAll();
	
	@Insert("insert into toPackage values(#{toPackage.id},#{toPackage.recipient},#{toPackage.phone},#{toPackage.weight})")
	void insert(@Param("toPackage") ToPackage toPackage);
}

//mybatis:
//	  mapper-locations: "classpath:mapper/*Mapper.xml"
