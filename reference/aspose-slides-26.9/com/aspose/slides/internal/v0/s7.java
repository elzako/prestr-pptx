package com.aspose.slides.internal.v0;

import com.aspose.slides.ms.System.a3;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.j8;

public class s7 {
   private String n5;
   private String l6;
   private int k5;
   private int u3;
   private int a6;
   private String u9;
   private boolean h0;
   private int c8;

   public s7(String var1) {
      this.n5 = var1;
   }

   public s7(String var1, String var2, int var3, int var4) {
      this(var1, var2, var3, var4, 0);
   }

   public s7(String var1, String var2, int var3, int var4, int var5) {
      this(var1);
      this.l6 = var2;
      this.k5 = var3;
      this.u3 = var4;
      this.a6 = var5;
   }

   public final String n5() {
      return this.n5;
   }

   public final String l6() {
      return this.l6;
   }

   public final int k5() {
      return this.k5;
   }

   public final int u3() {
      return this.a6;
   }

   public final int a6() {
      return this.u3;
   }

   private String u9() {
      if (this.u9 == null) {
         this.u9 = d1.n5("{0},{1},{2},{3}", this.n5(), this.l6(), this.k5(), this.a6());
      }

      return this.u9;
   }

   @Override
   public int hashCode() {
      if (!this.h0) {
         this.c8 = this.u9().hashCode();
         this.h0 = true;
      }

      return this.c8;
   }

   @Override
   public boolean equals(Object obj) {
      s7 var2 = com.aspose.slides.internal.v6g.k5.n5(obj, s7.class);
      if (j8.l6(null, var2)) {
         return false;
      } else {
         return j8.l6(this, var2) ? true : a3.l6(this.hashCode(), var2.hashCode());
      }
   }

   @Override
   public String toString() {
      return this.u9();
   }
}
