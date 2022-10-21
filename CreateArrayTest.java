package OOP.Sprint2.indi2;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class CreateArrayTest {

    CreateArray c = new CreateArray();
    ArrayList<Person> a = c.readToArraylist();
    @Test
    void readToArraylist() {
        assert (a.get(0).getName().equals("Alhambra Aromes"));
        assert (a.get(1).getName().equals("Bear Belle"));
        assert (a.get(2).getName().equals("Chamade Coriola"));
        assert (a.get(3).getName().equals("Diamanda Djedi"));
        assert (a.get(4).getName().equals("Elmer Ekorrsson"));
        assert (a.get(5).getName().equals("Fritjoff Flacon"));
        assert (a.get(6).getName().equals("Greger Ganache"));
        assert (a.get(7).getName().equals("Hilmer Heur"));
        assert (a.get(8).getName().equals("Ida Idylle"));
        assert (a.get(9).getName().equals("Jicky Juul"));
        assert (a.get(10).getName().equals("Kadine Karlsson"));
        assert (a.get(11).getName().equals("Liu Lingren"));
        assert (a.get(12).getName().equals("Mitsuko Mayotte"));
        assert (a.get(13).getName().equals("Nahema Ninsson"));

    }
}