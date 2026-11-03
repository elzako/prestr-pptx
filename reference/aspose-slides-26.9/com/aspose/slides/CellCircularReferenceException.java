package com.aspose.slides;

public class CellCircularReferenceException extends PptxEditException {
   private String n5;

   public final String getReference() {
      return this.n5;
   }

   public CellCircularReferenceException() {
   }

   public CellCircularReferenceException(String message) {
      super(message);
   }

   public CellCircularReferenceException(String message, RuntimeException innerException) {
      super(message, innerException);
   }

   public CellCircularReferenceException(String message, String reference) {
      this(message);
      this.n5 = reference;
   }
}
