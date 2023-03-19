public class hogwats {
    public static void main(String[] args) {

        slizerin[] student = {
                new slizerin("Драко ", "Малфой ", "33 ", "23 ", "45", "77", "22"),
                new slizerin("Грэхэм ", "Монтегю", "21", "34", "10", "32", "23"),
                new slizerin("Грегори ", "Гойл", "76", "54", "65", "77", "76"),
        };
        System.out.println("Студенты Слизерин " + student.length);
        for (int i = 0; i < student.length; i++) {
            slizerin slizerin = student[i];
            System.out.println("Имя - " + slizerin.getName() + ", Фамилия - " + slizerin.getSurname() + ", Хитрость - " + slizerin.getCunning() + ", Решительность " + slizerin.getAmbition() + ", Амбициозность " + slizerin.getResourcefulness() + ", Находчивость " + slizerin.getDetermination() + ", Жажда власти " + slizerin.getLustPower());
        }



            cogtevran[] students = {
                    new cogtevran("Чжоу", "Чанг", "55", "61", "45", "23"),
                    new cogtevran("Падма", "Патил", "21", "34", "54", "65"),
                    new cogtevran("Маркус", "Белби", "87", "67", "64", "44"),
            };
            System.out.println(" Студенты Когтервана  " + students.length);
            for (int i = 0; i < students.length; i++) {
                cogtevran cogtevran = students[i];
                System.out.println("Имя - " + cogtevran.getName() + ", Фамилия - " + cogtevran.getSurname() + ", Умны - " + cogtevran.getSmart() + ",Мудры - " + cogtevran.getWise() + ",Остроумны - " + cogtevran.getWitty() + ", Полны творчества- " + cogtevran.getFullCreativity());
            }


                pufenduy[] pufenduys = {
                        new pufenduy("Захария", "Смит", "23", "44", "56"),
                        new pufenduy("Седрик", "Диггори", "24", "44", "65"),
                        new pufenduy("Джастин", "Финч-Флетчли", "67", "88", "100"),
                };
                System.out.println("Студенты Пуфендуя" + pufenduys.length);
                for (int i = 0; i < pufenduys.length; i++) {
                    pufenduy pufenduy = pufenduys[i];
                    System.out.println("Имя -" + pufenduy.getName() + ",Фамилия -" + pufenduy.getSurname() + ",Трудолюбивы - " + pufenduy.getHardworking() + ",Верны - " + pufenduy.getLoyal() + ",Честны - " + pufenduy.getHonest());
                }

                griffindor[] griffindors = {
                        new griffindor("Гарри","Поттер","21","24","54"),
                        new griffindor("Гермиона","Грейнджер","32","44","76"),
                        new griffindor("Рон","Уизли","45","66","77"),
                };
        System.out.println("Студенты Гриффиндора " + griffindors.length);
        for (int i = 0; i < griffindors.length; i++) {
            griffindor griffindor = griffindors[i];
            System.out.println("Имя -" + griffindor.getName() + ",Фамилия - " + griffindor.getSurname() + ",Благородсва - " + griffindor.getNobility() + ",честь - " + griffindor.getHonor() + ",Храбрость - " + griffindor.getCourage());

        }
            }
        }

