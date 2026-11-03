package com.aspose.slides.internal.u1n;

import com.aspose.slides.internal.o9b.y4;
import com.aspose.slides.internal.q9r.z3;
import java.awt.Font;
import java.util.Locale;
import java.util.Map;

public final class k5 {
   private final Map<String, Font[]> n5;
   private y4[] l6;
   private z3 k5;

   public k5(Map<String, Font[]> var1) {
      this.n5 = var1;
   }

   public com.aspose.slides.internal.q9r.k5 n5(String var1, int var2) {
      return this.k5.n5(var1, var2);
   }

   public com.aspose.slides.internal.q9r.u3 n5(String var1) {
      return this.k5.n5(var1);
   }

   public Font[] l6(String var1) {
      if (var1 == null) {
         return null;
      }

      String var2 = com.aspose.slides.internal.u1n.n5.l6(var1);
      return this.n5.get(var2);
   }

   public Map<String, Font[]> n5() {
      return this.n5;
   }

   public y4[] l6() {
      return this.l6;
   }

   public void n5(Font var1) {
      String var2 = com.aspose.slides.internal.u1n.n5.l6(var1.getFamily(Locale.ROOT));
      this.n5.put(var2, com.aspose.slides.internal.u1n.n5.n5(var2));
   }

   public void n5(y4[] var1, z3 var2) {
      this.k5 = var2;
      this.l6 = var1;
   }

   public void k5() {
      this.l6 = null;
      this.k5 = null;
      this.n5.clear();
   }
}
