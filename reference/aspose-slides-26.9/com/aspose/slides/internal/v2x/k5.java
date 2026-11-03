package com.aspose.slides.internal.v2x;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.internal.e2l.h0;
import com.aspose.slides.internal.y5s.a0;
import com.aspose.slides.internal.y5s.j5;
import com.aspose.slides.internal.y5s.k7;
import com.aspose.slides.internal.y5s.m3;
import com.aspose.slides.internal.z0k.t4;
import com.aspose.slides.ms.System.x8;

public final class k5 extends k7 implements h0 {
   private byte n5;
   private int l6;
   private int k5;
   private int u3;
   private int a6;
   private byte u9;

   public k5(int var1, int var2) {
      this(0, 0, var1, var2);
   }

   public k5(int var1, int var2, int var3, int var4) {
      this(null, var1, var2, var3, var4, null, false, false, (byte)8);
   }

   public k5(int var1, int var2, int var3, int var4, com.aspose.slides.internal.j3b.u3 var5, boolean var6, boolean var7, byte var8) {
      this(null, var1, var2, var3, var4, var5, var6, var7, var8);
   }

   public k5(
      com.aspose.slides.internal.e2l.k5 var1,
      int var2,
      int var3,
      int var4,
      int var5,
      com.aspose.slides.internal.j3b.u3 var6,
      boolean var7,
      boolean var8,
      byte var9
   ) {
      super(var6);
      this.n5(var6, var2, var3, com.aspose.slides.internal.v6g.k5.u3(var4, 8), com.aspose.slides.internal.v6g.k5.u3(var5, 8), var7, var8, var9);
      if (var1 != null) {
         this.n5(var1);
         var1.n5(this);
      }
   }

   @Override
   public int t9() {
      return this.l6;
   }

   @Override
   public int n3() {
      return this.k5;
   }

   public boolean k7() {
      this.t2();
      return (com.aspose.slides.internal.v6g.k5.u3(this.u9, 6) & 64) != 0;
   }

   public int m3() {
      this.t2();
      return this.u3;
   }

   public int z8() {
      this.t2();
      return this.a6;
   }

   public u3 j5() {
      u3 var1 = null;
      if (com.aspose.slides.internal.v6g.k5.l6(this.x8(), com.aspose.slides.internal.e2l.u9.class)) {
         h0[] var2 = com.aspose.slides.internal.v6g.k5.n5(this.x8(), com.aspose.slides.internal.e2l.u9.class).q0();

         for (int var3 = 0; var3 < var2.length; var3++) {
            if (var2[var3] == this) {
               if (var3 > 0) {
                  h0 var4 = var2[var3 - 1];
                  if (com.aspose.slides.internal.v6g.k5.l6(var4, u3.class)) {
                     var1 = (u3)var4;
                  }
               }
               break;
            }
         }
      }

      return var1;
   }

   @Override
   public boolean z3() {
      u3 var1 = this.j5();
      return var1 == null ? false : var1.k5();
   }

   @Override
   public void n5(boolean var1) {
      if (this.j5() != null) {
         this.j5().l6(var1);
      } else {
         if (!com.aspose.slides.internal.v6g.k5.l6(this.x8(), com.aspose.slides.internal.e2l.u9.class)) {
            throw new com.aspose.slides.internal.d9m.n5("The block does not belong to any image and transparent color could not be set.");
         }

         h0[] var2 = com.aspose.slides.internal.v6g.k5.n5(this.x8(), com.aspose.slides.internal.e2l.u9.class).q0();

         for (int var3 = 0; var3 < var2.length; var3++) {
            if (var2[var3] == this) {
               com.aspose.slides.internal.e2l.u9 var4 = com.aspose.slides.internal.v6g.k5.n5(this.x8(), com.aspose.slides.internal.e2l.u9.class);
               u3 var5 = new u3();
               var5.l6(var1);
               var4.n5(var3, var5);
            }
         }
      }
   }

   public static com.aspose.slides.internal.j3b.u3 k5(com.aspose.slides.internal.j3b.u3 var0, com.aspose.slides.internal.j3b.u3 var1) {
      com.aspose.slides.internal.j3b.u3 var2 = null;
      if (var0 != null) {
         var2 = var0;
      } else if (var1 != null) {
         var2 = var1;
      }

      if (var2 == null) {
         throw new com.aspose.slides.internal.g9t.n5(
            "Cannot work with GIF frame pixels since palette is not present neither in GIF image nor in GIF frame. Tip: setup color palette first."
         );
      } else {
         return var2;
      }
   }

   public static byte n5(com.aspose.slides.internal.j3b.u3 var0, boolean var1, boolean var2) {
      byte var3 = 0;
      if (var0 != null) {
         if (var0.n5() == 1) {
            throw new ArgumentOutOfRangeException(
               "colorPalette", "The color palette must contain entries count equal to the power of 2. Minimal entries count are 2 and maximal 256."
            );
         }

         byte var4 = 0;

         for (int var5 = var0.n5(); var5 > 2; var4++) {
            if ((var5 & 1) == 1) {
               throw new ArgumentOutOfRangeException(
                  "colorPalette", "The color palette must contain entries count equal to the power of 2. Minimal entries count are 2 and maximal 256."
               );
            }

            var5 >>= 1;
         }

         var3 = (byte)(com.aspose.slides.internal.v6g.k5.u3(var3, 6) | com.aspose.slides.internal.v6g.k5.u3(var4, 6));
         var3 = (byte)(com.aspose.slides.internal.v6g.k5.u3(var3, 6) | 128);
      }

      if (var1) {
         var3 = (byte)(com.aspose.slides.internal.v6g.k5.u3(var3, 6) | 32);
      }

      if (var2) {
         var3 = (byte)(com.aspose.slides.internal.v6g.k5.u3(var3, 6) | 64);
      }

      return var3;
   }

   static void n5(a0 var0, j5 var1, byte var2) {
      var0.n5((byte)44);
      var0.n5(x8.n5(com.aspose.slides.internal.v6g.k5.k5(var1.h0(), 9)));
      var0.n5(x8.n5(com.aspose.slides.internal.v6g.k5.k5(var1.c8(), 9)));
      var0.n5(x8.n5(com.aspose.slides.internal.v6g.k5.k5(var1.a6(), 9)));
      var0.n5(x8.n5(com.aspose.slides.internal.v6g.k5.k5(var1.u9(), 9)));
      var0.n5(var2);
   }

   static void n5(m3 var0, a0 var1, com.aspose.slides.internal.j3b.u3 var2, byte var3, boolean var4) {
      if (var2 == null) {
         throw new ArgumentNullException("palette");
      }

      var1.n5(var3);
      l6(var0, var1, var2, var3, var4);
   }

   @Override
   protected void l6(t4 var1) {
      this.t2();
      a0 var2 = new a0(var1);

      try {
         n5(var2, new j5(com.aspose.slides.internal.v6g.k5.u3(this.u3, 8), com.aspose.slides.internal.v6g.k5.u3(this.a6, 8), this.l6, this.k5), this.u9);
         com.aspose.slides.internal.j3b.u3 var3 = this.y4();
         if (var3 != null) {
            com.aspose.slides.internal.e2l.a6.n5(var2, var3);
         }

         n5(this, var2, this.w1(), this.n5, this.k7());
      } finally {
         if (var2 != null) {
            var2.dispose();
         }
      }
   }

   @Override
   protected void n5(int var1, int var2) {
      this.l6 = var1;
      this.k5 = var2;
   }

   @Override
   protected void n5(com.aspose.slides.internal.j3b.u3 var1, com.aspose.slides.internal.j3b.u3 var2) {
      this.u9 = n5(var2, (com.aspose.slides.internal.v6g.k5.u3(this.u9, 6) & 32) > 0, (com.aspose.slides.internal.v6g.k5.u3(this.u9, 6) & 64) > 0);
      super.n5(var1, var2);
   }

   private static void l6(m3 var0, a0 var1, com.aspose.slides.internal.j3b.u3 var2, byte var3, boolean var4) {
      k5$n5 var5 = new k5$n5(var0, var1, var2, com.aspose.slides.internal.v6g.k5.u3(var3, 6), var0.t9(), var0.n3());

      try {
         if (var4) {
            com.aspose.slides.internal.y5s.t4.n5(var0.s7().n3(), var0.t9(), var0.n3(), var5);
         } else {
            com.aspose.slides.internal.y5s.t4.n5(var0.s7().n3(), var5);
         }
      } finally {
         if (var5 != null) {
            var5.dispose();
         }
      }
   }

   private com.aspose.slides.internal.j3b.u3 w1() {
      com.aspose.slides.internal.j3b.u3 var1 = null;
      if (this.x8() != null) {
         var1 = this.x8().y4();
      }

      return k5(this.y4(), var1);
   }

   private void n5(com.aspose.slides.internal.j3b.u3 var1, int var2, int var3, int var4, int var5, boolean var6, boolean var7, byte var8) {
      this.u9 = n5(var1, var6, var7);
      this.u3 = var2;
      this.a6 = var3;
      if (com.aspose.slides.internal.v6g.k5.u3(var8, 6) > 8) {
         this.n5 = 8;
      } else if (com.aspose.slides.internal.v6g.k5.u3(var8, 6) < 2) {
         this.n5 = 2;
      } else {
         this.n5 = var8;
      }

      this.l6 = var4;
      this.k5 = var5;
   }
}
