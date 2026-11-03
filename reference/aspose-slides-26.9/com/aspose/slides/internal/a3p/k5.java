package com.aspose.slides.internal.a3p;

public abstract class k5 extends com.aspose.slides.internal.u2w.a6 {
   public abstract long n3();

   public abstract com.aspose.slides.ms.System.u3 x8();

   @Override
   public final long n5() {
      long var1 = 0L;
      if (this.x8() != null) {
         var1 = this.x8().u9() & 4294967295L;
      }

      return var1;
   }

   @Override
   public final long u9() {
      long var1 = (this.n3() & 4294967295L) * (this.n5() & 4294967295L) & 4294967295L;
      if ((var1 & 4294967295L) <= 4L) {
         var1 = 0L;
      }

      return var1;
   }

   protected k5(int var1) {
      super(var1);
   }

   @Override
   protected final void l6(com.aspose.slides.internal.v6s.a6 var1, long var2) {
      if ((this.u9() & 4294967295L) > 0L) {
         var1.l6(var2 & 4294967295L);
      } else if (this.x8() == null) {
         var1.n5(0);
      } else {
         this.l6(var1);
      }
   }

   protected abstract void l6(com.aspose.slides.internal.v6s.a6 var1);
}
