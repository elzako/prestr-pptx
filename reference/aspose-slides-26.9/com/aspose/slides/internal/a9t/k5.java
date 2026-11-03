package com.aspose.slides.internal.a9t;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.ms.System.x8;
import com.aspose.slides.ms.System.y4;

public abstract class k5 {
   private static byte[] n5 = new byte[]{78, 84, 76, 77, 83, 83, 80, 0};
   private int l6;
   private int k5;

   protected k5(int var1) {
      this.l6 = var1;
   }

   public int n5() {
      return this.k5;
   }

   public void n5(int var1) {
      this.k5 = var1;
   }

   public int l6() {
      return this.l6;
   }

   protected byte[] l6(int var1) {
      byte[] var2 = new byte[var1];
      y4.n5(n5, 0, var2, 0, 8);
      var2[8] = com.aspose.slides.internal.v6g.k5.n5((Object)(this.l6), 9);
      var2[9] = com.aspose.slides.internal.v6g.k5.n5((Object)(this.l6 >> 8), 9);
      var2[10] = com.aspose.slides.internal.v6g.k5.n5((Object)(this.l6 >> 16), 9);
      var2[11] = com.aspose.slides.internal.v6g.k5.n5((Object)(this.l6 >> 24), 9);
      return var2;
   }

   protected void n5(byte[] var1) {
      if (var1 == null) {
         throw new ArgumentNullException("message");
      }

      if (var1.length < 12) {
         String var3 = "Minimum message length is 12 bytes.";
         throw new ArgumentOutOfRangeException("message", com.aspose.slides.internal.v6g.k5.l6(var1.length), var3);
      }

      if (!this.l6(var1)) {
         String var2 = String.format("Invalid Type{0} message.", this.l6);
         throw new ArgumentException(var2, "message");
      }
   }

   protected boolean l6(byte[] var1) {
      for (int var2 = 0; var2 < n5.length; var2++) {
         if (com.aspose.slides.internal.v6g.k5.u3(var1[var2], 6) != com.aspose.slides.internal.v6g.k5.u3(n5[var2], 6)) {
            return false;
         }
      }

      return com.aspose.slides.internal.v6g.k5.a6(x8.l6(var1, 8), 10) == this.l6;
   }

   public abstract byte[] k5();
}
