package com.aspose.slides.internal.o9n;

import com.aspose.slides.internal.o9b.y2;
import com.aspose.slides.internal.r1x.d2;
import com.aspose.slides.internal.r1x.o0;

public class a6 extends com.aspose.slides.internal.u2w.l6 {
   private final d2 u9;
   private long h0;
   private long[] c8;
   private long[] t2;
   private long[] s7;
   private int x8;
   private int n3;
   private int y4;
   private int e2;
   private int t9;
   private com.aspose.slides.internal.u2w.a6[] z1;

   public a6(com.aspose.slides.internal.f2i.n5 var1, int var2, int var3, d2 var4) {
      super(var1, var2, var3);
      this.u9 = var4;
   }

   public final com.aspose.slides.internal.u2w.a6[] x8() {
      return this.z1;
   }

   public final void n5(com.aspose.slides.internal.u2w.a6[] var1) {
      this.z1 = var1;

      for (int var2 = 0; var2 < this.z1.length; var2++) {
         switch (this.z1[var2].l6()) {
            case 256:
               int[] var9 = com.aspose.slides.internal.v6g.k5.n5(this.z1[var2].h0(), int[].class);
               if (var9 != null) {
                  this.y4 = var9[0] & 65535;
               }
               break;
            case 257:
               int[] var10 = com.aspose.slides.internal.v6g.k5.n5(this.z1[var2].h0(), int[].class);
               if (var10 != null) {
                  this.e2 = var10[0] & 65535;
               }
               break;
            case 278:
               int[] var11 = com.aspose.slides.internal.v6g.k5.n5(this.z1[var2].h0(), int[].class);
               if (var11 != null) {
                  this.t9 = var11[0] & 65535;
               }
               break;
            case 513:
               long[] var6 = com.aspose.slides.internal.v6g.k5.n5(this.z1[var2].h0(), long[].class);
               if (var6 != null) {
                  this.h0 = var6[0] & 4294967295L;
               }
               break;
            case 514:
               long[] var7 = com.aspose.slides.internal.v6g.k5.n5(this.z1[var2].h0(), long[].class);
               if (var7 != null) {
                  this.x8 = (int)var7[0];
               }
               break;
            case 515:
               long[] var8 = com.aspose.slides.internal.v6g.k5.n5(this.z1[var2].h0(), long[].class);
               if (var8 != null) {
                  this.n3 = (int)var8[0];
               }
               break;
            case 519:
               long[] var3 = com.aspose.slides.internal.v6g.k5.n5(this.z1[var2].h0(), long[].class);
               if (var3 != null) {
                  this.c8 = new long[var3.length];
                  com.aspose.slides.ms.System.u3.n5(var3, this.c8, this.c8.length);
               }
               break;
            case 520:
               long[] var4 = com.aspose.slides.internal.v6g.k5.n5(this.z1[var2].h0(), long[].class);
               if (var4 != null) {
                  this.t2 = new long[var4.length];
                  com.aspose.slides.ms.System.u3.n5(var4, this.t2, this.t2.length);
               }
               break;
            case 521:
               long[] var5 = com.aspose.slides.internal.v6g.k5.n5(this.z1[var2].h0(), long[].class);
               if (var5 != null) {
                  this.s7 = new long[var5.length];
                  com.aspose.slides.ms.System.u3.n5(var5, this.s7, this.s7.length);
               }
         }
      }
   }

   public final int n3() {
      return this.y4;
   }

   public final int y4() {
      return this.t9;
   }

   public final int e2() {
      return this.x8;
   }

   public final int t9() {
      return (int)this.h0;
   }

   public final int z1() {
      return this.n3;
   }

   @Override
   public void n5(com.aspose.slides.internal.v6s.u3 var1, y2 var2, com.aspose.slides.internal.b8u.x8 var3) {
      com.aspose.slides.internal.b8u.e2 var4;
      if (this.n5) {
         var4 = new a6$l6(var1, var3, this.h0, this);
      } else {
         var4 = new a6$n5(var1, var3, this.h0, this);
      }

      o0.n5(var2.n3(), var4);
   }

   // $VF: synthetic method
   static long[] n5(a6 var0) {
      return var0.u3;
   }

   // $VF: synthetic method
   static long[] l6(a6 var0) {
      return var0.a6;
   }

   // $VF: synthetic method
   static long[] k5(a6 var0) {
      return var0.u3;
   }

   // $VF: synthetic method
   static long[] u3(a6 var0) {
      return var0.a6;
   }

   // $VF: synthetic method
   static int a6(a6 var0) {
      return var0.x8;
   }

   // $VF: synthetic method
   static int u9(a6 var0) {
      return var0.l6;
   }

   // $VF: synthetic method
   static int h0(a6 var0) {
      return var0.k5;
   }

   // $VF: synthetic method
   static int c8(a6 var0) {
      return var0.l6;
   }

   // $VF: synthetic method
   static int t2(a6 var0) {
      return var0.k5;
   }

   // $VF: synthetic method
   static long[] s7(a6 var0) {
      return var0.u3;
   }

   // $VF: synthetic method
   static long[] x8(a6 var0) {
      return var0.a6;
   }

   // $VF: synthetic method
   static int n3(a6 var0) {
      return var0.l6;
   }

   // $VF: synthetic method
   static int y4(a6 var0) {
      return var0.k5;
   }

   // $VF: synthetic method
   static long[] e2(a6 var0) {
      return var0.c8;
   }

   // $VF: synthetic method
   static long[] t9(a6 var0) {
      return var0.t2;
   }

   // $VF: synthetic method
   static long[] z1(a6 var0) {
      return var0.s7;
   }

   // $VF: synthetic method
   static d2 t4(a6 var0) {
      return var0.u9;
   }
}
