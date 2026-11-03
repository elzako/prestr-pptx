package com.aspose.slides.internal.y4g;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.internal.o8m.j3;
import com.aspose.slides.internal.o8m.q1;
import com.aspose.slides.internal.o8m.s4;
import com.aspose.slides.internal.o8m.u8;

public abstract class x9 {
   public static byte[] n5 = new byte[0];
   private short l6;
   private String k5;
   private int u3;
   private int a6;
   private int u9;
   private boolean h0;
   private int c8;
   private byte t2;
   private int s7;
   private byte x8;
   private short n3;
   private byte y4;
   private byte e2;
   private v8 t9;
   private u8 z1;
   private com.aspose.slides.internal.o8m.i1 t4;
   private u8 q0;
   private com.aspose.slides.internal.o8m.i1 z3;
   private com.aspose.slides.internal.o8m.b3 m1;
   private com.aspose.slides.internal.o8m.b3 k7;

   protected com.aspose.slides.internal.o8m.i1 l6() {
      return this.t4;
   }

   protected com.aspose.slides.internal.o8m.i1 k5() {
      return this.z3;
   }

   protected com.aspose.slides.internal.o8m.b3 u3() {
      return this.m1;
   }

   protected com.aspose.slides.internal.o8m.b3 a6() {
      return this.k7;
   }

   com.aspose.slides.internal.o8m.f2 u9() {
      switch (this.a6) {
         case 0:
            return com.aspose.slides.internal.o8m.z7.a6();
         case 2:
            return s4.a6();
         default:
            return null;
      }
   }

   public int h0() {
      switch (this.a6) {
         case 0:
            return 16;
         case 2:
            return 20;
         default:
            return 0;
      }
   }

   public int c8() {
      return this.u9;
   }

   public int t2() {
      return this.c8;
   }

   public short s7() {
      return this.l6;
   }

   public String x8() {
      return this.k5;
   }

   public boolean n3() {
      return this.h0;
   }

   public byte y4() {
      return this.t2;
   }

   public int e2() {
      return this.s7;
   }

   public byte t9() {
      return this.x8;
   }

   public byte z1() {
      return this.y4;
   }

   public v8 t4() {
      return this.t9;
   }

   public void n5(v8 var1) {
      this.t9 = var1;
   }

   public x9(short var1, String var2, int var3, int var4, int var5, boolean var6, boolean var7, byte var8, byte var9, short var10, byte var11, byte var12) {
      this.l6 = var1;
      this.k5 = var2;
      this.u3 = var3;
      this.a6 = var4;
      this.u9 = var5;
      this.h0 = var6;
      if (var7) {
         this.c8 = 1;
      }

      this.t2 = var8;
      this.x8 = var9;
      this.n3 = var10;
      this.y4 = var11;
      this.e2 = var12;
      this.s7 = com.aspose.slides.internal.v6g.k5.u3(this.t2, 6) + this.h0() + com.aspose.slides.internal.v6g.k5.u3(this.y4, 6) << 1;
   }

   void n5(byte[] var1, int var2, short var3) {
      if (var2 > var1.length - 2) {
         throw new ArgumentException("offset");
      }

      var1[var2] = com.aspose.slides.internal.v6g.k5.n5((Object)(var3 >> 8), 9);
      var1[var2 + 1] = com.aspose.slides.internal.v6g.k5.n5((Object)(var3), 7);
   }

   void n5(byte[] var1, int var2, long var3) {
      if (var2 > var1.length - 8) {
         throw new ArgumentException("offset");
      }

      var1[var2] = com.aspose.slides.internal.v6g.k5.n5((Object)(var3 >> 56), 12);
      var1[var2 + 1] = com.aspose.slides.internal.v6g.k5.n5((Object)(var3 >> 48), 12);
      var1[var2 + 2] = com.aspose.slides.internal.v6g.k5.n5((Object)(var3 >> 40), 12);
      var1[var2 + 3] = com.aspose.slides.internal.v6g.k5.n5((Object)(var3 >> 32), 12);
      var1[var2 + 4] = com.aspose.slides.internal.v6g.k5.n5((Object)(var3 >> 24), 12);
      var1[var2 + 5] = com.aspose.slides.internal.v6g.k5.n5((Object)(var3 >> 16), 12);
      var1[var2 + 6] = com.aspose.slides.internal.v6g.k5.n5((Object)(var3 >> 8), 12);
      var1[var2 + 7] = com.aspose.slides.internal.v6g.k5.n5((Object)(var3), 12);
   }

   public void q0() {
      this.m1();
      this.k7();
   }

   public byte[] n5(byte[] var1, byte[] var2) {
      int var3 = var1.length + var2.length;
      int var4 = 0;
      if (this.t2() == 1) {
         var3++;
         var4 = com.aspose.slides.internal.v6g.k5.u3(this.e2, 6) - var3 % com.aspose.slides.internal.v6g.k5.u3(this.e2, 6);
         if (var4 == com.aspose.slides.internal.v6g.k5.u3(this.e2, 6)) {
            var4 = 0;
         }

         var3 += var4;
      }

      byte[] var5 = new byte[var3];
      com.aspose.slides.ms.System.y4.n5(var1, 0, var5, 0, var1.length);
      com.aspose.slides.ms.System.y4.n5(var2, 0, var5, var1.length, var2.length);
      if (var4 > 0) {
         int var6 = var1.length + var2.length;

         for (int var7 = var6; var7 < var6 + var4 + 1; var7++) {
            var5[var7] = com.aspose.slides.internal.v6g.k5.n5((Object)(var4), 9);
         }
      }

      this.l6().n5(var5, 0, var5.length, var5, 0);
      return var5;
   }

   public void n5(byte[] var1, byte[][] var2, byte[][] var3) {
      int var4 = 0;
      int var5 = 0;
      this.k5().n5(var1, 0, var1.length, var1, 0);
      if (this.t2() == 1) {
         var5 = com.aspose.slides.internal.v6g.k5.u3(var1[var1.length - 1], 6);
         var4 = var1.length - (var5 + 1) - this.h0();
      } else {
         var4 = var1.length - this.h0();
      }

      var2[0] = new byte[var4];
      var3[0] = new byte[this.h0()];
      com.aspose.slides.ms.System.y4.n5(var1, 0, var2[0], 0, var2[0].length);
      com.aspose.slides.ms.System.y4.n5(var1, var2[0].length, var3[0], 0, var3[0].length);
   }

   public abstract byte[] l6(byte var1, byte[] var2);

   public abstract byte[] n5(byte var1, byte[] var2);

   public abstract void n5(byte[] var1);

   public abstract void n5();

   public byte[] z3() {
      z6 var1 = (z6)this.t9;
      byte[] var2 = this.t9.u3(48);
      var2[0] = com.aspose.slides.internal.v6g.k5.n5((Object)(var1.l6() >> 8), 9);
      var2[1] = com.aspose.slides.internal.v6g.k5.n5((Object)(var1.l6()), 7);
      return var2;
   }

   public byte[] n5(byte[] var1, String var2, byte[] var3, int var4) {
      int var5 = var1.length >> 1;
      if ((var1.length & 1) == 1) {
         var5++;
      }

      h2 var6 = new h2();
      var6.n5(com.aspose.slides.internal.l7h.j5.e2().u3(var2));
      var6.n5(var3);
      byte[] var7 = var6.u9();
      var6.a6();
      byte[] var8 = new byte[var5];
      com.aspose.slides.ms.System.y4.n5(var1, 0, var8, 0, var5);
      byte[] var9 = new byte[var5];
      com.aspose.slides.ms.System.y4.n5(var1, var1.length - var5, var9, 0, var5);
      byte[] var10 = this.n5(com.aspose.slides.internal.o8m.z7.a6(), var8, var7, var4);
      byte[] var11 = this.n5(s4.a6(), var9, var7, var4);
      byte[] var12 = new byte[var4];

      for (int var13 = 0; var13 < var12.length; var13++) {
         var12[var13] = com.aspose.slides.internal.v6g.k5.n5(
            (Object)(com.aspose.slides.internal.v6g.k5.u3(var10[var13], 6) ^ com.aspose.slides.internal.v6g.k5.u3(var11[var13], 6)), 9
         );
      }

      return var12;
   }

   public byte[] n5(com.aspose.slides.internal.o8m.f2 var1, byte[] var2, byte[] var3, int var4) {
      int var5 = var1.y4() / 8;
      int var6 = var4 / var5;
      if (var4 % var5 > 0) {
         var6++;
      }

      com.aspose.slides.internal.x8w.t2 var7 = new com.aspose.slides.internal.x8w.t2(var1, var2);
      h2 var8 = new h2();
      byte[][] var9 = new byte[var6 + 1][];
      var9[0] = var3;

      for (int var10 = 1; var10 <= var6; var10++) {
         h2 var11 = new h2();
         var7.n5(var9[var10 - 1], 0, var9[var10 - 1].length);
         var9[var10] = var7.n3();
         var11.n5(var9[var10]);
         var11.n5(var3);
         var7.n5(var11.u9(), 0, com.aspose.slides.internal.v6g.k5.u3(var11.getLength(), 11));
         var8.n5(var7.n3());
         var11.a6();
      }

      byte[] var12 = new byte[var4];
      com.aspose.slides.ms.System.y4.n5(var8.u9(), 0, var12, 0, var12.length);
      var8.a6();
      return var12;
   }

   private void m1() {
      switch (this.u3) {
         case 0:
            this.z1 = com.aspose.slides.internal.o8m.z1.k5();
         case 1:
         case 5:
         default:
            break;
         case 2:
            this.z1 = com.aspose.slides.internal.o8m.f0.k5();
            break;
         case 3:
            this.z1 = new com.aspose.slides.internal.x8w.n5();
            break;
         case 4:
            this.z1 = j3.k5();
            break;
         case 6:
            this.z1 = q1.k5();
      }

      if (this.c8 == 1) {
         this.z1.k5(this.c8);
         this.z1.u3(1);
         this.z1.n5(com.aspose.slides.internal.v6g.k5.u3(this.x8, 6) * 8);
         this.z1.l6(com.aspose.slides.internal.v6g.k5.u3(this.e2, 6) * 8);
      }

      if (com.aspose.slides.internal.v6g.k5.l6(this.t9, z6.class)) {
         this.z1.k5(this.t9.r4());
         this.z1.u3(this.t9.y2());
      } else {
         this.z1.k5(this.t9.c4());
         this.z1.u3(this.t9.y1());
      }

      this.t4 = this.z1.t9();
      if (com.aspose.slides.internal.v6g.k5.l6(this.t9, z6.class)) {
         this.m1 = new com.aspose.slides.internal.x8w.t2(this.u9(), this.t9.p8().l6());
      } else {
         this.k7 = new com.aspose.slides.internal.x8w.t2(this.u9(), this.t9.p8().k5());
      }
   }

   private void k7() {
      switch (this.u3) {
         case 0:
            this.q0 = com.aspose.slides.internal.o8m.z1.k5();
         case 1:
         case 5:
         default:
            break;
         case 2:
            this.q0 = com.aspose.slides.internal.o8m.f0.k5();
            break;
         case 3:
            this.q0 = new com.aspose.slides.internal.x8w.n5();
            break;
         case 4:
            this.q0 = j3.k5();
            break;
         case 6:
            this.q0 = q1.k5();
      }

      if (this.c8 == 1) {
         this.q0.k5(this.c8);
         this.q0.u3(1);
         this.q0.n5(com.aspose.slides.internal.v6g.k5.u3(this.x8, 6) * 8);
         this.q0.l6(com.aspose.slides.internal.v6g.k5.u3(this.e2, 6) * 8);
      }

      if (com.aspose.slides.internal.v6g.k5.l6(this.t9, z6.class)) {
         this.q0.k5(this.t9.c4());
         this.q0.u3(this.t9.y1());
      } else {
         this.q0.k5(this.t9.r4());
         this.q0.u3(this.t9.y2());
      }

      this.z3 = this.q0.e2();
      if (com.aspose.slides.internal.v6g.k5.l6(this.t9, z6.class)) {
         this.k7 = new com.aspose.slides.internal.x8w.t2(this.u9(), this.t9.p8().k5());
      } else {
         this.m1 = new com.aspose.slides.internal.x8w.t2(this.u9(), this.t9.p8().l6());
      }
   }
}
