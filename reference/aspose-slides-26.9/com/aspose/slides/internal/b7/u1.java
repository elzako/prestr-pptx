package com.aspose.slides.internal.b7;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentException;

class u1 extends m6n {
   private final z6e n5;
   private final v7u l6;
   private final w1n k5;
   private List<r7c> u3;
   private List<l2p> a6;

   public u1(v7u var1, z6e var2, w1n var3) {
      if (var1.a6() != null && var1.u3() != null) {
         this.l6 = var1;
         this.n5 = var2;
         this.k5 = var3;
         this.u3 = new List<>();
         this.a6 = new List<>();
         this.c8();
      } else {
         throw new ArgumentException("TextBody must contain predefined paths and coordinates");
      }
   }

   public final r7c[] n5() {
      return this.u3.toArray(new r7c[0]);
   }

   public final l2p[] l6() {
      return this.a6.toArray(new l2p[0]);
   }

   private d4 n5(com.aspose.slides.internal.o9b.y1[] var1) {
      if (var1.length == 0) {
         return new d4();
      }

      double var2 = Double.MAX_VALUE;
      double var4 = -Double.MAX_VALUE;
      double var6 = Double.MAX_VALUE;
      double var8 = -Double.MAX_VALUE;

      for (com.aspose.slides.internal.o9b.y1 var13 : var1) {
         var2 = com.aspose.slides.ms.System.q1.k5(var2, var13.a6());
         var4 = com.aspose.slides.ms.System.q1.l6(var4, var13.h0());
         var6 = com.aspose.slides.ms.System.q1.k5(var6, var13.t2());
         var8 = com.aspose.slides.ms.System.q1.l6(var8, var13.l6());
      }

      return new d4(var2, var6, var4, var8);
   }

   private void c8() {
      com.aspose.slides.internal.o9b.y1[] var1 = this.l6.a6();
      n7[] var2 = this.l6.u3();
      int var3 = 0;
      double var4 = 4.0;
      if (com.aspose.slides.internal.v6g.k5.l6(this.l6.n5().n5(), j8m.class) || com.aspose.slides.internal.v6g.k5.l6(this.l6.n5().n5(), s4.class)) {
         d4 var6 = this.n5(var1).s7();
         double var7 = this.n5.l6().n5() / var6.h0();
         double var9 = this.n5.l6().l6() / var6.c8();
         var4 = com.aspose.slides.ms.System.q1.k5(var4, 2.0 * com.aspose.slides.ms.System.q1.l6(var7, var9));
      }

      for (t9p var13 : this.l6.l6()) {
         u0a var14 = com.aspose.slides.internal.v6g.k5.n5(var13.n5().l6(), u0a.class);
         if (var14 != null) {
            n7 var15 = var2[var3];
            com.aspose.slides.internal.o9b.y1 var16 = var1[var3].y4();
            var15.l6(var4, var4, false);
            var15.a6();
            var15.h0();
            var15.l6(1.0 / var4, 1.0 / var4, false);
            var15.a6();
            r7c var17 = new r7c(l7h.n5(var15), new w1n());
            this.u3.addItem(var17);
            this.a6.addItem(new l2p(var17, new d4(var16.a6(), var16.t2(), var16.h0(), var16.l6())));
            var3++;
         }

         for (g1p var18 : var13.l6()) {
            m5 var19 = com.aspose.slides.internal.v6g.k5.n5(var18, m5.class);
            if (var19 != null) {
               for (int var20 = 0; var20 < var19.n5().length(); var20++) {
                  if (!com.aspose.slides.ms.System.t9.k5(var19.n5().charAt(var20)) || var19.n5().charAt(var20) == '\t') {
                     n7 var21 = var2[var3];
                     com.aspose.slides.internal.o9b.y1 var22 = var1[var3].y4();
                     var21.l6(var4, var4, false);
                     var21.a6();
                     var21.h0();
                     var21.l6(1.0 / var4, 1.0 / var4, false);
                     var21.a6();
                     r7c var23 = new r7c(l7h.n5(var21), var18.u3());
                     this.u3.addItem(var23);
                     this.a6.addItem(new l2p(var23, new d4(var22.a6(), var22.t2(), var22.h0(), var22.l6())));
                     var3++;
                  }
               }
            }
         }
      }
   }

   @Override
   public j6 k5() {
      return this.n5.l6();
   }
}
