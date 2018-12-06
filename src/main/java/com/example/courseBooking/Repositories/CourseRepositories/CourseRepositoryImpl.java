package com.example.courseBooking.Repositories.CourseRepositories;

import com.example.courseBooking.models.Course;
import com.example.courseBooking.models.Customer;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;

public class CourseRepositoryImpl implements CourseRepositoryCustom {
    @Autowired
    EntityManager entityManager;

    @Transactional
    public List<Course> getCourseWithRating(int rating){
        List<Course> results = null;
        Session session = entityManager.unwrap(Session.class);
        try {
            Criteria cr = session.createCriteria(Course.class);
            cr.add(Restrictions.eq("rating",rating));
            results = cr.list();
        } catch (HibernateException ex){
            ex.printStackTrace();
        } finally {
            session.close();
        }

        return results;
    }

    @Transactional
    public List<Course> getCourseByCustomer(Long id){
        List<Course> results = null;
        Session session = entityManager.unwrap(Session.class);
        try {
            Criteria cr = session.createCriteria(Course.class);
            cr.createAlias("bookings","bookingAlias");
            cr.add(Restrictions.eq("bookingAlias.customer.id",id));
            results = cr.list();
        } catch (HibernateException ex){
            ex.printStackTrace();
        } finally {
            session.close();
        }
        return results;
    }
}
