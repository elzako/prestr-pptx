package com.aspose.slides.internal.b7;

import com.aspose.slides.IGenericCloneable;
import com.aspose.slides.Collections.Generic.IGenericList;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.ms.System.IDisposable;

public final class v7u implements IGenericCloneable<v7u> {
   private final List<t9p> n5;
   private final w7 l6;
   private z0k k5;
   private x7i u3;
   private n7[] a6;
   private com.aspose.slides.internal.o9b.y1[] u9;

   public final z0k n5() {
      return this.k5;
   }

   public final void n5(x7i var1) {
      if (var1 != this.u3) {
         this.u3 = null != var1 ? var1.n5() : null;
      }
   }

   public final t9p[] l6() {
      return this.n5.toArray(new t9p[0]);
   }

   public final v7u k5() {
      v7u var1 = new v7u(this.l6);
      var1.k5 = this.k5.u9();
      var1.n5(this.u3);
      List$Enumerator var2 = this.n5.iterator();

      try {
         while (var2.hasNext()) {
            t9p var3 = (t9p)var2.next();
            var1.n5.addItem(var3.k5());
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }

      return var1;
   }

   public final void n5(t9p var1) {
      if (var1 == null) {
         throw new ArgumentNullException("paragraph");
      }

      this.n5.addItem(var1);
   }

   public final com.aspose.slides.internal.x4g.s7[] n5(com.aspose.slides.internal.o9b.y1[] var1) {
      r7c[] var2 = this.n5(this.l6.k5(), 3116.0);
      com.aspose.slides.internal.x4g.s7[] var3 = new com.aspose.slides.internal.x4g.s7[var2.length];
      var1[0] = new com.aspose.slides.internal.o9b.y1();
      if (var2.length > 0) {
         float var4 = Float.MAX_VALUE;
         float var5 = Float.MAX_VALUE;
         float var6 = -Float.MAX_VALUE;
         float var7 = -Float.MAX_VALUE;

         for (int var8 = 0; var8 < var2.length; var8++) {
            r7c var9 = var2[var8];
            h6[] var10 = var9.l6().l6();
            com.aspose.slides.internal.x4g.s7 var11 = new com.aspose.slides.internal.x4g.s7();
            var3[var8] = var11;

            for (h6 var15 : var10) {
               if (var15.n5() > 0) {
                  com.aspose.slides.internal.o9b.w1[] var16 = (com.aspose.slides.internal.o9b.w1[])com.aspose.slides.ms.System.u3.n5(
                     com.aspose.slides.ms.System.u3.n5(com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.o9b.w1.class), var15.n5())
                  );

                  for (int var17 = 0; var17 < var15.n5(); var17++) {
                     k0 var18 = var15.n5(var17).u3();
                     float var19 = (float)(var18.n5() / 12700.0);
                     float var20 = (float)(var18.l6() / 12700.0);
                     if (var4 > var19) {
                        var4 = var19;
                     }

                     if (var5 > var20) {
                        var5 = var20;
                     }

                     if (var6 < var19) {
                        var6 = var19;
                     }

                     if (var7 < var20) {
                        var7 = var20;
                     }

                     var16[var17] = new com.aspose.slides.internal.o9b.w1(var19, var20);
                     if (var17 > 0) {
                        if (Math.abs(var16[var17].l6() - var16[var17 - 1].l6()) < 9.0E-4) {
                           var16[var17] = new com.aspose.slides.internal.o9b.w1(var16[var17 - 1].l6(), var16[var17].k5());
                        }

                        if (Math.abs(var16[var17].k5() - var16[var17 - 1].k5()) < 9.0E-4) {
                           var16[var17] = new com.aspose.slides.internal.o9b.w1(var16[var17].l6(), var16[var17 - 1].k5());
                        }
                     }
                  }

                  var11.k5(var16);
               }
            }
         }

         var1[0] = new com.aspose.slides.internal.o9b.y1(
            var4, var5, com.aspose.slides.ms.System.q1.n5(var6 - var4), com.aspose.slides.ms.System.q1.n5(var7 - var5)
         );
      }

      return var3;
   }

   public final void n5(IGenericList<com.aspose.slides.internal.x4g.s7> var1, IGenericList<com.aspose.slides.internal.o9b.y1> var2) {
      if (var1.size() != var2.size()) {
         throw new ArgumentException("Count of charPaths list must be equals count of charBounds list");
      }

      this.a6 = new n7[var1.size()];
      this.u9 = (com.aspose.slides.internal.o9b.y1[])com.aspose.slides.ms.System.u3.n5(
         com.aspose.slides.ms.System.u3.n5(com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.o9b.y1.class), var2.size())
      );

      for (int var3 = 0; var3 < var1.size(); var3++) {
         n7 var4 = new n7((com.aspose.slides.internal.x4g.s7)var1.get_Item(var3), 12700.0F);
         var4.u9();
         this.a6[var3] = var4;
         com.aspose.slides.internal.o9b.y1 var5 = ((com.aspose.slides.internal.o9b.y1)var2.get_Item(var3)).y4();
         if (var4.s7() == 0 && var3 + 1 < var1.size()) {
            com.aspose.slides.internal.o9b.y1 var6 = ((com.aspose.slides.internal.o9b.y1)var2.get_Item(var3 + 1)).y4();
            if (var6.n3() - var5.n3() < 0.1F) {
               var5.l6(var6.x8() - var5.x8());
            }
         }

         this.u9[var3] = new com.aspose.slides.internal.o9b.y1(var5.x8() * 12700.0F, var5.n3() * 12700.0F, var5.s7() * 12700.0F, var5.k5() * 12700.0F);
      }
   }

   final r7c[] n5(z6e var1, double var2) {
      l7h var4 = new l7h(this, var1, var2);
      return var4.n5();
   }

   final n7[] u3() {
      return this.a6;
   }

   final com.aspose.slides.internal.o9b.y1[] a6() {
      return this.u9;
   }

   v7u(w7 var1) {
      if (var1 == null) {
         throw new ArgumentNullException();
      }

      this.k5 = new z0k();
      this.l6 = var1;
      this.n5 = new List<>();
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public v7u cloneT() {
      return this.k5();
   }

}
