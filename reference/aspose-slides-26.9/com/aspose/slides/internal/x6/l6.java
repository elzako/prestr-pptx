package com.aspose.slides.internal.x6;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.IOException;
import com.aspose.slides.internal.m9.c8;
import com.aspose.slides.internal.z0k.j5;
import com.aspose.slides.internal.z0k.m3;

public class l6 {
   private boolean n5 = false;
   private List<Integer> l6;

   private l6() {
   }

   public static l6 n5() {
      return new l6();
   }

   public final void n5(boolean var1) {
      this.n5 = var1;
   }

   public final n5[] n5(m3 var1) {
      if (u3(var1)) {
         return this.l6(var1);
      }

      if (this.n5) {
         throw new IOException("Unable to get requested message digest algorithm.");
      }

      n5$n5 var2 = n5$n5.n5(this, var1);
      return new n5[]{var2.n5()};
   }

   private n5[] l6(m3 var1) {
      n5$n5[] var2 = this.k5(var1);
      n5[] var3 = new n5[var2.length];

      for (int var4 = 0; var4 < var3.length; var4++) {
         var3[var4] = var2[var4].n5();
      }

      return var3;
   }

   private n5$n5[] k5(m3 var1) {
      c8 var2 = c8.n3((int)var1.n5().getLength());
      var2.n5(var1);
      return this.n5(var2);
   }

   private static boolean u3(m3 var0) {
      byte[] var1 = new byte[4];
      var0.n5().read(var1, 0, var1.length);
      var0.n5().setPosition(var0.n5().getPosition() - 4L);
      return k5.n5 == k5.n5(var1);
   }

   private n5$n5 n5(c8 var1, int var2) {
      if (this.n5) {
      }

      return n5$n5.n5(this, var1, var2);
   }

   private n5$n5[] n5(c8 var1) {
      var1.c8(0);
      var1.s7(4);
      int var2 = var1.c8(8);
      n5$n5[] var3 = new n5$n5[var2];
      byte var4 = 12;

      for (int var5 = 0; var5 < var2; var4 += 4) {
         int var6 = var1.c8(var4);
         var3[var5] = this.n5(var1, var6);
         var5++;
      }

      return var3;
   }

   public final void n5(n5 var1, j5 var2) {
      var1.n5(var2, this.l6);
   }
}
