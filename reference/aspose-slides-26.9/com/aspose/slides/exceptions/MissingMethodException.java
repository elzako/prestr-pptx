package com.aspose.slides.exceptions;

import com.aspose.slides.internal.x7n.l6;
import com.aspose.slides.ms.System.d1;

public class MissingMethodException extends MissingMemberException {
   public MissingMethodException() {
      super("Attempted to access a missing method.");
   }

   public MissingMethodException(String message) {
      super(message);
   }

   public MissingMethodException(String message, Throwable inner) {
      super(message, inner);
   }

   public MissingMethodException(String className, String methodName) {
      this.className = className;
      this.memberName = methodName;
   }

   @Override
   public String getMessage() {
      return this.className == null
         ? super.getMessage()
         : d1.n5(
            l6.u3(),
            "Method '{0}' not found.",
            this.className != null && this.memberName != null ? new Object[]{this.className + "." + this.memberName} : new Object[0]
         );
   }
}
