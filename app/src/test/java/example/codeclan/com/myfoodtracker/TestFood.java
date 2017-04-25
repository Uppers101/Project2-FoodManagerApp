package example.codeclan.com.myfoodtracker;

import org.junit.Before;
import org.junit.Test;

import example.codeclan.com.myfoodtracker.MyClasses.Food;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by user on 20/04/2017.
 */

public class TestFood {

    Food food;

    @Before
    public void before(){
//        Should the Breakfast, Lunch, Dinner and Snacks be Enums?
        food = new Food("Salad", 300);
    }


    @Test
    public void testCanGetFood() {
        assertEquals("Salad", food.getFood());
    }

    @Test
    public void testCanGetCalories(){
        assertEquals(300, food.getCalories());
    }

//    @Test
//    public void testCanGetDay() {
//    assertEquals("day", food.getDate());
//    }
//
//    @Test
//    public void testCanGetJournal() {
//        assertEquals("journal", food.getJournal());
//    }
//
//    @Test
//    public void testCanGetMeal() {
//        assertEquals(MealType.LUNCH, food.getMeal());
//    }


















//    @Before
//    public void before(){
//         food = new Food(new Date(117,3,20));
//
//    }
//
//
//    @Test
//    public void testGetDate(){
//        assertEquals("2017/04/20", food.getSimpleDateFormat());
//    }



}
