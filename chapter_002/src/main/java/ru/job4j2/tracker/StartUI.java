package ru.job4j2.tracker;


/**
 * 2.1. Реализация класса StartUI[#235573]
 * 4.1. Разрыв зависимости StartUI от Scanner.[#235568]
 * 4.2. Статические методы.[#235569]
 */
public class StartUI {


    public void init(Input input, Tracker tracker, UserAction[] actions) {
        boolean run = true;
        while (run) {
            this.showMenu(actions);
            int select = input.askInt("Select: ");
            UserAction action = actions[select];
            run = action.execute(input, tracker);
        }
    }

    private void showMenu(UserAction[] actions) {
        System.out.println("Menu.");
        for (int index = 0; index < actions.length; index++) {
            System.out.println(index + ". " + actions[index].name());
        }
    }

    public static void main(String[] args) {
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        UserAction[] actions = {new CreateAction(), new AllAction(), new ReplaceAction(),
                new DeleteAction(), new FindByIDAction(), new FindByNameAction(), new ExitAction()};
        new StartUI().init(input, tracker, actions);
    }
}