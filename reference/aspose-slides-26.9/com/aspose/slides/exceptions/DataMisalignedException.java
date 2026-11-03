package com.aspose.slides.exceptions;

public final class DataMisalignedException extends SystemException {
   public DataMisalignedException() {
      super("A datatype misalignment was detected in a load or store instruction.");
      this.setErrorCode(-2146233023);
   }

   public DataMisalignedException(String message) {
      super(message);
      this.setErrorCode(-2146233023);
   }

   public DataMisalignedException(String message, Throwable innerException) {
      super(message, innerException);
      this.setErrorCode(-2146233023);
   }
}
