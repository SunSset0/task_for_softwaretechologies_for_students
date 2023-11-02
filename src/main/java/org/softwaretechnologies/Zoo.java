package org.softwaretechnologies;

import org.softwaretechnologies.animals.Animal;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Zoo {
    private final List<Animal> animalList = new ArrayList<>();

    public void addAnimal(Animal animal) {

        animalList.add(animal);
    }

    /**
     * Метод должен возвращять список звуков животных.
     * Звуки животных должны быть отсортированы по имени житного. Пример
     * Животные:
     * <p>
     * Корова: Яша
     * Кошка: Дуся
     * Собака: Жучка
     * Корова: Абракадабра
     * Собака: Шарик
     * Кошка: Мурзик
     * Собака: Бобик
     * <p>
     * Вовращаемый список звуков: moo, woof, meow, woof, meow, woof, moo
     *
     * @return Звуки животных, в алфавитном порядке имени животного.
     */
    public List<String> soundAllAnimalsSortByName() {
        List<String> sounds = new ArrayList<>();
        animalList.sort(Comparator.comparing(Animal::getName));
        for (Animal animal : animalList) {
            sounds.add(getAnimalSound(animal));
        }
        return sounds;
    }
    private String getAnimalSound(Animal animal) {
        return animal.sound();
    }
}