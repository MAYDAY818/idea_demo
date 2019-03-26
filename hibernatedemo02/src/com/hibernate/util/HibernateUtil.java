package com.hibernate.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.mapping.MetadataSource;

public class HibernateUtil {
    private static SessionFactory sessionFactory;

    static {
        StandardServiceRegistry registry=new StandardServiceRegistryBuilder().configure().build();
        try {
            sessionFactory = new MetadataSources(registry)
                    .buildMetadata()
                    .buildSessionFactory();
        }catch(Exception e) {
            e.printStackTrace();
            StandardServiceRegistryBuilder.destroy(registry);
        }
    }
    public static Session openSession(){
        return sessionFactory.openSession();
    }
}
