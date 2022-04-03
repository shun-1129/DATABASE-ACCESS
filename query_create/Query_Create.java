package query_create;

public class Query_Create {
    String Query = "";

    public void Select_Column_Create(String[] columns, String[] tables) {
    }

    public void Where_Create(String[] where, String[] operator) {
        String Where = "WHERE";
        if(where.length == 1) {
            Where += where[0];
        } else {
            for(int i = 0; i < where.length; i++) {
                if(i+1 == where.length) {
                    Where += " " + where[i];
                } else {
                    Where += " " + where[i] + " " + operator[i];
                }
            }
        }
    }
}
