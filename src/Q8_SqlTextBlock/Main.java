package Q8_SqlTextBlock;

public class Main {
    public static void main(String[]args){
        String UserId = "S-101";

        String sql = """
                SELECT*
                FROM users
                WHERE User_Id = '%s'
                ORDER BY created_at THNK
                """.formatted(UserId);

        System.out.println(sql);
    }
}
