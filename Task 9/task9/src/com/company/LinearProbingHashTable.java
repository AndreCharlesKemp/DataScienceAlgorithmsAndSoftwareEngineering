package com.company;

/*This program is designed to create a Hash Table Operations menu, and execute the orders provided.
With this table, you should be able to  insert a key and the corresponding value, remove a key, retrieve an already
existing key, clear your hash table, or print out the size and all current keys and values.
 */

import static javax.swing.UIManager.get;

class LinearProbingHashTable {
    private int currentSize, maxSize;
    private String[] keys;
    private String[] val;

    //Constructor
    public LinearProbingHashTable(int capacity)
    {
        currentSize = 0;
        maxSize = capacity;
        keys = new String[maxSize];
        val = new String[maxSize];
    }

    //Clear hash table
    public void makeEmpty()
    {
        currentSize = 0;
        keys = new String[maxSize];
        val = new String[maxSize];
    }
    //Get size of hash table
    public int getSize()
    {
        return currentSize;
    }

    //Check if hash table is full
    public boolean isFull()
    {
        return currentSize == maxSize;
    }

    //Check if hash table is empty
    public boolean isEmpty()
    {
        return getSize() == 0;
    }

    //Check if hash table contains a key
    public boolean contains(String key)
    {
        return get(key) !=  null;
    }

    //Function to get hash code of a given key
    private int hash(String key)
    {
        return key.hashCode() % maxSize;
    }

    //Insert key-values
    public void insert(String key, String val)
    {
        int tmp = hash(key);
        int i = tmp;
        do
        {
            if (keys[i] == null)
            {
                keys[i] = key;
                this.val[i] = val;
                currentSize++;
                return;
            }
            if (keys[i].equals(key))
            {
                this.val[i] = val;
                return;
            }
            i = (i + 1) % maxSize;
        } while (i != tmp);
    }

    //Function to get value for a given key
    public String get(String key)
    {
        int i = hash(key);
        while (keys[i] != null)
        {
            if (keys[i].equals(key))
                return val[i];
            i = (i + 1) % maxSize;
        }
        return null;
    }

    //Function to remove key and its value
    public void remove(String key)
    {
        if (!contains(key))
            return;

        // find position key and delete
        int i = hash(key);
        while (!key.equals(keys[i]))
            i = (i + 1) % maxSize;
        keys[i] = val[i] = null;

        //Rehash all keys
        for (i = (i + 1) % maxSize; keys[i] != null; i = (i + 1) % maxSize)
        {
            String tmp1 = keys[i], tmp2 = val[i];
            keys[i] = val[i] = null;
            currentSize--;
            insert(tmp1, tmp2);
        }
        currentSize--;
    }

    //Print HashTable
    public void printHashTable()
    {
        System.out.println("\nHash Table: ");
        for (int i = 0; i < maxSize; i++)
            if (keys[i] != null)
                System.out.println(keys[i] +" "+ val[i]);
        System.out.println();
    }
}