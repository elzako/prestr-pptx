package com.aspose.slides.exceptions;

import com.aspose.slides.internal.x7n.l6;
import com.aspose.slides.ms.System.d1;

public class MissingFieldException extends MissingMemberException {
   public MissingFieldException() {
      super("Attempted to access a non-existing field.");
   }

   public MissingFieldException(String message) {
      super(message);
   }

   public MissingFieldException(String message, Throwable inner) {
      super(message, inner);
   }

   public MissingFieldException(String className, String fieldName) {
      this.className = className;
      this.memberName = fieldName;
   }

   @Override
   public String getMessage() {
      return this.className == null
         ? super.getMessage()
         : d1.n5(
            l6.u3(),
            "Field '{0}' not found.",
            this.className != null && this.memberName != null ? new Object[]{this.className + "." + this.memberName} : new Object[0]
         );
   }
}
