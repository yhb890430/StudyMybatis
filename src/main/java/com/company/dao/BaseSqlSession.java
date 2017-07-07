package com.company.dao;

import org.apache.ibatis.session.SqlSessionFactory;

/**
 * User:  yuanhaibo@dnion.com
 * Time:  2017/7/6 16:27
 */
public class BaseSqlSession {

    static{
        System.out.println("这是外部类的静态代码块");
    }


    public static class SqlSession{
        static{
            System.out.println("这是内部类的静态代码块");
        }
//        String resource = "org/mybatis/example/mybatis-config.xml";
//        InputStream inputStream = Resources.getResourceAsStream(resource);
//        private static final SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    }

    public static void main(String[] args) {
        System.out.println(1111);
    }

}
