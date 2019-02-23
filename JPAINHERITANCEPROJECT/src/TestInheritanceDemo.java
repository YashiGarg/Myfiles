import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.cg.ems.util.JPAUtil;

public class TestInheritanceDemo
{
public static void main(String[] args) 
{
	Emp rahul=new Emp();
	rahul.setEmpName("Rahul Chauhan");
	rahul.setEmpSal(60000);
	Manager vaishali=new Manager();
	vaishali.setEmpName("VaishaliS");
	vaishali.setEmpSal(50000);
	vaishali.setDeptName("JAVA");
	
	EntityManager em=JPAUtil.getEntityManager();
	EntityTransaction tran=em.getTransaction();
	tran.begin();
	//em.persist(rahul);
	//em.persist(vaishali);
	 tran.commit();
	System.out.println("Data is inserted");
	Manager ee1=em.find(Manager.class, 7);

	
	System.out.println(ee1.getEmpName());

}
}
