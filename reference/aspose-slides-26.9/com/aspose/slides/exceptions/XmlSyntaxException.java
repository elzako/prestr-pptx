package com.aspose.slides.exceptions;

import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.j3;

@j3
public final class XmlSyntaxException extends SystemException {
   public XmlSyntaxException() {
   }

   public XmlSyntaxException(int lineNumber) {
      super(d1.n5("Invalid syntax on line {0}.", new Object[]{lineNumber}));
   }

   public XmlSyntaxException(int lineNumber, String message) {
      super(d1.n5("Invalid syntax on line {0} - {1}.",new Object[]{ lineNumber, message}));
   }

   public XmlSyntaxException(String message) {
      super(message);
   }

   public XmlSyntaxException(String message, Exception inner) {
      super(message, inner);
   }
}
