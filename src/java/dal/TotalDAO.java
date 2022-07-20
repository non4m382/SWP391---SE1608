///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//package dal;
//
//import java.sql.SQLException;
//import java.util.ArrayList;
//import java.util.logging.Level;
//import java.util.logging.Logger;
//import model.Account;
//import model.Role;
//
///**
// *
// * @author Admin
// */
//public class TotalDAO {
//
//    //account
//    public ArrayList<Account> getAccountByAcId(int id) {
//        ArrayList<Account> accounts = new ArrayList<>();
//        try {
//            String sql = "SELECT [account_id]\n"
//                    + "      ,[first_name]\n"
//                    + "      ,[last_name]\n"
//                    + "      ,[gender]\n"
//                    + "      ,[email]\n"
//                    + "      ,[password]\n"
//                    + "      ,[dob]\n"
//                    + "      ,[phone_number]\n"
//                    + "      ,[address]\n"
//                    + "      ,[img]\n"
//                    + "      ,[role_id]\n"
//                    + "  FROM [Account] where [role_id]=?";
//            connection = new DBContext().getConnection();
//            ps = connection.prepareStatement(sql);
//            ps.setInt(1, id);
//            rs = ps.executeQuery();
//            while (rs.next()) {
//                Account a = new Account();
//                a.setAccountID(rs.getInt("account_id"));
//                a.setFirstName(rs.getString("first_name"));
//                a.setLastName(rs.getString("last_name"));
//                a.setGender(rs.getBoolean("gender"));
//                a.setEmail(rs.getString("email"));
//                a.setPassword(rs.getString("password"));
//                a.setDob(rs.getString("dob"));
//                a.setPhoneNumber(rs.getString("phone_number"));
//                a.setAddress(rs.getString("address"));
//                a.setImg(rs.getString("img"));
////                a.setRoleId(rs.getInt("role_id"));
//                Role r = rd.getRoleByID(rs.getInt("role_id"));
//                a.setRole(r);
//                accounts.add(a);
//            }
//
//        } catch (SQLException ex) {
//            Logger.getLogger(AccountDAO.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (Exception ex) {
//            Logger.getLogger(AccountDAO.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        return accounts;
//    }
//    
//    //kinpublic ArrayList<Account> getAccountByAcId(int id) {
//        ArrayList<Account> accounts = new ArrayList<>();
//        try {
//            String sql = "SELECT [account_id]\n"
//                    + "      ,[first_name]\n"
//                    + "      ,[last_name]\n"
//                    + "      ,[gender]\n"
//                    + "      ,[email]\n"
//                    + "      ,[password]\n"
//                    + "      ,[dob]\n"
//                    + "      ,[phone_number]\n"
//                    + "      ,[address]\n"
//                    + "      ,[img]\n"
//                    + "      ,[role_id]\n"
//                    + "  FROM [Account] where [role_id]=?";
//            connection = new DBContext().getConnection();
//            ps = connection.prepareStatement(sql);
//            ps.setInt(1, id);
//            rs = ps.executeQuery();
//            while (rs.next()) {
//                Account a = new Account();
//                a.setAccountID(rs.getInt("account_id"));
//                a.setFirstName(rs.getString("first_name"));
//                a.setLastName(rs.getString("last_name"));
//                a.setGender(rs.getBoolean("gender"));
//                a.setEmail(rs.getString("email"));
//                a.setPassword(rs.getString("password"));
//                a.setDob(rs.getString("dob"));
//                a.setPhoneNumber(rs.getString("phone_number"));
//                a.setAddress(rs.getString("address"));
//                a.setImg(rs.getString("img"));
////                a.setRoleId(rs.getInt("role_id"));
//                Role r = rd.getRoleByID(rs.getInt("role_id"));
//                a.setRole(r);
//                accounts.add(a);
//            }
//
//        } catch (SQLException ex) {
//            Logger.getLogger(AccountDAO.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (Exception ex) {
//            Logger.getLogger(AccountDAO.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        return accounts;
//    }
//        
//        
//        //kinder
//
//        
//        //class
//        
//        
//        //
//        
//        
//        
//}
