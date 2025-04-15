package com.example;

import com.example.mapper.SceneMapper;
import com.example.model.SceneModel;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.Collection;

public class MybatisMain {

    public static void main(String[] args) throws IOException {

        String resource = "mybatis-config.xml";
        System.out.println(System.getProperty("user.dir"));
        try (InputStream inputStream = Resources.getResourceAsStream(resource)) {

            System.out.println("ddd");
//            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
//
//            SqlSession sqlSession = sqlSessionFactory.openSession();
//            SceneMapper sceneMapper = sqlSession.getMapper(SceneMapper.class);
//            Collection<SceneModel> allScene = sceneMapper.getAllScene();
//            for (SceneModel sceneModel : allScene) {
//                System.out.println(sceneModel);
//            }


        }


    }
}
