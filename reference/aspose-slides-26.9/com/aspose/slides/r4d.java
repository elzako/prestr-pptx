package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.ObjectModel.ReadOnlyCollection;

final class r4d {
   private final float t2;
   private final float s7;
   private final m7f[] x8;
   private final boolean n3;
   com.aspose.slides.internal.o9b.y1 n5 = new com.aspose.slides.internal.o9b.y1();
   private d2k y4 = new d2k();
   private float e2 = 0.0F;
   private float t9 = 0.0F;
   public final e2n l6;
   public final y6e k5;
   public final y6e u3;
   public final d2k a6 = new d2k();
   public final float u9;
   public k8x h0 = new k8x();
   public final ReadOnlyCollection<m4i> c8;

   public r4d(e2n var1, y6e var2, y6e var3, float var4, float var5, k8x var6, m7f[] var7, boolean var8) {
      this.l6 = var1;
      this.k5 = var2;
      this.u3 = var3;
      d2k.k5.n5(this.y4);
      new d2k(var4, var6.n5).n5(this.a6);
      this.t2 = var5;
      this.e2 = var6.n5 - var6.l6;
      this.s7 = var6.n5 == 0.0F ? 0.0F : this.e2 / var6.n5;
      this.t9 = var6.l6;
      this.x8 = var7;
      this.n3 = var8;
      this.u9 = this.e2;
      var6.n5(this.h0);
      if (var2 == var3) {
         this.c8 = new ReadOnlyCollection<>(com.aspose.slides.ms.System.u3.n5(new m4i[]{var2.n5()}));
      } else {
         List var9 = new List();

         y6e var10;
         for (var10 = var2; var10.n5(var3); var10 = var10.t2()) {
            if (!var9.containsItem(var10.n5())) {
               var9.addItem(var10.n5());
            }
         }

         if ("\u000b".equals(var3.n5().l6)) {
            var9.addItem(var10.n5());
         }

         this.c8 = new ReadOnlyCollection<>(var9);
      }
   }

   public final float n5() {
      return this.y4.l6 - this.e2;
   }

   public final float l6() {
      return this.y4.l6 + this.t9;
   }

   public final float k5() {
      return this.a6.n5;
   }

   public final float u3() {
      return this.t2;
   }

   public final float a6() {
      return this.a6.l6;
   }

   public final float u9() {
      return this.s7;
   }

   public final m7f[] h0() {
      return this.x8;
   }

   public final boolean c8() {
      return this.n3;
   }

   public final d2k t2() {
      return this.y4;
   }

   public final float s7() {
      return this.y4.l6;
   }

   public final void n5(float var1) {
      this.y4.l6 = var1;
   }

   public final float x8() {
      return this.y4.n5;
   }

   public final void l6(float var1) {
      this.y4.n5 = var1;
   }

   public final float n3() {
      return this.e2;
   }

   public final void k5(float var1) {
      this.e2 = var1;
   }

   public final float y4() {
      return this.t9;
   }

   public final void u3(float var1) {
      this.t9 = var1;
   }
}
