package congnhan.models.repository.imlp;

import congnhan.models.model.Worker;
import congnhan.models.repository.interfaceRepo.InterRepo;

import java.util.ArrayList;
import java.util.List;

public class IWorkerRepo implements InterRepo {
    static public List<Worker> workerList = new ArrayList<>();

    static {
        workerList.add(new Worker("1", "Nam", "abc@gmail.com", "10A"));
    }

    @Override
    public void display() {
        for (Worker worker1 : workerList) {
            System.out.println(worker1);
        }


    }

    @Override
    public void add(Worker worker) {

    }

    @Override
    public void search(String str) {
        for (int i = 0; i < workerList.size(); i++) {
            if (workerList.get(i).getName().contains(str)) {
                System.out.println(workerList.get(i));
            }
        }
    }
}
