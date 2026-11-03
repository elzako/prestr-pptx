package com.aspose.slides.internal.b7;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.exceptions.NotImplementedException;

final class x7n extends m6n {
   private k4s n5;
   private r5w l6;
   private double k5;
   private double u3;
   private final w1n a6;
   private double u9;
   private Dictionary<Integer, Integer> h0;
   private final z6e c8;
   private final v7u t2;

   public x7n(v7u var1, z6e var2, w1n var3) {
      this.t2 = var1;
      this.c8 = var2;
      this.a6 = var3;
      this.k5 = 0.0;
      this.u3 = 0.0;
      this.u9 = 0.0;
      this.h0 = new Dictionary<>();

      for (int var4 = 0; var4 < 9; var4++) {
         this.h0.addItem(var4, 0);
      }

      this.l6();
   }

   @Override
   public j6 k5() {
      return this.c8.l6();
   }

   private void n5(r5t var1) {
      if (var1.u3().h0() > this.u9) {
         this.u9 = var1.u3().h0();
      }

      throw new NotImplementedException();
   }

   private void n5() {
      this.l6.n5(this.n5);
      this.n5 = this.l6.n5();
   }

   private void n5(s5g var1) {
      if (var1.u3().h0() > this.u9) {
         this.u9 = var1.u3().h0();
      }

      w1n var2 = var1.u3();
      x6s var3 = new x6s(var2, this.c8.l6());
      this.n5.n5(var3);
      this.n5();
   }

   private void n5(m5 var1, j6 var2) {
      w1n var3 = var1.u3();
      x6s var4 = new x6s(var3, this.c8.l6());
      if (var1.u3().h0() > this.u9) {
         this.u9 = var1.u3().h0();
      }

      for (int var5 = 0; var5 < var1.n5().length(); var5++) {
         char var6 = var1.n5().charAt(var5);
         var4.n5(var6);
         double var7 = this.n5.k5().n5() + var4.k5().n5();
         if (var7 > var2.n5()) {
            if (this.n5.u9().length != 0 && var4.c8().length() > 1) {
               var4.t2();
            }

            this.n5.n5(var4);
            this.n5();
            var4 = new x6s(var3, this.c8.l6());
         }
      }

      this.n5.n5(var4);
   }

   private void l6() {
      j6 var1 = this.c8.l6();

      for (t9p var5 : this.t2.l6()) {
         this.l6 = new r5w(var5.n5(), this.a6);
         this.l6.n5(new w9(this.k5, this.u3));
         this.n5 = this.l6.n5();
         if (null != var5.n5().l6()) {
            w1n var6 = var5.l6()[0].u3();
            v2s var7 = this.n5(var5);
            t5g var8 = m5l.n5().n5(var7, var5.n5().k5(), var5.n5().u3(), var5.n5().a6(), var6, this.c8.l6());
            this.n5.n5(var8);
         }

         for (g1p var9 : var5.l6()) {
            m5 var10 = com.aspose.slides.internal.v6g.k5.n5(var9, m5.class);
            if (null != var10) {
               this.n5(var10, var1);
            } else {
               s5g var11 = com.aspose.slides.internal.v6g.k5.n5(var9, s5g.class);
               if (null != var11) {
                  this.n5(var11);
               } else {
                  r5t var12 = com.aspose.slides.internal.v6g.k5.n5(var9, r5t.class);
                  if (null != var12) {
                     this.n5(var12);
                  }
               }
            }
         }

         this.n5();
         this.n5(this.l6);
         this.u3 = this.u3 + this.l6.k5().l6();
      }
   }

   private v2s n5(t9p var1) {
      if (null == var1.n5().l6()) {
         return null;
      } else {
         j9e var2 = com.aspose.slides.internal.v6g.k5.n5(var1.n5().l6(), j9e.class);
         if (null != var2) {
            int var3 = this.l6(var1);
            return new j9e(new x4g(var3), var2.l6());
         } else {
            return var1.n5().l6().k5();
         }
      }
   }

   private int l6(t9p var1) {
      int var2 = 0;
      j9e var3 = com.aspose.slides.internal.v6g.k5.n5(var1.n5().l6(), j9e.class);
      if (null != var3) {
         int var4 = 0;
         if (null != var1.n5().c8()) {
            var4 = var1.n5().c8().n5();
         }

         if (null != var3.n5()) {
            this.h0.set_Item(var4, var3.n5().n5());
         } else {
            this.h0.set_Item(var4, this.h0.get_Item(var4) + 1);
         }

         var2 = this.h0.get_Item(var4);

         for (int var5 = var4 + 1; var5 < 9; var5++) {
            this.h0.set_Item(var5, 0);
         }
      }

      return var2;
   }
}
