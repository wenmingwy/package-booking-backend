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






//buildscript {
//    ext {
//        springBootVersion = '2.0.3.RELEASE'
//    }
//    repositories {
//        maven { url 'http://maven.aliyun.com/nexus/content/groups/public/' }
//        maven { url 'http://maven.aliyun.com/nexus/content/repositories/jcenter' }
//        mavenCentral()
//    }
//    dependencies {
//        classpath "org.springframework.boot:spring-boot-gradle-plugin:${springBootVersion}"
//        classpath 'org.junit.platform:junit-platform-gradle-plugin:1.0.0'
//    }
//}
//
//apply plugin: 'java'
//apply plugin: 'idea'
//apply plugin: 'org.springframework.boot'
//apply plugin: 'io.spring.dependency-management'
//
//group = 'com.tw'
//version = '0.0.1-SNAPSHOT'
//sourceCompatibility = 1.8
//
//repositories {
//    maven { url 'http://maven.aliyun.com/nexus/content/groups/public/' }
//    maven { url 'http://maven.aliyun.com/nexus/content/repositories/jcenter' }
//    mavenCentral()
//}
//
//dependencies {
//    implementation 'org.mybatis.spring.boot:mybatis-spring-boot-starter:2.1.0'
//    implementation 'org.springframework.boot:spring-boot-starter-web'
//    compile 'com.h2database:h2'
//
//    implementation 'org.flywaydb:flyway-core'
//    testImplementation 'org.mybatis.spring.boot:mybatis-spring-boot-starter-test:2.1.0'
//    testImplementation 'org.springframework.boot:spring-boot-starter-test'
//}
