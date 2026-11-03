package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.ms.System.IDisposable;

class e8x extends com.aspose.slides.internal.e1.y4 {
   private final com.aspose.slides.internal.n2d.z1<com.aspose.slides.internal.h6.n5, v4l> n5 = new com.aspose.slides.internal.n2d.z1<>(
      com.aspose.slides.internal.h6.n5.class, v4l.class
   );
   private final com.aspose.slides.internal.n2d.z1<com.aspose.slides.internal.h6.n5, e1r> l6 = new com.aspose.slides.internal.n2d.z1<>(
      com.aspose.slides.internal.h6.n5.class, e1r.class
   );
   private final com.aspose.slides.internal.n2d.z1<com.aspose.slides.internal.h6.n5, Integer> k5 = new com.aspose.slides.internal.n2d.z1<>(
      com.aspose.slides.internal.h6.n5.class, Integer.class
   );
   private com.aspose.slides.internal.h6.n5 u3;
   private final List<com.aspose.slides.internal.e1.z1> a6 = new List<>();
   private final List<i1t> u9 = new List<>();
   private final f7s h0;
   private final String c8;
   private final com.aspose.slides.internal.f4.k5 t2;
   private final Presentation s7;
   private final List<Slide> x8 = new List<>();
   private LayoutSlide n3;
   private k3w y4;
   private Slide e2;
   private int t9;
   private com.aspose.slides.internal.e1.w1 z1;

   public e8x(Presentation var1, f7s var2, String var3, com.aspose.slides.internal.f4.k5 var4) {
      this.s7 = var1;
      this.h0 = var2;
      this.c8 = var3;
      this.t2 = var4;
      IGenericEnumerator var5 = this.s7.getMasters().get_Item(0).getLayoutSlides().iterator();

      try {
         while (var5.hasNext()) {
            LayoutSlide var6 = (LayoutSlide)var5.next();
            if (var6.getLayoutType() == 11) {
               this.n3 = var6;
               break;
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var5, IDisposable.class)) {
            var5.dispose();
         }
      }

      if (this.n3 == null) {
         this.n3 = (LayoutSlide)this.s7.getMasters().get_Item(0).getLayoutSlides().get_Item(0);
      }
   }

   @Override
   public void n5(com.aspose.slides.internal.e1.z1 var1) {
      super.n5(var1);
      if (!this.n5(var1, this)) {
         this.n5((com.aspose.slides.internal.e1.m3)var1);
      }
   }

   @Override
   public void n5(com.aspose.slides.internal.e1.k7 var1) {
      com.aspose.slides.internal.f4.l6 var2 = this.t2.l6(var1);
      com.aspose.slides.internal.t9.u3 var3 = ((com.aspose.slides.internal.w5.k5)var2.l6()).a3();
      if (var3.k7().h0() != 2) {
         z8y var4 = new z8y(var1, this.y4, (com.aspose.slides.internal.h6.n5)var2.l6());
         this.n5().addItem(var4);
      }

      super.n5(var1);
   }

   @Override
   public void l6(com.aspose.slides.internal.e1.r4 var1) {
      this.n5((com.aspose.slides.internal.e1.m3)var1);
      super.l6(var1);
   }

   @Override
   public void n5(com.aspose.slides.internal.e1.r4 var1) {
      super.n5(var1);
   }

   @Override
   public void n5(com.aspose.slides.internal.e1.w1 var1) {
      this.y4 = k3w.n5(this);
   }

   private boolean n5(com.aspose.slides.internal.e1.m3 var1, e8x var2) {
      com.aspose.slides.internal.f4.l6 var3 = this.t2.l6(var1);
      if (var3 == null) {
         return false;
      }

      com.aspose.slides.internal.f4.l6 var4 = this.l6(var3);
      if (var4 == null) {
         return false;
      }

      this.n5((com.aspose.slides.internal.h6.n5)var3.l6());
      com.aspose.slides.internal.f4.l6 var5 = this.k5(var4);
      if (var5 == null) {
         return false;
      }

      com.aspose.slides.internal.h6.n5 var6 = (com.aspose.slides.internal.h6.n5)var5.l6();
      if (!this.n5.containsKey(var6)) {
         v4l var7 = new v4l(this.y4, var6);
         this.n5().addItem(var7);
         this.n5.set_Item((com.aspose.slides.internal.h6.n5)var5.l6(), var7);
      }

      v4l var8 = this.n5.get_Item((com.aspose.slides.internal.h6.n5)var5.l6());
      var8.n5(var4, var1, var2);
      return true;
   }

   private com.aspose.slides.internal.f4.l6 l6(com.aspose.slides.internal.f4.l6 var1) {
      while (!m1j.k5((com.aspose.slides.internal.h6.n5)var1.l6())) {
         var1 = var1.n5();
         if (var1 == null) {
            return null;
         }
      }

      return var1;
   }

   private com.aspose.slides.internal.f4.l6 k5(com.aspose.slides.internal.f4.l6 var1) {
      while (!m1j.l6((com.aspose.slides.internal.h6.n5)var1.l6())) {
         var1 = var1.n5();
         if (var1 == null) {
            return null;
         }
      }

      return var1;
   }

   public static com.aspose.slides.internal.o9b.y1 n5(com.aspose.slides.internal.f4.l6 var0) {
      com.aspose.slides.internal.o9b.y1 var1 = var0.k5().y4();
      return new com.aspose.slides.internal.o9b.y1(var1.x8(), var1.n3(), var1.s7(), var1.k5());
   }

   private void n5(com.aspose.slides.internal.e1.m3 var1) {
      com.aspose.slides.internal.f4.l6 var2 = this.t2.l6(var1);
      if (var2 != null) {
         com.aspose.slides.internal.h6.n5 var3 = (com.aspose.slides.internal.h6.n5)var2.l6();
         this.n5(var3);
         com.aspose.slides.internal.e1.z1 var4 = com.aspose.slides.internal.v6g.k5.n5(var1, com.aspose.slides.internal.e1.z1.class);
         if (m1j.u9(var3)) {
            if (this.u3 == null) {
               this.u3 = var3;
            }

            if (var4 == null) {
               this.n5(var3.u9());
            } else {
               this.a6.addItem(var4);
            }
         } else {
            if (this.n3()) {
               this.n5(this.y4);
            }

            if (var4 != null && this.l6(var2) == null) {
               com.aspose.slides.internal.h6.n5 var5 = this.u3(var2);
               if (var5 != null) {
                  e1r var6 = null;
                  e1r[] var7 = new e1r[]{var6};
                  boolean var8 = !this.l6.tryGetValue(var5, var7);
                  var6 = var7[0];
                  if (var8) {
                     var6 = new e1r(this.y4, var5);
                     this.n5().addItem(var6);
                     this.l6.set_Item(var5, var6);
                  }

                  var6.l6(var1);
               }
            } else {
               this.n5(var1, this);
            }
         }
      }
   }

   public final void n5(k3w var1) {
      p1 var2 = new p1(this.a6.toArray(new com.aspose.slides.internal.e1.z1[0]), var1, this.u3);
      this.n5().addItem(var2);
      this.a6.clear();
   }

   private com.aspose.slides.internal.h6.n5 u3(com.aspose.slides.internal.f4.l6 var1) {
      com.aspose.slides.internal.h6.n5 var2 = null;
      com.aspose.slides.internal.f4.l6 var3 = var1;

      com.aspose.slides.internal.h6.n5 var4;
      do {
         var4 = (com.aspose.slides.internal.h6.n5)var3.l6();
         var3 = var3.n5();
         if (m1j.a6(var4)
            && !m1j.u9(var4)
            && (!m1j.c8(var4) || !m1j.h0((com.aspose.slides.internal.h6.n5)var3.l6()))
            && !com.aspose.slides.internal.v6g.k5.l6(var4, com.aspose.slides.internal.w8.y1.class)) {
            var2 = var4;
            break;
         }
      } while (var3 != null && !m1j.k5(var4) && !m1j.l6(var4));

      return var2;
   }

   private void n5(com.aspose.slides.internal.h6.n5 var1) {
      this.n5(var1, 0);
   }

   private void n5(com.aspose.slides.internal.h6.n5 var1, int var2) {
      while (var1 != null) {
         if (m1j.l6(var1)) {
            var2 |= 4;
         } else if (m1j.u3(var1)) {
            var2 |= 1;
         } else if (m1j.a6(var1)) {
            var2 |= 2;
         }

         int var3 = 0;
         Integer[] var4 = new Integer[]{var3};
         boolean var5 = !this.k5.tryGetValue(var1, var4);
         var3 = var4[0];
         if (var5) {
            this.k5.set_Item(var1, var2);
         } else {
            this.k5.set_Item(var1, var2 | var3);
         }

         var1 = com.aspose.slides.internal.v6g.k5.n5(var1.y2(), com.aspose.slides.internal.h6.n5.class);
      }
   }

   private void n5(com.aspose.slides.internal.f5.l6 var1) {
      String var2 = null;
      if (var1.n5("background")) {
         var2 = var1.l6("background").k5();
      } else if (var1.n5("style")) {
         String var3 = var1.l6("style").k5();
         Dictionary var4 = n6h.n5(var3);
         String[] var5 = new String[]{var2};
         boolean var6 = !var4.tryGetValue("background", var5);
         var2 = var5[0];
         if (var6) {
            var5[0] = var2;
            var4.tryGetValue("background-color", var5);
            var2 = var5[0];
         }
      }

      if (var2 != null) {
         IBackground var7 = this.h0().getBackground();
         x3s.n5(var2, var7.getFillFormat().getSolidFillColor());
         if (var7.getFillFormat().getSolidFillColor().getColorType() != -1) {
            var7.getFillFormat().setFillType((byte)1);
            var7.setType((byte)1);
         }
      }
   }

   public static float n5(com.aspose.slides.internal.q0.e2 var0, float var1, float var2, float var3) {
      return n5(var0.n5(), var0.l6(), var1, var2, var3);
   }

   public static float n5(int var0, float var1, float var2, float var3, float var4) {
      switch (var0) {
         case 0:
         case 4:
         case 8:
            return var1 * 0.75F;
         case 1:
            return var1 * var2 / 100.0F;
         case 2:
            return var1 * var3;
         case 3:
            return var1 * var3;
         case 5:
            return var1 * 0.75F / 2.54F * 72.0F;
         case 6:
            return var1 * 0.75F / 25.4F * 72.0F;
         case 7:
            return var1 * 0.75F * 72.0F;
         case 9:
            return var1 * 0.75F * 12.0F;
         default:
            return 0.0F;
      }
   }

   public final List<i1t> n5() {
      return this.u9;
   }

   public final com.aspose.slides.internal.n2d.z1<com.aspose.slides.internal.h6.n5, Integer> l6() {
      return this.k5;
   }

   public final f7s k5() {
      return this.h0;
   }

   public final String u3() {
      return this.c8;
   }

   public final com.aspose.slides.internal.f4.k5 a6() {
      return this.t2;
   }

   public final Presentation u9() {
      return this.s7;
   }

   public final Slide h0() {
      return this.e2;
   }

   public final void n5(Slide var1) {
      this.e2 = var1;
   }

   public final int c8() {
      return this.t9;
   }

   public final void n5(int var1) {
      this.t9 = var1;
   }

   public final com.aspose.slides.internal.e1.w1 t2() {
      return this.z1;
   }

   public final com.aspose.slides.internal.n2d.z1<com.aspose.slides.internal.h6.n5, v4l> s7() {
      return this.n5;
   }

   public final com.aspose.slides.internal.n2d.z1<com.aspose.slides.internal.h6.n5, e1r> x8() {
      return this.l6;
   }

   public final boolean n3() {
      return this.a6.size() > 0;
   }
}
