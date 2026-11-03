package com.aspose.slides.internal.v4;

import com.aspose.slides.ms.System.d1;

public class j5$n5 {
   public final String n5;
   public final String l6;
   public final String k5;
   public final String u3;

   private j5$n5(String var1, String var2, String var3, String var4) {
      this.n5 = var1;
      this.l6 = var2;
      this.k5 = var3 == null ? var2 : var3;
      this.u3 = var4;
   }

   public static j5$n5 n5(String var0, String var1, String var2, String var3) {
      return new j5$n5(var0, var1, var2, var3);
   }

   @Override
   public int hashCode() {
      int var1 = 17;
      var1 = 37 * var1 + (this.n5 == null ? 0 : this.n5.hashCode());
      var1 = 37 * var1 + (this.l6 == null ? 0 : this.l6.hashCode());
      var1 = 37 * var1 + (this.k5 == null ? 0 : this.k5.hashCode());
      return 37 * var1 + (this.u3 == null ? 0 : this.u3.hashCode());
   }

   @Override
   public boolean equals(Object obj) {
      if (this == obj) {
         return true;
      }

      if (!com.aspose.slides.internal.v6g.k5.l6(obj, j5$n5.class)) {
         return false;
      }

      j5$n5 var2 = (j5$n5)obj;
      return (d1.a6(var2.n5, this.n5) || var2.n5 != null && d1.a6(var2.n5, this.n5))
         && (d1.a6(var2.l6, this.l6) || var2.l6 != null && d1.a6(var2.l6, this.l6))
         && (d1.a6(var2.k5, this.k5) || var2.k5 != null && d1.a6(var2.k5, this.k5))
         && (d1.a6(var2.u3, this.u3) || var2.u3 != null && d1.a6(var2.u3, this.u3));
   }
}
