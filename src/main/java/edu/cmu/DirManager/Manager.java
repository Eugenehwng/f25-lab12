package edu.cmu.DirManager;

/**
 * Exception thrown when attempting to create a directory that already exists.
 */
class DirectoryExistsException extends Exception {
    public DirectoryExistsException(String message) {
        super(message);
    }
}

/**
 * Exception thrown when attempting to create a directory with an invalid path.
 */
class InvalidPathException extends Exception {
    public InvalidPathException(String message) {
        super(message);
    }
}

public class Manager {
    private DirOps dirOps;
    
    /**
     * Creates a new directory at the specified path.
     *
     * @param path the path where the new directory should be created
     * @throws DirectoryExistsException if the directory already exists
     * @throws InvalidPathException if the path is invalid
     */
    public void newDirectory(String path) throws DirectoryExistsException, InvalidPathException {
        if (dirOps.checkDirectoryExists(path)) {
            throw new DirectoryExistsException("Directory already exists at path: " + path);
        } else if (!dirOps.checkPathValid(path)) {
            throw new InvalidPathException("Invalid path: " + path);
        } else {
            dirOps.createDirectory(path);
        }
    }
}
