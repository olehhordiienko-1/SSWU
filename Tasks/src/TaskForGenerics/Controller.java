package TaskForGenerics;

import java.util.*;

public class Controller {
    // first two methods only for comparison
    // read-only, so ? extends Animal
    public static <T extends Animal> HashMap<? extends Animal, Integer> findCommonElementsInContainers(T[] arrayAnimals, List<? extends Animal> listAnimals) {
        HashMap<Animal, Integer> mapAnimals = new HashMap<>();
        int counterMatchers;
        for (Animal arAnimal : arrayAnimals) {
            counterMatchers = 0;
            if(!listAnimals.contains(arAnimal)) {
                continue;
            }
            for (Animal liAnimal : listAnimals) {
                if (arAnimal.equals(liAnimal)) {
                    counterMatchers++;
                }
            }
            mapAnimals.put(arAnimal, counterMatchers);
        }
        return mapAnimals;
    }

    // writeable, so ? super Animal
    public static <T extends Animal> List<? super Animal> findMissingElementsInContainers(T[] arrayAnimals, List<? super Animal> listAnimals) {
        HashSet<? super Animal> setAnimals = new HashSet<>(listAnimals);
        setAnimals.addAll(Arrays.asList(arrayAnimals));
        return new ArrayList<>(setAnimals);
    }

    // next two methods are corresponding to task (without inheritance)

    public static <T> Map<T, Integer> findCommonElementsInContainersWithoutInheritance(T[] array, List<T> list) {
        HashMap<T, Integer> mapAnimals = new HashMap<>();
        int counterMatchers;
        for (T arAnimal : array) {
            counterMatchers = 0;
            if(!list.contains(arAnimal)) {
                continue;
            }
            for (Object liAnimal : list) {
                if (arAnimal.equals(liAnimal)) {
                    counterMatchers++;
                }
            }
            mapAnimals.put(arAnimal, counterMatchers);
        }
        return mapAnimals;
    }

    public static <T> List<T> findMissingElementsInContainersWithoutInheritance(T[] array, List<T> list) {
        HashSet<T> setAnimals = new HashSet<>(list);
        setAnimals.addAll(Arrays.asList(array));
        return new ArrayList<>(setAnimals);
    }
}
