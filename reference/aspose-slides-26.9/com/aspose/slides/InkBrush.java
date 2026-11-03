package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;
import java.awt.Color;
import java.awt.geom.Dimension2D;

public class InkBrush implements IInkBrush {
   private String n5;
   private String l6;
   private List<t7j> k5;
   private List<r3w> u3;
   private z1k a6;
   private z1k u9;
   private com.aspose.slides.internal.o9b.c8 h0 = new com.aspose.slides.internal.o9b.c8();
   private int c8;
   private int t2;
   private int s7;
   private boolean x8;
   private boolean n3;
   private boolean y4;
   private List<n0p> e2;
   private static final com.aspose.slides.internal.v6g.u9 t9 = new com.aspose.slides.internal.v6g.u9(
      "bronze", "galaxy", "gold", "lava", "ocean", "rainbowglitter", "rosegold", "silver"
   );

   @Override
   public final Color getColor() {
      return com.aspose.slides.internal.o9b.c8.l6(this.n5());
   }

   com.aspose.slides.internal.o9b.c8 n5() {
      return com.aspose.slides.internal.o9b.c8.n5(this.c8, this.h0.o8());
   }

   @Override
   public final void setColor(Color value) {
      this.n5(com.aspose.slides.internal.o9b.c8.n5(value));
   }

   void n5(com.aspose.slides.internal.o9b.c8 var1) {
      var1.n5(this.h0);
   }

   @Override
   public final Dimension2D getSize() {
      return com.aspose.slides.internal.o9b.f2.n5(this.l6());
   }

   com.aspose.slides.internal.o9b.f2 l6() {
      return new com.aspose.slides.internal.o9b.f2((float)y9k.n5(this.x8().n5(), this.x8().l6()), (float)y9k.n5(this.n3().n5(), this.n3().l6()));
   }

   @Override
   public final void setSize(Dimension2D value) {
      this.n5(com.aspose.slides.internal.o9b.f2.n5(value));
   }

   void n5(com.aspose.slides.internal.o9b.f2 var1) {
      this.x8().n5(y9k.l6(var1.l6(), this.x8().l6()));
      this.n3().n5(y9k.l6(var1.k5(), this.x8().l6()));
   }

   final com.aspose.slides.internal.o9b.f2 k5() {
      double var1 = 0.0;
      double var3 = 0.0;
      n0p var5 = this.k5("anchorX");
      if (var5 != null) {
         var1 = com.aspose.slides.ms.System.d2.n5(var5.l6(), com.aspose.slides.internal.x7n.l6.k5());
      }

      var5 = this.k5("anchorY");
      if (var5 != null) {
         var3 = com.aspose.slides.ms.System.d2.n5(var5.l6(), com.aspose.slides.internal.x7n.l6.k5());
      }

      return new com.aspose.slides.internal.o9b.f2((float)var1, (float)var3);
   }

   final float u3() {
      double var1 = 100.0;
      n0p var3 = this.k5("scaleFactor");
      if (var3 != null) {
         var1 = com.aspose.slides.ms.System.d2.n5(var3.l6(), com.aspose.slides.internal.x7n.l6.k5()) * 100.0;
      }

      return (float)var1;
   }

   @Override
   public final int getInkEffect() {
      n0p var1 = this.k5("inkEffects");
      if (var1 == null) {
         return -1;
      }

      switch (t9.n5(var1.l6())) {
         case 0:
            return 0;
         case 1:
            return 1;
         case 2:
            return 2;
         case 3:
            return 3;
         case 4:
            return 4;
         case 5:
            return 5;
         case 6:
            return 6;
         case 7:
            return 7;
         default:
            return -1;
      }
   }

   final int a6() {
      return this.t2;
   }

   final void n5(int var1) {
      this.t2 = var1;
   }

   final int u9() {
      return this.s7;
   }

   final void l6(int var1) {
      this.s7 = var1;
   }

   final String h0() {
      return this.n5;
   }

   final void n5(String var1) {
      this.n5 = var1;
   }

   final String c8() {
      return this.l6;
   }

   final void l6(String var1) {
      this.l6 = var1;
   }

   private n0p k5(String var1) {
      List$Enumerator var2 = this.t4().iterator();

      try {
         while (var2.hasNext()) {
            n0p var3 = (n0p)var2.next();
            if (com.aspose.slides.ms.System.d1.a6(com.aspose.slides.ms.System.d1.u9(var3.n5()), com.aspose.slides.ms.System.d1.u9(var1))) {
               return var3;
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }

      return null;
   }

   final List<t7j> t2() {
      return this.k5;
   }

   final List<r3w> s7() {
      return this.u3;
   }

   final z1k x8() {
      return this.a6;
   }

   final void n5(z1k var1) {
      this.a6 = var1;
   }

   final z1k n3() {
      return this.u9;
   }

   final void l6(z1k var1) {
      this.u9 = var1;
   }

   final int y4() {
      return this.c8;
   }

   final void k5(int var1) {
      this.c8 = var1;
   }

   final boolean e2() {
      return this.x8;
   }

   final void n5(boolean var1) {
      this.x8 = var1;
   }

   final boolean t9() {
      return this.n3;
   }

   final void l6(boolean var1) {
      this.n3 = var1;
   }

   final boolean z1() {
      return this.y4;
   }

   final void k5(boolean var1) {
      this.y4 = var1;
   }

   final List<n0p> t4() {
      return this.e2;
   }

   InkBrush() {
      this.k5 = new List<>();
      this.u3 = new List<>();
      this.e2 = new List<>();
      this.t2 = 0;
      this.s7 = 1;
      this.c8 = 255;
   }
}
