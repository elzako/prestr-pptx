package com.aspose.slides.internal.u2w;

import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.internal.a3p.t9;

class s7$n5 extends a6 {
   private final a6[] n5;
   private final long l6;
   private long k5;

   public s7$n5(a6[] var1, int var2) {
      super(var2);
      this.n5 = var1;
      long var3 = 0L;

      for (a6 var8 : this.n5) {
         if (var8 != null && var8.c8() && !com.aspose.slides.internal.v6g.k5.l6(var8, t9.class)) {
            var3 = (var3 & 4294967295L) + (var8.a6() & 4294967295L) & 4294967295L;
            this.k5++;
         }
      }

      var3 = (var3 & 4294967295L) + (12L * (this.k5 & 4294967295L) & 4294967295L) & 4294967295L;
      if ((var3 & 4294967295L) > 0L) {
         var3 = (var3 & 4294967295L) + 4L & 4294967295L;
      }

      this.l6 = var3;
   }

   @Override
   public long n5() {
      return 1L;
   }

   @Override
   public int u3() {
      return 4;
   }

   @Override
   public long u9() {
      return this.l6;
   }

   @Override
   public Object h0() {
      throw new NotImplementedException();
   }

   @Override
   public void n5(Object var1) {
      throw new NotImplementedException();
   }

   @Override
   public long n5(com.aspose.slides.internal.v6s.a6 var1) {
      var1.l6((int)(this.k5 & 65535L));
      long var2 = var1.l6() + (12L * (this.k5 & 4294967295L) & 4294967295L) + 2L;
      s7.n5(var1, this.n5, var2);
      var1.n5((short)0);
      s7.n5(var1, this.n5);
      long var4 = this.a6() & 4294967295L;
      long var6 = var4 - (this.l6 & 4294967295L);
      if (var6 > 0L) {
         var1.n5(new byte[(int)var6]);
      }

      return var4;
   }

   @Override
   protected void n5(com.aspose.slides.internal.v6s.u3 var1, long var2, long var4) {
      throw new NotImplementedException();
   }

   @Override
   protected void l6(com.aspose.slides.internal.v6s.a6 var1, long var2) {
      var1.l6(var2 & 4294967295L);
   }

   @Override
   protected a6 s7() {
      throw new NotImplementedException();
   }
}
