# Section 25: Databases

Section 25: Databases

# What I Learned

- Will will use SQL and SQLite and then into JAVA with SQL


<img src="whySql.JPG" alt="alt text" width="500"/>

- Easy to use and easy to switch other databases


<img src="dbTerminology.JPG" alt="alt text" width="500"/>

1. **SQLite** database will be in single file

- Db data in certain structure


<img src="dbTerminology.JPG" alt="alt text" width="500"/>


- **Table** is collection if related data. Here you can see there is structure in tables

- There are databases without structure like **NoSQL** [NoSQL](https://fi.wikipedia.org/wiki/NoSQL)

- **Field** is basic unit of data

<img src="dbTerminology2.JPG" alt="alt text" width="500"/>

1. **Fields** are often called **Column**
    - This can be confusing, like in **Microsoft Excel** **Columns** have different meaning.
<img src="columnInExel.JPG" alt="alt text" width="500"/>

In Relational Database, Columns is often ment for name for **field**.


<img src="dbTerminology3.JPG" alt="alt text" width="500"/>

<br>

<img src="flatFileDatabase.JPG" alt="alt text" width="500"/>

1. **Flat file database** are stored in single table 
    - A Lot of duplication of data
    - [Flat File Database](https://en.wikipedia.org/wiki/Flat-file_database)
<img src="flatTabledbExample.JPG" alt="alt text" width="500"/>

1. Lot of duplication data. If wanted raise **Credit_Limit** for **ISP**
    - Would need to change **three** data
- In old days these were popular.
    - In simple cases where data don't need to be related to each other this works perfectly well

- This extracted a bit further by taking out **customer data** to **own table** and **relating** them

<img src="ExampleToRelational.JPG" alt="alt text" width="500"/>

- This is called in Relational Database **Join** more specific **One To Many**

<img src="dbExampleToRelationalLinkingTable.JPG" alt="alt text" width="500"/>

1. It's common to have linking table to link data
    - **Advantage** of this the invoice table only contains data to **Invoices**. There is no **Customer** information anymore.
- This is called **Normalisation** [Db Normalisation](https://en.wikipedia.org/wiki/Database_normalization)
    - Db Normalisation is removing all unnecessarily data and irrelevant data. More this is done, **higher** the level normalisation. You can go level **6**, but most practical level is around level **3**
- Example is this case is not high as it should be
    - Because we use **Customer Name** as the link between table.**If** Customer name changes(which is common to happen), we would need to update relevant tables

<img src="dbTerminologyViews.JPG" alt="alt text" width="500"/>

- **View** is the way to bring data together from more than one joined table.
    - In **SQLite** view cannot be used to update, some can do this, **but** has some restriction on **operations**
- **SQLite** is designed to be embedded into application

- Installing SQLite, in windows `Precompiled Binaries for Windows` and `A bundle of command-line tools for managing SQLite database files`


<img src="envSetting.JPG" alt="alt text" width="500"/>

1. You should add to first **User System Variables** **Path**
2.  After that **System Variables** should be used. This can be messing up system more easily

<img src="testingSqlite3InCmdWindows10.JPG" alt="alt text" width="500"/>

- `.quit` quitting from SQLite3

- `.headers on` SQLite configuration for headers

- When Embedding SQL into Java It's recommended to use **""** in String statements and **''** SQL statements

`Insert into contact (name, phone, emil) values('Tim', 21232, 'time@email.com');`

- In **SQLite** we can put any kind of data in any field
    - **Bit strange**

<img src="dangeOfNonTypes.JPG" alt="alt text" width="500"/>

- Here It's fine to insert such, but be **careful** when switching databases, this **phone number** could be inserted into **Integer field** or would **not work** at all! 

- sqLite command ´to backout`.backup`
    - `.backup testbackup`

<img src="backupCommandInsqLite.JPG" alt="alt text" width="500"/>

1. You can restore database using restore command `.backup testbackup`
2. `UPDATE` affecting all the data. Be careful when using **UPDATE**

- todo jäin 8:20