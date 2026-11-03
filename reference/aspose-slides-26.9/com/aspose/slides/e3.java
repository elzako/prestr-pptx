package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.Stack;
import com.aspose.slides.ms.System.IDisposable;

abstract class e3 implements IDisposable {
   private Shape c8;
   private boolean t2;
   private com.aspose.slides.internal.o9b.w1 s7 = new com.aspose.slides.internal.o9b.w1();
   private com.aspose.slides.internal.w0.c8 x8;
   private s5u n3;
   protected com.aspose.slides.internal.o9b.l6 n5;
   protected com.aspose.slides.internal.o9b.z1 l6;
   protected boolean k5;
   protected final boolean u3;
   protected final com.aspose.slides.internal.o9b.e5 a6;
   protected final Stack<com.aspose.slides.internal.w0.c8> u9 = new Stack<>(3);
   protected com.aspose.slides.internal.x4g.m1 h0;
   private boolean y4;

   protected e3(com.aspose.slides.internal.o9b.l6 var1) {
      this(var1, false);
   }

   protected e3(com.aspose.slides.internal.o9b.l6 var1, boolean var2) {
      this.s7 = new com.aspose.slides.internal.o9b.w1(0.0F, 0.0F);
      this.a6 = new com.aspose.slides.internal.o9b.e5(com.aspose.slides.internal.o9b.e5.t2());
      this.a6.k5(this.a6.k5() | 2048);
      if (var1 != null) {
         this.n5 = var1;
         this.k5 = var2;
      } else {
         this.n5 = new com.aspose.slides.internal.o9b.l6(32, 32);
         this.k5 = true;
      }

      this.n5.n5(96.0F, 96.0F);
      this.l6 = com.aspose.slides.internal.o9b.z1.n5(this.n5);
      this.u9.push(new com.aspose.slides.internal.w0.c8(1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F));
      this.x8 = new com.aspose.slides.internal.w0.c8(1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F);
      this.l6.k5(6);
      this.l6.l6(4);
      this.l6.u9(4);
      this.l6.c8(4);
      this.u3 = true;
   }

   public final s5u t4() {
      return this.n3;
   }

   public final void n5(s5u var1) {
      this.n3 = var1;
   }

   public final com.aspose.slides.internal.w0.c8 q0() {
      return this.x8 != null ? this.x8.k5() : null;
   }

   public final void l6(com.aspose.slides.internal.w0.c8 var1) {
      if (var1 == null) {
         var1 = new com.aspose.slides.internal.w0.c8();
      }

      this.x8 = var1;
      this.n5(var1);
   }

   public final void k5(com.aspose.slides.internal.w0.c8 var1) {
      this.n5(var1, true);
   }

   public final void n5(com.aspose.slides.internal.w0.c8 var1, boolean var2) {
      this.u9.push(this.x8);
      if (var2) {
         com.aspose.slides.internal.x4g.m1 var3 = com.aspose.slides.internal.n8e.n1.l6(var1);
         com.aspose.slides.internal.x4g.m1 var4 = com.aspose.slides.internal.n8e.n1.l6(this.x8);
         var4.l6(var3);
         this.l6(com.aspose.slides.internal.n8e.n1.n5(var4));
      } else {
         this.l6(var1);
      }
   }

   public final com.aspose.slides.internal.w0.c8 z3() {
      com.aspose.slides.internal.w0.c8 var1 = this.u9.pop();
      this.l6(var1);
      return var1;
   }

   protected abstract com.aspose.slides.internal.w0.c8 n3();

   protected abstract void n5(com.aspose.slides.internal.w0.c8 var1);

   public void n5(float var1, float var2, int var3) {
      com.aspose.slides.internal.w0.c8 var4 = this.q0();
      if (var4 != null) {
         var4.l6(var1, var2, var3);
      }

      this.l6(var4);
   }

   public void l6(float var1, float var2, int var3) {
      com.aspose.slides.internal.w0.c8 var4 = this.q0();
      if (var4 != null) {
         var4.n5(var1, var2, var3);
      }

      this.l6(var4);
   }

   public final void n5(float var1, float var2) {
      this.n5(var1, var2, 0);
   }

   public final void l6(float var1, float var2) {
      this.l6(var1, var2, 0);
   }

   protected void h0() {
      this.s7.n5(0.0F);
      this.s7.l6(0.0F);
   }

   public abstract float c8();

   public abstract float t2();

   public abstract int s7();

   public abstract int x8();

   final Shape m1() {
      return this.c8;
   }

   final void n5(Shape var1) {
      this.c8 = var1;
   }

   final boolean k7() {
      return this.t2;
   }

   final void n5(boolean var1) {
      this.t2 = var1;
   }

   public abstract void n5(com.aspose.slides.internal.x4g.s7 var1, l6v var2, a1v var3);

   public abstract void n5(com.aspose.slides.internal.o9b.t4 var1, int var2, int var3);

   public abstract void n5(com.aspose.slides.internal.o9b.t4 var1, int var2, int var3, int var4, int var5);

   public abstract void n5(com.aspose.slides.internal.o9b.t4 var1, float var2, float var3);

   public abstract void n5(com.aspose.slides.internal.o9b.t4 var1, float var2, float var3, float var4, float var5);

   public void n5(com.aspose.slides.internal.o9b.y1 var1, l6v var2, a1v var3) {
      com.aspose.slides.internal.x4g.s7 var4 = new com.aspose.slides.internal.x4g.s7();

      try {
         var4.l6(var1.y4());
         this.n5(var4, var2, var3);
      } finally {
         if (var4 != null) {
            var4.dispose();
         }
      }
   }

   public void n5(com.aspose.slides.internal.o9b.y2 var1, l6v var2, a1v var3) {
      com.aspose.slides.internal.x4g.s7 var4 = new com.aspose.slides.internal.x4g.s7();

      try {
         var4.l6(var1.n3());
         this.n5(var4, var2, var3);
      } finally {
         if (var4 != null) {
            var4.dispose();
         }
      }
   }

   public void l6(com.aspose.slides.internal.o9b.y1 var1, l6v var2, a1v var3) {
      com.aspose.slides.internal.x4g.s7 var4 = new com.aspose.slides.internal.x4g.s7();

      try {
         var4.n5(var1.y4());
         this.n5(var4, var2, var3);
      } finally {
         if (var4 != null) {
            var4.dispose();
         }
      }
   }

   public void n5(l6v var1, com.aspose.slides.internal.o9b.w1... var2) {
      com.aspose.slides.internal.x4g.s7 var3 = new com.aspose.slides.internal.x4g.s7();

      try {
         var3.l6(var2);
         this.n5(var3, var1, (a1v)null);
      } finally {
         if (var3 != null) {
            var3.dispose();
         }
      }
   }

   public final com.aspose.slides.internal.o9b.f2 n5(String var1, TextParam var2) {
      e4z var3 = var2.d2();
      return this.n5(var1, var3, var2, Integer.MIN_VALUE);
   }

   public final com.aspose.slides.internal.o9b.f2 n5(String var1, e4z var2, TextParam var3, int var4) {
      var1 = var2.n5(var1);
      com.aspose.slides.internal.l7h.a5 var5 = new com.aspose.slides.internal.l7h.a5();

      for (int var6 = 0; var6 < var1.length(); var6++) {
         char var7 = var1.charAt(var6);
         if (var7 != 8237 && var7 != 8236 && var7 != 8238 && !com.aspose.slides.internal.n2d.u9.k5((int)var7)) {
            var5.n5(var7);
         }
      }

      var1 = var5.toString();
      com.aspose.slides.internal.o9b.f2 var26 = new com.aspose.slides.internal.o9b.f2(0.0F, 0.0F);
      if (var1.length() > 0) {
         boolean var27 = false;
         boolean var8 = false;
         float var9 = var2.n5().t2() * 4.0F / 3.0F;
         var26.l6(var2.l6().x8());
         if (var3.e2() == 1 && com.aspose.slides.ms.System.t9.c8(var1.charAt(0))) {
            var9 = var2.n5().t2() * var2.a6() * 4.0F / 3.0F;
            var1 = com.aspose.slides.ms.System.d1.t2(var1);
            var27 = true;
         }

         for (int var10 = 0; var10 < var1.length(); var10++) {
            int var11 = var1.charAt(var10);
            if (com.aspose.slides.internal.n2d.u9.m1(var1.charAt(var10)) && var1.length() > 1) {
               var11 = com.aspose.slides.ms.System.t9.n5(var1.charAt(var10), var1.charAt(var10 + 1));
               var10++;
               if (var1.length() > 2 && com.aspose.slides.internal.n2d.u9.n5(var11)) {
                  com.aspose.slides.internal.i0e.l6 var12 = new com.aspose.slides.internal.i0e.l6(this.l6, this.a6);

                  try {
                     synchronized (com.aspose.slides.internal.n8e.d2.n5()) {
                        for (int var14 = 0; var14 < 3; var14++) {
                           try {
                              var26.n5(var12.n5(var1, var2.n5()).l6());
                              var10 = var1.length();
                              break;
                           } catch (RuntimeException var21) {
                              if (var14 == 2) {
                                 com.aspose.slides.internal.n8e.v4.n5(var21);
                              }
                           }
                        }
                     }
                  } finally {
                     if (var12 != null) {
                        var12.dispose();
                     }
                  }

                  if (var10 == var1.length()) {
                     break;
                  }
               }
            }

            float var30 = var2.l6().n5().n5(var11, var9);
            if (var30 == 0.0F) {
               var8 = true;
            }

            if (!var3.n5()) {
               if (var3.m1() == -128 && !com.aspose.slides.internal.n2d.u9.h0((char)var11) && com.aspose.slides.ms.System.t9.h0((char)var11)) {
                  var30 += var30 * 0.002F;
               }

               if (com.aspose.slides.internal.n2d.u9.k7((char)var11) && var3.a6 != null && var3.a6.getSpacing() == 0.0F) {
                  var30 += var30 * 1.0E-4F;
               }
            }

            if (!(var9 >= 45.0F) && (var1.length() <= 1 || !com.aspose.slides.ms.System.d1.t2(var1, " ") || !(var9 < 9.3))) {
               var26.n5(var26.l6() + (float)com.aspose.slides.ms.System.q1.u3(var30 * 8.0F) / 8.0F);
            } else {
               var26.n5(var26.l6() + var30);
            }

            if (var3.l6() == 4 && com.aspose.slides.internal.n2d.u9.n5(var11)) {
               var26.n5(var26.l6() * 1.1F);
            }
         }

         if (n5(var3, var9, var2.l6().n5(), var1, var4)) {
            var26.n5(var26.l6() + (float)this.n5(var2.l6().n5(), var9, var1, var4));
         }

         if (var8) {
            var2.l6().n5().o0();
         }

         if (var27) {
            var1 = com.aspose.slides.ms.System.d1.u9(var1);
         }

         if (com.aspose.slides.ms.System.q1.n5(var3.q0()) > 0.005 || !com.aspose.slides.ms.System.n1.k5(var3.c4())) {
            int var28 = 0;

            for (int var29 = 0; var29 < var1.length(); var29++) {
               if (!com.aspose.slides.internal.n2d.u9.n3(var1.charAt(var29))) {
                  var28++;
               }
            }

            if (!com.aspose.slides.ms.System.n1.k5(var3.c4())) {
               var26.n5(var3.c4() * var28);
            }

            var26.n5(var26.l6() + var28 * var3.q0());
         }
      }

      return var26;
   }

   private static boolean n5(TextParam var0, float var1, com.aspose.slides.internal.e1x.i1 var2, String var3, int var4) {
      if (!var3.isEmpty() && (var3.length() != 1 || var4 != Integer.MIN_VALUE) && var0.v0()) {
         var2.b3();
         boolean var5 = com.aspose.slides.internal.n2d.u9.u3((int)var3.charAt(0)) == 2;
         c9g var6 = var0.a6;
         boolean var7 = var6 != null && var1 >= var6.getKerningMinimalSize() && !var5 && var6.getKerningMinimalSize() > 0.0F;
         if (var0.e2() == 1 && com.aspose.slides.ms.System.t9.c8(var3.charAt(0))) {
            return false;
         } else if (!com.aspose.slides.ms.System.d1.t2(var3, " ") || var2.p8() && var0.q0() == 0.0F) {
            return var7 && var2.d5() != null ? true : var7;
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   final double n5(com.aspose.slides.internal.e1x.i1 var1, double var2, String var4, int var5) {
      double var6 = 0.0;
      if (var1 != null && var1.d5() != null) {
         int var8 = var5 < 0 ? Integer.MIN_VALUE : var1.h0().l6(var5).l6();

         for (int var9 = 0; var9 < var4.length(); var9++) {
            int var10 = var4.charAt(var9);
            if (com.aspose.slides.internal.n2d.u9.m1(var4.charAt(var9))) {
               var10 = com.aspose.slides.ms.System.t9.n5(var4.charAt(var9), var4.charAt(var9 + 1));
               var9++;
            }

            int var11 = var1.h0().l6(var10).l6();
            if (var8 != Integer.MIN_VALUE) {
               var6 += var1.n5(var8 & 4294967295L, var11 & 4294967295L) / var1.t2() * var2;
            }

            var8 = var11;
         }
      }

      return var6;
   }

   public abstract void n5(String var1, com.aspose.slides.internal.o9b.y1 var2, TextParam var3);

   void n5(String var1, com.aspose.slides.internal.o9b.y1 var2, TextParam var3, e4z var4) {
   }

   protected final void l6(String var1, com.aspose.slides.internal.o9b.y1 var2, TextParam var3) {
      e4z var4 = var3.d2();
      TextParam var5;
      if (!com.aspose.slides.ms.System.n1.k5(var4.a6())) {
         var5 = var3.l6(var3.t4() * var4.a6());
      } else {
         var5 = var3.r4();
      }

      e4z var6 = var5.d2();
      com.aspose.slides.internal.l7h.a5 var7 = new com.aspose.slides.internal.l7h.a5(var1.length());
      boolean var8 = n5(var1, 0);
      int var9 = 0;

      while (var9 < var1.length()) {
         do {
            var7.n5(var1.charAt(var9++));
         } while (var9 < var1.length() && var8 == n5(var1, var9));

         String var10;
         TextParam var11;
         e4z var12;
         if (var8) {
            var10 = com.aspose.slides.ms.System.d1.s7(var7.toString());
            var11 = var5;
            var12 = var6;
         } else {
            var10 = var7.toString();
            var11 = var3;
            var12 = var4;
         }

         this.n5(var10, var2.y4(), var11, var12);
         if (var9 < var1.length()) {
            com.aspose.slides.internal.o9b.f2 var13 = this.n5(var10, var12, var11, Integer.MIN_VALUE).a6();
            var2.k5(var13.l6(), 0.0F);
            var8 = n5(var1, var9);
            var7.l6(0, var7.l6());
         }
      }
   }

   public void n5(IHyperlink var1) {
   }

   public void u3() {
   }

   public void l6(IHyperlink var1) {
   }

   public void a6() {
   }

   public void m3() {
   }

   public void z8() {
   }

   public void j5() {
   }

   public void w1() {
   }

   public boolean n5(String var1) {
      return false;
   }

   public boolean n5(String var1, Object var2) {
      return false;
   }

   public boolean n5(String var1, Object var2, String var3) {
      return false;
   }

   public void u9() {
   }

   public abstract void n5(IPPImage var1, com.aspose.slides.internal.o9b.y1 var2, com.aspose.slides.internal.o9b.y1 var3, a6l var4);

   public void n5(IPPImage var1, com.aspose.slides.internal.o9b.y1 var2, a6l var3) {
      this.n5(var1, var2.y4(), com.aspose.slides.internal.o9b.y1.n5(((PPImage)var1).k5()).y4(), var3);
   }

   @Override
   public final void dispose() {
      this.c4();
      this.k5(true);
   }

   protected static com.aspose.slides.internal.x4g.s7 n5(
      com.aspose.slides.internal.x4g.s7 var0, l6v var1, com.aspose.slides.internal.x4g.s7[] var2, com.aspose.slides.internal.x4g.s7[] var3
   ) {
      com.aspose.slides.internal.x4g.s7 var4 = new com.aspose.slides.internal.x4g.s7(var0.a6(), var0.u9());
      var4.y4();
      List var5 = new List<>(com.aspose.slides.ms.System.u3.n5(var4.a6()));
      var2[0] = n5(var5, var1);
      var3[0] = l6(var5, var1);
      var4.t2();
      var4.l6((com.aspose.slides.internal.o9b.w1[])var5.toArray(new com.aspose.slides.internal.o9b.w1[0]));
      return var4;
   }

   private static com.aspose.slides.internal.x4g.s7 n5(List<com.aspose.slides.internal.o9b.w1> var0, l6v var1) {
      if (var1.s7() != 0) {
         float var2 = 0.0F;
         float[] var3 = new float[]{0.0F};
         com.aspose.slides.internal.x4g.s7 var4 = l6v.n5(var1.s7(), var1.n3(), var1.e2(), var3);
         var2 = var3[0];
         return n5(var0, var4, var1.n5(), var1.s7());
      } else {
         return null;
      }
   }

   private static com.aspose.slides.internal.x4g.s7 l6(List<com.aspose.slides.internal.o9b.w1> var0, l6v var1) {
      com.aspose.slides.internal.x4g.s7 var2 = null;
      if (var1.x8() != 0) {
         float var3 = 0.0F;
         float[] var4 = new float[]{0.0F};
         com.aspose.slides.internal.x4g.s7 var5 = l6v.n5(var1.x8(), var1.y4(), var1.t9(), var4);
         var3 = var4[0];
         var0.reverse();
         var2 = n5(var0, var5, var1.n5(), var1.x8());
         var0.reverse();
      }

      return var2;
   }

   static com.aspose.slides.internal.x4g.s7 n5(List<com.aspose.slides.internal.o9b.w1> var0, com.aspose.slides.internal.x4g.s7 var1, double var2, byte var4) {
      if (var1 == null) {
         return null;
      }

      com.aspose.slides.internal.o9b.w1 var5 = ((com.aspose.slides.internal.o9b.w1)var0.get_Item(0)).u3();
      float var6 = (float)(var2 < 2.0 ? 2.0 : var2);
      float var7 = var1.s7().k5();
      double var8 = var7 * var6 - var7 / 2.0F;
      double var10 = com.aspose.slides.ms.System.q1.z3(
         com.aspose.slides.ms.System.q1.a6(com.aspose.slides.ms.System.q1.n5(((com.aspose.slides.internal.o9b.w1)var0.get_Item(1)).l6() - var5.l6()), 2.0)
            + com.aspose.slides.ms.System.q1.a6(com.aspose.slides.ms.System.q1.n5(((com.aspose.slides.internal.o9b.w1)var0.get_Item(1)).k5() - var5.k5()), 2.0)
      );
      if (var10 < var8 && var0.size() > 3) {
         var0.removeAt(0);

         while (var10 < var8 && var0.size() > 2) {
            var0.removeAt(0);
            var10 = com.aspose.slides.ms.System.q1.z3(
               com.aspose.slides.ms.System.q1.a6(com.aspose.slides.ms.System.q1.n5(((com.aspose.slides.internal.o9b.w1)var0.get_Item(0)).l6() - var5.l6()), 2.0)
                  + com.aspose.slides.ms.System.q1.a6(
                     com.aspose.slides.ms.System.q1.n5(((com.aspose.slides.internal.o9b.w1)var0.get_Item(0)).k5() - var5.k5()), 2.0
                  )
            );
         }

         var0.insertItem(0, var5.u3());
      }

      double var12 = com.aspose.slides.ms.System.q1.u3(
         ((com.aspose.slides.internal.o9b.w1)var0.get_Item(1)).k5() - var5.k5(), ((com.aspose.slides.internal.o9b.w1)var0.get_Item(1)).l6() - var5.l6()
      );
      com.aspose.slides.internal.o9b.w1 var14 = ((com.aspose.slides.internal.o9b.w1)var0.get_Item(0)).u3();
      if (var4 == 1) {
         var14.n5(var14.l6() + (float)(var8 * com.aspose.slides.ms.System.q1.c8(var12)));
         var14.l6(var14.k5() + (float)(var8 * com.aspose.slides.ms.System.q1.h0(var12)));
      } else {
         var14.n5(var14.l6() + (float)(var6 * com.aspose.slides.ms.System.q1.c8(var12)));
         var14.l6(var14.k5() + (float)(var6 * com.aspose.slides.ms.System.q1.h0(var12)));
      }

      var0.removeAt(0);
      var0.insertItem(0, var14.u3());
      com.aspose.slides.internal.x4g.m1 var15 = new com.aspose.slides.internal.x4g.m1(var6, 0.0F, 0.0F, var6, var5.l6(), var5.k5());
      var15.n5(90.0F);
      var15.n5((float)(var12 * 180.0 / Math.PI));
      var1.l6(var15);
      return var1;
   }

   final com.aspose.slides.internal.o9b.w1 r4() {
      if (com.aspose.slides.ms.System.q1.n5(this.s7.l6()) + com.aspose.slides.ms.System.q1.n5(this.s7.k5()) < 1.0E-5) {
         com.aspose.slides.internal.w0.c8 var1 = this.n3().k5();
         var1 = com.aspose.slides.internal.n8e.n1.n5(var1);
         com.aspose.slides.internal.o9b.w1[] var2 = new com.aspose.slides.internal.o9b.w1[]{new com.aspose.slides.internal.o9b.w1(1.0F, 1.0F)};
         com.aspose.slides.internal.n8e.n1.n5(var1, var2);
         double var3 = com.aspose.slides.ms.System.q1.z3(var2[0].l6() * var2[0].l6() + var2[0].k5() * var2[0].k5());
         this.s7 = new com.aspose.slides.internal.o9b.w1((float)(var2[0].l6() / var3), (float)(var2[0].k5() / var3));
      }

      return this.s7;
   }

   final void c4() {
      if (!this.u3 && this.h0 != null) {
         this.l6.l6(this.h0);
      }
   }

   final boolean y2() {
      return this.l6.t4() == 4;
   }

   final void l6(boolean var1) {
      this.l6.u9(var1 ? 4 : 3);
   }

   protected final boolean n5(com.aspose.slides.internal.x4g.s7 var1) {
      boolean var2 = false;
      if (var1.h0() != 0) {
         byte var3 = -128;

         for (byte var7 : var1.u9()) {
            if ((var7 & 255 & var3 & 255) != 0) {
               var2 = true;
               break;
            }
         }
      }

      return var2;
   }

   protected final boolean n5(com.aspose.slides.internal.x4g.s7 var1, l6v var2, q3d var3) {
      return this.n5(var1, var2, var3, false);
   }

   protected final boolean n5(com.aspose.slides.internal.x4g.s7 var1, l6v var2, q3d var3, boolean var4) {
      return var3.h0() != null && var1.h0() == 4 && (var3.h0().h0 == 5 || var3.h0().h0 == -1)
         ? var2 == null && var3.z1() == 1 && (var4 || var3.q0().x8() >= 0.0F && var3.q0().n3() >= 0.0F) && !var3.j5()
         : false;
   }

   protected final boolean n5(Picture var1) {
      return this.n5(var1, false);
   }

   protected final boolean n5(Picture var1, boolean var2) {
      if (var1 == null || var1.getImage() == null || ((PPImage)var1.getImage()).k5().k5()) {
         return false;
      }

      if (!var2 && !k8s.n5(var1.getImageTransform())) {
         return false;
      }

      byte[] var3 = ((PPImage)var1.getImage()).h0();
      return var3 == null
         ? false
         : com.aspose.slides.internal.n8e.k7.u3(var3)
            || com.aspose.slides.internal.n8e.k7.a6(var3)
            || com.aspose.slides.internal.n8e.k7.c8(var3)
            || com.aspose.slides.internal.n8e.k7.k5(var3)
            || com.aspose.slides.internal.n8e.k7.l6(var3)
            || com.aspose.slides.internal.v6g.k5.l6(this, q4b.class) && com.aspose.slides.internal.n8e.k7.u9(var3);
   }

   protected static com.aspose.slides.internal.o9b.p8 l6(com.aspose.slides.internal.o9b.y1 var0) {
      int var1 = com.aspose.slides.internal.v6g.k5.u3(
         com.aspose.slides.ms.System.q1.n5(com.aspose.slides.ms.System.q1.n5(var0.s7() + var0.x8(), 1, (short)1), (short)1), 14
      );
      int var2 = com.aspose.slides.internal.v6g.k5.u3(
         com.aspose.slides.ms.System.q1.n5(com.aspose.slides.ms.System.q1.n5(var0.k5() + var0.n3(), 1, (short)1), (short)1), 14
      );
      return new com.aspose.slides.internal.o9b.p8(var1, var2);
   }

   protected static boolean n5(q3d var0, com.aspose.slides.internal.o9b.p8 var1, com.aspose.slides.internal.o9b.u6 var2, com.aspose.slides.internal.o9b.y1 var3) {
      if (var1.l6() >= var2.s7().l6() && var1.k5() >= var2.s7().k5()) {
         return false;
      }

      com.aspose.slides.internal.o9b.t4 var4 = var0.y1();
      return com.aspose.slides.internal.n8e.k7.h0(var0.c4().a6()) && var0.d5() == 5
         ? true
         : !com.aspose.slides.internal.n8e.v4.n5(var4.e2(), var3.s7()) || !com.aspose.slides.internal.n8e.v4.n5(var4.h0(), var3.k5());
   }

   protected static com.aspose.slides.internal.o9b.p8 n5(com.aspose.slides.internal.o9b.p8 var0, com.aspose.slides.internal.o9b.u6 var1, float[] var2) {
      float var3 = 2.35F;
      var2[0] = 2.35F;
      if (!(var0.l6() * 2.35F >= var1.h0().e2()) && !(var0.k5() * 2.35F >= var1.h0().h0())) {
         return new com.aspose.slides.internal.o9b.p8(
            com.aspose.slides.internal.v6g.k5.u3(var0.l6() * var2[0], 13), com.aspose.slides.internal.v6g.k5.u3(var0.k5() * var2[0], 13)
         );
      }

      var2[0] = 1.0F;
      return var1.h0().n3();
   }

   protected static float n5(e4z var0, com.aspose.slides.internal.o9b.z1 var1) {
      com.aspose.slides.internal.o9b.y4 var2 = var0.n5().l6();
      return var0.n5().n5(var1) * var2.k5(var0.k5()) / var2.h0(var0.k5());
   }

   static com.aspose.slides.internal.o9b.c8 n5(com.aspose.slides.internal.o9b.c8 var0) {
      return n5(var0, 157);
   }

   static com.aspose.slides.internal.o9b.c8 n5(com.aspose.slides.internal.o9b.c8 var0, int var1) {
      double var2 = (var0.s7() & 0xFF) / 255.0;
      var2 = var2 * (255.0 - var1) / 255.0;
      return com.aspose.slides.internal.o9b.c8.n5(com.aspose.slides.internal.v6g.k5.u3(var2 * 255.0, 14), var0.x8() & 255, var0.n3() & 255, var0.y4() & 255);
   }

   static boolean n5(String var0, int var1) {
      char var2 = var0.charAt(var1);
      return com.aspose.slides.ms.System.t9.u9(var2) && com.aspose.slides.ms.System.t9.c8(var2);
   }

   public final com.aspose.slides.internal.o9b.l6 y1() {
      return this.n5;
   }

   public final com.aspose.slides.internal.o9b.z1 a0() {
      return this.l6;
   }

   protected void k5(boolean var1) {
      if (!this.y4) {
         if (var1) {
            if (this.u3) {
               this.l6.dispose();
               this.l6 = null;
            }

            if (this.k5) {
               this.n5.dispose();
               this.n5 = null;
               this.x8 = null;
               this.n3 = null;
               this.s7 = null;
               if (this.h0 != null) {
                  this.h0.dispose();
                  this.h0 = null;
               }

               if (this.a6 != null) {
                  this.a6.dispose();
               }

               if (this.u9 != null) {
                  this.u9.clear();
               }
            }
         }

         this.y4 = true;
      }
   }

   abstract com.aspose.slides.internal.o9b.y1 t9();

   abstract void n5(com.aspose.slides.internal.o9b.y1 var1);
}
