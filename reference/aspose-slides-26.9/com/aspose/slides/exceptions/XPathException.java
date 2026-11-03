package com.aspose.slides.exceptions;

import com.aspose.slides.internal.v6g.k5;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.j3;
import com.aspose.slides.ms.System.Xml.v3;

@j3
public class XPathException extends SystemException {
   private String n5;
   private String[] l6;
   private String k5;

   public XPathException() {
      this(d1.n5, (Exception)null);
   }

   public XPathException(String message) {
      this(message, (Exception)null);
   }

   public XPathException(String message, RuntimeException innerException) {
      this("{0}", new String[]{message}, innerException);
   }

   public static XPathException create(String res) {
      return new XPathException(res, com.aspose.slides.internal.v6g.k5.k5(null, String[].class));
   }

   public static XPathException create(String res, String arg) {
      return new XPathException(res, new String[]{arg});
   }

   public static XPathException create(String res, String arg, String arg2) {
      return new XPathException(res, new String[]{arg, arg2});
   }

   public static XPathException create(String res, String arg, RuntimeException innerException) {
      return new XPathException(res, new String[]{arg}, innerException);
   }

   private XPathException(String res, String[] args) {
      this(res, args, null);
   }

   private XPathException(String res, String[] args, RuntimeException inner) {
      super(n5(res, args), inner);
      this.setHResult(-2146231997);
      this.n5 = res;
      this.l6 = args;
   }

   private static String n5(String var0, String[] var1) {
      try {
         String var2 = v3.n5(var0, var1);
         if (var2 == null) {
            var2 = d1.n5(new String[]{"UNKNOWN(", var0, ")"});
         }

         return var2;
      } catch (MissingManifestResourceException var3) {
         return d1.n5(new String[]{"UNKNOWN(", var0, ")"});
      }
   }

   @Override
   public String getMessage() {
      return this.k5 == null ? super.getMessage() : this.k5;
   }
}
