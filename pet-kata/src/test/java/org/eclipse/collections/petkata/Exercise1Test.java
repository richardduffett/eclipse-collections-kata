/*
 * Copyright (c) 2016 Goldman Sachs.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * and Eclipse Distribution License v. 1.0 which accompany this distribution.
 * The Eclipse Public License is available at http://www.eclipse.org/legal/epl-v10.html
 * and the Eclipse Distribution License is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 */

package org.eclipse.collections.petkata;

import org.eclipse.collections.api.block.function.Function;
import org.eclipse.collections.api.block.predicate.Predicate;
import org.eclipse.collections.api.list.MutableList;
import org.eclipse.collections.impl.factory.Lists;
import org.eclipse.collections.impl.test.Verify;
import org.junit.Assert;
import org.junit.Test;

/**
 * In the slides leading up to this exercise you should have learned about
 * {@link MutableList#collect(Function)} and {@link MutableList#select(Predicate)}.
 *
 * @see <a href="http://eclipse.github.io/eclipse-collections-kata/pet-kata/#/2">Exercise 1 Slides</a>
 */
public class Exercise1Test extends PetDomainForKata
{
    @Test
    public void getFirstNamesOfAllPeople()
    {
        // Replace null, with a transformation method on MutableList.
        MutableList<String> firstNames = null; // this.people...

        MutableList<String> expectedFirstNames = Lists.mutable.with("Mary", "Bob", "Ted", "Jake", "Barry", "Terry", "Harry", "John");
        Assert.assertEquals(expectedFirstNames, firstNames);
    }

    @Test
    public void getNamesOfMarySmithsPets()
    {
        Person person = this.getPersonNamed("Mary Smith");
        MutableList<Pet> pets = person.getPets();

        // Replace null, with a transformation method on MutableList.
        MutableList<String> names = null; // pets...

        Assert.assertEquals("Tabby", names.makeString());
    }

    @Test
    public void getPeopleWithCats()
    {
        // Replace null, with a positive filtering method on MutableList.
        MutableList<Person> peopleWithCats = null;  // this.people...

        Verify.assertSize(2, peopleWithCats);
    }

    @Test
    public void getPeopleWithoutCats()
    {
        // Replace null, with a negative filtering method on MutableList.
        MutableList<Person> peopleWithoutCats = null;  // this.people...

        Verify.assertSize(6, peopleWithoutCats);
    }
}
