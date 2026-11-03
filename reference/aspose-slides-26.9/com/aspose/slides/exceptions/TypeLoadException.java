package com.aspose.slides.exceptions;

import com.aspose.slides.ms.System.d1;

public class TypeLoadException extends SystemException {
   private String n5;
   private String l6;

   public TypeLoadException() {
      super("A type load exception has occurred.");
   }

   public TypeLoadException(String message) {
      super(message);
   }

   public TypeLoadException(String message, Exception inner) {
      super(message, inner);
   }

   @Override
   public String getMessage() {
      if (this.n5 != null) {
         return this.l6 != null && !d1.a6(this.l6, d1.n5)
            ? d1.n5("Could not load type '{0}' from assembly '{1}'.",new Object[]{ this.n5, this.l6})
            : d1.n5("Could not load type '{0}'.", new Object[]{this.n5});
      } else {
         return super.getMessage();
      }
   }

   public String getTypeName() {
      return this.n5 == null ? d1.n5 : this.n5;
   }
}
