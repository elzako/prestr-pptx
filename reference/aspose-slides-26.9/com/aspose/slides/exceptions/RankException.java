package com.aspose.slides.exceptions;

public class RankException extends SystemException {
   public RankException() {
      super("Attempted to operate on an array with the incorrect number of dimensions.");
   }

   public RankException(String message) {
      super(message);
   }

   public RankException(String message, Throwable cause) {
      super(message, cause);
   }

   public RankException(Throwable cause) {
      super(cause);
   }
}
