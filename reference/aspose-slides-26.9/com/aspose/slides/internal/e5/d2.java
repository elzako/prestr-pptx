package com.aspose.slides.internal.e5;

import com.aspose.slides.internal.h2.a5;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.r8;

public class d2 extends a5 {
   private r8 n5;

   protected d2(r8 var1) {
      this.n5 = var1;
   }

   private d2(String var1, boolean var2) {
      if (var2 && !d1.n5(var1)) {
         this.n5 = new r8(var1);
      } else {
         this.n5(var1);
      }
   }

   @Override
   public String j_() {
      return this.n5 == null ? this.t9() : this.n5.toString();
   }

   @Override
   public String toString() {
      return this.j_();
   }

   @Override
   public int hashCode() {
      byte var1 = 31;
      int var2 = 1;
      var2 = var1 * var2 + com.aspose.slides.internal.v3.u3.n5(this.t9());
      return var1 * var2 + com.aspose.slides.internal.v3.u3.n5(this.n5);
   }

   @Override
   public boolean equals(Object obj) {
      if (obj == null) {
         return false;
      }

      if (!com.aspose.slides.internal.v6g.k5.l6(obj, d2.class)) {
         return false;
      }

      d2 var2 = (d2)obj;
      return com.aspose.slides.internal.v3.u3.n5(this.t9(), var2.t9()) && com.aspose.slides.internal.v3.u3.n5(this.n5, var2.n5);
   }

   // $VF: synthetic method
   static r8 n5(d2 var0) {
      return var0.n5;
   }

   // Restored original synthetic constructor delegation: (Ljava/lang/String;ZLcom/aspose/slides/internal/e5/d2$1;)V -> (Ljava/lang/String;Z)V
   d2(java.lang.String recoveredArg0, boolean recoveredArg1, com.aspose.slides.internal.e5.d2$1 recoveredArg2) {
      this(recoveredArg0, recoveredArg1);
   }
}
