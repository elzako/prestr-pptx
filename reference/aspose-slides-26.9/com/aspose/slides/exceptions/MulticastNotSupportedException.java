package com.aspose.slides.exceptions;

public final class MulticastNotSupportedException extends SystemException {
   public MulticastNotSupportedException() {
      super("This operation cannot be performed with the specified delagates.");
   }

   public MulticastNotSupportedException(String message) {
      super(message);
   }

   public MulticastNotSupportedException(String message, Exception inner) {
      super(message, inner);
   }
}
