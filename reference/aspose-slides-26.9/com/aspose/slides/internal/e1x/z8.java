package com.aspose.slides.internal.e1x;

import com.aspose.slides.exceptions.NotSupportedException;

public class z8 extends f0 {
   public long n5;
   public short l6;
   public short k5;
   public short u3;
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
   public int t4;

   public z8(com.aspose.slides.internal.n2d.k5 var1) {
      this.n5 = var1.k5();
      if ((this.n5 & 4294967295L) == 131072L) {
         this.n5 = 65536L;
      }

      if ((this.n5 & 4294967295L) != 65536L) {
         throw new NotSupportedException("Unsupported font head version.");
      }

      this.l6 = var1.u3();
      this.k5 = var1.u3();
      this.u3 = var1.u3();
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
      this.t4 = var1.a6();
   }

   @Override
   public void n5(com.aspose.slides.internal.n2d.u3 var1) {
      var1.n5(this.n5);
      var1.l6(this.l6);
      var1.l6(this.k5);
      var1.l6(this.u3);
      var1.l6(this.a6 & 65535);
      var1.l6(this.u9);
      var1.l6(this.h0);
      var1.l6(this.c8);
      var1.l6(this.t2);
      var1.l6(this.s7);
      var1.l6(this.x8);
      var1.l6(this.n3);
      var1.l6(this.y4);
      var1.l6(this.e2);
      var1.l6(this.t9);
      var1.l6(this.z1);
      var1.l6(this.t4 & 65535);
   }
}
