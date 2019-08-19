package rentalstore;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CustomerTest {
    private Customer customer = new Customer("Eric");

    @Test
    public void should_return_correct_textStatement_given_customer_has_no_rental() {
        String statement = customer.statement(new TextStatement());

        Assert.assertEquals("Rental Record for Eric\n" +
                "Amount owed is 0.0\n" +
                "You earned 0.0 frequent renter points", statement);
    }

    @Test
    public void should_return_correct_textStatement_given_customer_has_rent_one_regular_movie_for_2_day() {
        Movie movie = new RegularMovie("Titanic", Movie.REGULAR);
        Rental oneDayRental = new Rental(movie, 2);
        customer.addRental(oneDayRental);

        String statement = customer.statement(new TextStatement());

        Assert.assertEquals("Rental Record for Eric\n" +
                "\tTitanic\t2.0\n" +
                "Amount owed is 2.0\n" +
                "You earned 1.0 frequent renter points", statement);
    }

    @Test
    public void should_return_correct_textStatement_given_customer_has_rent_one_regular_movie_for_3_day() {
        Movie movie = new RegularMovie("Titanic", Movie.REGULAR);
        Rental oneDayRental = new Rental(movie, 3);
        customer.addRental(oneDayRental);

        String statement = customer.statement(new TextStatement());

        Assert.assertEquals("Rental Record for Eric\n" +
                "\tTitanic\t3.5\n" +
                "Amount owed is 3.5\n" +
                "You earned 1.0 frequent renter points", statement);
    }

    @Test
    public void should_return_correct_textStatement_given_customer_has_rent_one_new_release_movie_for_1_day() {
        Movie movie = new NewReleaseMovie("Titanic", Movie.NEW_RELEASE);
        Rental oneDayRental = new Rental(movie, 1);
        customer.addRental(oneDayRental);

        String statement = customer.statement(new TextStatement());

        Assert.assertEquals("Rental Record for Eric\n" +
                "\tTitanic\t3.0\n" +
                "Amount owed is 3.0\n" +
                "You earned 1.0 frequent renter points", statement);
    }

    @Test
    public void should_return_correct_textStatement_given_customer_has_rent_one_new_release_movie_for_2_day() {
        Movie movie = new NewReleaseMovie("Titanic", Movie.NEW_RELEASE);
        Rental oneDayRental = new Rental(movie, 2);
        customer.addRental(oneDayRental);

        String statement = customer.statement(new TextStatement());

        Assert.assertEquals("Rental Record for Eric\n" +
                "\tTitanic\t6.0\n" +
                "Amount owed is 6.0\n" +
                "You earned 2.0 frequent renter points", statement);
    }

    @Test
    public void should_return_correct_textStatement_given_customer_has_rent_one_childrens_movie_for_3_day() {
        Movie movie = new ChildrensMovie("Titanic", Movie.CHILDRENS);
        Rental oneDayRental = new Rental(movie, 3);
        customer.addRental(oneDayRental);

        String statement = customer.statement(new TextStatement());

        Assert.assertEquals("Rental Record for Eric\n" +
                "\tTitanic\t1.5\n" +
                "Amount owed is 1.5\n" +
                "You earned 1.0 frequent renter points", statement);
    }

    @Test
    public void should_return_correct_textStatement_given_customer_has_rent_one_childrens_movie_for_4_day() {
        Movie movie = new ChildrensMovie("Titanic", Movie.CHILDRENS);
        Rental oneDayRental = new Rental(movie, 4);
        customer.addRental(oneDayRental);

        String statement = customer.statement(new TextStatement());

        Assert.assertEquals("Rental Record for Eric\n" +
                "\tTitanic\t3.0\n" +
                "Amount owed is 3.0\n" +
                "You earned 1.0 frequent renter points", statement);
    }

    @Test
    public void should_return_correct_textStatement_given_customer_has_rent_one_childrens_movie_for_4_day_and_one_regular_movie_for_4_day() {
        Movie childrensMovie = new ChildrensMovie("Titanic", Movie.CHILDRENS);
        Movie regularMovie = new RegularMovie("Roman Holiday", Movie.REGULAR);
        Rental childrensMovieRental = new Rental(childrensMovie, 4);
        Rental regularMovieRental = new Rental(regularMovie, 4);
        customer.addRental(childrensMovieRental);
        customer.addRental(regularMovieRental);

        String statement = customer.statement(new TextStatement());

        Assert.assertEquals("Rental Record for Eric\n" +
                "\tTitanic\t3.0\n" +
                "\tRoman Holiday\t5.0\n" +
                "Amount owed is 8.0\n" +
                "You earned 2.0 frequent renter points", statement);
    }

    @Test
    public void should_return_correct_htmlStatement_given_customer_has_rent_one_childrens_movie_for_4_day_and_one_regular_movie_for_4_day() {
        Movie childrensMovie = new ChildrensMovie("Titanic", Movie.CHILDRENS);
        Movie regularMovie = new RegularMovie("Roman Holiday", Movie.REGULAR);
        Rental childrensMovieRental = new Rental(childrensMovie, 4);
        Rental regularMovieRental = new Rental(regularMovie, 4);
        customer.addRental(childrensMovieRental);
        customer.addRental(regularMovieRental);

        String statement = customer.statement(new HtmlStatement());

        Assert.assertEquals("<H1>Rental Record for <EM>Eric</EM></H1><P>\n" +
                "Titanic：3.0<BR>\n" +
                "Roman Holiday：5.0<BR>\n" +
                "<P>You owe<EM>8.0</EM><P>\n" +
                "On this rental you earned <EM>2.0</EM> frequent renter points<P>", statement);
    }

    @Test
    public void should_return_correct_textStatement_given_customer_has_rent_one_literary_movie_for_3_day() {
        Movie movie = new LiteraryMovie("Titanic", Movie.LITERARY);
        Rental oneDayRental = new Rental(movie, 3);
        customer.addRental(oneDayRental);

        String statement = customer.statement(new TextStatement());

        Assert.assertEquals("Rental Record for Eric\n" +
                "\tTitanic\t18.0\n" +
                "Amount owed is 18.0\n" +
                "You earned 1.5 frequent renter points", statement);
    }
}