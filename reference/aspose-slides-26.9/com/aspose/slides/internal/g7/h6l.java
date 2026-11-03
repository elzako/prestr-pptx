package com.aspose.slides.internal.g7;

public class h6l extends s7k {
   private float n5;
   private int l6;
   private int k5;
   private int u3;
   private int a6;
   private int u9;
   private int h0;
   private int c8;
   private int t2;
   private int s7;
   private int x8;
   private int n3;
   private int y4;
   private int e2;
   private int t9;

   public h6l(d7u var1, u0a var2) {
      super(var1, var2);
      this.n5 = 1.0F;
      this.h0 = 2;
      this.u3 = 1024;
      this.k5 = 4096;
      this.s7 = 255;
      this.x8 = 255;
      this.y4 = 8192;
      this.c8 = 16;
      this.n3 = 4096;
      this.t2 = 255;
      this.a6 = 255;
      this.u9 = 255;
      this.e2 = 255;
      this.t9 = 30;
   }

   public h6l(g9t var1, long var2, long var4, long var6) {
      super(var1, var2, var4, var6);
   }

   public final int n5() {
      return this.l6;
   }

   public final void n5(int var1) {
      this.l6 = var1;
   }

   public final int l6() {
      return this.c8;
   }

   public final void l6(int var1) {
      this.c8 = var1;
   }

   public final int k5() {
      return this.t2;
   }

   public final void k5(int var1) {
      this.t2 = var1;
   }

   public final int u3() {
      return this.s7;
   }

   public final void u3(int var1) {
      this.s7 = var1;
   }

   public final int a6() {
      return this.x8;
   }

   public final void a6(int var1) {
      this.x8 = var1;
   }

   public final int u9() {
      return this.n3;
   }

   public final void u9(int var1) {
      this.n3 = var1;
   }

   public final int h0() {
      return this.y4;
   }

   public final void h0(int var1) {
      this.y4 = var1;
   }

   @Override
   public void n5(f3c var1) {
      var1.n5(this.d2() & 4294967295L);
      this.n5 = var1.u3();
      this.l6 = var1.n3();
      this.k5 = var1.n3();
      this.u3 = var1.n3();
      this.a6 = var1.n3();
      this.u9 = var1.n3();
      this.h0 = var1.n3();
      this.c8 = var1.n3();
      this.t2 = var1.n3();
      this.s7 = var1.n3();
      this.x8 = var1.n3();
      this.n3 = var1.n3();
      this.y4 = var1.n3();
      this.e2 = var1.n3();
      this.t9 = var1.n3();
      super.n5(var1);
   }

   @Override
   public void n5(byte[][] var1, long[] var2, long[] var3) {
      if (this.a0()) {
         com.aspose.slides.internal.z0k.e2 var4 = new com.aspose.slides.internal.z0k.e2();

         try {
            j2p var5 = new j2p(var4, true);

            try {
               var5.n5(this.n5);
               var5.n5(this.l6);
               var5.n5(this.k5);
               var5.n5(this.u3);
               var5.n5(this.a6);
               var5.n5(this.u9);
               var5.n5(this.h0);
               var5.n5(this.c8);
               var5.n5(this.t2);
               var5.n5(this.s7);
               var5.n5(this.x8);
               var5.n5(this.n3);
               var5.n5(this.y4);
               var5.n5(this.e2);
               var5.n5(this.t9);
               this.n5(var5, var4, var1, var2, var3);
            } finally {
               if (var5 != null) {
                  var5.dispose();
               }
            }
         } finally {
            if (var4 != null) {
               var4.dispose();
            }
         }
      } else {
         super.n5(var1, var2, var3);
      }
   }
}
