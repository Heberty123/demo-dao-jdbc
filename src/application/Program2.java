package application;

import Model.dao.DaoFactory;
import Model.dao.DepartmentDao;
import Model.entities.Department;

import java.util.List;

public class Program2 {

    public static void main(String[] args) {

        DepartmentDao depDao = DaoFactory.createDepartmentDao();

        Department dep = new Department(null, "AiiIISSIMMMMM");

        /*
        depDao.insert(dep);
        dep.setId(5);
        depDao.update(dep);
        depDao.deleteById(8);
        Department department = depDao.findById(3);
        List<Department> listaDepartment = depDao.findAll();
        listaDepartment.forEach(e -> {
            System.out.println(e);
        });
         */



    }
}
