package zaki.example.store;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

// @Component
public class OrderService{
    private PaymentService paymentService;
    public OrderService(){}
    @Autowired
    public OrderService(PaymentService paymentService){
        System.out.println("!!!!!!!!!!!!!!!service created");
        this.paymentService=paymentService;
    }
    @PostConstruct
    public void init(){
        System.out.println("!!!!!!!!!!!!!!!post_constructor is called");
    }
    @PostConstruct
    public void inti1(){
        System.out.println("!!!!!!!!!!!!!!!the second post_constructor is called");
    }
    @PreDestroy
    public void clean(){
        System.out.println("!!!!!!!!!!!!!!!cleaning");
    }
    public void process(){
        paymentService.process(111);
    }
    public void setPaymentService(PaymentService paymentService){
        this.paymentService=paymentService;
    }
}
