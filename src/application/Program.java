package application;

import Model.entities.Department;
import db.DB;
import db.DbException;
import db.DbIntegrityException;

import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Program {

    public static void main(String[] argc){

        Department obj = new Department(1, "books");
        System.out.println(obj);

    }
}