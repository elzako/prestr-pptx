package com.aspose.slides.internal.i2i;

import com.aspose.slides.internal.z0k.z1;

public final class h0 {
   private static String n5;
   private static String l6;
   private static t9 k5;
   private static t9 u3;

   static String n5() {
      if (n5 == null) {
         n5 = z1.l6(z1.n5(), ".java.user");
         n5 = z1.l6(n5, "certs");
      }

      return n5;
   }

   static String l6() {
      if (l6 == null) {
         l6 = z1.l6(z1.n5(), ".java.machine");
         l6 = z1.l6(l6, "certs");
      }

      return l6;
   }

   public static t9 k5() {
      if (k5 == null) {
         k5 = new t9(n5());
      }

      return k5;
   }

   public static t9 u3() {
      if (u3 == null) {
         u3 = new t9(l6());
      }

      return u3;
   }

   public static k5 a6() {
      k5 var0 = new k5();
      var0.n5(k5().n5().n5());
      var0.n5(u3().n5().n5());
      return var0;
   }
}
