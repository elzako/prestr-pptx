package com.aspose.slides.internal.v9l;

import com.aspose.slides.internal.e3j.u9;
import com.aspose.slides.internal.o9b.w1;
import com.aspose.slides.internal.x4g.s7;
import java.util.Iterator;

class n5$n5 implements com.aspose.slides.internal.t9z.k5 {
   private k5 n5;
   private w1 l6;

   public n5$n5() {
   }

   public k5 n5(s7 var1) {
      this.n5 = new k5();
      this.l6 = null;
      com.aspose.slides.internal.t9z.u3.n5(var1, this);
      if (this.l6 == null) {
         this.l6 = new w1(0.0F, 0.0F);
      }

      Iterator var2 = this.n5.h0();
      w1 var3 = ((l6)var2.next()).u3();
      byte var4 = 1;
      float var5 = 1.0E-4F;
      if (var2.hasNext() && u9.n5(var3, this.l6, 1.0E-4F)) {
         var4 = 2;
         var3 = ((l6)var2.next()).u3();
      }

      if (u9.n5(var3, this.l6, 1.0E-4F)) {
         var3 = this.l6;
      }

      Iterator var6 = this.n5.h0();

      for (int var7 = 0; var7 < var4; var7++) {
         var6.next();
         var6.remove();
      }

      this.n5.n5(com.aspose.slides.internal.v9l.l6.l6(this.l6.l6(), this.l6.k5()));
      this.n5.n5(com.aspose.slides.internal.v9l.l6.n5(var3.l6(), var3.k5()));
      this.n5.l6(com.aspose.slides.internal.v9l.l6.n5());
      return this.n5;
   }

   @Override
   public void n5(float var1, float var2) {
      this.l6 = new w1(var1, var2);
   }

   @Override
   public void l6(float var1, float var2) {
      this.n5.l6(com.aspose.slides.internal.v9l.l6.l6(var1, var2));
   }

   @Override
   public void n5(float var1, float var2, float var3, float var4) {
      this.n5.l6(com.aspose.slides.internal.v9l.l6.n5(var1, var2, var3, var4));
   }

   @Override
   public void n5(float var1, float var2, float var3, float var4, float var5, float var6) {
      this.n5.l6(com.aspose.slides.internal.v9l.l6.n5(var1, var2, var3, var4, var5, var6));
   }

   @Override
   public void n5() {
   }

   @Override
   public void l6() {
   }
}
