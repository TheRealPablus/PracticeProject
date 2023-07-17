import java.util.Scanner;

public class Main {

    static void algebra() {
        Scanner in = new Scanner(System.in);
        int type_algebra;
        System.out.print("Что именно нужно? 1-сумма, 2-вычитание, 3-умножение, 4-деление, 5-процент от числа, 6-возведение в степень, 7-квадратный корень : ");
        type_algebra = in.nextInt();
        do {
            if (type_algebra > 7) {
                System.out.print("Такой операции не существует! Что именно нужно? 1-сумма, 2-вычитание, 3-умножение, 4-деление, 5-процент от числа, 6-возведение в степень, 7-квадратный корень : ");
                type_algebra = in.nextInt();
            }
        } while (type_algebra > 7);
        switch (type_algebra) {

            case 1:
                System.out.print("Первое слагаемое = ");
                double s1 = in.nextDouble();
                System.out.print("Второе слагаемое = ");
                double s2 = in.nextDouble();
                System.out.printf("Сумма = %.3f \n", s1 + s2);
                break;

            case 2:
                System.out.print("Уменьшаемое = ");
                double u1 = in.nextDouble();
                System.out.print("Вычитаемое = ");
                double u2 = in.nextDouble();
                System.out.printf("Разность = %.3f \n", u1 - u2);
                break;

            case 3:
                System.out.print("Первый множитель = ");
                double umn1 = in.nextDouble();
                System.out.print("Второй множитель = ");
                double umn2 = in.nextDouble();
                System.out.printf("Произведение = %.3f \n", umn1 * umn2);
                break;

            case 4:
                double del1;
                double del2;
                System.out.print("Делимое = ");
                del1 = in.nextDouble();
                System.out.print("Делитель = ");
                del2 = in.nextDouble();
                double chastnoe = del1 / del2;
                System.out.printf("Частное = %.3f \n", chastnoe);
                break;

            case 5:
                double proc1;
                double proc2;
                double proc_itog;
                double sto = 100;
                System.out.print("Введите число = ");
                proc1 = in.nextDouble();
                System.out.print("Какой процент = ");
                proc2 = in.nextDouble();
                proc_itog = (proc1 * proc2);
                double proc_itog_na_sto = proc_itog / sto;
                System.out.printf("Итого = %.3f \n", proc_itog_na_sto);
                break;

            case 6:
                double step1;
                double step2;
                System.out.print("Число = ");
                step1 = in.nextDouble();
                System.out.print("Степень = ");
                step2 = in.nextDouble();
                double step_itog = Math.pow(step1, step2);
                System.out.printf("Итог = %.3f \n", step_itog);
                break;

            case 7:
                double kor1;
                System.out.print("Число = ");
                kor1 = in.nextDouble();
                System.out.printf("Корень = %.3f \n", Math.sqrt(kor1));
                break;

        }
    }


    static void bank() {
        Scanner in = new Scanner(System.in);
        System.out.print("Что именно нужно здесь расчитать? 1-переплату, 2-ежемесячный доход по депозиту : ");
        int type_bank = in.nextInt();
        do {
            if (type_bank>2) {
                System.out.print("Неверный код операции! 1-переплату, 2-ежемесячный доход по депозиту : ");
                type_bank = in.nextInt();
            }
        } while(type_bank>2);

        switch (type_bank) {
            case 1:
                double vzyal;
                double stavka;
                double dney_v_godu = 365;
                double let;
                double dney;
                double pereplata_1;
                double pereplata_2;
                double pereplata_itog;
                System.out.print("Сколько взял = ");
                vzyal = in.nextDouble();
                System.out.print("Процентая ставка (без %) = ");
                stavka = in.nextDouble();
                System.out.print("Срок кредита (в годах) = ");
                let = in.nextDouble();
                dney = 365*let;
                pereplata_1 = vzyal*stavka/100*dney/dney_v_godu;
                pereplata_2 = vzyal*0.01*stavka;
                pereplata_itog = pereplata_1+pereplata_2;
                System.out.printf("Переплата = сумма кредита*ставка/100*срок кредита в днях/365+сумма кредита*0.01*ставка =  %.3f \n", pereplata_itog);
                break;

            case 2:
                double depozit;
                double stavka_type_bank_2;
                double dohod;
                System.out.print("Депозит = ");
                depozit = in.nextDouble();
                System.out.print("Ставка (без %) = ");
                stavka_type_bank_2 = in.nextDouble();
                dohod = depozit*stavka_type_bank_2/100*30;
                double dohod_2 = dohod/360;
                System.out.printf("Вознаграждение = депозит*ставка*30 дней/360 дней = %.3f \n", dohod_2);
                break;
        }
    }

    static void S() {
        Scanner in = new Scanner(System.in);
        int s_imenno;
        System.out.print("Площадь чего нужно найти? 1-квадрата, 2-прямоугольника, 3-трапеции : ");
        s_imenno = in.nextInt();
        do {
            if(s_imenno>3){
                System.out.print("Неверный код операции! 1-квадрата, 2-прямоугольника, 3-трапеции : ");
                s_imenno = in.nextInt();
            }
        } while (s_imenno>3);

        switch(s_imenno) {
            case 1:
                double quadro;
                double dlina_quadro;
                System.out.print("Длина стороны квадрата = ");
                dlina_quadro = in.nextDouble();
                quadro = dlina_quadro*dlina_quadro;
                System.out.printf("Площадь квадрата = a*a = %.3f \n", quadro);
                break;

            case 2:
                double pryamo_a;
                double pryamo_b;
                System.out.print("Длина прямоугольника (а) = ");
                pryamo_a = in.nextDouble();
                System.out.print("Длина прямоугольника (b) = ");
                pryamo_b = in.nextDouble();
                double s_pryamo = pryamo_a * pryamo_b;
                System.out.printf("Площадь прямоугольника = a*b = %.2f \n", s_pryamo);
                break;

            case 3:
                double trap_a;
                double trap_b;
                double h_trap;
                double s_trap_1;
                double s_trap_2;
                double s_trap_itog;
                System.out.print("Длина вернехо основания = ");
                trap_a = in.nextDouble();
                System.out.print("Длина нижнего основания = ");
                trap_b = in.nextDouble();
                System.out.print("Высота трапеции = ");
                h_trap = in.nextDouble();
                s_trap_1 = trap_a + trap_b;
                s_trap_2 = s_trap_1/2;
                s_trap_itog = s_trap_2*h_trap;
                System.out.printf("Площадь трапции = ((a+b)/2)*h = %.2f \n", s_trap_itog);
                break;

        }
    }

    static void fizika() {
        Scanner in = new Scanner(System.in);
        System.out.print("Какую физическую формулу надо решить? 1-ток, напряжение, сопротивление; 2-теория относительности : ");
        int fiz = in.nextInt();
        do {
            if(fiz > 2){
                System.out.print("Неверный код операции! 1-ток, напряжение, сопротивление; 2-теория относительности : ");
                fiz=in.nextInt();
            }
        } while (fiz > 2);

        switch (fiz) {

            case 2:
                System.out.print("Для расчёта энергии для преодоления скорости света существует формула Энштейна: E=mc^2.");
                long massa;
                long v_sveta = 299792458;
                System.out.print(" Для расчёта введите массу объекта, округлённую до целых чисел = ");
                massa = in.nextLong();
                long E = v_sveta*v_sveta*massa;
                System.out.printf("E = %d Дж \n", E);
                break;

            case 1:
                System.out.print("Что иммено найти: 1-ток, 2-напряжение, 3-сопротивление : ");
                int fiz_imenno=in.nextInt();
                double i;
                double u;
                double r;
                do {
                    if (fiz_imenno>3) {
                        System.out.print("Неверный код операции! 1-ток, 2-напряжение, 3-сопротивление : ");
                        fiz_imenno=in.nextInt();
                    }
                }while (fiz_imenno>3);


                switch (fiz_imenno) {
                    case 1:
                        System.out.print("Введите сопротивление = ");
                        r = in.nextDouble();
                        System.out.print("Введите напряжение = ");
                        u = in.nextDouble();
                        i = u/r;
                        System.out.printf("Ток = U/R = %.3f А \n", i);
                        break;

                    case 2:
                        System.out.print("Введите ток = ");
                        i = in.nextDouble();
                        System.out.print("Введите сопротивление = ");
                        r = in.nextDouble();
                        u = i*r;
                        System.out.printf("Напряжение = R*I = %.3f В \n", u);
                        break;

                    case 3:
                        System.out.print("Введите напряжение = ");
                        u = in.nextDouble();
                        System.out.print("Введите ток = ");
                        i = in.nextDouble();
                        r = u/i;
                        System.out.printf("Сопротивление = U/I = %.3f Ом \n", r);
                        break;

                }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Данный калькулятор очень примитивен и требуют ввода дробных чисел с запятой вместо точки, но только после выбора операции. ");

        int cicle = 1;
        do {
            System.out.print("Что выберете? 0-о программе, 1-алгебраические операции, 2-расчёты площадей геометрических фигур, 3-физические расчёты, 4-банковские расчёты : ");
            int type = in.nextInt();
            do {
                if(type>4) {
                    System.out.print("Данной операции не существует! 1-алгебраические операции, 2-расчёты площадей геометрических фигур, 3-физические расчёты, 4-банковские расчёты :  ");
                    type = in.nextInt();
                }
            } while(type>4);
            switch(type) {

                case -1:
                    System.out.print("Поздравляю! Ты нашёл пасхалку! Дата её создания = 04.04.2020 ");
                    break;

                case 0:
                    System.out.print("Версия программы: 5; создатель: Владислав С. (Duco Exin); год: 2020; язык программирования: Java; версия Java Development Kit (JDK): 14. ");
                    break;

                case 1:
                    algebra();
                    break;

                case 2:
                    S();
                    break;

                case 3:
                    fizika();
                    break;

                case 4:
                    bank();
                    break;
            }

        } while(cicle==1);
    }
}