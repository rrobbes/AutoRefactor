/*
 * AutoRefactor - Eclipse plugin to automatically refactor Java code bases.
 *
 * Copyright (C) 2017 Fabrice Tiercelin - Initial API and implementation
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program under LICENSE-GNUGPL.  If not, see
 * <http://www.gnu.org/licenses/>.
 *
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution under LICENSE-ECLIPSE, and is
 * available at http://www.eclipse.org/legal/epl-v10.html
 */
package org.autorefactor.refactoring.rules.samples_out;

import java.util.Collection;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.NavigableSet;
import java.util.Properties;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class HashSetRatherThanTreeSetSample {

    public void replaceTreeSetInstanceCreation() {
        // Keep this comment
        boolean isFooContained = new java.util.HashSet<String>().contains("foo");
        // Keep this comment too
        int size = new java.util.HashSet<String>(new java.util.HashSet<String>()).size();
    }

    public void replaceRawTreeSet() {
        // Keep this comment
        boolean isFooContained = new java.util.HashSet().contains("foo");
        // Keep this comment too
        int size = new java.util.HashSet(new java.util.HashSet<String>()).size();
    }

    public void replaceFullyQualifiedTreeSet() {
        // Keep this comment
        boolean isFooContained = new java.util.HashSet<Integer>().contains("foo");
        // Keep this comment too
        int size = new java.util.HashSet(new java.util.HashSet<String>()).size();
    }

    public void replaceTreeSetVariableDeclaration() {
        // Keep this comment
        java.util.HashSet<String> set = new java.util.HashSet<String>();
    }

    public void doNotReplaceInterface() {
        // Keep this comment
        Set<String> set = new TreeSet<String>();
    }

    public void replaceTreeSetVariableUse() {
        // Keep this comment
        java.util.HashSet<String> set = new java.util.HashSet<String>();
        // Keep this comment too
        set.add("foo");
    }

    public boolean replaceTreeSetWithLoop(List<Date> dates) {
        // Keep this comment
        java.util.HashSet<Long> set = new java.util.HashSet<Long>();
        for (Date date : dates) {
            set.add(date.getTime());
        }

        return set.remove(789L);
    }

    public boolean replaceTreeSetWithModifier() {
        // Keep this comment
        final java.util.HashSet<String> set = new java.util.HashSet<String>();
        return set.add("foo");
    }

    public void replaceTreeSetWithParameter() {
        // Keep this comment
        java.util.HashSet<char[]> set = new java.util.HashSet<char[]>(new java.util.HashSet<char[]>());
        set.add(new char[] {'a'});
    }

    public void doNotReplaceTreeSetWithComparator(Comparator<Long> comparator) {
        TreeSet<Long> set = new TreeSet<Long>(comparator);
        set.add(123L);
    }

    public boolean replaceReassignedTreeSet() {
        // Keep this comment
        java.util.HashSet<String> set1 = new java.util.HashSet<String>();
        set1.add("foo");

        // Keep this comment too
        java.util.HashSet<String> set2 = set1;
        set2.add("bar");

        return set2.isEmpty();
    }

    public void doNotReplaceArrayListWithImplicitItertor() {
        TreeSet<Properties> iterableList = new TreeSet<Properties>();
        for (Properties properties : iterableList) {
            System.out.println("The properties: " + properties);
        }
    }

    public void doNotReplaceTreeSetParameter(TreeSet<String> aSet) {
        TreeSet<String> set = aSet;
        set.add("foo");
    }

    public void doNotReplaceTreeSetPassedToAMethod() {
        String text = String.valueOf(new TreeSet<String>());
    }

    public TreeSet<Integer> doNotReplaceReturnedTreeSet() {
        return new TreeSet<Integer>();
    }

    public void doNotReplaceReassignedVariable() {
        TreeSet<String> set = new TreeSet<String>();
        set = new TreeSet<String>();
    }

    public String doNotReplaceCeiling(String e) {
        TreeSet<String> set = new TreeSet<String>();
        return set.ceiling(e);
    }

    public Object doNotReplaceClone() {
        TreeSet<String> set = new TreeSet<String>();
        return set.clone();
    }

    public Comparator doNotReplaceComparator() {
        TreeSet<String> set = new TreeSet<String>();
        return set.comparator();
    }

    public Iterator<String> doNotReplaceDescendingIterator() {
        TreeSet<String> set = new TreeSet<String>();
        return set.descendingIterator();
    }

    public NavigableSet<String> doNotReplaceDescendingSet() {
        TreeSet<String> set = new TreeSet<String>();
        return set.descendingSet();
    }

    public String doNotReplaceFirst() {
        TreeSet<String> set = new TreeSet<String>();
        return set.first();
    }

    public String doNotReplaceFloor(String e) {
        TreeSet<String> set = new TreeSet<String>();
        return set.floor(e);
    }

    public SortedSet<String> doNotReplaceHeadSet(String toElement) {
        TreeSet<String> set = new TreeSet<String>();
        return set.headSet(toElement);
    }

    public NavigableSet<String> doNotReplaceHeadSet(String toElement, boolean inclusive) {
        TreeSet<String> set = new TreeSet<String>();
        return set.headSet(toElement, inclusive);
    }

    public String doNotReplaceHigher(String e) {
        TreeSet<String> set = new TreeSet<String>();
        return set.higher(e);
    }

    public Iterator<String> doNotReplaceIterator() {
        TreeSet<String> set = new TreeSet<String>();
        return set.iterator();
    }

    public String doNotReplaceLower(String e) {
        TreeSet<String> set = new TreeSet<String>();
        return set.lower(e);
    }

    public String doNotReplacePollFirst() {
        TreeSet<String> set = new TreeSet<String>();
        return set.pollFirst();
    }

    public String doNotReplacePollLast() {
        TreeSet<String> set = new TreeSet<String>();
        return set.pollLast();
    }

    public NavigableSet<String> doNotReplaceSubSet(String fromElement, boolean fromInclusive, String toElement,
            boolean toInclusive) {
        TreeSet<String> set = new TreeSet<String>();
        return set.subSet(fromElement, fromInclusive, toElement, toInclusive);
    }

    public SortedSet<String> doNotReplaceSubSet(String fromElement, String toElement) {
        TreeSet<String> set = new TreeSet<String>();
        return set.subSet(fromElement, toElement);
    }

    public SortedSet<String> doNotReplaceTailSet(String fromElement) {
        TreeSet<String> set = new TreeSet<String>();
        return set.tailSet(fromElement);
    }

    public NavigableSet<String> doNotReplaceTailSet(String fromElement, boolean inclusive) {
        TreeSet<String> set = new TreeSet<String>();
        return set.tailSet(fromElement, inclusive);
    }

    public Object[] doNotReplaceToArray() {
        TreeSet<String> set = new TreeSet<String>();
        return set.toArray();
    }

    public String[] doNotReplaceToArray(String[] a) {
        TreeSet<String> set = new TreeSet<String>();
        return set.toArray(a);
    }

    public void refactorWithMethods(Collection<Integer> anotherCollection) throws InterruptedException {
        // Keep this comment
        java.util.HashSet<Integer> set = new java.util.HashSet<Integer>();
        set.add(123);
        set.clear();
        set.contains(anotherCollection);
        set.isEmpty();
        set.remove(123);
        set.size();
        set.removeAll(anotherCollection);
        set.addAll(anotherCollection);
        set.containsAll(anotherCollection);
        set.retainAll(anotherCollection);
        set.notify();
        set.notifyAll();
        set.wait();
        set.wait(1000);
        set.wait(1000, 1000);
    }

    public void replaceMapThroughRunnable() {
        // Keep this comment
        final java.util.HashSet<String> set = new java.util.HashSet<String>();
        new Runnable() {

            @Override
            public void run() {
                set.add("foo");
            }
        };
    }

    public void replaceMapInsideRunnable() {
        // Keep this comment
        final java.util.HashSet<String> set = new java.util.HashSet<String>();
        set.add("foo");
        new Runnable() {

            @Override
            public void run() {
                // Keep this comment too
                final java.util.HashSet<String> localSet = new java.util.HashSet<String>();
                localSet.add("foo");
            }
        };
    }
}
