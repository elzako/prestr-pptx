package com.aspose.slides.internal.y4g;

import com.aspose.slides.exceptions.NotSupportedException;
import com.aspose.slides.internal.o8m.i9;

public abstract class v8 {
   private int n5;
   private byte[] l6;
   private int k5;
   private a5 u3;
   private t1 a6;
   private s7 u9;
   private s7 h0;
   private s7 c8;
   private s7 t2;
   private y0 s7;
   private byte x8;
   private int n3;
   private boolean y4;
   private boolean e2;
   private boolean t9;
   private boolean z1;
   private long t4;
   private long q0;
   private byte[] z3;
   private byte[] m1;
   private byte[] k7;
   private byte[] m3;
   private byte[] z8;
   private byte[] j5;
   private byte[] w1;
   private byte[] r4;
   private byte[] c4;
   private h2 y2;
   private i9 y1;
   private h0 a0;

   public boolean u3() {
      return this.y4;
   }

   public void n5(boolean var1) {
      this.y4 = var1;
   }

   public boolean a6() {
      return this.z1;
   }

   public void l6(boolean var1) {
      this.z1 = var1;
   }

   public int u9() {
      if ((this.n5 & 192) == 192 || (this.n5 & -1073741824) == -1073741824) {
         return 192;
      } else if ((this.n5 & 48) == 48) {
         return 48;
      } else {
         throw new NotSupportedException("Unsupported security protocol type");
      }
   }

   public void n5(int var1) {
      this.n5 = var1;
   }

   public int h0() {
      return this.n5;
   }

   public short c8() {
      switch (this.u9()) {
         case -1073741824:
         case 192:
            return 769;
         case 12:
         default:
            throw new NotSupportedException("Unsupported security protocol type");
         case 48:
            return 768;
      }
   }

   public byte[] t2() {
      return this.l6;
   }

   public void n5(byte[] var1) {
      this.l6 = var1;
   }

   public int s7() {
      return this.k5;
   }

   public void l6(int var1) {
      this.k5 = var1;
   }

   public a5 x8() {
      return this.u3;
   }

   public t1 n3() {
      return this.a6;
   }

   public byte y4() {
      return this.x8;
   }

   public void n5(byte var1) {
      this.x8 = var1;
   }

   public int e2() {
      return this.n3;
   }

   public void k5(int var1) {
      this.n3 = var1;
   }

   public boolean t9() {
      return this.e2;
   }

   public void k5(boolean var1) {
      this.e2 = var1;
   }

   public boolean z1() {
      return this.t9;
   }

   public void u3(boolean var1) {
      this.t9 = var1;
   }

   public y0 t4() {
      return this.s7;
   }

   public void n5(y0 var1) {
      this.s7 = var1;
   }

   public h2 q0() {
      return this.y2;
   }

   public long z3() {
      return this.t4;
   }

   public void n5(long var1) {
      this.t4 = var1;
   }

   public long m1() {
      return this.q0;
   }

   public void l6(long var1) {
      this.q0 = var1;
   }

   public byte[] k7() {
      return this.z3;
   }

   public void l6(byte[] var1) {
      this.z3 = var1;
   }

   public byte[] m3() {
      return this.m1;
   }

   public void k5(byte[] var1) {
      this.m1 = var1;
   }

   public byte[] z8() {
      return this.k7;
   }

   public void u3(byte[] var1) {
      this.k7 = var1;
   }

   public byte[] j5() {
      return this.m3;
   }

   public void a6(byte[] var1) {
      this.m3 = var1;
   }

   public byte[] w1() {
      return this.z8;
   }

   public void u9(byte[] var1) {
      this.z8 = var1;
   }

   public byte[] r4() {
      return this.j5;
   }

   public void h0(byte[] var1) {
      this.j5 = var1;
   }

   public byte[] c4() {
      return this.w1;
   }

   public void c8(byte[] var1) {
      this.w1 = var1;
   }

   public byte[] y2() {
      return this.r4;
   }

   public void t2(byte[] var1) {
      this.r4 = var1;
   }

   public byte[] y1() {
      return this.c4;
   }

   public void s7(byte[] var1) {
      this.c4 = var1;
   }

   public h0 a0() {
      return this.a0;
   }

   public void n5(h0 var1) {
      this.a0 = var1;
   }

   public v8(int var1) {
      this.n5(var1);
      this.k5 = 0;
      this.u3 = new a5();
      this.a6 = new t1();
      this.y2 = new h2();
      this.l6 = null;
      this.n3 = 0;
      this.y1 = i9.n5();
   }

   public int d2() {
      com.aspose.slides.ms.System.j5 var1 = com.aspose.slides.ms.System.j5.t2().m3();
      return com.aspose.slides.internal.v6g.k5.u3((var1.n3() - 621355968000000000L) / 10000000L, 11);
   }

   public byte[] u3(int var1) {
      byte[] var2 = new byte[var1];
      this.y1.l6(var2);
      return var2;
   }

   public void k5() {
      this.k5 = 0;
      this.u3 = new a5();
      this.a6 = new t1();
      this.y2 = new h2();
      this.l6 = null;
      this.n3 = 0;
      this.d5();
   }

   public void d5() {
      if (this.z8 != null) {
         com.aspose.slides.ms.System.u3.n5(this.z8, 0, this.z8.length);
         this.z8 = null;
      }

      if (this.z3 != null) {
         com.aspose.slides.ms.System.u3.n5(this.z3, 0, this.z3.length);
         this.z3 = null;
      }

      if (this.m1 != null) {
         com.aspose.slides.ms.System.u3.n5(this.m1, 0, this.m1.length);
         this.m1 = null;
      }

      if (this.k7 != null) {
         com.aspose.slides.ms.System.u3.n5(this.k7, 0, this.k7.length);
         this.k7 = null;
      }

      if (this.m3 != null) {
         com.aspose.slides.ms.System.u3.n5(this.m3, 0, this.m3.length);
         this.m3 = null;
      }

      if (this.j5 != null) {
         com.aspose.slides.ms.System.u3.n5(this.j5, 0, this.j5.length);
         this.j5 = null;
      }

      if (this.r4 != null) {
         com.aspose.slides.ms.System.u3.n5(this.r4, 0, this.r4.length);
         this.r4 = null;
      }

      if (this.w1 != null) {
         com.aspose.slides.ms.System.u3.n5(this.w1, 0, this.w1.length);
         this.w1 = null;
      }

      if (this.c4 != null) {
         com.aspose.slides.ms.System.u3.n5(this.c4, 0, this.c4.length);
         this.c4 = null;
      }

      this.y2.a6();
      if (this.n5 != 48) {
      }
   }

   public int l6(short var1) {
      return this.n5(var1, false);
   }

   public int n5(short var1, boolean var2) {
      switch (var1) {
         case 768:
            return 48;
         case 769:
            return 192;
         default:
            if (var2 && var1 > 769) {
               return 192;
            } else {
               throw new NotSupportedException("Unsupported security protocol type");
            }
      }
   }

   public void k5(short var1) {
      int var2 = this.l6(var1);
      if ((var2 & this.h0()) != var2 && (this.h0() & -1073741824) != -1073741824) {
         throw new n5((byte)70, "Incorrect protocol version received from server");
      }

      this.n5(var2);
      this.n5(j9.n5(com.aspose.slides.internal.v6g.k5.l6(this, x8.class), var2));
   }

   public s7 s3() {
      if (this.u9 == null) {
         this.u9 = new s7();
      }

      if (this.u9.n5() != null) {
         this.u9.n5().n5(this);
      }

      return this.u9;
   }

   public s7 p8() {
      if (this.h0 == null) {
         this.h0 = new s7();
      }

      if (this.h0.n5() != null) {
         this.h0.n5().n5(this);
      }

      return this.h0;
   }

   public s7 f2() {
      return this.c8;
   }

   public s7 i1() {
      return this.t2;
   }

   public void a6(boolean var1) {
      if (var1) {
         this.t2 = this.h0;
         this.c8 = this.u9;
      } else {
         this.c8 = this.h0;
         this.t2 = this.u9;
      }

      this.u9 = this.h0;
   }

   public void u9(boolean var1) {
      s7 var2;
      if (var1) {
         var2 = this.c8;
         this.c8 = this.u9;
      } else {
         var2 = this.t2;
         this.t2 = this.u9;
      }

      if (var2 != null) {
         var2.u3();
      }

      this.h0 = var2;
   }
}
