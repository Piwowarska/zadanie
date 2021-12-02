package pl.camp.it.rent.session;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import pl.camp.it.rent.database.TaleDatabase;
import pl.camp.it.rent.model.Tale;
import java.util.List;


@Service
public class TaleService {

    @Autowired
    TaleDatabase taleDatabase;
    public List<Tale> gestAllTale(){
return this.taleDatabase.getTales();
    }
}
