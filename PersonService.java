package cn.itcast.service;

import java.util.List;

import cn.itcast.bean.Person;

public interface PersonService
{
    /**
     * 保存 person 
     * @param person
     */
    public void save(Person person);
    /**
     * 更新 person
     * @param person
     */
    public void update(Person person);
    
    /**
     * 获取 person
     * @param person
     * @return
     */
    public Person getPerson(Integer person);
    
    /**
     * 获取所有person
     * @return
     */
    public List<Person> getPersons();
    
    /**
     * 删除指定id的person
     * @param person
     */
    public void delete(Integer person);
}
