package com.aspose.slides;

public class CellInvalidReferenceException extends PptxEditException {
   private String n5;

   public final String getReference() {
      return this.n5;
   }

   public CellInvalidReferenceException() {
   }

   public CellInvalidReferenceException(String message) {
      super(message);
   }

   public CellInvalidReferenceException(String message, RuntimeException innerException) {
      super(message, innerException);
   }

   public CellInvalidReferenceException(String message, String reference) {
      this(message);
      this.n5 = reference;
   }
}
