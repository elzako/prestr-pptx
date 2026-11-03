package com.aspose.slides;

/**
 * Memory, source locking and temporary storage for large presentation media.
 * @see <a href="https://docs.aspose.com/slides/java/manage-blob/">BLOB management</a>
 */
public interface IBlobManagementOptions {
   /** Source locking policy; initially PresentationLockingBehavior.LoadAndRelease. */
   int getPresentationLockingBehavior();
   /** Sets a PresentationLockingBehavior constant. */
   void setPresentationLockingBehavior(int value);
   /** Whether disk spill is allowed; initially false. */
   boolean isTemporaryFilesAllowed();
   /** Enables or disables disk spill when binary data exceeds the memory budget. */
   void setTemporaryFilesAllowed(boolean value);
   /** Temporary directory; initially the system temporary directory. */
   String getTempFilesRootPath();
   /** Sets an existing directory; this setting does not create it. */
   void setTempFilesRootPath(String value);
   /** In-memory binary-data budget in bytes; initially 600 MiB. */
   long getMaxBlobsBytesInMemory();
   /** Sets a binary-data budget in bytes, not the total JVM heap limit. */
   void setMaxBlobsBytesInMemory(long value);
}
