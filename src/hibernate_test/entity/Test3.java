package hibernate_test.entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;


public class Test3 {
    public static void main(String[] args) {


        SessionFactory factory = new Configuration()
                .configure("aop/hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();
        try {
            Session session = factory.getCurrentSession();

            session.beginTransaction();

            Employee emp4 = session.get(Employee.class, 4);

            emp4.setSurname("Ivanov");
            emp4.setSalary(500);

//            List<Employee> emps = session.createQuery("from Employee ").getResultList();
//
//            List<Employee> emps = session.createQuery("from Employee " +
//                    "where name = 'Aleksandr'")
//                    .getResultList();
//
//            for (Employee e: emps)
//                System.out.println(e);



            session.getTransaction().commit();

            System.out.println("Done!");
        }
        finally {
            factory.close();
        }


    }
}
