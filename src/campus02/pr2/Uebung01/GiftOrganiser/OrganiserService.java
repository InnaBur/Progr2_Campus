package campus02.pr2.Uebung01.GiftOrganiser;

import java.time.LocalDate;
import java.util.ArrayList;

public class OrganiserService {

    ArrayList<Gift> gifts;
    ArrayList<Person> persons;

    public OrganiserService(ArrayList<Gift> gifts, ArrayList<Person> persons) {
        this.gifts = gifts;
        this.persons = persons;
    }

    public ArrayList<Gift> findGiftsFor(Person person) {
        return person.getGiftIdeas();
    }

    public ArrayList<Person> birthdayBefore(LocalDate date) {
        ArrayList<Person> hatBirthdaySoon = new ArrayList<>();
        for (Person person : persons) {
            int currentYear = LocalDate.now().getYear();
            int birthdayMonth = person.getBirthday().getMonthValue();
            int bthdDay = person.getBirthday().getDayOfMonth();
            LocalDate bthdThisYear = LocalDate.of(currentYear, birthdayMonth, bthdDay);
            if (bthdThisYear.isAfter(LocalDate.now()) && bthdThisYear.isBefore(date)) {
                hatBirthdaySoon.add(person);
            }
        }
        return hatBirthdaySoon;
    }

    public ArrayList<Gift> findGiftsInPriceRange(ArrayList<Gift> giftList, int min, int max) {
        ArrayList<Gift> giftsInRange = new ArrayList<>();
        for (Gift gift : giftList) {
            if (gift.getPrice() >= min && gift.getPrice() <= max) {
                giftsInRange.add(gift);
            }
        }
        return giftsInRange;
    }

    public void giveGift(Person person, Gift gift) {
        person.getAlreadyGifted().add(gift);
        person.getGiftIdeas().remove(gift);
    }

    public boolean hasAlreadyBeenGifted(Person person, Gift gift) {
        return person.getAlreadyGifted().contains(gift);
    }

}
