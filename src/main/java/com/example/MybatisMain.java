package com.example;


//import jdk.internal.loader.ClassLoaders;

import java.io.IOException;
import java.lang.String;
import java.net.URL;

public class MybatisMain {

    public static void main(String[] args) throws IOException {

//        String resource = "mybatis-config.xml";



        Class<Object> objectClass = Object.class;
        ClassLoader classLoader2 = objectClass.getClassLoader();
        URL resource2 = objectClass.getResource(objectClass.getSimpleName() + ".class");

        Class<Class> classClass = Class.class;
        Class<ClassLoader> classLoaderClass = ClassLoader.class;


        URL resource = classClass.getResource(classClass.getSimpleName() + ".class");
        URL resource1 = classLoaderClass.getResource(classLoaderClass.getSimpleName() + ".class");

        ClassLoader classLoader = classClass.getClassLoader();
        ClassLoader classLoader1 = classLoaderClass.getClassLoader();

        System.out.println(" ");


//        ClassLoader platformClassLoader = ClassLoader.getPlatformClassLoader();
//        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
//        ClassLoader classLoader = ClassLoader.class.getClassLoader();
//        Class<ClassLoader> classLoaderClass = ClassLoader.class;
//        URL resource3 = classLoaderClass.getResource("");
//        ClassLoader classLoader3 = classLoaderClass.getClassLoader();
//        Class<Class> classClass = Class.class;
//        String name = classClass.getName();
//        String typeName = classClass.getTypeName();
//        String canonicalName = classClass.getCanonicalName();
//        String packageName = classClass.getPackageName();
//        String simpleName = classClass.getSimpleName();
//        URL resource = classClass.getResource(classClass.getSimpleName() + ".class");
//        URL resource1 = systemClassLoader.getResource("");
//        URL resource2 = platformClassLoader.getResource("");
//
//
//        ClassLoader classLoader1 = classClass.getClassLoader();
//        Class<?> nestHost = classClass.getNestHost();
//        ClassLoader classLoader2 = Base.class.getClassLoader();
//
////
//        System.out.println("user.dir: " + System.getProperty("user.dir"));
//        System.out.println("java.class.path: " + System.getProperty("java.class.path"));
//        String property = System.getProperty("java.class.path");
//        for (String s : property.split(";")) {
//            System.out.println(s);
//        }
//        System.out.println(cp);
//        System.out.println(System.getProperty("jdk.module.main"));
//        try (InputStream inputStream = Resources.getResourceAsStream(resource)) {
//
////            System.out.println("ddd");
////            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
////
////            SqlSession sqlSession = sqlSessionFactory.openSession();
////            SceneMapper sceneMapper = sqlSession.getMapper(SceneMapper.class);
////            Collection<SceneModel> allScene = sceneMapper.getAllScene();
////            for (SceneModel sceneModel : allScene) {
////                System.out.println(sceneModel);
////            }
//
//
//        }


    }
}
