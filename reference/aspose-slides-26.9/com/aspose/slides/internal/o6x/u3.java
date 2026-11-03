package com.aspose.slides.internal.o6x;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.o9b.e5;
import com.aspose.slides.internal.o9b.n3;
import com.aspose.slides.internal.o9b.z1;
import com.aspose.slides.internal.x4g.m1;
import com.aspose.slides.ms.System.n1;
import com.aspose.slides.ms.System.p8;
import java.awt.font.FontRenderContext;
import java.awt.font.TextMeasurer;
import java.awt.geom.AffineTransform;
import java.util.ArrayList;
import java.util.List;

public final class u3 {
   private static String u3;
   private static final AffineTransform a6 = AffineTransform.getRotateInstance(Math.PI / 2);
   private final boolean u9;
   private final float h0;
   private final float c8;
   private final boolean t2;
   private final e5 s7;
   private final FontRenderContext x8;
   private final String n3;
   protected final n3 n5;
   protected final n3 l6;
   protected final z1 k5;
   private k5 y4;
   private a6 e2;
   private TextMeasurer t9;
   private com.aspose.slides.internal.p5x.n5 z1;
   private final boolean t4 = false;
   private List<l6> q0 = new ArrayList<>();
   private int z3 = 0;
   private float m1;
   private float k7;
   private float m3;
   private float z8;

   public u3(z1 var1, String var2, n3 var3, n3 var4, FontRenderContext var5, e5 var6, float var7, float var8, boolean var9) {
      if (var3 == null) {
         throw new ArgumentNullException("Value of 'font' cannot be null");
      }

      this.u9 = var9;
      this.k5 = var1;
      this.n3 = var2 != null ? var2.replaceAll("\uffff", "\ufffe") : "";
      this.n5 = var3;
      this.l6 = var4;
      this.x8 = var5;
      this.t2 = var6 == null;
      this.s7 = var6 != null ? var6 : new e5();
      this.h0 = var7;
      this.c8 = var8;
      this.z1();
   }

   private void z1() {
      n3 var1 = this.m3();
      int var2 = var1.x8();
      this.m1 = com.aspose.slides.internal.f3l.k5.n5(var1, var2);
      this.k7 = com.aspose.slides.internal.f3l.k5.l6(var1, var2);
      this.m3 = com.aspose.slides.internal.f3l.k5.u3(var1, var2);
      this.z8 = com.aspose.slides.internal.f3l.k5.k5(var1, var2);
      if (this.n3.length() > 0) {
         this.j5();
      }

      this.y4 = this.z8();
      if (this.y4.u9) {
         this.e2 = this.s7.s7() ? new com.aspose.slides.internal.b1m.k5(this, this.y4) : new com.aspose.slides.internal.b1m.u3(this, this.y4);
      } else {
         this.e2 = this.s7.s7() ? new com.aspose.slides.internal.b1m.l6(this, this.y4) : new com.aspose.slides.internal.b1m.a6(this, this.y4);
      }

      Object var3 = null;

      while ((var3 = this.m1()) != null) {
         this.q0.add((l6)var3);
      }
   }

   public float n5() {
      return this.h0;
   }

   public float l6() {
      return this.c8;
   }

   public e5 k5() {
      return this.s7;
   }

   public int u3() {
      return this.y4.x8;
   }

   public int a6() {
      return this.y4.e2;
   }

   public float u9() {
      float var1 = 0.0F;

      for (l6 var3 : this.q0) {
         float var4 = var3.k5();
         if (var4 > var1) {
            var1 = var4;
         }
      }

      return var1 + this.k5(var1);
   }

   public float h0() {
      return this.s7.q0() ? this.q0() : this.z3();
   }

   private boolean t4() {
      return this.l6 != null && !this.n5.h0().equals(this.l6.h0());
   }

   private float q0() {
      if (this.y4.e2 == 1) {
         return !this.s7.x8() && !this.s7.t9() && !this.t4() && !this.y4.l6.h0().equals("Gulim") ? this.z8 - this.m3 : this.z8;
      } else {
         return this.y4.e2 * this.z8;
      }
   }

   private float z3() {
      float var1 = this.a6(this.z8);
      if (this.y4.e2 > 1) {
         var1 += (this.y4.e2 - 1) * this.z8 + this.m3;
      }

      return var1;
   }

   public float n5(int var1, int var2) {
      return this.z1.n5(var1, var2);
   }

   public int n5(int var1, float var2) {
      return this.z1.n5(var1, var2);
   }

   public l6 c8() {
      return this.z3 < this.q0.size() ? this.q0.get(this.z3++) : null;
   }

   private l6 m1() {
      if (this.y4 == null || this.y4.x8 >= this.y4.n5.length() || this.y4.u3 < 0.0F) {
         return null;
      }

      if (!this.k7()) {
         return null;
      }

      this.y4.s7 = this.y4.x8;
      this.e2.n5();
      if (this.y4.x8 <= this.y4.s7) {
         return null;
      }

      this.y4.y4 = this.y4.n5.substring(this.y4.s7, this.y4.x8);
      return this.n5(this.y4);
   }

   private l6 n5(k5 var1) {
      float var2 = this.z8 * var1.e2;
      if (var1.n3.isEmpty()) {
         return null;
      }

      l6 var3 = null;
      if (var1.n3.size() == 1) {
         var3 = this.n5(var1.n3.poll(), var2);
      } else {
         com.aspose.slides.internal.p9w.l6 var4 = new com.aspose.slides.internal.p9w.l6(this, var1.s7, var1.x8, this.y4.y4);

         for (k5$n5 var6 : var1.n3) {
            com.aspose.slides.internal.p9w.k5 var7 = this.n5(var6, var2);
            var4.n5(var7, var6.k5);
         }

         var1.n5();
         var3 = var4;
      }

      var1.e2++;
      return var3;
   }

   private com.aspose.slides.internal.p9w.k5 n5(k5$n5 var1, float var2) {
      String var3 = this.n3.substring(var1.n5, var1.l6);
      return new com.aspose.slides.internal.p9w.k5(
         this, new com.aspose.slides.internal.a9y.n5(this.z1, this.t9, var1.n5, var1.l6), this.z1, var1.k5, var2, var1.n5, var1.l6, var3
      );
   }

   private boolean k7() {
      return this.n5(false);
   }

   public boolean n5(boolean var1) {
      float var2 = this.y4();
      if (!(var2 <= 0.0F) && !(var2 >= 2.1474836E9F)) {
         boolean var3 = this.y4.k5.y4() && this.y4.k5.e2() && this.y4.k5.z1();
         int var4 = 0;
         if (var3) {
            var4++;
         }

         if (var1) {
            var4++;
         }

         try {
            this.y4.e2 += var4;
            float var5 = this.y4.e2 == 0 ? 0.0F : this.h0();
            return var3 ? var5 <= var2 : var5 < var2;
         } finally {
            this.y4.e2 -= var4;
         }
      } else {
         return true;
      }
   }

   public float t2() {
      return this.m1;
   }

   public float s7() {
      return this.k7;
   }

   public float x8() {
      return this.m3;
   }

   public float n3() {
      return this.z8;
   }

   private n3 m3() {
      return this.l6 != null ? this.l6 : this.n5;
   }

   private k5 z8() {
      k5 var1 = new k5();
      var1.n5 = this.n3;
      var1.l6 = this.n5;
      var1.k5 = this.s7;
      if (this.s7.x8()) {
         var1.a6 = this.h0;
         var1.u3 = this.c8;
      } else {
         var1.u3 = this.h0;
         var1.a6 = this.c8;
      }

      if (this.t2) {
         var1.h0 = 0.0F;
         var1.c8 = com.aspose.slides.internal.r5w.k5.l6(this.k5, this.n5);
      } else {
         float[] var2 = new float[]{0.0F};
         var1.c8 = this.s7.n5(var2);
         var1.h0 = var2[0];
      }

      var1.u9 = this.n3.contains("\t") && (var1.c8.length > 1 || var1.c8.length == 1 && var1.c8[0] != 0.0F);
      var1.t2 = u3;
      var1.s7 = 0;
      var1.x8 = 0;
      return var1;
   }

   private void j5() {
      n3 var1 = null;
      if (this.t4()) {
         var1 = this.l6;
      }

      n5 var2 = new n5(this.n3, this.n5, var1, this.x8);
      if (!this.u9) {
         this.t9 = var2.n5();
      }

      if (this.n5(this.n5, this.n3)) {
         this.z1 = new com.aspose.slides.internal.p5x.l6(var2.l6());
      } else {
         this.z1 = new com.aspose.slides.internal.p5x.k5(this.n3, this.n5, var1);
      }
   }

   private boolean n5(n3 var1, String var2) {
      if (this.l6 != null && this.l6.l6().l6(this.l6.x8()) == null) {
         return true;
      }

      if (var1.l6().l6(var1.x8()) == null) {
         return true;
      }

      boolean var3 = !com.aspose.slides.internal.f3l.k5.k5(var1, var2);
      if (var3) {
         if (var2.length() > 1) {
            return true;
         }

         if (com.aspose.slides.internal.t9p.k5.l4 || com.aspose.slides.internal.t9p.k5.i6) {
            return true;
         }
      }

      return false;
   }

   public float y4() {
      float var1 = this.s7.x8() ? this.n5() : this.l6();
      if (!this.s7.q0()) {
      }

      return var1;
   }

   public float n5(float var1) {
      return n5(this.k5, this.s7, this.n5);
   }

   public float l6(float var1) {
      return n5(this.k5, this.s7, this.n5) + this.u9(var1);
   }

   public float k5(float var1) {
      float var2 = this.u9(var1);
      return 2.0F * n5(this.k5, this.s7, this.n5) + var2;
   }

   public float u3(float var1) {
      float var2 = this.l6(true);
      float var3 = 2.0F * n5(this.k5, this.s7, this.n5);
      return (var1 - var3) / (1.0F + var2);
   }

   private float u9(float var1) {
      boolean var2 = this.y4.e2 > 1;
      float var3 = this.l6(var2);
      return var3 * var1;
   }

   private float l6(boolean var1) {
      if (this.s7.q0()) {
         return 0.0F;
      } else {
         return var1 ? 0.003F : 0.03F;
      }
   }

   private static float n5(z1 var0, e5 var1, n3 var2) {
      if (var1.q0()) {
         return 0.0F;
      }

      float var3 = 0.16666667F;
      float var4 = com.aspose.slides.internal.f3l.k5.n5(var2.c8(), var2.y4(), var0);
      return var4 * 0.16666667F;
   }

   public float a6(float var1) {
      if (this.k5().q0()) {
         return var1;
      }

      if (this.y4.e2 == 0) {
         return 1.11F * var1;
      }

      if (this.y4.e2 != 1 || !this.k5().x8() && !this.k5().t9()) {
         if (this.w1()) {
            return 1.11F * (var1 - this.m3);
         } else {
            return this.m3 == 0.0F ? 1.11F * var1 : 1.08F * var1;
         }
      } else {
         return 1.11F * var1;
      }
   }

   private boolean w1() {
      return this.m3().z1().deriveFont(0).getItalicAngle() != 0.0F;
   }

   public AffineTransform e2() {
      return this.k5().x8() ? a6 : com.aspose.slides.internal.x4g.m1.n5.t2();
   }

   public AffineTransform t9() {
      if (this.k5().l6() == 0) {
         return null;
      }

      float var1 = this.y4();
      if (n1.a6(var1)) {
         var1 = 0.0F;
      }

      float var2 = var1 - this.z3();
      if (var1 > 0.0F && var2 <= 0.0F) {
         return null;
      }

      if (this.k5().l6() == 1) {
         var2 /= 2.0F;
      } else if (this.k5().x8() && this.k5().t9()) {
         return null;
      }

      return this.k5().x8() ? AffineTransform.getTranslateInstance(var2, 0.0) : AffineTransform.getTranslateInstance(0.0, var2);
   }

   static {
      String var0 = p8.n5;
      if (var0 == null || var0.length() == 0 || var0.charAt(var0.length() - 1) == '\n') {
         var0 = "\n";
      }

      u3 = var0;
   }
}
