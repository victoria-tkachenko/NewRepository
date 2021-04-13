package Java2.Lesson8;


import java.sql.*;

public class SQLiteExamples {
    public static void main(String[] args) throws SQLException {
        Connection connection = null;
        Statement statement = null;
        PreparedStatement preparedStatement = null;

        try {
            Class.forName("org.sqlite.JDBC");
            connection = DriverManager.getConnection("jdbc:sqlite:geekbrains.db");
            statement = connection.createStatement();

            int count = statement.executeUpdate("update faculties set name = 'Test' where id = 1");
            System.out.println("Строк изменено: " + count);

            ResultSet resultSet = statement.executeQuery("select * from faculties");
            while(resultSet.next()) {
                System.out.print(resultSet.getInt("id"));
                System.out.print(" ");
                System.out.println(resultSet.getString("name"));
            }

//            Long time = System.currentTimeMillis();
//            for (int i = 0; i < 100; i++) {
//                statement.executeUpdate(String.format("insert into students (name, score, fac_id) values ('%s', %d, %d)",
//                        "student", i , i , i));
//            }
//            System.out.println("Время выполнения c автокоммитом: " + (System.currentTimeMillis()- time));

//            time = System.currentTimeMillis();
//            connection.setAutoCommit(false);
//            for (int i = 0; i < 100; i++) {
//                statement.executeUpdate(String.format("insert into students (name, score, fac_id) values ('%s', %d, %d)",
//                        "student", i, i, i));
//            }
//            connection.commit();
//            System.out.println("Время выполнения без автокоммита: " + (System.currentTimeMillis()- time));

//            statement.executeUpdate("delete from students where name = 'student'");
            statement.executeUpdate("delete from students");
            connection.setAutoCommit(true);
            preparedStatement = connection.prepareStatement(
                   " insert into students (name, score, fac_id) values (?, ?, ?)");
            preparedStatement.setString(1, "Nikita");
            preparedStatement.setInt(2, 9);
            preparedStatement.setInt(3, 4);
            preparedStatement.addBatch();
            preparedStatement.executeBatch();

            preparedStatement.setString(1, "Fedor");
            preparedStatement.setInt(2, 8);
            preparedStatement.setInt(3, 3);
            preparedStatement.addBatch();
            preparedStatement.executeBatch();

            resultSet = statement.executeQuery("select * from students");
            while(resultSet.next()) {
                System.out.print(resultSet.getInt("id"));
                System.out.print(" ");
                System.out.print(resultSet.getString("name"));
                System.out.print(" ");
                System.out.println(resultSet.getInt("score"));
            }

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } finally {
            connection.close();
        }
    }
}
