package com.aspose.slides.internal.y4g;

import com.aspose.slides.internal.o8m.s4;
import com.aspose.slides.ms.System.d1;

class n3 extends x9 {
   private byte[] l6;
   private byte[] k5;
   private byte[] u3;

   public n3(short var1, String var2, int var3, int var4, int var5, boolean var6, boolean var7, byte var8, byte var9, short var10, byte var11, byte var12) {
      super(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12);
      int var13 = var4 == 0 ? 48 : 40;
      this.l6 = new byte[var13];
      this.k5 = new byte[var13];

      for (int var14 = 0; var14 < var13; var14++) {
         this.l6[var14] = 54;
         this.k5[var14] = 92;
      }
   }

   @Override
   public byte[] n5(byte var1, byte[] var2) {
      com.aspose.slides.internal.o8m.f2 var3 = this.u9();
      byte[] var4 = this.t4().f2().k5();
      var3.n5(var4, 0, var4.length, var4, 0);
      var3.n5(this.l6, 0, this.l6.length, this.l6, 0);
      if (this.u3 == null) {
         this.u3 = new byte[11];
      }

      long var5 = com.aspose.slides.internal.v6g.k5.l6(this.t4(), z6.class) ? this.t4().m1() : this.t4().z3();
      this.n5(this.u3, 0, (long)var5);
      this.u3[8] = var1;
      this.n5(this.u3, 9, com.aspose.slides.internal.v6g.k5.l6(var2.length, 9));
      var3.n5(this.u3, 0, this.u3.length, this.u3, 0);
      var3.n5(var2, 0, var2.length, var2, 0);
      var3.n5(x9.n5, 0, 0);
      byte[] var7 = var3.n3();
      var3.t2();
      var3.n5(var4, 0, var4.length, var4, 0);
      var3.n5(this.k5, 0, this.k5.length, this.k5, 0);
      var3.n5(var7, 0, var7.length, var7, 0);
      var3.n5(x9.n5, 0, 0);
      return var3.n3();
   }

   @Override
   public byte[] l6(byte var1, byte[] var2) {
      com.aspose.slides.internal.o8m.f2 var3 = this.u9();
      byte[] var4 = this.t4().s3().l6();
      var3.n5(var4, 0, var4.length, var4, 0);
      var3.n5(this.l6, 0, this.l6.length, this.l6, 0);
      if (this.u3 == null) {
         this.u3 = new byte[11];
      }

      long var5 = com.aspose.slides.internal.v6g.k5.l6(this.t4(), z6.class) ? this.t4().z3() : this.t4().m1();
      this.n5(this.u3, 0, (long)var5);
      this.u3[8] = var1;
      this.n5(this.u3, 9, com.aspose.slides.internal.v6g.k5.l6(var2.length, 9));
      var3.n5(this.u3, 0, this.u3.length, this.u3, 0);
      var3.n5(var2, 0, var2.length, var2, 0);
      var3.n5(x9.n5, 0, 0);
      byte[] var7 = var3.n3();
      var3.t2();
      var3.n5(var4, 0, var4.length, var4, 0);
      var3.n5(this.k5, 0, this.k5.length, this.k5, 0);
      var3.n5(var7, 0, var7.length, var7, 0);
      var3.n5(x9.n5, 0, 0);
      return var3.n3();
   }

   @Override
   public void n5(byte[] var1) {
      h2 var2 = new h2();
      var2.n5(this.n5(var1, "A", this.t4().z8()));
      var2.n5(this.n5(var1, "BB", this.t4().z8()));
      var2.n5(this.n5(var1, "CCC", this.t4().z8()));
      this.t4().u9(var2.u9());
   }

   @Override
   public void n5() {
      h2 var1 = new h2();
      char var2 = 'A';

      for (int var3 = 1; var1.getLength() < this.e2(); var3++) {
         String var4 = d1.n5;

         for (int var5 = 0; var5 < var3; var5++) {
            var4 = d1.n5(var4, com.aspose.slides.ms.System.t9.q0(var2));
         }

         byte[] var11 = this.n5(this.t4().w1(), var4.toString(), this.t4().j5());
         int var6 = var1.getLength() + var11.length > this.e2() ? this.e2() - com.aspose.slides.internal.v6g.k5.u3(var1.getLength(), 11) : var11.length;
         var1.write(var11, 0, var6);
         var2++;
      }

      h2 var10 = new h2(var1.u9());
      this.t4().p8().n5(var10.n5(this.h0()));
      this.t4().p8().l6(var10.n5(this.h0()));
      this.t4().h0(var10.n5(com.aspose.slides.internal.v6g.k5.u3(this.y4(), 6)));
      this.t4().c8(var10.n5(com.aspose.slides.internal.v6g.k5.u3(this.y4(), 6)));
      if (!this.n3()) {
         if (com.aspose.slides.internal.v6g.k5.u3(this.z1(), 6) != 0) {
            this.t4().t2(var10.n5(com.aspose.slides.internal.v6g.k5.u3(this.z1(), 6)));
            this.t4().s7(var10.n5(com.aspose.slides.internal.v6g.k5.u3(this.z1(), 6)));
         } else {
            this.t4().t2(x9.n5);
            this.t4().s7(x9.n5);
         }
      } else {
         com.aspose.slides.internal.o8m.z7 var12 = com.aspose.slides.internal.o8m.z7.a6();
         int var13 = var12.y4() >> 3;
         byte[] var7 = new byte[var13];
         var12.n5(this.t4().r4(), 0, this.t4().r4().length, var7, 0);
         var12.n5(this.t4().z8(), 0, this.t4().z8().length);
         byte[] var8 = new byte[this.t9()];
         com.aspose.slides.ms.System.y4.n5(var12.n3(), 0, var8, 0, com.aspose.slides.internal.v6g.k5.u3(this.t9(), 6));
         var12.t2();
         var12.n5(this.t4().c4(), 0, this.t4().c4().length, var7, 0);
         var12.n5(this.t4().j5(), 0, this.t4().j5().length);
         byte[] var9 = new byte[this.t9()];
         com.aspose.slides.ms.System.y4.n5(var12.n3(), 0, var9, 0, com.aspose.slides.internal.v6g.k5.u3(this.t9(), 6));
         this.t4().h0(var8);
         this.t4().c8(var9);
         if (com.aspose.slides.internal.v6g.k5.u3(this.z1(), 6) > 0) {
            var12.t2();
            var7 = var12.k5(this.t4().z8(), 0, this.t4().z8().length);
            this.t4().t2(new byte[this.z1()]);
            com.aspose.slides.ms.System.y4.n5(var7, 0, this.t4().y2(), 0, com.aspose.slides.internal.v6g.k5.u3(this.z1(), 6));
            var12.t2();
            var7 = var12.k5(this.t4().j5(), 0, this.t4().j5().length);
            this.t4().s7(new byte[this.z1()]);
            com.aspose.slides.ms.System.y4.n5(var7, 0, this.t4().y1(), 0, com.aspose.slides.internal.v6g.k5.u3(this.z1(), 6));
         } else {
            this.t4().t2(x9.n5);
            this.t4().s7(x9.n5);
         }
      }

      o5.n5(this.t4());
      var10.a6();
      var1.a6();
   }

   private byte[] n5(byte[] var1, String var2, byte[] var3) {
      com.aspose.slides.internal.o8m.z7 var4 = com.aspose.slides.internal.o8m.z7.a6();
      s4 var5 = s4.a6();
      h2 var6 = new h2();
      var6.n5(com.aspose.slides.internal.l7h.j5.e2().u3(var2));
      var6.n5(var1);
      var6.n5(var3);
      byte[] var7 = var5.k5(var6.u9(), 0, com.aspose.slides.internal.v6g.k5.u3(var6.getLength(), 11));
      var6.a6();
      var6.n5(var1);
      var6.n5(var7);
      byte[] var8 = var4.k5(var6.u9(), 0, com.aspose.slides.internal.v6g.k5.u3(var6.getLength(), 11));
      var6.a6();
      return var8;
   }
}
