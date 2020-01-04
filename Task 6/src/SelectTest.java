import​ java​.​sql​.*;
​// You need to use the 'Connection', 'Statement' and 'ResultSet' classes in java.sql package

public​ ​class​ ​SelectTest​ ​{
        public​ ​static​ ​void​ main​(​String​[]​ args​)​ ​{

        ​try​(
        ​// Step 1: Allocate a database 'Connection' object
        ​Connection​ conn ​=​ ​DriverManager​.​getConnection​(
        // Database URL: "jdbc:mysql://hostname:port/databaseName",
        // "username", "password"                ​
        "jdbc:mysql://localhost:3306/library_db?useSSL=false"​,​ ​"myuser"​,"xxxx"​);              ​

        // Step 2: Allocate a 'Statement' object in the Connection          ​
        Statement​ stmt ​=​ conn​.​createStatement​();
        ​)​ {

        ​// Step 3: Execute a SQL SELECT query, the query result is returned in a ResultSet object.
        ​String​ strSelect ​=​ ​"select title, qty from books"​;
        ​System​.​out​.​println​(​"The SQL query is: "​ ​+​ strSelect​);
        ​System​.​out​.​println​();

        ​ResultSet​ rset ​=​ stmt​.​executeQuery​(​strSelect​);
        ​
        // Step 4: Process the ResultSet by scrolling the cursor forward via next().          ​/
        // For each row, retrieve the contents of the cells with getXxx(columnName).          ​
        System​.​out​.​println​(​"The records selected are:"​);          ​
        int​ rowCount ​=​ ​0;

        ​// Move the cursor to the next row, return false if no more row          ​
        while​(​rset​.​next​())​ ​{
            ​String​ title ​=​ rset​.​getString​(​"title"​);             ​
            int​    qty   ​=​ rset​.​getInt​(​"qty"​);             ​
            System​.​out​.​println​(​title ​+​ ​", "​ ​+​ qty​);             ​
            ++​rowCount​;
        }

        ​System​.​out​.​println​(​"Total number of records = "​ ​+​ rowCount​);         ​

      }​ ​catch​(​SQLException​ ex​)​ ​{
            ex​.​printStackTrace​();
      }
        ​// Step 5: Close the resources - Done automatically by try-with-resources    ​} }
        }
}