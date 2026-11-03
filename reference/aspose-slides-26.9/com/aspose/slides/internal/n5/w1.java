package com.aspose.slides.internal.n5;

public class w1 extends Exception {
   public transient e2 u3;
   public int a6;
   public y2 u9;
   public Object h0;
   public int c8;
   public int t2;
   public int s7;
   public boolean x8;

   public w1() {
   }

   public w1(e2 var1) {
      this.u3 = var1;
      this.a6 = var1.l6();
      if (var1 instanceof a0) {
         this.u9 = ((a0)var1).u9(1);
         this.t2 = this.u9.k5();
         this.s7 = this.u9.u3();
      }

      if (var1 instanceof com.aspose.slides.internal.l6.e2) {
         this.n5(var1);
      } else if (var1 instanceof u9) {
         this.c8 = var1.n5(1);
         this.t2 = ((u9)var1).u9();
         this.s7 = ((u9)var1).h0();
      } else {
         this.c8 = var1.n5(1);
      }
   }

   protected void n5(e2 var1) {
      com.aspose.slides.internal.l6.e2 var2 = (com.aspose.slides.internal.l6.e2)var1;
      this.h0 = var2.k5(1);
      com.aspose.slides.internal.l6.y4 var3 = var2.u9();
      y2 var4 = var3.h0(this.h0);
      if (var4 != null) {
         this.u9 = var4;
         if (var4.k5() <= 0) {
            int var5 = -1;

            for (Object var6 = var2.k5(var5); var6 != null; var6 = var2.k5(--var5)) {
               y2 var7 = var3.h0(var6);
               if (var7 != null && var7.k5() > 0) {
                  this.t2 = var7.k5();
                  this.s7 = var7.u3();
                  this.x8 = true;
                  break;
               }
            }
         } else {
            this.t2 = var4.k5();
            this.s7 = var4.u3();
         }
      } else if (this.h0 instanceof com.aspose.slides.internal.l6.n3) {
         this.t2 = ((com.aspose.slides.internal.l6.n3)this.h0).c8();
         this.s7 = ((com.aspose.slides.internal.l6.n3)this.h0).t2();
         if (this.h0 instanceof com.aspose.slides.internal.l6.u3) {
            this.u9 = ((com.aspose.slides.internal.l6.u3)this.h0).u9;
         }
      } else {
         int var8 = var3.k5(this.h0);
         String var9 = var3.u3(this.h0);
         this.u9 = new t2(var8, var9);
      }
   }

   public int l6() {
      if (this.u3 instanceof a0) {
         return this.u9.n5();
      } else if (this.u3 instanceof com.aspose.slides.internal.l6.e2) {
         com.aspose.slides.internal.l6.e2 var1 = (com.aspose.slides.internal.l6.e2)this.u3;
         com.aspose.slides.internal.l6.y4 var2 = var1.u9();
         return var2.k5(this.h0);
      } else {
         return this.c8;
      }
   }
}
