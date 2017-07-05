package cn.itcast.service;

import java.util.List;

import cn.itcast.bean.Person;

public interface PersonService
{
    /**
     * ���� person 
     * @param person
     */
    public void save(Person person);
    /**
     * ���� person
     * @param person
     */
    public void update(Person person);
    
    /**
     * ��ȡ person
     * @param person
     * @return
     */
    public Person getPerson(Integer person);
    
    /**
     * ��ȡ����person
     * @return
     */
    public List<Person> getPersons();
    
    /**
     * ɾ��ָ��id��person
     * @param person
     */
    public void delete(Integer person);
}
