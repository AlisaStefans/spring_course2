package hibernate_test_2;


import hibernate_test_2.entity.Detail;
import hibernate_test_2.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class Test1 {
    public static void main(String[] args) {


        SessionFactory factory = new Configuration()
                .configure("aop/hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Detail.class)
                .buildSessionFactory();
        Session session = null;
        try {
//            Session session = factory.getCurrentSession();
//
//            Employee employee = new Employee("Zaur","Tregulov"
//                    ,"IT", 500 );
//
//            Detail detail = new Detail ("Baku", "123456789"
//                    , "zaurtregulov@gmail.com");
//            employee.setEmpDetail(detail);
//
//            session.beginTransaction();
//
//            session.save(employee);
//            session.getTransaction().commit();
//            System.out.println("Done!");

            session = factory.getCurrentSession();

            session.beginTransaction();

            // Получаем детали работника применяя каскад
            Employee emp = session.get(Employee.class, 2);
            System.out.println(emp.getEmpDetail());

            session.delete(emp);


            session.getTransaction().commit();
            System.out.println("Done!");
        }
        finally {
            session.close();
            factory.close();
        }


    }
}
