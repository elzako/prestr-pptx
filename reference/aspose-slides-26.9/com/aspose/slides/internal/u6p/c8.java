package com.aspose.slides.internal.u6p;

import com.aspose.slides.internal.h3d.c4;
import com.aspose.slides.internal.h3d.y2;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.y8;

class c8 extends t2 {
   private y8[] n5;
   private String[] u3;

   public c8(y8 var1, c4 var2) {
      this.n5 = new y8[var2.k5()];
      this.u3 = new String[var2.k5()];
      y2 var3 = var2.u3();

      for (int var4 = 0; var3.hasNext(); var4++) {
         this.n5[var4] = var3.k5();
         this.u3[var4] = var3.l6();
      }

      this.l6 = var2.n5();
      this.k5 = var2.l6();
   }

   @Override
   public boolean n5(t2 var1) {
      if (!(var1 instanceof c8)) {
         return false;
      }

      c8 var2 = (c8)var1;
      if (this.n5.length != var2.n5.length) {
         return false;
      }

      if (!d1.a6(this.l6, var2.l6)) {
         return false;
      }

      if (!d1.a6(this.k5, var2.k5)) {
         return false;
      }

      for (int var3 = 0; var3 < this.n5.length; var3++) {
         if (this.n5[var3] != var2.n5[var3]) {
            return false;
         }

         if (!d1.a6(this.u3[var3], var2.u3[var3])) {
            return false;
         }
      }

      return true;
   }

   @Override
   public void n5(h0 var1, com.aspose.slides.internal.z0k.l6 var2) {
      for (y8 var6 : this.n5) {
         y8 var7 = var6;

         while (var7.s3()) {
            var7 = var7.h0();
         }

         var1.n5(var2, var7.t4());
      }
   }

   @Override
   public void n5(h0 var1, com.aspose.slides.internal.z0k.l6 var2, boolean var3) {
      var2.l6(this.n5.length);

      for (String var7 : this.u3) {
         var2.n5(var7);
      }

      for (y8 var14 : this.n5) {
         h0.n5(var2, var14);
      }

      for (y8 var15 : this.n5) {
         var1.l6(var2, var15);
      }
   }

   @Override
   public void n5(h0 var1, com.aspose.slides.internal.z0k.l6 var2, Object var3) {
      c4 var4 = (c4)var3;
      y2 var5 = var4.u3();

      while (var5.hasNext()) {
         var1.n5(var2, var5.k5(), var5.u3());
      }
   }

   @Override
   public boolean n5() {
      return true;
   }
}
