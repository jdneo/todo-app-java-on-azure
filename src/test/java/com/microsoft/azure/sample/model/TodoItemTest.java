/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See LICENSE in the project root for
 * license information.
 */
package com.microsoft.azure.sample.model;

import static org.junit.Assert.*;

import org.junit.Test;

public class TodoItemTest {

    @Test
    public void testEqualsObject() {
        final TodoItem itemA = new TodoItem("A", "Item A", "Owner of Item A");
        final TodoItem itemB1 = new TodoItem("B", "Item B", "Owner of Item B");   
        
        assertFalse(itemA.equals(itemB1));

        /**
         * Let user define a new TodoItem itemB2, whose constructor is the same as itemB1.
         * And verify if itemB1 is equal to itemB2.
         * 
         * Answer:
         * final TodoItem itemB2 = new TodoItem("B", "Item B", "Owner of Item B");
         * assertTrue(itemB1.equals(itemB2));
         * 
         * ----------------------------------------
         * Here are some other options users can do:
         * 
         * 1. Add whatever test cases they want to add and have a try.
         * 2. Set a breakpoint in method: equals() of TodoItem.java, and experience the debug test.
         *  
         */
    }

}
