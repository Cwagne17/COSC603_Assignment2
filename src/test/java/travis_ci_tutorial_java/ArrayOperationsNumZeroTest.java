package travis_ci_tutorial_java;

import static org.junit.Assert.*;

import com.sun.source.tree.ArrayAccessTree;
import org.junit.Test;

import java.lang.reflect.Array;

public class ArrayOperationsNumZeroTest 
{
   @Test
   public void testNumZeroEmptyArray() 
   {
      int x[] = {};     // zero-sized array
      int n = ArrayOperations.numZero(x);
      assertEquals("0 zeros", 0, n);
   }
   
   @Test
   public void testNumZeroArrayWithNoZeros()
   {
      int[] x = {1, 2, 3}; 
      int n = ArrayOperations.numZero(x);
      assertEquals("0 zeros in an array with no zeros", 0, n);
   }

   @Test
   public void testNumZeroArrayWithZero() {
      int[] x = {0};
      assertEquals(ArrayOperations.numZero(x), 1);
   }

   @Test(expected = NullPointerException.class)
   public void findLastNullParameter() {
      int[] x = null;
      ArrayOperations.findLast(x, 1);
   }

   @Test
   public void findLastFirstElement() {
      int[] x = {1};
      assertEquals(ArrayOperations.findLast(x, 1), 0);
   }

   @Test
   public void findLastNonExistent() {
      int[] x = {1, 2, 3};
      assertEquals(ArrayOperations.findLast(x, 0), -1);
   }

   @Test(expected = NullPointerException.class)
   public void countPositiveNullParameter() {
      ArrayOperations.countPositive(null);
   }

   @Test
   public void countPositive() {
      int[] x = { 1 };
      assertEquals(ArrayOperations.countPositive(x), 1);
   }

}


