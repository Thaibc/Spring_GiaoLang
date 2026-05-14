package mamnguquaver2.config;

import mamnguquaver2.entity.Fruit;
import mamnguquaver2.repo.FruitRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataInitialazer implements CommandLineRunner {

    private FruitRepo fruitRepo;

    @Autowired
    public DataInitialazer(FruitRepo fruitRepo) {
        this.fruitRepo = fruitRepo;
    }

    @Override
    public void run(String... args) throws Exception {
        //tao san 1 vai trai cay khi ta run cai app
        //xai Builder cua loombok, hoac phai new Fruit truyen thong
        Fruit cau = Fruit.builder().name("Mang Cau").description("La loai trai cay.....").price(30000).build();

        Fruit sung = Fruit.builder().name("Sung").description("La loai trai cay.....").price(40000).build();

        Fruit dua = Fruit.builder().name("Dua").description("La loai trai cay.....").price(50000).build();

        fruitRepo.save(cau);
        fruitRepo.save(sung);
        fruitRepo.save(dua);

    }
}
