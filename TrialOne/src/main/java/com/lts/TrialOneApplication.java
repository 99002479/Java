package com.lts;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.lts.autowiring.Shape;
import com.lts.autowiring.ShapeFactory;
import com.lts.constr.Student;
import com.lts.foodwiring.FoodPanda;
import com.lts.setter.Employee;
import com.lts.vehiclewiring.MileCalculator;
import com.lts.vehiclewiring.VehicleDetails;

@SpringBootApplication
public class TrialOneApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(TrialOneApplication.class, args);
	}
	
	@Autowired
	ApplicationContext context;

	@Override
	public void run(String... args) throws Exception {
		//Employee employee = context.getBean("employee", Employee.class);
		//System.out.println(employee);
		
		//Student student = context.getBean("student", Student.class);
		//System.out.println(student);
		
		//ShapeFactory shapeFactory = context.getBean(ShapeFactory.class);
		//shapeFactory.printArea(10,20);
		
		/*FoodPanda foodPanda = context.getBean(FoodPanda.class);
		List<String> foodlist = foodPanda.showMenu("Chinese");
		
		for(String food : foodlist)
		{
			System.out.println(food);
		}*/
		
		VehicleDetails vehicleDetails = context.getBean(VehicleDetails.class);
		vehicleDetails.getMileage("car");
	}
	
}
