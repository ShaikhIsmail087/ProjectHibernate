package com.map;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MapDemo {
	public static void main(String[] args) {
		Configuration cfg=new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory=cfg.buildSessionFactory();
        
        //creating question
        Question q1 = new Question();
        q1.setQuestionId(1212);
        q1.setQuestion("what is java?");
        
        Answer answer = new Answer();
        answer.setAnswerID(343);
        answer.setAnswer("Java is programming language");
        answer.setQuestion(q1);
//        q1.setAnswer(answer);
        
        Answer answer1 = new Answer();
        answer1.setAnswerID(33);
        answer1.setAnswer("With the help of java we can create software");
        answer1.setQuestion(q1);
        
        Answer answer2 = new Answer();
        answer2.setAnswerID(363);
        answer2.setAnswer("Java has different type of frameworks");
        answer2.setQuestion(q1);
        
        List<Answer> list=new ArrayList<Answer>();
        list.add(answer);
        list.add(answer1);
        list.add(answer2);
        
        q1.setAnswer(list);
        
      //creating question
        Question q2 = new Question();
        q2.setQuestionId(242);
        q2.setQuestion("what is collection Framework?");
        
        Answer answer3 = new Answer();
        answer3.setAnswerID(344);
        answer3.setAnswer("API to work with objects in java");
        answer3.setQuestion(q2);
//        q2.setAnswer(answer3);
        
        //session
        
        Session s=factory.openSession();
        Transaction tx=s.beginTransaction();
        
        //save
        s.save(q1);
        s.save(answer);
        s.save(answer1);
        s.save(answer2);
        
        Question q=(Question)s.get(Question.class, 1212);
        System.out.println(q.getQuestionId());
        System.out.println(q.getQuestion());
        System.out.println(q.getAnswer().size());
        
        tx.commit();
        
        //fetching.....
        Question newQ=(Question)s.get(Question.class, 1212);
        Question newQ1=(Question)s.load(Question.class, 1212);
        System.out.println(newQ.getQuestion());
        System.out.println(newQ1.getAnswer());
        
        s.close();
        factory.close();
	}
}
