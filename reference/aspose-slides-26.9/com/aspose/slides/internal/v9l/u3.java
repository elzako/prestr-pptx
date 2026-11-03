package com.aspose.slides.internal.v9l;

import com.aspose.slides.internal.e3j.u9;
import com.aspose.slides.internal.o9b.w1;
import com.aspose.slides.internal.x4g.s7;

public class u3 implements com.aspose.slides.internal.t9z.k5 {
   private final k5 l6 = new k5();
   public final w1 n5 = new w1();

   public k5 k5() {
      return this.l6;
   }

   @Override
   public void n5(float var1, float var2) {
      this.l6.l6(com.aspose.slides.internal.v9l.l6.n5(var1, var2));
      this.n5.n5(var1);
      this.n5.l6(var2);
   }

   @Override
   public void l6(float var1, float var2) {
      if (!u9.n5(this.n5, new w1(var1, var2), 1.0E-6F)) {
         this.l6.l6(com.aspose.slides.internal.v9l.l6.l6(var1, var2));
         this.n5.n5(var1);
         this.n5.l6(var2);
      }
   }

   @Override
   public void n5(float var1, float var2, float var3, float var4) {
      this.l6.l6(com.aspose.slides.internal.v9l.l6.n5(var1, var2, var3, var4));
   }

   @Override
   public void n5(float var1, float var2, float var3, float var4, float var5, float var6) {
      this.l6.l6(com.aspose.slides.internal.v9l.l6.n5(var1, var2, var3, var4, var5, var6));
   }

   @Override
   public void n5() {
      this.l6.l6(com.aspose.slides.internal.v9l.l6.n5());
   }

   @Override
   public void l6() {
   }

   public static k5 n5(s7 var0) {
      u3 var1 = new u3();
      com.aspose.slides.internal.t9z.u3.n5(var0, var1);
      return var1.k5();
   }
}
