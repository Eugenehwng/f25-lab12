package edu.cmu.Library;

public class LibraryAccount {
    private LibraryService libraryService;
 
    /**
     * Retrieves an array of checked out books associated with the specified library ID and user name.
     * If the user has no books checked out, the returned list will be empty. Since multiple households
     * may share a single account, both the library ID and user name are required to identify the user.
     *
     * @param libraryId the ID of the library account
     * @param userName the name of the user whose books are to be retrieved
     * @return an array of Book objects the user has checked out
     */
    public Book[] getBooks(String libraryId, String userName) {
        // LibraryService.getBooks expects (name, id) where name is libraryId and id is userName
        // This matches the original behavior but with clearer parameter separation
        return libraryService.getBooks(libraryId, userName);        
    }
}
