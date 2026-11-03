package com.aspose.slides.internal.q9r;

import com.aspose.slides.exceptions.NotSupportedException;

public class y1 extends s7 {
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

   public y1(com.aspose.slides.internal.z5z.n5 var1) {
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
}
