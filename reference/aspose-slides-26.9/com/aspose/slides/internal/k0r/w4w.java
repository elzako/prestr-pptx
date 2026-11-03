package com.aspose.slides.internal.k0r;

import com.aspose.slides.Collections.Generic.List;

public class w4w extends m4d {
   private o5k[] n5 = new o5k[]{new o5k()};
   private l8r[] l6 = new l8r[]{new l8r()};

   public w4w(r5w var1) {
      super(var1);
      this.w1().n5(4001);
   }

   public final o5k[] l6() {
      return this.n5;
   }

   public final void n5(o5k[] var1) {
      this.n5 = var1;
   }

   public final l8r[] k5() {
      return this.l6;
   }

   public final void n5(l8r[] var1) {
      this.l6 = var1;
   }

   @Override
   protected void n5(com.aspose.slides.internal.z0k.n5 var1) {
      long var2 = var1.x8().getPosition();
      int var4 = this.u9().z8() + 1;
      List var5 = new List();
      int var6 = var4;

      while (var6 > 0) {
         o5k var7 = new o5k();
         var7.n5(var1);
         var6 -= (int)var7.n5();
         var5.addItem(var7);
      }

      if (var6 != 0) {
      }

      this.n5 = (o5k[])var5.toArray(new o5k[0]);
      List var10 = new List();
      var6 = var4;

      while (var6 > 0) {
         l8r var8 = new l8r();
         var8.n5(var1, var6);
         var6 -= (int)var8.n5();
         var10.addItem(var8);
         if (var1.x8().getPosition() - var2 == this.w1().a6()) {
            var6 = 0;
         }
      }

      if (var6 != 0) {
      }

      this.l6 = (l8r[])var10.toArray(new l8r[0]);
   }

   @Override
   public void n5(com.aspose.slides.internal.z0k.l6 var1) {
      for (int var2 = 0; var2 < this.n5.length; var2++) {
         this.n5[var2].n5(var1);
      }

      for (int var3 = 0; var3 < this.l6.length; var3++) {
         this.l6[var3].n5(var1);
      }
   }

   @Override
   public int n5() {
      int var1 = 0;

      for (int var2 = 0; var2 < this.n5.length; var2++) {
         var1 += this.n5[var2].u3();
      }

      for (int var3 = 0; var3 < this.l6.length; var3++) {
         var1 += this.l6[var3].k5();
      }

      return var1;
   }

   public final boolean u3() {
      if (this.n5 != null && this.l6 != null) {
         if (this.n5.length >= 1 && this.l6.length >= 1) {
            for (int var1 = 0; var1 < this.n5.length; var1++) {
               if (!this.n5[var1].k5().j5() || (this.n5[var1].l6() & 65535) != 0) {
                  return false;
               }
            }

            for (int var2 = 0; var2 < this.l6.length; var2++) {
               if (!this.l6[var2].l6().z3()) {
                  return false;
               }
            }

            return true;
         } else {
            return true;
         }
      } else {
         return true;
      }
   }

   public final void a6() {
      this.h0();
      this.c8();
   }

   private void h0() {
      if (this.n5 != null && this.n5.length >= 2) {
         List var1 = new List();
         o5k var2 = this.n5[0];
         var1.addItem(var2);

         for (int var3 = 1; var3 < this.n5.length; var3++) {
            if (this.n5[var3].n5(var2)) {
               var2.n5((var2.n5() & 4294967295L) + (this.n5[var3].n5() & 4294967295L) & 4294967295L);
            } else {
               var2 = this.n5[var3];
               var1.addItem(var2);
            }
         }

         this.n5 = (o5k[])var1.toArray(new o5k[0]);
      }
   }

   private void c8() {
      if (this.l6 != null && this.l6.length >= 2) {
         List var1 = new List();
         l8r var2 = this.l6[0];
         var1.addItem(var2);

         for (int var3 = 1; var3 < this.l6.length; var3++) {
            if (this.l6[var3].n5(var2)) {
               var2.n5((var2.n5() & 4294967295L) + (this.l6[var3].n5() & 4294967295L) & 4294967295L);
            } else {
               var2 = this.l6[var3];
               var1.addItem(var2);
            }
         }

         this.l6 = (l8r[])var1.toArray(new l8r[0]);
      }
   }
}
