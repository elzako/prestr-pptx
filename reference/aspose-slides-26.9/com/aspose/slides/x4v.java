package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.SortedList;

class x4v {
   private f3z n5;
   private List<Integer> l6 = new List<>();
   private s3x[] k5;
   private SortedList<Long, Integer> u3 = new SortedList<>();
   private List<com.aspose.slides.internal.k0r.e6r> a6 = new List<>();

   x4v(com.aspose.slides.internal.k0r.z6z var1, f3z var2) {
      this.n5 = var2;
      if (var1.k5() == 2 && com.aspose.slides.internal.v6g.k5.a6(var2.u3().a6(), 10) > 0L) {
         com.aspose.slides.internal.k0r.w1n var3 = new com.aspose.slides.internal.k0r.w1n(null);
         var3.n5(var2.u3().a6());
         var3.l6(0L);
         this.a6.addItem(var3);
      }

      this.n5(var1);
      this.k5 = new s3x[this.k5()];
   }

   final s3x n5(int var1) {
      if (this.k5[var1] == null) {
         int var2 = this.l6.get_Item(var1);
         com.aspose.slides.internal.k0r.w1n var3 = (com.aspose.slides.internal.k0r.w1n)this.a6.get_Item(var2);
         s3x var4 = new s3x(var3, this);
         int var5 = var2 + 1;

         for (int var6 = this.u3().size();
            var5 < var6 && com.aspose.slides.internal.v6g.k5.k5(this.u3().get_Item(var5).r4(), 8) != com.aspose.slides.internal.v6g.k5.k5(var3.r4(), 8);
            var5++
         ) {
            var4.n5(this.u3().get_Item(var5));
         }

         this.k5[var1] = var4;
      }

      return this.k5[var1];
   }

   public final s3x n5(long var1) {
      return !this.u3.containsKey(var1) ? null : this.n5(this.u3.get_Item(var1));
   }

   final void n5(com.aspose.slides.internal.k0r.z6z var1) {
      com.aspose.slides.internal.z0k.n5 var2 = this.n5.n5();
      g4x var3 = new g4x(var1, var2);

      try {
         com.aspose.slides.internal.k0r.z6z var4 = var3.l6();
         boolean var5 = false;

         while (var4 != null) {
            switch (var4.u3()) {
               case 1011:
                  if (var5) {
                     this.a6.addItem(new com.aspose.slides.internal.k0r.k2p(null));
                  }

                  var5 = false;
                  com.aspose.slides.internal.k0r.w1n var6 = new com.aspose.slides.internal.k0r.w1n(null);
                  var6.n5(var2, var4);
                  this.u3.addItem(var6.u3(), this.l6.size());
                  this.l6.addItem(this.a6.size());
                  this.a6.addItem(var6);
                  break;
               case 3999:
                  if (var5) {
                     this.a6.addItem(new com.aspose.slides.internal.k0r.k2p(null));
                  }

                  var5 = true;
                  break;
               case 4000:
                  com.aspose.slides.internal.k0r.x1f var8 = new com.aspose.slides.internal.k0r.x1f(null);
                  var8.n5(var2, var4);
                  this.a6.addItem(var8);
                  var5 = false;
                  break;
               case 4008:
                  com.aspose.slides.internal.k0r.k2p var7 = new com.aspose.slides.internal.k0r.k2p(null);
                  var7.n5(var2, var4);
                  this.a6.addItem(var7);
                  var5 = false;
            }

            var4 = var3.l6();
         }
      } finally {
         if (var3 != null) {
            var3.dispose();
         }
      }
   }

   final f3z n5() {
      return this.n5;
   }

   final com.aspose.slides.internal.z0k.n5 l6() {
      return this.n5.n5();
   }

   final int k5() {
      return this.l6.size();
   }

   final List<com.aspose.slides.internal.k0r.e6r> u3() {
      return this.a6;
   }

   final boolean a6() {
      return this.n5.k5();
   }
}
