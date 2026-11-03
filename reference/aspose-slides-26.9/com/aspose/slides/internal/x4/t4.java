package com.aspose.slides.internal.x4;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.o9b.y1;

public class t4 implements l6 {
   private int n5;
   private y1 l6 = y1.n5.y4();
   private final List<y1> k5 = new List<>();

   public final void n5(z1 var1) {
      var1.k7();
      var1.k7();
      var1.m3();
      var1.k7();
      short var2 = var1.k7();
      var1.k7();
      var1.u3().a6(this.l6);
      this.k5.clear();

      for (int var3 = 0; var3 < var2; var3++) {
         int var4 = var1.r4() & 65535;
         int var5 = var1.r4() & 65535;
         int var6 = var1.r4() & 65535;

         for (int var7 = 0; var7 < var4; var7++) {
            int var8 = var1.r4() & 65535;
            int var9 = var1.r4() & 65535;
            this.k5.addItem(new y1(var8, var5, var9 - var8, var6 - var5));
         }

         var1.r4();
      }
   }

   public final void n5(t9 var1) {
      var1.m3();
      var1.m3();
      int var2 = var1.m3();
      var1.m3();
      var1.u3().a6(this.l6);
      this.k5.clear();

      for (int var3 = 0; var3 < var2; var3++) {
         this.k5.addItem(var1.u3().y4());
      }
   }

   @Override
   public final int n5() {
      return 4;
   }

   @Override
   public final int l6() {
      return this.n5;
   }

   @Override
   public final void n5(int var1) {
      this.n5 = var1;
   }

   public final y1 k5() {
      return this.l6;
   }

   public final List<y1> u3() {
      return this.k5;
   }
}
