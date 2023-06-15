package solution2;
//Example of Injecting collections (List, Set and Map)
//        Create a class Question with following attributes: questionId, question, answers.
//        There are 3 cases for above program.
//        a. Write a program where answers is of type List<String> or String []
//        b. Write a program where answers is of type Set<String>
//c. Write a program where answers is of type Map<Integer, String>
//In case of Map, Integer value represents answer’s sequence number.
//        d. Create a Test class with main() method, get Question bean from
//        ApplicationContext object and print question and its answers.
//        e. Also write the JUnit Test cases for above program.
//        - Use XML based configuration.

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Question {
   String questionId;
   String question;
   private List<String> answerList;
   private Set<String> answerSet;
   private Map<Integer,String> answerMap;



   public String getQuestionId() {
      return questionId;
   }

   public void setQuestionId(String questionId) {
      this.questionId = questionId;
   }

   public String getQuestion() {
      return question;
   }

   public void setQuestion(String question) {
      this.question = question;
   }

   public List<String> getAnswerList() {
      return answerList;
   }

   public void setAnswerList(List<String> answerList) {
      this.answerList = answerList;
   }

   public Set<String> getAnswerSet() {
      return answerSet;
   }

   public void setAnswerSet(Set<String> answerSet) {
      this.answerSet = answerSet;
   }

   public Map<Integer, String> getAnswerMap() {
      return answerMap;
   }

   public void setAnswerMap(Map<Integer, String> answerMap) {
      this.answerMap = answerMap;
   }

   public void printAnswerList(){
      System.out.println(questionId+" "+question);
      System.out.println("Answer: ");
      for (String s:answerList) {
         System.out.println(s);
      }
   }
   public void printAnswerSet(){
      System.out.println(questionId+": "+question);
      System.out.println("Answer: ");
      for (String s:answerSet) {
         System.out.println(s);
      }
   }
   public void printAnswerMap(){
      System.out.println(questionId+" "+question);
      System.out.println("Answer: ");
      for (String s:answerMap.values()) {
         System.out.println(s);
      }
   }

}
