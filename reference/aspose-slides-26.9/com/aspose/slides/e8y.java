package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.Exception;

class e8y extends f7c {
   e8y(p7m var1, g3y var2) {
      super(var1, var2);
   }

   protected final void n5(List<h2v> var1) {
      if (this.e2().u9().getSmooth() && var1.size() > 2) {
         this.l6(var1);
      } else {
         this.k5(var1);
      }
   }

   private void l6(List<h2v> var1) {
      boolean var2 = var1.get_Item(0) == this.l6.get_Item(0);
      boolean var3 = var1.get_Item(var1.size() - 1) == this.l6.get_Item(this.l6.size() - 1);
      com.aspose.slides.internal.o9b.w1 var4 = new com.aspose.slides.internal.o9b.w1();
      com.aspose.slides.internal.o9b.w1 var5 = new com.aspose.slides.internal.o9b.w1();
      byte var6 = 0;
      if (var2) {
         float var7 = this.l6.get_Item(0).i1().l6();
         float var8 = this.l6.get_Item(0).i1().k5();
         var4 = new com.aspose.slides.internal.o9b.w1(var7, var8);
         var6 = (byte)((var6 & 255) + 1);
      }

      if (var3) {
         float var16 = this.l6.get_Item(this.l6.size() - 1).i1().l6();
         float var18 = this.l6.get_Item(this.l6.size() - 1).i1().k5();
         var5 = new com.aspose.slides.internal.o9b.w1(var16, var18);
         var6 = (byte)((var6 & 255) + 1);
      }

      com.aspose.slides.internal.x4g.s7 var17 = new com.aspose.slides.internal.x4g.s7();
      com.aspose.slides.internal.x4g.s7 var19 = new com.aspose.slides.internal.x4g.s7();
      com.aspose.slides.internal.o9b.w1[] var9 = var1.convertAll(new e8y$1(this)).toArray(new com.aspose.slides.internal.o9b.w1[0]);
      com.aspose.slides.internal.o9b.w1[] var10 = (com.aspose.slides.internal.o9b.w1[])com.aspose.slides.ms.System.u3.n5(
         com.aspose.slides.ms.System.u3.n5(com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.o9b.w1.class), var9.length + (var6 & 255))
      );
      var4.n5(var10[0]);
      var5.n5(var10[var10.length - 1]);
      com.aspose.slides.ms.System.u3.n5((Object)(var9)).copyTo(com.aspose.slides.ms.System.u3.n5((Object)(var10)), var2 ? 1 : 0);

      for (int var11 = 1; var11 < var1.size(); var11++) {
         var17.n5(var10[var11 - 1].u3(), var10[var11].u3());
         if (var10.length > 2) {
            int var12 = var2 ? var11 : var11 - 1;
            if ((!var2 || var12 != 1) && var12 != 0) {
               if (var12 == var10.length - 2) {
                  com.aspose.slides.internal.o9b.w1[] var20 = x5h.n5(var10[var12 - 1].u3(), var10[var12].u3(), var10[var12 + 1].u3(), var10[var12 + 1].u3());
                  var19.u3(var20);
               } else {
                  com.aspose.slides.internal.o9b.w1[] var21;
                  try {
                     var21 = x5h.n5(var10[var12 - 1].u3(), var10[var12].u3(), var10[var12 + 1].u3(), var10[var12 + 2].u3());
                  } catch (RuntimeException var15) {
                     throw new Exception();
                  }

                  var19.u3(var21);
               }
            } else {
               com.aspose.slides.internal.o9b.w1[] var13 = x5h.n5(var10[var12].u3(), var10[var12].u3(), var10[var12 + 1].u3(), var10[var12 + 2].u3());
               var19.u3(var13);
            }
         }

         if (var11 == var1.size() - 1 || this.n5((h2v)var1.get_Item(var11), (h2v)var1.get_Item(var11 + 1))) {
            this.e2()
               .n5(
                  ((h2v)var1.get_Item(var11)).e2().m3().o8(),
                  var10.length > 2 ? var19 : var17,
                  this.n5((h2v)var1.get_Item(var11)),
                  w5k.n5(this.e2().u9().getChart())
               );
            var17.t2();
            var19.t2();
         }
      }
   }

   private LineFormat n5(h2v var1) {
      boolean var2 = var1.e2().s7().n5() != null && !var1.e2().s7().n5().getLine().isFormatNotDefined();
      return !var2 ? (LineFormat)this.e2().u9().getFormat().getLine() : (LineFormat)var1.e2().s7().getFormat().getLine();
   }

   private boolean n5(h2v var1, h2v var2) {
      LineFormat var3 = this.n5(var1);
      LineFormat var4 = this.n5(var2);
      boolean var5 = var3.equals(var4);
      return !var5;
   }

   private void k5(List<h2v> var1) {
      com.aspose.slides.internal.x4g.s7 var2 = new com.aspose.slides.internal.x4g.s7();
      com.aspose.slides.internal.o9b.y1 var3 = this.e2().t2().d2().t9().y4();
      var3.n5(10.0F, 10.0F);

      for (int var4 = 1; var4 < var1.size(); var4++) {
         com.aspose.slides.internal.o9b.w1 var5 = ((h2v)var1.get_Item(var4 - 1)).i1().u3();
         com.aspose.slides.internal.o9b.w1 var6 = ((h2v)var1.get_Item(var4)).i1().u3();
         var2.n5(var5.u3(), var6.u3());
         if (var4 == var1.size() - 1 || this.n5((h2v)var1.get_Item(var4), (h2v)var1.get_Item(var4 + 1))) {
            this.e2().n5(((h2v)var1.get_Item(var4)).e2().m3().o8(), var2, this.n5((h2v)var1.get_Item(var4)), w5k.n5(this.e2().u9().getChart()));
            var2.t2();
         }
      }
   }

   protected final float h0() {
      if (com.aspose.slides.internal.v6g.k5.l6(this.t9().k5, o8r.class)) {
         return com.aspose.slides.internal.v6g.k5.n5(this.t9().k5, m3o.class).w1();
      } else {
         return com.aspose.slides.internal.v6g.k5.l6(this.t9().k5, a0k.class)
            ? com.aspose.slides.internal.v6g.k5.n5(this.t9().k5, a0k.class).a5()
            : this.d2() / this.l6.size();
      }
   }
}
