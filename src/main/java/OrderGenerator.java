import java.util.List;

public class OrderGenerator {

    public static Order colourBlackAndGrey() {
        return new Order("Николай","Паштетов","ул. Пушинская, д. 24","3","+7 900 123 45 67",5,"2022-12-16","Комментарий к заказу", List.of("BLACK", "GREY"));
    }

    public static Order colourBlack() {
        return new Order("Николай","Паштетов","ул. Пушинская, д. 24","3","+7 900 123 45 67",5,"2022-12-16","Комментарий к заказу",List.of("BLACK"));
    }

    public static Order colourGrey() {
        return new Order("Николай","Паштетов","ул. Пушинская, д. 24","3","+7 900 123 45 67",5,"2022-12-16","Комментарий к заказу",List.of("GREY"));
    }

    public static Order colourNull() {
        return new Order("Николай","Паштетов","ул. Пушинская, д. 24","3","+7 900 123 45 67",5,"2022-12-16","Комментарий к заказу",null);
    }

    public static Order colourEmpty() {
        return new Order("Николай","Паштетов","ул. Пушинская, д. 24","3","+7 900 123 45 67",5,"2022-12-16","Комментарий к заказу",List.of(""));
    }
}