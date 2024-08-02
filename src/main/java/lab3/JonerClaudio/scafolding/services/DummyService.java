package lab3.JonerClaudio.scafolding.services;

import lab3.JonerClaudio.scafolding.models.Dummy;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DummyService {
    Dummy getDummy(Long id);
    List<Dummy> getDummyList();
    Dummy createDummy(Dummy dummy);
    Dummy updateDummy(Dummy dummy);
    void deleteDummy(Dummy dummy);

}
