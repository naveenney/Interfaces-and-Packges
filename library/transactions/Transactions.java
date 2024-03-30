package library.transactions;

import java.text.SimpleDateFormat;
import java.util.Date;

import library.book.Book;
import library.member.Member;

public class Transactions {

	private Book book;

	private Member member;

	private Date date;

	private Date date1;

	public Transactions(Book book, Member member, Date date, Date date1) {
		this.book = book;
		this.member = member;
		this.date = date;
		this.date1 = date1;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	public Member getMember() {
		return member;
	}

	public void setMember(Member member) {
		this.member = member;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public void setDate1(Date date) {
		this.date1 = date;
	}

	public Date getDate1() {
		return date1;
	}

	public void returnBook() {
		SimpleDateFormat s = new SimpleDateFormat();

		String d = s.format(this.date);

		String d1 = s.format(this.date1);

		System.out.println(
				"MEMBER ID:" + this.getMember().getMemberId() + "\nMEMBER NAME:" + this.getMember().getMemberName()
						+ "\nBORROWED DATE:" + d.substring(0, 8) + "\nRETURNING DATE:" + d1.substring(0, 8) + "\n");

	}

}
