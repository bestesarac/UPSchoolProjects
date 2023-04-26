import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
        int choice = 0;

        FilmsManager filmsManager = new FilmsManager();
        UsersManager usersManager = new UsersManager();
        

        printMenu();
        do {
            System.out.print("Seçiminiz : ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1 -> { 
                    System.out.println("******************************");
                    System.out.print("Id : ");
                    Long id = scanner.nextLong();
                    System.out.print("Kullanıcı Adı: ");
                    scanner.nextLine();
                    String userName = scanner.nextLine();
                    System.out.print("Şifre : ");
                    String password = scanner.nextLine();
                    System.out.print("Email Adresi : ");
                    String email = scanner.nextLine();
                    Users users = new Users(id, userName, password, email);
                    usersManager.addUser(users);
                    System.out.println(" -Kullanıcı Oluşturuldu- \nHoşgeldiniz");
                    System.out.println("******************************");
                }
                case 2 -> { 
                    System.out.println("******************************");
                    System.out.print("Silmek İstediğiniz Kullanıcı Id'si : ");
                    Long id = scanner.nextLong();
                    usersManager.deleteUser(id);
                    System.out.println(" -Hesabınız Silindi-");
                    System.out.println("******************************");
                }
                case 3 -> { 
                    System.out.println("******************************");
                    System.out.print("Aramak İstediğiniz Kullanıcı Id'si Giriniz : ");
                    scanner.nextLine();
                    Long id = scanner.nextLong();
                    usersManager.searchUser(id);
                    System.out.println("******************************");
                }
                case 4 -> { 
                    System.out.println("******************************");
                    System.out.print("Film Id'si : ");
                    Long id = scanner.nextLong();
                    System.out.print("Film İsmi : ");
                    scanner.nextLine();
                    String name = scanner.nextLine();
                    System.out.print("Filmin Yönetmeni : ");
                    String directorName = scanner.nextLine();
                    System.out.print("Filmin Oyuncuları : ");
                    String filmActors = scanner.nextLine();
                    System.out.print("Vizyon Tarihi : ");
                    String date = scanner.nextLine();
                    System.out.print("Filmin Açıklaması : ");
                    String description = scanner.nextLine();
                    System.out.print("Türü : ");
                    String type = scanner.nextLine();
                    Films films = new Films(id, name, directorName, filmActors, date, description, type);
                    filmsManager.filmList(films);
                    System.out.println(" -Film Eklendi- ");
                    System.out.println("******************************");
                }
                case 5 -> { 
                    System.out.println("******************************");
                    System.out.println("Silmek İstediğiniz Filmin Id'sini Giriniz :");
                    Long id = scanner.nextLong();
                    filmsManager.deleteFilm(id);
                    System.out.println("******************************");
                }
                case 6 -> {
                    System.out.println("******************************");
                    System.out.println("Aramak İstediğiniz Filmin Id'sini Giriniz : ");
                    scanner.nextLine();
                    Long id = scanner.nextLong();
                    filmsManager.searchFilm(id);
                    System.out.println("******************************");
                }
                case 7 -> {
                    System.out.println("******************************");
                    filmsManager.listFilms();
                    System.out.println("******************************");
                }

                case -1 -> {
                    System.out.println("İyi Günler");
                }
                default -> printMenu();
            }
        } while (choice != -1);
    }

    private static void printMenu() {
        System.out.println("****** Menu ******");
        System.out.println("1: Kullanıcı Hesabı Oluşturun");
        System.out.println("2: Kullanıcı Hesabını Silin");
        System.out.println("3: Kullanıcı Hesabını Arayın");
        System.out.println("4: Film Ekleyinn");
        System.out.println("5: Film Silin");
        System.out.println("6: Film Arayın");
        System.out.println("7: Film Listesi");
        System.out.println("-1: Çıkış \n\n");
    }

	}


