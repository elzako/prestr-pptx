package com.aspose.slides;

/**
 * Controls memory and disk use for embedded binary data. Sizes are bytes.
 * Configure before loading; the temporary directory must already exist.
 * @see IBlobManagementOptions
 */
public class BlobManagementOptions implements IBlobManagementOptions {
   private long maxBlobsBytesInMemory = 600L * 1024 * 1024;
   private int presentationLockingBehavior = PresentationLockingBehavior.LoadAndRelease;
   private boolean temporaryFilesAllowed = false;
   private String tempFilesRootPath = com.aspose.slides.internal.z0k.z1.n5();

   @Override
   public final int getPresentationLockingBehavior() {
      return this.presentationLockingBehavior;
   }

   @Override
   public final void setPresentationLockingBehavior(int value) {
      this.presentationLockingBehavior = value;
   }

   @Override
   public final boolean isTemporaryFilesAllowed() {
      return this.temporaryFilesAllowed;
   }

   @Override
   public final void setTemporaryFilesAllowed(boolean value) {
      this.temporaryFilesAllowed = value;
   }

   @Override
   public final String getTempFilesRootPath() {
      return this.tempFilesRootPath;
   }

   @Override
   public final void setTempFilesRootPath(String value) {
      this.tempFilesRootPath = value;
   }

   @Override
   public final long getMaxBlobsBytesInMemory() {
      return this.maxBlobsBytesInMemory;
   }

   @Override
   public final void setMaxBlobsBytesInMemory(long value) {
      this.maxBlobsBytesInMemory = value;
   }
}
