package com.aspose.slides.internal.a3p;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;

public final class a6 extends k5 {
   private float[] n5;

   public a6(int var1) {
      super(var1 & 65535);
   }

   @Override
   public long n3() {
      return 4L;
   }

   @Override
   public com.aspose.slides.ms.System.u3 x8() {
      return com.aspose.slides.ms.System.u3.n5((Object)(this.n5));
   }

   @Override
   public int u3() {
      return 11;
   }

   @Override
   public Object h0() {
      return this.n5;
   }

   @Override
   public void n5(Object var1) {
      if (var1 != null && !com.aspose.slides.internal.v6g.k5.l6(var1, float[].class)) {
         throw new ArgumentException("Only float array is supported.");
      }

      this.n5 = com.aspose.slides.internal.v6g.k5.n5(var1, float[].class);
   }

   @Override
   public long n5(com.aspose.slides.internal.v6s.a6 var1) {
      if (var1 == null) {
         throw new ArgumentNullException("dataStream");
      }

      long var2 = 0L;
      long var4 = com.aspose.slides.ms.System.u3.n5((Object)(this.n5)).u9();
      if (this.n5 != null && var4 > 1L) {
         var1.n5(this.n5);
         var2 = var4 * 4L;
      }

      return var2;
   }

   @Override
   protected void n5(com.aspose.slides.internal.v6s.u3 var1, long var2, long var4) {
      if (var4 == 1L) {
         this.n5 = var1.k5(var2, 1L);
      } else {
         long var6 = var1.n5(var2) & 4294967295L;
         if (var6 + var4 * 4L <= var1.n5()) {
            this.n5 = var1.k5(var6, var4);
         }
      }
   }

   @Override
   protected com.aspose.slides.internal.u2w.a6 s7() {
      return new a6(this.k5());
   }

   @Override
   protected void n5(com.aspose.slides.internal.u2w.a6 var1) {
      ((a6)var1).n5 = com.aspose.slides.internal.r1x.k5.n5(this.n5);
      super.n5(var1);
   }

   @Override
   protected void l6(com.aspose.slides.internal.v6s.a6 var1) {
      var1.n5(this.n5);
      var1.n5(new byte[4 - this.n5.length * 4]);
   }
}
