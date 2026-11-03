package com.aspose.slides.internal.g7;

import com.aspose.slides.exceptions.InvalidOperationException;

class l8 extends a1k {
   public int n5;
   public short l6;
   public short k5;
   public short u3;
   public short a6;
   public short u9;
   public int h0;
   private short c8;
   private short t2;
   private int s7;
   private short x8;
   private short n3;
   private short y4;

   public final short n5() {
      return this.c8;
   }

   public final void n5(short var1) {
      this.n5(com.aspose.slides.internal.v6g.k5.u3((byte)4, 6), var1);
      this.c8 = var1;
   }

   public final short l6() {
      return this.t2;
   }

   public final void l6(short var1) {
      this.n5(com.aspose.slides.internal.v6g.k5.u3((byte)6, 6), var1);
      this.t2 = var1;
   }

   public final void n5(int var1) {
      this.n5(com.aspose.slides.internal.v6g.k5.u3((byte)10, 6), (int)var1);
      this.s7 = var1;
   }

   public final void k5(short var1) {
      this.n5(com.aspose.slides.internal.v6g.k5.u3((byte)12, 6), var1);
      this.x8 = var1;
   }

   public final void u3(short var1) {
      this.n5(com.aspose.slides.internal.v6g.k5.u3((byte)14, 6), var1);
      this.n3 = var1;
   }

   public final void a6(short var1) {
      this.n5(com.aspose.slides.internal.v6g.k5.u3((byte)16, 6), var1);
      this.y4 = var1;
   }

   public l8(byte[] var1) {
      super("hhea", var1);
      t4 var2 = new t4(var1);
      this.n5 = var2.a6();
      int var3 = 65536;
      if (this.n5 != 65536) {
         throw new InvalidOperationException(
            com.aspose.slides.ms.System.d1.n5("Version of 'hhea' table is incorrect: {0}, expected {1} for v1.0",new Object[]{ this.n5, 65536})
         );
      }

      this.c8 = var2.h0();
      this.t2 = var2.h0();
      this.l6 = var2.h0();
      this.s7 = var2.u9();
      this.x8 = var2.h0();
      this.n3 = var2.h0();
      this.y4 = var2.h0();
      this.k5 = var2.h0();
      this.u3 = var2.h0();
      this.a6 = var2.h0();

      for (int var4 = 0; var4 < 4; var4++) {
         var2.h0();
      }

      this.u9 = var2.h0();
      this.h0 = var2.u9();
      if (var1.length != var2.n5()) {
         throw new InvalidOperationException("Incorrect length of 'hhea' table");
      }
   }
}
