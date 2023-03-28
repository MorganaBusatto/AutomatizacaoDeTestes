package FrameWork.Utils;

import java.util.Locale;

import com.github.javafaker.Faker;

public class FakersGeneration {//gera dados aleatorios
    
    private Faker faker;
    private String firstName;
    private String lastName;
    private String zipCode;
    
    //construtor
    public FakersGeneration() {
        
        faker = new Faker(new Locale("pt-BR"));//colocou a linguagem portugues Brasil
        
    }
    
    public String getFirstName() {//metodo First Name
        firstName = faker.name().firstName();
        return firstName;
        
        ///return faker.name().firstName();//pode ser direto desse jeito tambem
    }
    
    public String getLastName() {
        lastName = faker.name().lastName();
        return lastName;
        
    }
    
    public String getZipCode() {
        zipCode = faker.address().zipCode();
        return zipCode;
        
    }
    

}


