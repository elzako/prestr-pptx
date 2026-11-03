package com.aspose.slides.exceptions;

public class CustomAttributeFormatException extends FormatException {
   public CustomAttributeFormatException() {
      super("Binary format of the specified custom attribute was invalid.");
   }

   public CustomAttributeFormatException(String message) {
      super(message);
   }

   public CustomAttributeFormatException(String message, Throwable cause) {
      super(message, cause);
   }
}
