package com.aspose.slides.internal.y4g;

class u6 extends x9 {
   private byte[] l6;
   private final Object k5 = new Object();

   public u6(short var1, String var2, int var3, int var4, int var5, boolean var6, boolean var7, byte var8, byte var9, short var10, byte var11, byte var12) {
      super(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12);
   }

   @Override
   public byte[] n5(byte var1, byte[] var2) {
      synchronized (this.k5) {
         if (this.l6 == null) {
            this.l6 = new byte[13];
         }

         long var4 = com.aspose.slides.internal.v6g.k5.l6(this.t4(), z6.class) ? this.t4().m1() : this.t4().z3();
         this.n5(this.l6, 0, (long)var4);
         this.l6[8] = var1;
         this.n5(this.l6, 9, this.t4().c8());
         this.n5(this.l6, 11, com.aspose.slides.internal.v6g.k5.l6(var2.length, 9));
         com.aspose.slides.internal.o8m.b3 var6 = this.a6();
         var6.n5(this.l6, 0, this.l6.length, this.l6, 0);
         var6.n5(var2, 0, var2.length, var2, 0);
         var6.n5(x9.n5, 0, 0);
         return var6.n3();
      }
   }

   @Override
   public byte[] l6(byte var1, byte[] var2) {
      synchronized (this.k5) {
         if (this.l6 == null) {
            this.l6 = new byte[13];
         }

         long var4 = com.aspose.slides.internal.v6g.k5.l6(this.t4(), z6.class) ? this.t4().z3() : this.t4().m1();
         this.n5(this.l6, 0, (long)var4);
         this.l6[8] = var1;
         this.n5(this.l6, 9, this.t4().c8());
         this.n5(this.l6, 11, com.aspose.slides.internal.v6g.k5.l6(var2.length, 9));
         com.aspose.slides.internal.o8m.b3 var6 = this.u3();
         var6.n5(this.l6, 0, this.l6.length, this.l6, 0);
         var6.n5(var2, 0, var2.length, var2, 0);
         var6.n5(x9.n5, 0, 0);
         return var6.n3();
      }
   }

   @Override
   public void n5(byte[] var1) {
      this.t4().u9(new byte[var1.length]);
      this.t4().u9(this.n5(var1, "master secret", this.t4().z8(), 48));
   }

   @Override
   public void n5() {
      h2 var1 = new h2(this.n5(this.t4().w1(), "key expansion", this.t4().j5(), this.e2()));
      this.t4().p8().n5(var1.n5(this.h0()));
      this.t4().p8().l6(var1.n5(this.h0()));
      this.t4().h0(var1.n5(com.aspose.slides.internal.v6g.k5.u3(this.y4(), 6)));
      this.t4().c8(var1.n5(com.aspose.slides.internal.v6g.k5.u3(this.y4(), 6)));
      if (!this.n3()) {
         if (com.aspose.slides.internal.v6g.k5.u3(this.z1(), 6) != 0) {
            this.t4().t2(var1.n5(com.aspose.slides.internal.v6g.k5.u3(this.z1(), 6)));
            this.t4().s7(var1.n5(com.aspose.slides.internal.v6g.k5.u3(this.z1(), 6)));
         } else {
            this.t4().t2(x9.n5);
            this.t4().s7(x9.n5);
         }
      } else {
         byte[] var2 = this.n5(this.t4().r4(), "client write key", this.t4().z8(), com.aspose.slides.internal.v6g.k5.u3(this.t9(), 6));
         byte[] var3 = this.n5(this.t4().c4(), "server write key", this.t4().z8(), com.aspose.slides.internal.v6g.k5.u3(this.t9(), 6));
         this.t4().h0(var2);
         this.t4().c8(var3);
         if (com.aspose.slides.internal.v6g.k5.u3(this.z1(), 6) > 0) {
            byte[] var4 = this.n5(x9.n5, "IV block", this.t4().z8(), com.aspose.slides.internal.v6g.k5.u3(this.z1(), 6) * 2);
            this.t4().t2(new byte[this.z1()]);
            com.aspose.slides.ms.System.y4.n5(var4, 0, this.t4().y2(), 0, this.t4().y2().length);
            this.t4().s7(new byte[this.z1()]);
            com.aspose.slides.ms.System.y4.n5(var4, com.aspose.slides.internal.v6g.k5.u3(this.z1(), 6), this.t4().y1(), 0, this.t4().y1().length);
         } else {
            this.t4().t2(x9.n5);
            this.t4().s7(x9.n5);
         }
      }

      o5.n5(this.t4());
      var1.a6();
   }
}
