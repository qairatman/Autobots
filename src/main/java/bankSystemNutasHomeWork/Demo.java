package bankSystemNutasHomeWork;

import bankSystemNutasHomeWork.Client;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Client createdClient = null;

        // создаём пользователя
        System.out.println("====== Регистрация нового клиента ======");
        System.out.println("Введите имя клиента:");
        String name = scanner.nextLine();

        System.out.println("Придумайте PIN:");
        String pin = scanner.nextLine();

        createdClient = new Client(name, pin);
        System.out.println("Регистрация успешна!\nВаш ID: " + createdClient.getClientId());
        System.out.println("Пожалуйста войдите в систему.");

        boolean loginOk = false;
        while (!loginOk) {
            System.out.println("Введите имя клиента:");
            String loginName = scanner.nextLine();
            System.out.println("Введите PIN:");
            String loginPin = scanner.nextLine();

            if (loginName.equals(createdClient.getFullName()) && createdClient.authenticate(loginPin)) {
                System.out.println("Добро пожаловать, " + createdClient.getFullName());
                loginOk = true;
            } else {
                System.out.println("Неверное имя или PIN, попробуйте снова.");
            }
        }

        boolean running = true;
        while (running) {
            System.out.println("""
                    ========== МЕНЮ ==========
                    1. Создать новый счёт
                    2. Перевести деньги
                    3. Пополнить счёт
                    4. Снять деньги
                    5. Конвертация валюты
                    6. История транзакций
                    7. Показать все счета
                    0. Выход
                    ===========================
                    Выберите действие:
                    """);

            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    boolean stayInCreate = true;
                    while (stayInCreate) {
                        System.out.println("Выберите тип счёта: 1 - Кредит, 2 - Депозит");
                        int accType = scanner.nextInt();
                        scanner.nextLine();
                        System.out.println("Введите валюту (USD, EUR, KGS):");
                        String curr = scanner.nextLine();
                        Currency currency = Currency.valueOf(curr);

                        if (accType == 1) {
                            new CreditAccount(0, createdClient, currency);
                            System.out.println("Кредитный счёт создан!");
                        } else if (accType == 2) {
                            new DepositAccount(0, createdClient, currency);
                            System.out.println("Депозитный счёт создан!");
                        } else {
                            System.out.println("Неверный выбор.");
                        }
                        System.out.println("Хотите создать ещё счёт? (y/n)");
                        String again = scanner.nextLine();
                        if (!again.equalsIgnoreCase("y")) {
                            stayInCreate = false;
                        }
                    }
                    break;

                case 2:
                    boolean stayInTransfer = true;
                    while (stayInTransfer) {
                        if (Client.listOfAccounts.size() < 2) {
                            System.out.println("Для перевода нужно минимум 2 счёта.");
                            break;
                        }
                        System.out.println("Введите ID счёта-отправителя (0-" + (Client.listOfAccounts.size() - 1) + "):");
                        int fromIdx = scanner.nextInt();
                        System.out.println("Введите ID счёта-получателя:");
                        int toIdx = scanner.nextInt();
                        System.out.println("Введите сумму:");
                        double amount = scanner.nextDouble();
                        scanner.nextLine();

                        BankService.transfer(Client.listOfAccounts.get(fromIdx), Client.listOfAccounts.get(toIdx), amount);
                        System.out.println("Перевод выполнен.");

                        System.out.println("Хотите сделать ещё перевод? (y/n)");
                        String again = scanner.nextLine();
                        if (!again.equalsIgnoreCase("y")) {
                            stayInTransfer = false;
                        }
                    }
                    break;

                case 3:
                    boolean stayInDeposit = true;
                    while (stayInDeposit) {
                        System.out.println("Введите ID счёта для пополнения:");
                        int depIdx = scanner.nextInt();
                        System.out.println("Введите сумму:");
                        double depAmount = scanner.nextDouble();
                        scanner.nextLine();
                        Client.listOfAccounts.get(depIdx).deposit(depAmount);
                        System.out.println("Пополнение успешно.");

                        System.out.println("Хотите ещё пополнить? (y/n)");
                        String again = scanner.nextLine();
                        if (!again.equalsIgnoreCase("y")) {
                            stayInDeposit = false;
                        }
                    }
                    break;

                case 4:
                    boolean stayInWithdraw = true;
                    while (stayInWithdraw) {
                        System.out.println("Введите ID счёта для снятия:");
                        int wdrIdx = scanner.nextInt();
                        System.out.println("Введите сумму:");
                        double wdrAmount = scanner.nextDouble();
                        scanner.nextLine();
                        try {
                            Client.listOfAccounts.get(wdrIdx).withdraw(wdrAmount);
                            System.out.println("Снятие успешно.");
                        } catch (IllegalArgumentException e) {
                            System.out.println("Ошибка: " + e.getMessage());
                        }

                        System.out.println("Хотите ещё снять? (y/n)");
                        String again = scanner.nextLine();
                        if (!again.equalsIgnoreCase("y")) {
                            stayInWithdraw = false;
                        }
                    }
                    break;

                case 5:
                    boolean stayInConvert = true;
                    while (stayInConvert) {
                        System.out.println("Введите валюту FROM:");
                        String fromCurr = scanner.nextLine();
                        System.out.println("Введите валюту TO:");
                        String toCurr = scanner.nextLine();
                        System.out.println("Введите сумму:");
                        double convAmount = scanner.nextDouble();
                        scanner.nextLine();
                        ExchangeRate.convert(
                                Currency.valueOf(fromCurr),
                                Currency.valueOf(toCurr),
                                convAmount
                        );
                        System.out.println("Хотите ещё конвертировать? (y/n)");
                        String again = scanner.nextLine();
                        if (!again.equalsIgnoreCase("y")) {
                            stayInConvert = false;
                        }
                    }
                    break;

                case 6:
                    System.out.println("История транзакций:");
                    System.out.println(BankAccount.listOfTransactions);
                    break;

                case 7:
                    System.out.println("Счета клиента:");
                    int idx = 0;
                    for (BankAccount acc : Client.listOfAccounts) {
                        System.out.println(idx + ": " + acc);
                        idx++;
                    }
                    break;

                case 0:
                    running = false;
                    System.out.println("Выход...");
                    break;

                default:
                    System.out.println("Неверная опция.");
            }
        }
        scanner.close();
    }
}