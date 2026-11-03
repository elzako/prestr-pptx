package com.aspose.slides;

public class CellInvalidFormulaException extends PptxEditException {
   private String n5;

   public final String getReference() {
      return this.n5;
   }

   public CellInvalidFormulaException() {
   }

   public CellInvalidFormulaException(String message) {
      super(message);
   }

   public CellInvalidFormulaException(String message, RuntimeException innerException) {
      super(message, innerException);
   }

   public CellInvalidFormulaException(String message, String reference) {
      this(message);
      this.n5 = reference;
   }
}
