package com.aspose.slides.internal.e1;

import com.aspose.slides.ms.System.q1;

public class k7 extends m3 implements Cloneable {
   private com.aspose.slides.internal.o9b.w1 n5;
   private com.aspose.slides.internal.o9b.f2 l6;
   private byte[] k5;
   private com.aspose.slides.internal.s5.c8 u3;
   private m1 a6;
   private com.aspose.slides.internal.s5.a6 u9;
   private int h0;
   private String c8;
   private e2 t2;

   public k7(com.aspose.slides.internal.o9b.w1 var1, com.aspose.slides.internal.o9b.f2 var2, byte[] var3) {
      this(var1.u3(), var2.a6(), var3, null);
   }

   public k7(
      com.aspose.slides.internal.o9b.w1 var1,
      com.aspose.slides.internal.o9b.f2 var2,
      byte[] var3,
      com.aspose.slides.internal.s5.c8 var4,
      com.aspose.slides.internal.s5.a6 var5
   ) {
      this(var1.u3(), var2.a6(), var3, var4);
      this.u9 = var5;
   }

   public k7(com.aspose.slides.internal.o9b.w1 var1, com.aspose.slides.internal.o9b.f2 var2, byte[] var3, com.aspose.slides.internal.s5.c8 var4) {
      this.n5 = com.aspose.slides.internal.o9b.w1.n5.u3();
      this.l6 = com.aspose.slides.internal.o9b.f2.n5.a6();
      this.u9 = null;
      this.h0 = 2;
      var1.n5(this.n5);
      var2.l6(this.l6);
      this.u3 = var4;
      this.k5 = var3;
   }

   public final void n5(String var1, String var2, byte[] var3) {
      this.t2 = new e2(var1, var2, var3);
   }

   public static k7 n5(k7 var0) {
      k7 var1 = var0.e2();
      var1.n5(com.aspose.slides.internal.s5.s7.l6());
      var1.n5((com.aspose.slides.internal.s5.c8)null);
      return var1;
   }

   private k7 e2() {
      return (k7)this.y4();
   }

   public final k7 n5(y4 var1, com.aspose.slides.internal.g0.l6 var2, boolean var3, boolean var4) {
      switch (this.u9()) {
         case 0:
         case 4:
         case 5:
         case 6:
         case 7:
         case 8:
            return this;
         case 1:
         case 2:
            return this.n5(var4, var2, var3, var1);
         case 3:
         default:
            return n5(this);
      }
   }

   private k7 n5(boolean var1, com.aspose.slides.internal.g0.l6 var2, boolean var3, y4 var4) {
      if (var1) {
         return this.t9();
      }

      com.aspose.slides.internal.g0.k5 var5 = new com.aspose.slides.internal.g0.k5();

      t2 var8;
      try {
         t2 var6 = null;
         t2[] var7 = new t2[]{var6};
         var8 = var2.n5(this, var5, var7);
         var6 = var7[0];
         if (var3) {
            n5(var6);
         }
      } catch (RuntimeException var9) {
         return null;
      }

      if (var5.n5()) {
         return this.t9();
      }

      var4.l6((m3)var8);
      return null;
   }

   private k7 t9() {
      try {
         k7 var1 = this.e2();
         var1.n5(com.aspose.slides.internal.s5.s7.l6(this.u3(), var1.k5().y4(), 4.0F));
         return var1;
      } catch (RuntimeException var2) {
         return null;
      }
   }

   private static void n5(t2 var0) {
      float var1 = l6(var0);
      if (!(var1 >= 1.0F)) {
         d2 var2 = new d2();
         var2.n5(true);
         var2.n5(var0, var1);
         if (var0.u3() == null) {
            var0.n5(new com.aspose.slides.internal.w0.c8());
         }

         var0.u3().n5(1.0F / var1, 1.0F / var1, 0);
      }
   }

   private static float l6(t2 var0) {
      d5 var1 = new d5();
      var1.n5((m3)var0);
      if (!var1.k5()) {
         return 1.0F;
      }

      float var2 = q1.n5(q1.n5(var1.n5()), q1.n5(var1.l6()));
      return var2 < 32767.0F ? 1.0F : 32766.0F / var2;
   }

   public final com.aspose.slides.internal.o9b.w1 n5() {
      return this.n5;
   }

   public final void n5(com.aspose.slides.internal.o9b.w1 var1) {
      var1.n5(this.n5);
   }

   public final com.aspose.slides.internal.o9b.f2 l6() {
      return this.l6;
   }

   public final void n5(com.aspose.slides.internal.o9b.f2 var1) {
      var1.l6(this.l6);
   }

   public final com.aspose.slides.internal.o9b.y1 k5() {
      return new com.aspose.slides.internal.o9b.y1(this.n5.u3(), this.l6.a6());
   }

   public final byte[] u3() {
      return this.k5;
   }

   public final void n5(byte[] var1) {
      this.k5 = var1;
   }

   public final e2 a6() {
      return this.t2;
   }

   public final int u9() {
      return com.aspose.slides.internal.k4d.a6.l6(this.k5);
   }

   public final com.aspose.slides.internal.s5.c8 h0() {
      return this.u3;
   }

   public final void n5(com.aspose.slides.internal.s5.c8 var1) {
      this.u3 = var1;
   }

   public final m1 c8() {
      return this.a6;
   }

   public final void n5(m1 var1) {
      this.a6 = var1;
   }

   public final com.aspose.slides.internal.s5.a6 t2() {
      return this.u9;
   }

   public final int s7() {
      return this.h0;
   }

   public final void n5(int var1) {
      this.h0 = var1;
   }

   public final String x8() {
      return this.c8;
   }

   public final void n5(String var1) {
      this.c8 = var1;
   }

   public void n3() {
      this.n5 = null;
      this.l6 = null;
      this.k5 = null;
      this.u3 = null;
      this.a6 = null;
      this.u9 = null;
      this.c8 = null;
      this.t2 = null;
   }

   protected Object y4() {
      try {
         return this.clone();
      } catch (CloneNotSupportedException var2) {
         throw new IllegalStateException(var2);
      }
   }
}
