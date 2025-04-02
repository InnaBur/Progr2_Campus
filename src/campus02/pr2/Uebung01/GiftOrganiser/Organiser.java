package campus02.pr2.Uebung01.GiftOrganiser;

import java.time.LocalDate;
import java.util.ArrayList;

public class Organiser {
    public static void main(String[] args) {

        Person me = new Person("Donna", LocalDate.of(1996, 11, 11));
        Person clarissa = new Person("Clarissa", LocalDate.of(2000, 1, 11));
        Person inna = new Person("Inna", LocalDate.of(1987, 4, 1));

        Gift gaming = new Gift(1500, "gaming PC", "sehr cool");
        Gift flowers = new Gift(35, "flowers");
        Gift ticket = new Gift(2000, "Flugticket");
        Gift book = new Gift(20, "Clean Code");
        Gift voucher = new Gift(50, "Voucher", "Kleidung");
        Gift voucherGraz = new Gift(50, "Voucher", "Graz Gutschein");

        me.getGiftIdeas().add(ticket);
        me.getGiftIdeas().add(flowers);
        me.getGiftIdeas().add(voucherGraz);
        me.getAlreadyGifted().add(book);
        clarissa.getGiftIdeas().add(gaming);
        clarissa.getGiftIdeas().add(voucher);
        clarissa.getGiftIdeas().add(voucherGraz);
        clarissa.getAlreadyGifted().add(flowers);
        inna.getGiftIdeas().add(ticket);
        inna.getGiftIdeas().add(book);
        inna.getGiftIdeas().add(voucherGraz);
        inna.getAlreadyGifted().add(voucherGraz);

        ArrayList<Person> people = new ArrayList<>();
        people.add(inna);
        people.add(clarissa);
        people.add(me);

        ArrayList<Gift> gifts = new ArrayList<>();
        gifts.add(gaming);
        gifts.add(flowers);
        gifts.add(ticket);
        gifts.add(book);
        gifts.add(voucher);
        gifts.add(voucherGraz);

        OrganiserService organiserService = new OrganiserService(gifts, people);

        ArrayList<Gift> giftsForInna = organiserService.findGiftsFor(inna);

        System.out.println("Good Ideas for Inna ");
        for (Gift gift: giftsForInna) {
            System.out.println(gift.getLabel());
        }

        ArrayList<Person> bthdBefore = organiserService.birthdayBefore(LocalDate.of(2025, 12, 24));
        System.out.println("These people still have birthday before Christmas: ");
        for (Person person: bthdBefore) {
            System.out.println(person.getName());
        }

        ArrayList<Gift> giftsInPriceRangeForInna = organiserService.findGiftsInPriceRange(giftsForInna, 10, 50);
        for (Gift gift: giftsInPriceRangeForInna) {
            System.out.println(gift.getLabel());
        }

        System.out.println(organiserService.hasAlreadyBeenGifted(inna, voucher));

        organiserService.giveGift(inna, voucher);
        System.out.println(organiserService.hasAlreadyBeenGifted(inna, voucher));
    }


}
