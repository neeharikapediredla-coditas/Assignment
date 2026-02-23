// 3. Write a program that uses text blocks to store and display a multi-line SQL query.


public class Three {

    public static void main(String[] args) {

        String sqlQuery = """
                SELECT id, name, email
                FROM users
                WHERE status = 'ACTIVE'
                  AND created_date >= '2024-01-01'
                ORDER BY created_date DESC;
                """;

        System.out.println("SQL Query:");
        System.out.println(sqlQuery);
    }
}