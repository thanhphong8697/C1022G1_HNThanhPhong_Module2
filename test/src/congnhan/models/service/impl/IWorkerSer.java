package congnhan.models.service.impl;

import congnhan.models.model.Worker;
import congnhan.models.repository.imlp.IWorkerRepo;
import congnhan.models.repository.interfaceRepo.InterRepo;
import congnhan.models.service.interfaceService.InterSer;

public class IWorkerSer implements InterSer {
    InterRepo interRepo = new IWorkerRepo();


    @Override
    public void display() {

    }

    @Override
    public void add(Worker worker) {

    }

    @Override
    public void search(String str) {

    }
}
