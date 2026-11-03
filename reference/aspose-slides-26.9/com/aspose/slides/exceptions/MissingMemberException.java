package com.aspose.slides.exceptions;

import com.aspose.slides.internal.x7n.l6;
import com.aspose.slides.ms.System.d1;

public class MissingMemberException extends MemberAccessException {
   protected String className;
   protected String memberName;
   protected byte[] signature;

   public MissingMemberException() {
      super("Attempted to access a missing member.");
   }

   public MissingMemberException(String message) {
      super(message);
   }

   public MissingMemberException(String message, Throwable inner) {
      super(message, inner);
   }

   public MissingMemberException(String className, String memberName) {
      this.className = className;
      this.memberName = memberName;
   }

   @Override
   public String getMessage() {
      return this.className == null
         ? super.getMessage()
         : d1.n5(
            l6.u3(),
            "Member '{0}' not found.",
            this.className != null && this.memberName != null ? new Object[]{this.className + "." + this.memberName} : new Object[0]
         );
   }
}
