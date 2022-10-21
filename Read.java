package OOP.Sprint2.indi2;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;

public class Read {

    protected String path = GetFilePath.PATH.path;
        protected BufferedReader reader;
        protected StringBuilder builder;

        public Read(){

            initiateBuilder();
            initiateReader(path);
        }

    public BufferedReader initiateReader(String path){

            try {

                reader = new BufferedReader(new FileReader(path));
                return reader;
            }
            catch (Exception e) {
                System.out.println("File not found!");
                System.exit(-1);
            }
            return null;
        }

        public StringBuilder initiateBuilder(){
            try {
               return builder = new StringBuilder();

            }
            catch (Exception e){
                e.printStackTrace();
                System.exit(-1);
            }
            return null;
        }
}

