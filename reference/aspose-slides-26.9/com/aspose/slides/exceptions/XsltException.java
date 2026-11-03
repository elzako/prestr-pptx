package com.aspose.slides.exceptions;

import com.aspose.slides.internal.d0p.n5;
import com.aspose.slides.internal.x7n.l6;
import com.aspose.slides.ms.System.a3;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.j3;

@j3
public class XsltException extends SystemException {
   private String n5;
   private String l6;
   private int k5;
   private int u3;
   private String a6;

   public XsltException() {
      this(d1.n5, (Exception)null);
   }

   public XsltException(String message) {
      this(message, (Exception)null);
   }

   public XsltException(String message, RuntimeException innerException) {
      this("{0}", new String[]{message}, null, 0, 0, innerException);
   }

   public static XsltException create(String res, String... args) {
      return new XsltException(res, args, null, 0, 0, null);
   }

   public static XsltException create(String res, String[] args, Exception inner) {
      return new XsltException(res, args, null, 0, 0, inner);
   }

   public XsltException(String res, String[] args, String sourceUri, int lineNumber, int linePosition, RuntimeException inner) {
      super(n5(res, args, sourceUri, lineNumber, linePosition), inner);
      this.setHResult(-2146231998);
      this.n5 = res;
      this.l6 = sourceUri;
      this.k5 = lineNumber;
      this.u3 = linePosition;
   }

   public String getSourceUri() {
      return this.l6;
   }

   public int getLineNumber() {
      return this.k5;
   }

   public int getLinePosition() {
      return this.u3;
   }

   @Override
   public String getMessage() {
      return this.a6 == null ? super.getMessage() : this.a6;
   }

   private static String n5(String var0, String[] var1, String var2, int var3, int var4) {
      try {
         String var5 = n5(var0, var1);
         if (!"XSLT compile error at {0}({1},{2}). See InnerException for details.".equals(var0) && var3 != 0) {
            var5 = d1.n5(
               var5,
               d1.n5(new String[]{
                  " ",
                  n5(
                     "An error occurred at {0}({1},{2}).",
                     var2,
                     a3.n5(var3, com.aspose.slides.internal.x7n.l6.k5()),
                     a3.n5(var4, com.aspose.slides.internal.x7n.l6.k5())
                  )
               })
            );
         }

         return var5;
      } catch (MissingManifestResourceException var6) {
         return d1.n5(new String[]{"UNKNOWN(", var0, ")"});
      }
   }

   private static String n5(String var0, String... var1) {
      String var2 = com.aspose.slides.internal.d0p.n5.n5(var0);
      if (var2 != null && var1 != null) {
         var2 = d1.n5(com.aspose.slides.internal.x7n.l6.k5(), var2, var1);
      }

      return var2;
   }
}
