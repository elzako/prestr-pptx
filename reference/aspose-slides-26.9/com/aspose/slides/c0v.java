package com.aspose.slides;

import com.aspose.slides.exceptions.MethodAccessException;

class c0v {
   private com.aspose.slides.internal.j9e.x8 n5;
   private final int l6;
   private final int k5;
   private float u3;
   private float a6;
   private final byte[] u9;
   private int h0 = -1;
   private static final c0v$n5 c8 = x8();

   public final boolean n5() {
      return this.h0 != 0;
   }

   public final int l6() {
      return this.l6;
   }

   public final int k5() {
      return this.k5;
   }

   public final com.aspose.slides.internal.j9e.x8 u3() {
      return this.n5;
   }

   public final void n5(com.aspose.slides.internal.j9e.x8 var1) {
      this.n5 = var1;
   }

   public final byte[] a6() {
      return this.u9;
   }

   public final void u9() {
      if (this.h0 < 0) {
         for (int var1 = 0; var1 < this.u9.length; var1 += 4) {
            if ((this.u9[var1 + 3] & 255) != 255) {
               this.h0 = 1;
               return;
            }
         }

         this.h0 = 0;
      }
   }

   public final void h0() {
      this.h0 = 1;
   }

   public final void c8() {
      this.h0 = 0;
   }

   public final void t2() {
      this.h0 = -1;
   }

   public c0v(int var1, int var2) {
      this.l6 = var1;
      this.k5 = var2;
      this.u9 = new byte[this.l6 * this.k5 * 4];
   }

   private static c0v$n5 x8() {
      c0v$n5 var2;
      try {
         c0v$u3 var0 = new c0v$u3(null);
         com.aspose.slides.internal.o9b.l6 var1 = new com.aspose.slides.internal.o9b.l6(16, 16, 2498570);
         var0.n5(var1);
         var2 = var0;
      } catch (MethodAccessException var3) {
         com.aspose.slides.internal.n8e.v4.n5(var3);
         var2 = new c0v$l6(null);
      }

      return var2;
   }

   public static c0v n5(com.aspose.slides.internal.o9b.l6 var0) {
      c0v var1 = c8.n5(var0);
      var1.u3 = com.aspose.slides.internal.n2d.m1.n5(var0);
      var1.a6 = com.aspose.slides.internal.n2d.m1.l6(var0);
      var1.n5(var0.x8());
      return var1;
   }

   public final com.aspose.slides.internal.o9b.l6 s7() {
      com.aspose.slides.internal.o9b.l6 var1 = c8.n5(this);
      if (this.u3 != 0.0F && this.a6 != 0.0F) {
         var1.n5(this.u3, this.a6);
      }

      return var1;
   }

   // $VF: synthetic method
   static byte[] n5(c0v var0) {
      return var0.u9;
   }

   // $VF: synthetic method
   static int l6(c0v var0) {
      return var0.l6;
   }

   // $VF: synthetic method
   static int k5(c0v var0) {
      return var0.k5;
   }
}
