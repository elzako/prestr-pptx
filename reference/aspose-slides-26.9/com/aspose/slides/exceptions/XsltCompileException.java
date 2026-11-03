package com.aspose.slides.exceptions;

import com.aspose.slides.internal.x7n.l6;
import com.aspose.slides.ms.System.a3;
import com.aspose.slides.ms.System.j3;

@j3
public class XsltCompileException extends XsltException {
   public XsltCompileException() {
   }

   public XsltCompileException(String message) {
      super(message);
   }

   public XsltCompileException(String message, RuntimeException innerException) {
      super(message, innerException);
   }

   public XsltCompileException(RuntimeException inner, String sourceUri, int lineNumber, int linePosition) {
      super(
         lineNumber != 0 ? "XSLT compile error at {0}({1},{2}). See InnerException for details." : "XSLT compile error.",
         new String[]{sourceUri, a3.n5(lineNumber, com.aspose.slides.internal.x7n.l6.k5()), a3.n5(linePosition, com.aspose.slides.internal.x7n.l6.k5())},
         sourceUri,
         lineNumber,
         linePosition,
         inner
      );
   }
}
