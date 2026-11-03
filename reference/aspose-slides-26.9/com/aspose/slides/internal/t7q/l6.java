package com.aspose.slides.internal.t7q;

import com.aspose.slides.internal.b8u.a6;
import com.aspose.slides.internal.b8u.q0;
import com.aspose.slides.internal.b8u.t9;
import com.aspose.slides.internal.b8u.x8;
import com.aspose.slides.internal.o9b.j5;
import com.aspose.slides.internal.o9b.y2;
import com.aspose.slides.internal.r1x.o5;
import com.aspose.slides.internal.r1x.z6;

public class l6 {
   private final int[] n5;
   private final a6 l6;
   private final byte[] k5;

   public l6(int[] var1, a6 var2) {
      this.n5 = var1;
      this.l6 = var2;
      this.k5 = null;
   }

   public l6(byte[] var1, a6 var2) {
      this.n5 = null;
      this.l6 = var2;
      this.k5 = var1;
   }

   public final q0 n5() {
      return new l6$n5(this);
   }

   public final void n5(y2 var1, x8 var2) {
      this.l6(var1, var2);
   }

   public final void n5(y2 var1, z6 var2, t9 var3) {
      var3.n5(var1, this.k5, new j5(0, 0), new j5(var1.u9(), var1.n5()));
   }

   private static void n5(int[] var0, a6 var1) {
      o5 var2 = new o5(var1);

      for (int var3 = 0; var3 < var0.length; var3++) {
         var0[var3] = var1.l6(var2.n5(var0[var3]));
      }
   }

   private void l6(y2 var1, x8 var2) {
      int[] var3 = this.n5;
      int var4 = var1.u9();
      int var5 = var1.n5();
      if (this.l6 != null) {
         n5(var3, this.l6);
      }

      var2.n5(var1.n3(), var3, var1.a6().k5(), new j5(var4, var5));
   }
}
