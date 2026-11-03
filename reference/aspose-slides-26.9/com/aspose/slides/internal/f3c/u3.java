package com.aspose.slides.internal.f3c;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.l7h.a5;
import com.aspose.slides.internal.o8m.u6;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.p8;

public final class u3 extends com.aspose.slides.internal.o8m.u3 {
   private String k5;

   public u3(byte[] var1) {
      if (var1 == null) {
         throw new ArgumentNullException("encodedDistinguishedName");
      }

      this.n5(new u6());
      this.n5(var1);
      if (var1.length > 0) {
         this.u3();
      } else {
         this.k5 = d1.n5;
      }
   }

   public String k5() {
      return this.k5;
   }

   public String n5(int var1) {
      if (var1 != 0 && (var1 & 29169) == 0) {
         throw new ArgumentException("flag");
      }

      if (this.l6().length == 0) {
         return d1.n5;
      }

      boolean var2 = (var1 & 1) != 0;
      boolean var3 = (var1 & 64) == 0;
      String var4 = l6(var1);
      com.aspose.slides.internal.x8w.l6 var5 = new com.aspose.slides.internal.x8w.l6(this.l6());
      return com.aspose.slides.internal.i2i.n3.n5(var5, var2, var4, var3);
   }

   @Override
   public String n5(boolean var1) {
      if (var1) {
         String var2 = this.n5(256);
         return var2.length() > 0 ? d1.n5(new String[]{var2, p8.k5()}) : var2;
      } else {
         return this.n5(128);
      }
   }

   private static String l6(int var0) {
      if ((var0 & 16) != 0) {
         return "; ";
      } else if ((var0 & 128) != 0) {
         return ", ";
      } else {
         return (var0 & 256) != 0 ? p8.k5() : ", ";
      }
   }

   private void u3() {
      if (this.l6() != null && this.l6().length >= 3) {
         com.aspose.slides.internal.x8w.l6 var1 = new com.aspose.slides.internal.x8w.l6(this.l6());
         this.k5 = com.aspose.slides.internal.i2i.n3.n5(var1, true, ", ", true);
      } else {
         this.k5 = d1.n5;
      }
   }

   private static String n5(String var0) {
      int var1 = d1.u3(var0, '=') + 1;
      a5 var2 = new a5(d1.l6(var0, 0, var1));

      while (var1 < var0.length() && com.aspose.slides.ms.System.t9.h0(var0, var1)) {
         var1++;
      }

      var0 = d1.a6(var0, new char[]{});
      boolean var3 = false;

      while (var1 < var0.length()) {
         label41: {
            if (var3) {
               var3 = com.aspose.slides.ms.System.t9.h0(var0, var1);
               if (var3) {
                  break label41;
               }
            }

            if (com.aspose.slides.ms.System.t9.h0(var0, var1)) {
               var3 = true;
            }

            var2.n5(com.aspose.slides.ms.System.t9.m1(var0.charAt(var1)));
         }

         var1++;
      }

      return var2.toString();
   }

   public static boolean n5(u3 var0, u3 var1) {
      if (var0 == null) {
         return var1 == null;
      }

      if (var1 == null) {
         return false;
      }

      short var2 = 320;
      String[] var3 = new String[]{p8.k5()};
      String[] var4 = d1.n5(var0.n5(var2), var3, 1);
      String[] var5 = d1.n5(var1.n5(var2), var3, 1);
      if (var4.length != var5.length) {
         return false;
      }

      for (int var6 = 0; var6 < var4.length; var6++) {
         if (!d1.a6(n5(var4[var6]), n5(var5[var6]))) {
            return false;
         }
      }

      return true;
   }
}
