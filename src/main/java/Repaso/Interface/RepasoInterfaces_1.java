package Repaso.Interface;

public class RepasoInterfaces_1 {

    public static void main(String[] args) {
        MySQL n = new MySQL();
        System.out.println(n.getById(1L));

        Redis r = new Redis();
        System.out.println(r.getById(2L));
    }
}
