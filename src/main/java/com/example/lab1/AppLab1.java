package com.example.lab1;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class AppLab1 {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Customer customer = context.getBean("customer", Customer.class);

        System.out.println("Customer: " + customer.getName());
        System.out.println("Shopping at: " + customer.getShop());

        List<Product> products = customer.getShop().getProducts();
        System.out.println("Products:");
        for (Product product : products) {
            if (product instanceof Motherboard) {
                Motherboard motherboard = (Motherboard) product;
                System.out.println("  Motherboard: " + motherboard.getName() + "; Brand - " + motherboard.getBrand() + "; Price: " + motherboard.getPrice());
            } else if (product instanceof Cpu) {
                Cpu cpu = (Cpu) product;
                System.out.println("  CPU: " + cpu.getName() + " - " + cpu.getCategory() + "; Price: " + cpu.getPrice());
            }
        }
    }
}

