package com.aspose.slides.internal.x4a;

import com.aspose.slides.internal.o9b.i1;
import com.aspose.slides.internal.x4g.n3;
import java.awt.Color;
import java.io.IOException;

public final class n5 extends com.aspose.slides.internal.s2b.u3 {
   com.aspose.slides.internal.d2n.n5 n5;
   private Color l6 = null;

   public n5() {
   }

   public n5(com.aspose.slides.internal.d2n.n5 var1) {
      this.n5 = var1;
   }

   public n5(int var1, Color var2, int var3) {
      this.n5 = new com.aspose.slides.internal.d2n.n5(var3, var2, var1);
   }

   public static n5 n5(com.aspose.slides.internal.o9b.u3 var0) {
      byte var1 = 0;
      Color var2 = Color.BLACK;
      int var3 = 0;
      if (var0 instanceof n3) {
         var1 = 2;
         n3 var4 = (n3)var0;
         if (var4.t2() <= 6) {
            var3 = var4.t2();
         }

         var2 = com.aspose.slides.internal.o9b.c8.l6(var4.c8());
      } else if (var0 instanceof i1) {
         var2 = com.aspose.slides.internal.o9b.c8.l6(((i1)var0).h0());
      }

      n5 var5 = new n5(var1, var2, var3);
      if (var0 instanceof n3) {
         var5.l6 = com.aspose.slides.internal.o9b.c8.l6(((n3)var0).h0());
      }

      return var5;
   }

   public u9 l6() {
      return new u9(this.n5.l6());
   }

   @Override
   public void n5(byte[] var1, int var2, int var3) throws com.aspose.slides.internal.p7x.l6, IOException {
      this.n5 = new com.aspose.slides.internal.d2n.n5();
      this.n5.n5(var1, var2);
   }

   @Override
   public int n5() {
      return 764;
   }

   @Override
   public void n5(com.aspose.slides.internal.o6t.k5 var1, com.aspose.slides.internal.m5l.k5 var2, int var3) throws com.aspose.slides.internal.p7x.l6 {
      com.aspose.slides.internal.c4t.u3 var4 = this.n5.n5();
      var1.n5(var4);
      super.n5(var1, var2, var3);
   }

   public Color k5() {
      return this.l6;
   }
}
