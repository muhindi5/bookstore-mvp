package gekos.org.bookstore_mvc;

import java.util.List;

/**
 * Created by kelly on 10/7/17.
 */

public interface BooksListContract {

    /** Passive layer responsible for showing data and receiving user interactions.
     * Usually implemented by an Activity/Fragment, and will contain a reference to a presenter which is
     * ideally provided by a dependency injector such as Dagger2.
     * The View will call a method in the presenter every time there is a interface
     * interaction
     * */
    public interface View {

        void notifyBookAdded();

        void notifyBookDeleted();

        void notifyBookUpdated();

        void showBooksList();

        void showEditBookForm();

        void showDeleteBookPrompt(Book bookToDelete);

        void showMessage();

    }

/** The middleman between the model and the view, process user interactions and send data requests
 * to model A concrete presenter will implement these methods*/
    public interface Actions {

        void loadBooks();

        Book getBook();

        void editBook();
    }

/** The gateway to the domain logic or the business logic, provides all the data to be displayed by
 * the view. It hHandle all the business logic, It will be implemented by a persistent model class.
 * */
    public interface Repository {

        List<Book> getAllBooks();

        void addBook(Book bookToAdd);

        void deleteBook(Book book);

        void updateBook(Book book);
    }
}
