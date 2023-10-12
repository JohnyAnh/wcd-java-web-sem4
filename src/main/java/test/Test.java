//package test;
//
//import Util.liststudentUtil;
//import model.JavaWebLearn_liststudent;
//import org.hibernate.Session;
//import org.hibernate.SessionFactory;
//
//public class Test {
//    public static void main(String[] args) {
////        Connection connection = JDBCUtil.getConnection();
////        System.out.println(connection);
//        try{
//            SessionFactory sessionFactory = liststudentUtil.getSessionFactory();
//            if (sessionFactory != null){
//                Session session = sessionFactory.openSession();
//                try{
//                    JavaWebLearn_liststudent s1 = new JavaWebLearn_liststudent();
//                    s1.setMaSinhVien("0001");
//                    s1.setTen("Anh");
//                    s1.setNamSinh(1996);
//                    s1.setDienThoai("0123456789");
//                    session.save(s1);
//                }finally {
//                    session.close();
//                }
//            }
//        }catch (Exception e){
//            e.printStackTrace();
//        }
//
//
//    }
//}
