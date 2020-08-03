package ayala.bartal.concentration.game.controler;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import ayala.bartal.concentration.game.entities.Card;
import ayala.bartal.concentration.game.entities.Pair;

public class GameControler {
	
	@RequestMapping(value = "", method = RequestMethod.GET)
    @ResponseBody
    Collection <Pair> getAll() throws Exception {
        List pairList = new ArrayList<Pair>();
        pairList.add(new Pair(1, new Card(1, 1, "A"), new Card(2, 1, "A")));
        pairList.add(new Pair(2, new Card(1, 2, "B"), new Card(2, 2, "B")));
        pairList.add(new Pair(3, new Card(1, 3, "C"), new Card(2, 3, "C")));
        pairList.add(new Pair(4, new Card(1, 4, "D"), new Card(2, 4, "D")));
        pairList.add(new Pair(5, new Card(1, 5, "E"), new Card(2, 5, "E")));
        pairList.add(new Pair(6, new Card(1, 6, "F"), new Card(2, 6, "F")));
        pairList.add(new Pair(7, new Card(1, 7, "G"), new Card(2, 7, "G")));
        pairList.add(new Pair(8, new Card(1, 8, "H"), new Card(2, 8, "H")));
        return pairList;
    }

}
