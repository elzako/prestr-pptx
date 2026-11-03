package com.aspose.slides.internal.d4n;

import com.aspose.slides.exceptions.ExternalException;
import com.aspose.slides.internal.t9p.l6;
import com.aspose.slides.ms.System.y2;
import java.util.Formatter;
import java.util.List;

public class n5 extends ExternalException {
   private final int n5;
   private Object[] l6;
   private static List<n5$n5> k5 = null;

   public n5(int var1) {
      this.n5 = var1;
   }

   public n5(int var1, String var2) {
      super(var2);
      this.n5 = var1;
   }

   @Override
   public String getMessage() {
      String var1 = com.aspose.slides.internal.t5n.n5.n5(this.n5);
      return this.l6(var1);
   }

   public int n5() {
      return this.n5;
   }

   public Object[] l6() {
      if (this.l6 == null) {
         this.l6 = new Object[0];
      }

      return this.l6;
   }

   String n5(String var1) {
      String var2 = var1;

      for (n5$n5 var4 : k5) {
         String var5 = var4.n5();
         String var6 = var4.l6();
         var2 = var2.replaceAll(var5, var6);
      }

      return var2;
   }

   String l6(String var1) {
      String var2 = this.n5(var1);
      StringBuilder var3 = new StringBuilder();
      Formatter var4 = new Formatter(var3);
      var4.format(y2.n5(), var2, this.l6());
      var4.close();
      com.aspose.slides.internal.t9p.l6.n5.println("result string = " + var3.toString());
      return var3.toString();
   }

   static {
      k5 = n5$n5.n5(
         "(\\%\\d+)(!s!|!hs!)",
         "$1\\$s",
         "(\\%\\d+)(!lx!)",
         "$1\\$x",
         "(\\%\\d+)(!d!|!ld!)",
         "$1\\$d",
         "(\\%\\d+)(]|\\))",
         "$1\\$s$2",
         "(\\%\\d+)(\\s|,|\\.)",
         "$1\\$s$2",
         "(\\%)(wZ)",
         "$1s",
         "(0x)(\\%\\d+)(!)(\\d+)(lx!|x!)",
         "$1$2\\$$4X",
         "(\\%\\d+)[^d^s^x^]^\\)\\w]",
         "$1\\$s"
      );
   }
}
