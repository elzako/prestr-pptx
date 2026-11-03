package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.ms.System.IDisposable;

final class e9 extends s5u {
   private final com.aspose.slides.internal.o9b.p8 n5 = new com.aspose.slides.internal.o9b.p8();
   private final Dictionary<IShape, c1m> l6;
   private final Dictionary<Paragraph, c1m> k5;
   private final Dictionary<IShape, d2k> u3;
   private final Dictionary<IShape, k9k> a6;
   private com.aspose.slides.internal.o9b.l6 u9 = null;
   private com.aspose.slides.internal.o9b.l6 h0 = null;
   private final com.aspose.slides.ms.System.i9 c8;
   private float t2;

   final float n5() {
      return this.t2;
   }

   final void n5(float var1) {
      this.t2 = var1;
   }

   public static e9 n5(IBaseSlide var0, com.aspose.slides.internal.o9b.p8 var1) {
      y4x var2 = new y4x();
      var2.t2 = y4x.n5(var1.u3());
      com.aspose.slides.internal.t4r.n5 var3 = new com.aspose.slides.internal.t4r.n5<>(
         com.aspose.slides.internal.k9.h0.class, com.aspose.slides.internal.k9.u9.class
      );
      return new e9(var0, var3, var2, var1.u3());
   }

   private e9(
      IBaseSlide var1,
      com.aspose.slides.internal.t4r.n5<com.aspose.slides.internal.k9.h0, com.aspose.slides.internal.k9.u9> var2,
      y4x var3,
      com.aspose.slides.internal.o9b.p8 var4
   ) {
      super(var1, var2, var3);
      var4.k5(this.n5);
      this.l6 = new Dictionary<>();
      this.k5 = new Dictionary<>();
      this.u3 = new Dictionary<>();
      this.a6 = new Dictionary<>();
      this.c8 = new com.aspose.slides.ms.System.i9(0);
   }

   @Override
   public void n5(e3 var1, Shape var2, InterruptionToken var3) {
      c1m var4 = null;
      c1m[] var5 = new c1m[]{var4};
      boolean var6 = this.l6.tryGetValue(var2, var5);
      var4 = var5[0];
      if (var6) {
         com.aspose.slides.internal.o9b.l6[] var7 = new com.aspose.slides.internal.o9b.l6[]{this.u9};
         this.n5(var7);
         this.u9 = var7[0];
         r1c var8 = new r1c(this.u9, this.n5.l6(), this.n5.k5());

         try {
            var8.a0().n5(com.aspose.slides.internal.o9b.c8.n5(0).o8());
            this.l6(var8, var2, var3);
            var4.n5(var8);
            com.aspose.slides.internal.n2d.y4.n5(var8.y1());
         } finally {
            if (var8 != null) {
               var8.dispose();
            }
         }

         var1.n5(this.u9, 0, 0);
      } else {
         this.l6(var1, var2, var3);
      }
   }

   @Override
   public boolean n5(e3 var1, TextFrame var2, com.aspose.slides.internal.w0.c8 var3) {
      boolean var4 = false;
      if (this.k5.size() > 0) {
         IGenericEnumerator var5 = var2.getParagraphs().iterator();

         try {
            while (var5.hasNext()) {
               Paragraph var6 = (Paragraph)var5.next();
               if (this.k5.containsKey(var6)) {
                  var4 = true;
                  break;
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var5, IDisposable.class)) {
               var5.dispose();
            }
         }
      }

      if (var4) {
         com.aspose.slides.internal.o9b.l6[] var27 = new com.aspose.slides.internal.o9b.l6[]{this.h0};
         this.n5(var27);
         this.h0 = var27[0];
         r1c var7 = new r1c(this.h0, this.n5.l6(), this.n5.k5());

         boolean var28;
         try {
            var7.a0().n5(com.aspose.slides.internal.o9b.c8.n5(0).o8());
            var28 = super.n5(var7, var2, var3);
            if (var28) {
               IGenericEnumerator var8 = var2.getParagraphs().iterator();

               try {
                  while (var8.hasNext()) {
                     Paragraph var9 = (Paragraph)var8.next();
                     c1m var10 = null;
                     c1m[] var11 = new c1m[]{var10};
                     boolean var12 = this.k5.tryGetValue(var9, var11);
                     var10 = var11[0];
                     if (var12) {
                        var10.n5(var7);
                     }
                  }
               } finally {
                  if (com.aspose.slides.internal.v6g.k5.n5(var8, IDisposable.class)) {
                     var8.dispose();
                  }
               }
            }
         } finally {
            if (var7 != null) {
               var7.dispose();
            }
         }

         if (var28) {
            var1.n5(this.h0, 0, 0);
         }

         return var28;
      } else {
         return super.n5(var1, var2, var3);
      }
   }

   private void l6(e3 var1, Shape var2, InterruptionToken var3) {
      d2k var4 = new d2k();
      d2k[] var5 = new d2k[]{var4};
      boolean var6 = this.u3.tryGetValue(var2, var5);
      var5[0].n5(var4);
      if (var6) {
         if (var4.n5 == 0.0F || var4.l6 == 0.0F) {
            return;
         }

         IShapeFrame var7 = var2.getFrame();
         com.aspose.slides.internal.w0.c8 var8 = new com.aspose.slides.internal.w0.c8();
         var8.l6(var7.getCenterX(), var7.getCenterY());
         var8.n5(var4.n5, var4.l6);
         var8.l6(-var7.getCenterX(), -var7.getCenterY());
         var1.k5(var8);

         try {
            super.n5(var1, var2, var3);
         } finally {
            var1.z3();
         }
      } else {
         super.n5(var1, var2, var3);
      }
   }

   private void n5(com.aspose.slides.internal.o9b.l6[] var1) {
      if (var1[0] == null) {
         var1[0] = new com.aspose.slides.internal.o9b.l6(this.n5.l6(), this.n5.k5(), 2498570);
         float var2 = 96.0F;
         var1[0].n5(var2, var2);
      }
   }

   final void l6() {
      this.l6.clear();
      this.k5.clear();
      this.u3.clear();
   }

   final com.aspose.slides.ms.System.i9 k5() {
      return this.c8;
   }

   final void n5(IShape var1, c1m var2) {
      this.l6.set_Item(var1, var2);
   }

   final void n5(Paragraph var1, c1m var2) {
      this.k5.set_Item(var1, var2);
   }

   final void n5(IShape var1, d2k var2) {
      this.u3.set_Item(var1, var2.u3());
   }

   final boolean n5(IShape var1, d2k[] var2) {
      return this.u3.tryGetValue(var1, var2);
   }

   final void l6(IShape var1, d2k var2) {
      if (((Shape)var1).n5(var2.u3())) {
         this.k5(var1, var2.u3());
      }
   }

   final void n5(IShape var1, boolean var2, float var3) {
      if (var2) {
         var1.setX(var3);
      } else {
         var1.setY(var3);
      }

      IShapeFrame var4 = var1.getFrame();
      this.k5(var1, new d2k(var4.getX(), var4.getY()));
   }

   final void n5(Shape var1, boolean var2, float var3) {
      if (var3 < 0.0F) {
         var3 = -var3;
      }

      d2k var4 = new d2k();
      d2k[] var5 = new d2k[]{var4};
      boolean var6 = !this.u3.tryGetValue(var1, var5);
      var5[0].n5(var4);
      if (var6) {
         d2k.u3.n5(var4);
      }

      if (var2) {
         var4.n5 = var3 / var1.getWidth();
      } else {
         var4.l6 = var3 / var1.getHeight();
      }

      this.u3.set_Item(var1, var4.u3());
   }

   public final k9k n5(Shape var1) {
      k9k var2 = null;
      k9k[] var3 = new k9k[]{var2};
      boolean var4 = this.a6.tryGetValue(var1, var3);
      var2 = var3[0];
      if (var4) {
         var2.k5();
      } else {
         var2 = new k9k(var1, this);
         this.a6.addItem(var1, var2);
      }

      return var2;
   }

   final void n5(k9k var1) {
      this.a6.removeItemByKey(var1.k5);
   }

   private void k5(IShape var1, d2k var2) {
      k9k var3 = null;
      k9k[] var4 = new k9k[]{var3};
      boolean var5 = this.a6.tryGetValue(var1, var4);
      var3 = var4[0];
      if (var5) {
         var3.n5(var2.u3());
      }
   }
}
