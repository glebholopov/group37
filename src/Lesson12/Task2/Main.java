package Lesson12.Task2;

public class Main {
    public static void main(String[] args) {
        String text = """
                Заявка на подключение услуг
                
                Добрый день! Прошу подключить мне интернет и телевидение.
                
                Основные контакты:
                Email: client.info@mail.com
                Номер договора: 3344-5566-78
                
                Дополнительная информация:
                Резервный email: backup.contact@gmail.com
                Номер паспорта: 9876-5432-10
                
                По вопросам технической поддержки:
                Телефон техподдержки: +(25)1234567
                
                Блок без телефона:
                Email: billing@company.com
                Номер счета: 4455-6677-88
                
                Блок без email:
                Номер лицевого счета: 1122-3344-55
                Мобильный телефон: +(33)7654321
                
                Блок только с телефоном:
                Экстренный контакт: +(99)987654321
                
                Блок только с документом:
                Идентификатор оборудования: 7777-8888-99
                
                Итоговые реквизиты:
                Email: final.confirm@service.org
                Номер заявки: 9999-0000-11
                Контактный телефон: +(44)5556667
                
                С уважением,
                Александр Петров
                """;

        String regex1 = "[A-z0-9.]+@[A-Za-z]+\\.[A-Za-z]+";
        String regex2 = "([0-9]{4}-[0-9]{4}-[0-9]{2})";
        String regex3 = "([+][(]\\d{2}[)]\\d{7})";


        text = text.replaceAll("\n", " ").replaceAll(" +", " ");
        String[] stringArray = text.split(" ");


        for (String s : stringArray) {
            if (s.matches(regex1)) {
                System.out.println("email: " + s);
            }
            if (s.matches(regex2)) {
                System.out.println("document: " + s);
            }
            if (s.matches(regex3)) {
                System.out.println("tel: " + s);
            }
        }
    }
}
