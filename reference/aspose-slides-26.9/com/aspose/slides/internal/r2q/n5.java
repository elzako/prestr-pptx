package com.aspose.slides.internal.r2q;

import com.aspose.slides.internal.r1x.s3;
import com.aspose.slides.ms.System.a3;
import com.aspose.slides.ms.System.d1;

public class n5 {
   private final s3 n5 = new s3();
   private byte l6;
   private byte k5;
   private int u3;

   private n5(byte var1, byte var2, int var3, s3 var4) {
      this.l6 = var1;
      this.k5 = var2;
      this.u3 = var3;
      var4.n5(this.n5);
   }

   public static n5 n5() {
      s3 var0 = new s3();
      var0.n5 = true;
      var0.l6 = null;
      return new n5((byte)12, (byte)0, 0, var0.n5());
   }

   public final byte l6() {
      return this.l6;
   }

   public final byte k5() {
      return this.k5;
   }

   public final int u3() {
      return this.u3;
   }

   public static n5 n5(int[] var0, int var1) {
      int var2 = var1 * 3;
      byte var3 = (byte)var0[var2];
      byte var4 = (byte)var0[var2 + 1];
      int var5 = var0[var2 + 2];
      s3 var6 = new s3();
      var6.n5 = true;
      return new n5(var3, var4, var5, var6.n5());
   }

   @Override
   public String toString() {
      return d1.n5(new String[]{com.aspose.slides.ms.System.s3.n5(com.aspose.slides.internal.w2a.n5.class, this.l6), a3.l6(this.u3)});
   }
}
