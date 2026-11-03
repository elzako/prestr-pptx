package com.aspose.slides.ms.System;

import com.aspose.slides.Collections.Hashtable;
import com.aspose.slides.exceptions.UriFormatException;

public class y5 {
   static final Object n5 = new Object();
   static Hashtable l6;
   String k5;
   private int u9;
   static com.aspose.slides.internal.r7c.c8 u3 = new com.aspose.slides.internal.r7c.c8("^(([^:/?#]+):)?(//([^/?#]*))?([^?#]*)(\\?([^#]*))?(#(.*))?", 0);
   static com.aspose.slides.internal.r7c.c8 a6 = new com.aspose.slides.internal.r7c.c8("^(([^@]+)@)?(.*?)(:([0-9]+))?$");

   protected y5() {
   }

   void n5(r8 var1, UriFormatException[] var2) {
      if (!d1.a6(var1.t9(), this.k5) && !"*".equals(this.k5)) {
         var2[0] = new UriFormatException("The argument Uri's scheme does not match");
      } else {
         var2[0] = null;
      }
   }

   protected void n5(String var1, int var2) {
   }

   void n5(String var1) {
      this.k5 = var1;
   }

   int n5() {
      return this.u9;
   }

   void n5(int var1) {
      this.u9 = var1;
   }

   private static void l6() {
      if (l6 == null) {
         Hashtable var0 = new Hashtable();
         n5(var0, new y1(), r8.l6, -1);
         n5(var0, new y1(), r8.k5, 21);
         n5(var0, new y1(), r8.u3, 70);
         n5(var0, new y1(), r8.a6, 80);
         n5(var0, new y1(), r8.u9, 443);
         n5(var0, new y1(), r8.h0, 25);
         n5(var0, new y1(), r8.s7, -1);
         n5(var0, new y1(), r8.x8, -1);
         n5(var0, new y1(), r8.c8, -1);
         n5(var0, new y1(), r8.t2, 119);
         n5(var0, new y1(), "ldap", 389);
         synchronized (n5) {
            if (l6 == null) {
               l6 = var0;
            } else {
               Object var4 = null;
            }
         }
      }
   }

   private static void n5(Hashtable var0, y5 var1, String var2, int var3) {
      var1.n5(var2);
      var1.n5(var3);
      if (var1 instanceof b3) {
         var0.addItem(var2, var1);
      } else {
         y1 var4 = new y1();
         var4.n5(var2);
         var4.n5(var3);
         var0.addItem(var2, var4);
      }

      var1.n5(var2, var3);
   }

   static y5 l6(String var0) {
      if (var0 == null) {
         return null;
      }

      l6();
      String var1 = d1.n5(var0, com.aspose.slides.internal.x7n.l6.k5());
      return (y5)l6.get_Item(var1);
   }
}
