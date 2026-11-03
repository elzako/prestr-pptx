package com.aspose.slides.internal.k0r;

import com.aspose.slides.exceptions.Exception;

public abstract class s0 extends l8 {
   protected long n5;
   int l6;
   int k5;
   int u3;
   int a6;
   int u9;
   int h0;
   int c8;
   protected byte t2;

   s0(int var1, short var2) {
      super(var1, (byte)0);
      this.w1().n5(var1);
      this.w1().n5(var2);
   }

   public static s0 n5(com.aspose.slides.internal.j9e.y4 var0, com.aspose.slides.internal.z0k.t4 var1) {
      com.aspose.slides.internal.o9b.y2 var2 = var0.n5().n5().n3();
      short var3 = 12700;
      int var4 = var2.t2() * 12700;
      int var5 = var2.l6() * 12700;
      return n5(var0, var4, var5, var1);
   }

   public static s0 n5(com.aspose.slides.internal.y6.l6 var0, com.aspose.slides.internal.z0k.t4 var1) {
      com.aspose.slides.internal.o9b.y2 var2 = var0.k5().n3();
      short var3 = 12700;
      int var4 = var2.t2() * 12700;
      int var5 = var2.l6() * 12700;
      return n5(var0, var4, var5, var1);
   }

   public static s0 n5(com.aspose.slides.internal.y6.l6 var0, int var1, int var2, com.aspose.slides.internal.z0k.t4 var3) {
      byte[] var4 = new byte[(int)var3.getLength()];
      var3.read(var4, 0, var4.length);
      byte var5 = 0;
      s0 var6;
      if (com.aspose.slides.internal.n8e.k7.k5(var4)) {
         var6 = new i3();
      } else {
         var6 = new b6();
         int var7 = com.aspose.slides.internal.n8e.y2.l6(var4, 0);
         int var8 = com.aspose.slides.internal.n8e.y2.l6(var4, 2);
         if (var7 == 52695 && var8 == 39622) {
            var5 = 22;
         }
      }

      com.aspose.slides.internal.z0k.e2 var12 = new com.aspose.slides.internal.z0k.e2(var4, var5, var4.length - var5, false);

      try {
         var6.n5(com.aspose.slides.internal.j7.t9.n5(var12, 1));
      } finally {
         if (var12 != null) {
            var12.dispose();
         }
      }

      var6.n5 = var4.length & 4294967295L;
      com.aspose.slides.internal.o9b.y2 var13 = var0.k5().n3();
      var6.l6 = var13.u3();
      var6.k5 = var13.c8();
      var6.u3 = var13.u9();
      var6.a6 = var13.n5();
      var6.u9 = var1;
      var6.h0 = var2;
      var6.c8 = 0;
      var6.t2 = -2;
      var6.l6(var4);
      return var6;
   }

   public static s0 n5(com.aspose.slides.internal.j9e.y4 var0, int var1, int var2, com.aspose.slides.internal.z0k.t4 var3) {
      byte[] var4 = new byte[(int)var3.getLength()];
      var3.read(var4, 0, var4.length);
      byte var5 = 0;
      s0 var6;
      if (com.aspose.slides.internal.n8e.k7.k5(var4)) {
         var6 = new i3();
      } else {
         var6 = new b6();
         int var7 = com.aspose.slides.internal.n8e.y2.l6(var4, 0);
         int var8 = com.aspose.slides.internal.n8e.y2.l6(var4, 2);
         if (var7 == 52695 && var8 == 39622) {
            var5 = 22;
         }
      }

      com.aspose.slides.internal.z0k.e2 var12 = new com.aspose.slides.internal.z0k.e2(var4, var5, var4.length - var5, false);

      try {
         var6.n5(com.aspose.slides.internal.j7.t9.n5(var12, 1));
      } finally {
         if (var12 != null) {
            var12.dispose();
         }
      }

      var6.n5 = var4.length & 4294967295L;
      com.aspose.slides.internal.o9b.y2 var13 = var0.n5().n5().n3();
      var6.l6 = var13.u3();
      var6.k5 = var13.c8();
      var6.u3 = var13.u9();
      var6.a6 = var13.n5();
      var6.u9 = var1;
      var6.h0 = var2;
      var6.c8 = 0;
      var6.t2 = -2;
      var6.l6(var4);
      return var6;
   }

   final byte[] l6() {
      int var1 = 914400;
      int var2 = 1828800;
      byte[] var3 = new byte[22];
      int var4 = 0;
      com.aspose.slides.internal.n8e.y2.n5(var3, 0, 2596720087L);
      var4 = (var4 & 65535 ^ 52695) & 65535;
      var4 = (var4 & 65535 ^ 39622) & 65535;
      com.aspose.slides.internal.n8e.y2.n5(var3, 4, 0);
      var4 = (var4 & 65535 ^ 0) & 65535;
      com.aspose.slides.internal.n8e.y2.n5(var3, 6, this.l6);
      var4 = (var4 & 65535 ^ this.l6 & 65535) & 65535;
      com.aspose.slides.internal.n8e.y2.n5(var3, 8, this.k5);
      var4 = (var4 & 65535 ^ this.k5 & 65535) & 65535;
      com.aspose.slides.internal.n8e.y2.n5(var3, 10, this.u3);
      var4 = (var4 & 65535 ^ this.u3 & 65535) & 65535;
      com.aspose.slides.internal.n8e.y2.n5(var3, 12, this.a6);
      var4 = (var4 & 65535 ^ this.a6 & 65535) & 65535;
      int var5 = 96;
      if (this.u9 != 0 && this.h0 != 0) {
         long var6 = com.aspose.slides.internal.v6g.k5.h0(this.u3 - this.l6, 9) * com.aspose.slides.internal.v6g.k5.h0(1828800, 9) / (this.u9 & 4294967295L);
         int var8 = (int)(var6 + (var6 & 1L)) >> 1;
         var6 = com.aspose.slides.internal.v6g.k5.h0(this.a6 - this.k5, 9) * com.aspose.slides.internal.v6g.k5.h0(1828800, 9) / (this.h0 & 4294967295L);
         var8 += (int)(var6 + (var6 & 1L)) >> 1;
         var5 = var8 >> 1 & 65535;
      }

      com.aspose.slides.internal.n8e.y2.n5(var3, 14, var5 & 65535);
      var4 = (var4 & 65535 ^ var5 & 65535) & 65535;
      com.aspose.slides.internal.n8e.y2.n5(var3, 16, 0);
      var4 = (var4 & 65535 ^ 0) & 65535;
      com.aspose.slides.internal.n8e.y2.n5(var3, 18, 0);
      var4 = (var4 & 65535 ^ 0) & 65535;
      com.aspose.slides.internal.n8e.y2.n5(var3, 20, var4 & 65535);
      return var3;
   }

   public final byte[] u3() {
      com.aspose.slides.internal.z0k.e2 var1 = new com.aspose.slides.internal.z0k.e2();
      if (this.t2() != 2) {
         byte[] var2 = this.l6();
         var1.write(var2, 0, var2.length);
      }

      this.n5(var1);
      return var1.toArray();
   }

   public void n5(com.aspose.slides.internal.z0k.t4 var1) {
      switch (this.c8) {
         case 0:
            byte[] var2 = com.aspose.slides.internal.j7.t9.n5(this.c8(), 0, 1);
            var1.write(var2, 0, var2.length);
            break;
         case 254:
            var1.write(this.c8(), 0, this.c8().length);
            break;
         default:
            throw new Exception("Unknown metafile compression method.");
      }
   }

   @Override
   public byte[] k5() {
      byte[] var1;
      switch (this.c8) {
         case 0:
            var1 = com.aspose.slides.internal.j7.t9.n5(this.c8(), 0, 1);
            break;
         case 254:
            var1 = this.c8();
            break;
         default:
            var1 = null;
      }

      return var1;
   }

   @Override
   protected void n5(com.aspose.slides.internal.z0k.n5 var1) {
      int var2 = (int)var1.x8().getPosition();
      if ((this.w1().k5() & 1) > 0) {
         var1.c8(16);
         this.w1().n5((short)(this.w1().k5() & -2));
      }

      this.n5(l6(var1).k5());
      this.n5 = var1.c4();
      this.l6 = var1.m3();
      this.k5 = var1.m3();
      this.u3 = var1.m3();
      this.a6 = var1.m3();
      this.u9 = var1.m3();
      this.h0 = var1.m3();
      int var3 = var1.m3();
      this.c8 = var1.z1() & 255;
      this.t2 = var1.z1();
      this.n5(var1.c8(var3));
      var1.x8().setPosition((long)var2 + this.w1().a6());
   }

   @Override
   public void n5(com.aspose.slides.internal.z0k.l6 var1) {
      var1.n5(this.h0().n5());
      var1.n5(this.n5 & 4294967295L);
      var1.l6(this.l6);
      var1.l6(this.k5);
      var1.l6(this.u3);
      var1.l6(this.a6);
      var1.l6(this.u9);
      var1.l6(this.h0);
      var1.l6(this.c8().length);
      var1.n5((byte)this.c8);
      var1.n5(this.t2);
      var1.n5(this.c8());
   }

   @Override
   public int n5() {
      return this.h0().n5().length + 32 + 2 + this.c8().length;
   }

   public final int a6() {
      return this.u9;
   }

   public final int u9() {
      return this.h0;
   }
}
