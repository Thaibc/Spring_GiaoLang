package mamnguquaver2.repo;

import mamnguquaver2.entity.Fruit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface FruitRepo extends JpaRepository<Fruit,Long> {
    //tu dong hibernate va JPA se generate 1 class va 1 object chua toan bo cac ham CRUD Fruit dua tren key
    //Nhung dong thoi no ho tro genarate ra 1 loat cac ham chua biet, chua co, neu ban biet theo dung cu phap dat ten
    //co 2 loai ham: co san va se generate


}
