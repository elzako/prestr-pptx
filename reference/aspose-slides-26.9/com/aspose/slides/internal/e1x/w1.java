package com.aspose.slides.internal.e1x;

public class w1 {
   public j5[] n5;
   public short[] l6;

   public w1(com.aspose.slides.internal.n2d.k5 var1, int var2, int var3) {
      this.n5 = (j5[])com.aspose.slides.ms.System.u3.n5(com.aspose.slides.ms.System.u3.n5(com.aspose.slides.internal.v6g.k5.n5(j5.class), var2));

      for (int var4 = 0; var4 < this.n5.length; var4++) {
         this.n5[var4] = new j5(var1);
      }

      int var6 = var3 - var2;
      this.l6 = new short[var6];

      for (int var5 = 0; var5 < this.l6.length; var5++) {
         this.l6[var5] = var1.u3();
      }
   }

   public final j5 n5(int var1) {
      if (var1 < this.n5.length) {
         return this.n5[var1];
      }

      j5 var2 = this.n5[this.n5.length - 1].n5();
      short var3 = 0;
      if (var1 - this.n5.length < this.l6.length) {
         var3 = this.l6[var1 - this.n5.length];
      }

      return new j5(var2.n5, var3);
   }

   static {
      com.aspose.slides.internal.v6g.k5.n5(j5.class, new w1$1());
   }
}
