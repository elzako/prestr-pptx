package com.aspose.slides.internal.a3p;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;

public final class n3 extends k5 {
   private short[] n5;

   public n3(int var1) {
      super(var1 & 65535);
   }

   @Override
   public com.aspose.slides.ms.System.u3 x8() {
      return com.aspose.slides.ms.System.u3.n5((Object)(this.n5));
   }

   @Override
   public long n3() {
      return 2L;
   }

   @Override
   public int u3() {
      return 8;
   }

   @Override
   public Object h0() {
      return this.n5;
   }

   @Override
   public void n5(Object var1) {
      if (var1 != null && !com.aspose.slides.internal.v6g.k5.l6(var1, short[].class)) {
         throw new ArgumentException("Only signed short array is supported.");
      }

      this.n5 = com.aspose.slides.internal.v6g.k5.n5(var1, short[].class);
   }

   @Override
   public long n5(com.aspose.slides.internal.v6s.a6 var1) {
      if (var1 == null) {
         throw new ArgumentNullException("dataStream");
      }

      long var2 = 0L;
      long var4 = com.aspose.slides.ms.System.u3.n5((Object)(this.n5)).u9();
      if (this.n5 != null && var4 > 2L) {
         var1.n5(this.n5);
         var2 = var4 * 2L;
      }

      return var2;
   }

   @Override
   protected void n5(com.aspose.slides.internal.v6s.u3 var1, long var2, long var4) {
      if (var4 <= 2L) {
         this.n5 = var1.c8(var2, var4);
      } else {
         long var6 = var1.n5(var2) & 4294967295L;
         if (var6 + var4 * 2L <= var1.n5()) {
            this.n5 = var1.c8(var6, var4);
         }
      }
   }

   @Override
   protected com.aspose.slides.internal.u2w.a6 s7() {
      return new n3(this.k5());
   }

   @Override
   protected void n5(com.aspose.slides.internal.u2w.a6 var1) {
      ((n3)var1).n5 = com.aspose.slides.internal.r1x.k5.n5(this.n5);
      super.n5(var1);
   }

   @Override
   protected void l6(com.aspose.slides.internal.v6s.a6 var1) {
      var1.n5(this.n5);
      long var2 = 2L * com.aspose.slides.ms.System.u3.n5((Object)(this.n5)).u9();
      var1.n5(new byte[(int)(4L - var2)]);
   }
}
