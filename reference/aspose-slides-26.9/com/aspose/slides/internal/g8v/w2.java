package com.aspose.slides.internal.g8v;

import com.aspose.slides.exceptions.ArgumentOutOfRangeException;

public class w2 {
   private byte[] n5;

   public w2(int var1, int var2) {
      if (var2 < 2) {
         throw new ArgumentOutOfRangeException("size is too small");
      }

      this.n5 = new byte[var2];
      this.n5[0] = (byte)var1;
      this.n5[1] = com.aspose.slides.internal.v6g.k5.n5((Object)(var1 >> 8), (int)(9));
   }

   public int n5() {
      return com.aspose.slides.internal.v6g.k5.u3(this.n5[0], 6) + (com.aspose.slides.internal.v6g.k5.u3(this.n5[1], 6) << 8);
   }

   public int l6() {
      return com.aspose.slides.ms.System.u3.n5((Object)(this.n5)).a6();
   }

   public byte n5(int var1) {
      return this.n5[var1];
   }

   public void n5(int var1, byte var2) {
      this.n5[var1] = var2;
   }

   @Override
   public String toString() {
      String var1 = com.aspose.slides.ms.System.s3.n5(com.aspose.slides.internal.p6w.n5.class, com.aspose.slides.internal.v6g.k5.u3(this.n5[0], 6));
      int var2 = com.aspose.slides.ms.System.u3.n5((Object)(this.n5)).a6();
      String var3 = com.aspose.slides.ms.System.d1.n5(new String[]{var1, ":", com.aspose.slides.ms.System.a3.l6(var2), ":{"});

      for (int var4 = 2; var4 < var2; var4++) {
         int var5 = com.aspose.slides.internal.v6g.k5.u3(this.n5[var4], 6);
         var3 = com.aspose.slides.ms.System.d1.n5(new String[]{var3, com.aspose.slides.ms.System.a3.l6(var5)});
         if (var4 < var2 - 1) {
            var3 = com.aspose.slides.ms.System.d1.n5(new String[]{var3, ","});
         }
      }

      return com.aspose.slides.ms.System.d1.n5(new String[]{var3, "}"});
   }

   @Override
   public boolean equals(Object comparand) {
      w2 var2 = com.aspose.slides.internal.v6g.k5.n5(comparand, w2.class);
      if (var2 != null && com.aspose.slides.ms.System.u3.n5((Object)(var2.n5)).a6() == com.aspose.slides.ms.System.u3.n5((Object)(this.n5)).a6()) {
         byte[] var3 = var2.n5;

         for (int var4 = 0; var4 < com.aspose.slides.ms.System.u3.n5((Object)(this.n5)).a6(); var4++) {
            if (com.aspose.slides.internal.v6g.k5.u3(var3[var4], 6) != com.aspose.slides.internal.v6g.k5.u3(this.n5[var4], 6)) {
               return false;
            }
         }

         return true;
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      int var1 = 0;

      for (int var2 = 0; var2 < com.aspose.slides.ms.System.u3.n5((Object)(this.n5)).a6(); var2++) {
         var1 += com.aspose.slides.internal.v6g.k5.u3(this.n5[var2], 6) + var2;
      }

      return var1;
   }
}
