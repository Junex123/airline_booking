package userdao;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import userconfig.userconnection;
import userentity.contact;
import userentity.flight;
import userentity.user;
import userentity.payment;
import userentity.book;

public class userdao {

	public static void saveUser(user user) {
        Transaction transaction = null;
        try (Session session = userconnection.getSessionFactory().openSession()) {
            // start a transaction
            transaction = session.beginTransaction();
            // save the student object
            session.save(user);
            // commit transaction
            transaction.commit();
            session.close();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
        
    }
	public boolean validate(String username, String password) {

        Transaction transaction = null;
        user user = null;
        try (Session session = userconnection.getSessionFactory().openSession()) {
            // start a transaction
            transaction = session.beginTransaction();
            // get an user object
            user = (user) session.createQuery("from user u where u.username = :username").setParameter("username", username)
                .uniqueResult();

            if (user != null && user.getPassword().equals(password)) {
                return true;
            }
            // commit transaction
            transaction.commit();
            session.close();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
        return false;
    }
	public boolean validate2(String username, String password) {

        Transaction transaction = null;
        user user = null;
        try (Session session = userconnection.getSessionFactory().openSession()) {
            // start a transaction
            transaction = session.beginTransaction();
            // get an user object
            user = (user) session.createQuery("from user u where u.username = :admin").setParameter("username", username)
                .uniqueResult();

            if (user != null && user.getPassword().equals(password)) {
                return true;
            }
            // commit transaction
            transaction.commit();
            session.close();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
        return false;
    }
	
	
	public static void savecontact(contact contact) {
        Transaction transaction = null;
        try (Session session = userconnection.getSessionFactory().openSession()) {
            // start a transaction
            transaction = session.beginTransaction();
            // save the student object
            session.save(contact);
            // commit transaction
            transaction.commit();
            session.close();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
	}
        
        public static void saveflight(flight flight) {
            Transaction transaction = null;
            try (Session session = userconnection.getSessionFactory().openSession()) {
                // start a transaction
                transaction = session.beginTransaction();
                // save the student object
                session.save(flight);
                // commit transaction
                transaction.commit();
                session.close();
            } catch (Exception e) {
                if (transaction != null) {
                    transaction.rollback();
                }
                e.printStackTrace();
            }
        }
        	public void displayflight(flight flight) {
                Transaction transaction = null;
                try (Session session = userconnection.getSessionFactory().openSession()) {
                    // start a transaction
                    transaction = session.beginTransaction();
                    // save the student object
                    flight= (flight)session.createQuery("from flight");
                    // commit transaction
                    transaction.commit();
                    session.close();
                } catch (Exception e) {
                    if (transaction != null) {
                        transaction.rollback();
                    }
                    e.printStackTrace();
                }
                
        	}
            	public void payment(payment payment) {
                    Transaction transaction = null;
                    try (Session session = userconnection.getSessionFactory().openSession()) {
                        // start a transaction
                        transaction = session.beginTransaction();
                        // save the student object
                        session.save(payment);
                        // commit transaction
                        transaction.commit();
                        session.close();
                    } catch (Exception e) {
                        if (transaction != null) {
                            transaction.rollback();
                        }
                        e.printStackTrace();
                    }
            	}
                    public void booking(book book) {
                        Transaction transaction = null;
                        try (Session session = userconnection.getSessionFactory().openSession()) {
                            // start a transaction
                            transaction = session.beginTransaction();
                            // save the student object
                            session.save(book);
                            // commit transaction
                            transaction.commit();
                            session.close();
                        } catch (Exception e) {
                            if (transaction != null) {
                                transaction.rollback();
                            }
                            e.printStackTrace();
                        }
            }
                	public boolean search(String Flight_fromcity, String Flight_tocity) {

                        Transaction transaction = null;
                        flight flight = null;
                        try (Session session = userconnection.getSessionFactory().openSession()) {
                            // start a transaction
                            transaction = session.beginTransaction();
                            // get an user object
                            flight = (flight) session.createQuery("from flight u where u.Flight_fromcity = :Flight_fromcity").setParameter("Flight_fromcity", Flight_fromcity)
                                .uniqueResult();

                            if (flight !=null && flight.getTo().equals(Flight_tocity)) {
                                return true;
                            }
                            // commit transaction
                            transaction.commit();
                            session.close();
                        } catch (Exception e) {
                            if (transaction != null) {
                                transaction.rollback();
                            }
                            e.printStackTrace();
                        }
                        return false;
                    }
			
            
    }
	

