package com.aspose.slides.internal.k4d;

import com.aspose.slides.internal.z0k.e2;

public class u9 {
   private final long n5;
   private long l6;
   private long k5;
   private double u3;
   private double a6;
   private int u9 = 32767;
   private int h0 = 2;
   private int c8 = 1;
   private int t2 = 1;
   private int s7 = 1;
   private int x8 = 1;
   private int n3 = 4;
   private int[] y4 = new int[]{0};

   public u9(byte[] var1) {
      this(new com.aspose.slides.internal.n2d.k5(new e2(var1)));
   }

   public u9(com.aspose.slides.internal.n2d.k5 var1) {
      this.n5 = var1.n5().getPosition();
      this.n5(var1);
   }

   private void n5(com.aspose.slides.internal.n2d.k5 var1) {
      short var2 = var1.u3();
      boolean var3 = var2 == 19789;
      int var4 = n5(var1, var3);
      if ((var4 & 65535) == 42) {
         long var5 = l6(var1, var3);
         var1.n5().setPosition(this.n5 + (var5 & 4294967295L));
         int var7 = n5(var1, var3);
         long var8 = var1.n5().getPosition();

         for (int var10 = 0; var10 < (var7 & 65535); var10++) {
            var1.n5().setPosition(var8);
            var8 += 12L;
            int var11 = n5(var1, var3);
            int var12 = n5(var1, var3);
            long var13 = l6(var1, var3);
            if (((var12 & 65535) == 1 || (var12 & 65535) == 2) && (var13 & 4294967295L) > 4L
               || (var12 & 65535) == 3 && (var13 & 4294967295L) > 2L
               || (var12 & 65535) == 4 && (var13 & 4294967295L) > 1L
               || (var12 & 65535) == 5) {
               long var15 = l6(var1, var3);
               var1.n5().setPosition(this.n5 + (var15 & 4294967295L));
            }

            switch (var11) {
               case 256:
                  this.l6 = (var12 & 65535) == 3 ? n5(var1, var3) & 65535 : l6(var1, var3);
                  break;
               case 257:
                  this.k5 = (var12 & 65535) == 3 ? n5(var1, var3) & 65535 : l6(var1, var3);
                  break;
               case 258:
                  this.y4 = n5(var1, var3, var13);
                  break;
               case 259:
                  this.c8 = n5(var1, var3) & 65535;
                  break;
               case 262:
                  this.u9 = n5(var1, var3) & 65535;
                  break;
               case 277:
                  this.x8 = n5(var1, var3);
                  break;
               case 282:
                  this.u3 = k5(var1, var3);
                  break;
               case 283:
                  this.a6 = k5(var1, var3);
                  break;
               case 284:
                  this.t2 = n5(var1, var3) & 65535;
                  break;
               case 296:
                  this.h0 = n5(var1, var3) & 65535;
                  break;
               case 332:
                  this.s7 = n5(var1, var3) & 65535;
                  break;
               case 334:
                  this.n3 = n5(var1, var3);
            }
         }
      }
   }

   public static boolean n5(byte[] var0) {
      e2 var1 = new e2(var0);

      try {
         com.aspose.slides.internal.z0k.n5 var2 = new com.aspose.slides.internal.z0k.n5(var1);
         short var3 = var2.k7();
         return var3 == 18761 || var3 == 19789;
      } finally {
         if (var1 != null) {
            var1.dispose();
         }
      }
   }

   private static int n5(com.aspose.slides.internal.n2d.k5 var0, boolean var1) {
      int var2 = var0.a6();
      if (!var1) {
         var2 = com.aspose.slides.internal.n2d.a6.l6(var2);
      }

      return var2;
   }

   private static long l6(com.aspose.slides.internal.n2d.k5 var0, boolean var1) {
      long var2 = var0.k5();
      if (!var1) {
         var2 = com.aspose.slides.internal.n2d.a6.n5(var2);
      }

      return var2;
   }

   private static int[] n5(com.aspose.slides.internal.n2d.k5 var0, boolean var1, long var2) {
      int[] var4 = new int[(int)var2];

      for (int var5 = 0; var5 < var4.length; var5++) {
         var4[var5] = n5(var0, var1);
      }

      return var4;
   }

   private static double k5(com.aspose.slides.internal.n2d.k5 var0, boolean var1) {
      long var2 = l6(var0, var1);
      long var4 = l6(var0, var1);
      return ((var4 & 4294967295L) != 0L ? (var2 & 4294967295L) / (var4 & 4294967295L) & 4294967295L : 0L) & 4294967295L;
   }

   public final int n5() {
      return (this.l6 & 4294967295L) != 0L ? (int)this.l6 : 100;
   }

   public final int l6() {
      return (this.k5 & 4294967295L) != 0L ? (int)this.k5 : 100;
   }

   public final double k5() {
      return this.u3;
   }

   public final double u3() {
      return this.a6;
   }

   public final boolean a6() {
      return this.h0 != 1 && this.h0 != 2 && this.h0 != 3 ? false : this.u9() || this.h0() || this.c8() || this.t2() || this.s7();
   }

   private boolean u9() {
      return (this.u9 == 0 || this.u9 == 1)
         && (this.y4[0] & 65535) == 0
         && (this.c8 == 1 || this.c8 == 2 || this.c8 == 3 || this.c8 == 4 || this.c8 == 5 || this.c8 == 32773);
   }

   private boolean h0() {
      return (this.u9 == 0 || this.u9 == 1)
         && ((this.y4[0] & 65535) == 4 || (this.y4[0] & 65535) == 8 || (this.y4[0] & 65535) == 16)
         && (this.c8 == 1 || this.c8 == 2 || this.c8 == 32773);
   }

   private boolean c8() {
      return this.u9 == 3
         && ((this.y4[0] & 65535) == 1 || (this.y4[0] & 65535) == 4 || (this.y4[0] & 65535) == 8)
         && (this.c8 == 1 || this.c8 == 5 || this.c8 == 32773);
   }

   private boolean t2() {
      return this.u9 == 2
         && this.t2 == 1
         && this.y4.length == (this.x8 & 65535)
         && this.x8()
         && (this.c8 == 1 || this.c8 == 5 || this.c8 == 6 || this.c8 == 32773);
   }

   private boolean s7() {
      return this.u9 == 5
         && this.t2 == 1
         && this.s7 == 1
         && this.n3 == 4
         && this.y4.length == (this.x8 & 65535)
         && this.x8()
         && (this.c8 == 1 || this.c8 == 5 || this.c8 == 6 || this.c8 == 32773);
   }

   private boolean x8() {
      boolean var1 = (this.y4[0] & 65535) == 8 || (this.y4[0] & 65535) == 16;

      for (int var2 = 0; var2 < this.y4.length; var2++) {
         var1 = var1 && this.y4[var2] == this.y4[0];
      }

      return var1;
   }
}
