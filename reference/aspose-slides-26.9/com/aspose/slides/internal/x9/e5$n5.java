package com.aspose.slides.internal.x9;

import com.aspose.slides.ms.System.a3;
import com.aspose.slides.ms.System.d1;

public class e5$n5 {
   public int n5;
   public int l6;
   public int k5;
   public int u3;
   public int a6;
   public com.aspose.slides.internal.v8.u9 u9;
   public boolean h0;
   public boolean c8;
   public boolean t2;
   public com.aspose.slides.internal.v0.u3 s7;
   public int x8;
   public int[][] n3;
   private e5 y4;

   public e5$n5(
      int var1,
      int var2,
      int var3,
      int var4,
      com.aspose.slides.internal.v8.u9 var5,
      boolean var6,
      boolean var7,
      boolean var8,
      com.aspose.slides.internal.v0.u3 var9,
      int var10,
      int[][] var11,
      e5 var12
   ) {
      this.n5 = var1;
      this.l6 = var2;
      this.k5 = -1;
      this.u3 = var3;
      this.a6 = var4;
      this.u9 = var5;
      this.h0 = var6;
      this.c8 = var7;
      this.t2 = var8;
      this.s7 = var9;
      this.x8 = var10;
      this.n3 = var11;
      this.y4 = var12;
   }

   public final int n5() {
      if (this.k5 == -1) {
         if (e5.n5(this.y4).k5(this.n5, this.l6)) {
            this.k5 = e5.n5(this.y4).u3(this.n5, this.l6).length();
         } else {
            this.k5 = this.l6 - this.n5;
         }
      }

      return this.k5;
   }

   public final void n5(com.aspose.slides.internal.v8.u9 var1) {
      this.u9 = this.u9.n5(var1);
   }

   @Override
   public String toString() {
      return d1.n5(new Object[]{
         super.toString(),
         "{",
         "interval = [",
         a3.l6(this.n5),
         ",",
         a3.l6(this.l6),
         "]",
         ", isSpace = ",
         this.c8,
         ", level = ",
         a3.l6(this.x8),
         ", areaIPD = ",
         this.u9,
         ", letterSpaceCount = ",
         a3.l6(this.a6),
         ", wordSpaceCount = ",
         a3.l6(this.u3),
         ", isHyphenated = ",
         this.h0,
         ", font = ",
         this.s7,
         "}"
      });
   }
}
