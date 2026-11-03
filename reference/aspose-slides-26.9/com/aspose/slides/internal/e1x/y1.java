package com.aspose.slides.internal.e1x;

import com.aspose.slides.exceptions.NotSupportedException;

public class y1 extends f0 {
   public long n5;
   public int l6;
   public int k5;
   public int u3;
   public int a6;
   public int u9;
   public int h0;
   public int c8;
   public int t2;
   public int s7;
   public int x8;
   public int n3;
   public int y4;
   public int e2;
   public int t9;

   public y1(com.aspose.slides.internal.n2d.k5 var1) {
      this.n5 = var1.k5();
      this.l6 = var1.a6();
      if ((this.n5 & 4294967295L) != 20480L) {
         if ((this.n5 & 4294967295L) != 65536L) {
            throw new NotSupportedException("Unsupported maximum profile version.");
         }

         this.k5 = var1.a6();
         this.u3 = var1.a6();
         this.a6 = var1.a6();
         this.u9 = var1.a6();
         this.h0 = var1.a6();
         this.c8 = var1.a6();
         this.t2 = var1.a6();
         this.s7 = var1.a6();
         this.x8 = var1.a6();
         this.n3 = var1.a6();
         this.y4 = var1.a6();
         this.e2 = var1.a6();
         this.t9 = var1.a6();
      }
   }

   @Override
   public void n5(com.aspose.slides.internal.n2d.u3 var1) {
      var1.n5(this.n5);
      var1.l6(this.l6 & 65535);
      if ((this.n5 & 4294967295L) != 20480L) {
         var1.l6(this.k5 & 65535);
         var1.l6(this.u3 & 65535);
         var1.l6(this.a6 & 65535);
         var1.l6(this.u9 & 65535);
         var1.l6(this.h0 & 65535);
         var1.l6(this.c8 & 65535);
         var1.l6(this.t2 & 65535);
         var1.l6(this.s7 & 65535);
         var1.l6(this.x8 & 65535);
         var1.l6(this.n3 & 65535);
         var1.l6(this.y4 & 65535);
         var1.l6(this.e2 & 65535);
         var1.l6(this.t9 & 65535);
      }
   }
}
