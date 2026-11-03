package com.aspose.slides.internal.p5k;

import com.aspose.slides.internal.e1x.i1;
import com.aspose.slides.internal.e1x.t1;
import com.aspose.slides.ms.System.d1;

public class h0 extends d2 {
   public h0(l6 var1) {
      super(var1);
   }

   public final void n5(i1 var1) {
      y1 var2 = new y1(this.h0());
      var2.n5();
      this.u9().l6(this.h0().l6(var1));
      this.u9().n5(true, false);
      this.u9().n5(false, false);
      this.u9().n5(true, false);
      this.u9().n5(false, false);
      this.u9().n5(true, false);
      this.u9().n5(true, false);
      this.u9().n5(false, false);
      this.u9().n5(false, true);
      this.u9().n5(0);
      String var3 = d1.n5(new String[]{var1.u3(), "_AW"});
      this.u9().n5((byte)var3.length() & 255);

      for (int var4 = 0; var4 < var3.length(); var4++) {
         this.u9().n5((byte)var3.charAt(var4) & 255);
      }

      this.l6(var1);
      this.u9().l6().n5().seek(0L, 2);
      var2.n5(75);
   }

   private void l6(i1 var1) {
      u9 var2 = this.h0().k5(var1);
      this.u9().l6((short)var2.n5().length);
      long var3 = this.u9().l6().n5().getPosition();
      int[] var5 = new int[var2.n5().length];

      for (int var6 = 0; var6 < var5.length; var6++) {
         this.u9().k5(0);
      }

      long var7 = this.u9().l6().n5().getPosition();
      this.u9().k5(0);
      c8 var9 = new c8(this.h0());

      for (int var10 = 0; var10 < var2.n5().length; var10++) {
         var5[var10] = (int)(this.u9().l6().n5().getPosition() - var3);
         int var11 = var2.n5()[var10];
         if (var11 != 32) {
            t1 var12 = var2.l6(var11);
            var9.n5(var12);
         } else {
            var9.n5();
         }
      }

      int var13 = (int)(this.u9().l6().n5().getPosition() - var3);
      this.u9().l6().n5().setPosition(var7);
      this.u9().k5(var13);
      this.u9().l6().n5().setPosition(var3);

      for (int var14 = 0; var14 < var5.length; var14++) {
         this.u9().k5(var5[var14]);
      }

      this.u9().l6().n5().seek(0L, 2);

      for (int var15 = 0; var15 < var2.n5().length; var15++) {
         this.u9().l6((short)var2.n5()[var15]);
      }

      this.u9().l6(var2.l6());
      this.u9().l6(var2.k5());
      this.u9().l6(var2.u3());

      for (int var16 = 0; var16 < var2.n5().length; var16++) {
         short var18 = var2.k5(var2.n5()[var16]);
         this.u9().l6(var18);
      }

      for (int var17 = 0; var17 < var2.n5().length; var17++) {
         this.u9().n5(0, 0, 0, 0);
      }

      this.u9().l6(0);
   }
}
