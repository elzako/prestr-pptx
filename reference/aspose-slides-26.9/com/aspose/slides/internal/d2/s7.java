package com.aspose.slides.internal.d2;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;
import com.aspose.slides.ms.System.q1;

public class s7 extends c8 {
   public List<c8> x8 = new List<>();
   protected boolean n3;
   protected int y4;
   private int e2;

   @Override
   public void n5(com.aspose.slides.internal.a0.l6 var1) {
      if (this.x8.size() == 0) {
         this.n3 = this.l6() == 0;
      }

      c8 var2 = (c8)var1;
      this.x8.addItem(var2);
      var2.l6(this);
      if (this.n3) {
         this.e2(var2.f_());
      }

      this.t2(var2.h0());
      int var3 = var2.z8();
      this.y4 = q1.l6(this.y4, var3);
      this.e2 = q1.n5(this.e2, var3 + var2.j5());
   }

   @Override
   public int z8() {
      return this.w1() + this.y4;
   }

   @Override
   public int j5() {
      return this.e2 - this.y4;
   }

   public List<c8> d_() {
      return this.x8;
   }

   @Override
   public boolean n5(double var1, int var3, int var4) {
      boolean var5 = false;
      int var6 = 0;
      int var7 = 0;

      for (int var8 = this.x8.size(); var7 < var8; var7++) {
         c8 var9 = this.x8.get_Item(var7);
         var5 |= var9.n5(var1, var3, var4);
         var6 += var9.l6();
      }

      this.l6(var6);
      return var5;
   }

   @Override
   public List<com.aspose.slides.internal.d5.a6> l6(List<com.aspose.slides.internal.d5.a6> var1) {
      List$Enumerator var2 = this.d_().iterator();

      try {
         while (var2.hasNext()) {
            c8 var3 = (c8)var2.next();
            var1 = var3.l6(var1);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }

      return var1;
   }

   private void t2(int var1) {
      if (var1 >= 0) {
         int var2 = this.h0();
         if (var2 >= 0) {
            if (var1 < var2) {
               this.u3(var1);
            }
         } else {
            this.u3(var1);
         }
      }
   }
}
