package com.aspose.slides.internal.e1x;

public class m1 {
   public int n5;
   public short l6;
   public int k5;
   public int u3;
   public int a6;
   public short u9;
   public short h0;
   public short c8;
   public short t2;
   public short s7;
   public short x8;
   public short n3;
   public short y4;
   public short e2;
   public short t9;
   public short z1;
   public byte[] t4;
   public long q0;
   public long z3;
   public long m1;
   public long k7;
   public byte[] m3;
   public int z8;
   public int j5;
   public int w1;
   public short r4;
   public short c4;
   public short y2;
   public int y1;
   public int a0;
   public long d2;
   public long d5;
   public short s3;
   public short p8;
   public int f2;
   public int i1;
   public int e5;

   public final int n5() {
      int var1 = 0;
      var1 |= (this.z8 & 65535 & 1) != 0 ? 2 : 0;
      var1 |= (this.z8 & 65535 & 2) != 0 ? 4 : 0;
      var1 |= (this.z8 & 65535 & 16) != 0 ? 8 : 0;
      return var1 | ((this.z8 & 65535 & 32) != 0 ? 1 : 0);
   }

   public m1(com.aspose.slides.internal.n2d.k5 var1) {
      this.n5 = var1.a6();
      this.l6 = var1.u3();
      this.k5 = var1.a6();
      this.u3 = var1.a6();
      this.a6 = var1.a6();
      this.u9 = var1.u3();
      this.h0 = var1.u3();
      this.c8 = var1.u3();
      this.t2 = var1.u3();
      this.s7 = var1.u3();
      this.x8 = var1.u3();
      this.n3 = var1.u3();
      this.y4 = var1.u3();
      this.e2 = var1.u3();
      this.t9 = var1.u3();
      this.z1 = var1.u3();
      this.t4 = var1.n5(10);
      this.q0 = var1.k5();
      this.z3 = var1.k5();
      this.m1 = var1.k5();
      this.k7 = var1.k5();
      this.m3 = var1.n5(4);
      this.z8 = var1.a6();
      this.j5 = var1.a6();
      this.w1 = var1.a6();
      this.r4 = var1.u3();
      this.c4 = var1.u3();
      this.y2 = var1.u3();
      this.y1 = var1.a6();
      this.a0 = var1.a6();
      if ((this.n5 & 65535) >= 1) {
         this.d2 = var1.k5();
         this.d5 = var1.k5();
      } else {
         this.d2 = 0L;
         this.d5 = 0L;
      }

      if ((this.n5 & 65535) >= 2) {
         this.s3 = var1.u3();
         this.p8 = var1.u3();
         this.f2 = var1.a6();
         this.i1 = var1.a6();
         this.e5 = var1.a6();
      }
   }
}
