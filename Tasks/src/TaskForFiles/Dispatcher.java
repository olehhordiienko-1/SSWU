package TaskForFiles;

public class Dispatcher {
    public static void main(String[] args) {
        Controller.separateListBottlesForVolume();
        Controller.sortDataInFilesByParameter("any choice, which doesn't exist in switch-case");
    }
}
