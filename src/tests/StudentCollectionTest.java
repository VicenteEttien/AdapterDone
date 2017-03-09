package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import _todoInSection.StudentCollection;
import model.Student;

//
// A unit test for StudentCollection, okay just a small start.
//
// @author Rick Mercer
//
public class StudentCollectionTest {

  @Test
  public void testGetters() {
    StudentCollection students = new StudentCollection();
    students.add(new Student("Dakota", "Psychology", 1.99, 22));
    students.add(new Student("Jamie", "Computer Science", 2.0, 23));
    assertNull(students.getFirstStudentWithName("Not here"));
    assertEquals(1.99, students.getFirstStudentWithName("Dakota").getGPA(), 0.0001);
    assertEquals(2.0, students.getFirstStudentWithName("Jamie").getGPA(), 0.0001);
  }
  
  
}