package com.aspose.slides.internal.v9e;

import com.aspose.slides.exceptions.XsltException;

public abstract class t9 extends n5 {
   public boolean k5(z1 var1) {
      return false;
   }

   public final void u3(z1 var1) {
      z7 var2 = var1.u3();
      String var3 = var2.e2();
      if (var2.m1()) {
         do {
            if (var2.t9().length() == 0) {
               try {
                  if (!this.k5(var1)) {
                     throw XsltException.create("'{0}' is an invalid attribute for the '{1}' element.", var2.e2(), var3);
                  }
               } catch (RuntimeException var5) {
                  if (!var1.n3()) {
                     throw var5;
                  }
               }
            }
         } while (var2.k7());

         var2.c8();
      }
   }

   public static String n5(h0[] var0) {
      String var1 = null;
      if (var0[0] != null && var0[0].n5()) {
         var1 = var0[0].n5((p3)null, (l6)null);
         var0[0] = null;
      }

      return var1;
   }

   public final void a6(z1 var1) {
      String var2 = var1.u3().y4();
      if (var1.u9()) {
         do {
            int var3 = var1.u3().n3();
            if (var3 != 6 && var3 != 8 && var3 != 7) {
               throw XsltException.create("The contents of '{0}' must be empty.", var2);
            }
         } while (var1.a6());

         var1.h0();
      }
   }

   public final void n5(z1 var1, Object var2, String var3) {
      this.n5(var1, var2 != null, var3);
   }

   public final void n5(z1 var1, boolean var2, String var3) {
      if (!var2) {
         throw XsltException.create("Missing mandatory attribute '{0}'.", var3);
      }
   }
}
