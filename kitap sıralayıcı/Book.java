
    public class Book implements Comparable<Book> {
        private String bookName;
        private int numberOfPages;
        private String authorName;
        private int releaseDate;

        public Book(String bookName, int numberOfPages, String authorName, int releaseDate) {
            this.bookName = bookName;
            this.numberOfPages = numberOfPages;
            this.authorName = authorName;
            this.releaseDate = releaseDate;
        }

        public String getBookName() {
            return bookName;
        }

        public int getNumberOfPages() {
            return numberOfPages;
        }

        public String getAuthorName() {
            return authorName;
        }

        public int getReleaseDate() {
            return releaseDate;
        }

        @Override
        public int compareTo(Book o) {
            return bookName.compareTo(o.bookName);
        }

}

