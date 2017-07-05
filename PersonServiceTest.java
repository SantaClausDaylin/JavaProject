package cn.itcast.Test;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.itcast.bean.Person;
import cn.itcast.service.PersonService;

public class PersonServiceTest
{
    private static PersonService personService;
    @BeforeClass
    public static void setUpBeforeClass() throws Exception
    {
        try
        {
            ApplicationContext cxt = new ClassPathXmlApplicationContext("bean.xml");
            personService = (PersonService)cxt.getBean("personService");
        } catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    @Test public void save(){
        for(int i=0; i<5; i++)
            personService.save(new Person("WANG"+ i));
    }
    
    //出现了一个异常错误
    @Test public void getPerson(){
        Person person = personService.getPerson(1);
        System.out.println(person.getName());
    }
    
    @Test public void update(){
        Person person = personService.getPerson(16);
        person.setName("ZHao");
        personService.update(person);
    }
    
    @Test public void delete(){
        personService.delete(3);
        personService.delete(4);
        personService.delete(5);
        personService.delete(6);
        personService.delete(7);
        personService.delete(8);
        personService.delete(9);
        personService.delete(10);
        personService.delete(11);
        personService.delete(12);
        personService.delete(13);
        personService.delete(14);
        personService.delete(15);
    }
    
    @Test public void getBeans(){
        for(Person person : personService.getPersons()){
            System.out.println(person.getName());
        }
    }

}
