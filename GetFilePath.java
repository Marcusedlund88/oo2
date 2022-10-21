package OOP.Sprint2.indi2;

    public enum GetFilePath {
        PATH("C:\\Users\\Min Dator\\Desktop\\Marcus\\Java\\Test\\src\\OOP\\Objektorienterad Programmering\\src\\OOP\\Sprint2\\Individuell2\\customers.txt"),
        UPDATED_PATH( "C:\\Users\\Min Dator\\Desktop\\Marcus\\Java\\Test\\src\\OOP\\Objektorienterad Programmering\\UpdatedCustomerList.txt");
        final String path;


        GetFilePath(String path){
            this.path = path;
        }
    }

