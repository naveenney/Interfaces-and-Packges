package library;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import library.book.Book;
import library.member.Member;
import library.transactions.Transactions;

public class Main {

	public static void main(String[] args) {

		Book book = new Book("JAVA", "JAMES", "983-12-2-12");

		Book book1 = new Book("APPTITUDE REASONING", "AGARWAL", "783-21-4-23");

		Member member = new Member("NAVEEN", "101");

		Member member1 = new Member("PRAVEEN", "102");

		try {
			SimpleDateFormat s = new SimpleDateFormat("dd/MM/yyyy");
			Date date = s.parse("23/03/2024");
			Date date1 = s.parse("30/03/2024");
			Transactions transaction1 = new Transactions(book, member, date, date1);
			Date date2 = s.parse("20/03/2024");
			Date date3 = s.parse("30/03/2024");
			Transactions transaction2 = new Transactions(book1, member1, date2, date3);

			transaction1.returnBook();
			transaction2.returnBook();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
